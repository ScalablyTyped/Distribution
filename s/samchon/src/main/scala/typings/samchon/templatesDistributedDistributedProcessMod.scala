package typings.samchon

import typings.samchon.protocolEntityEntityMod.Entity
import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/DistributedProcess", JSImport.Namespace)
@js.native
object templatesDistributedDistributedProcessMod extends js.Object {
  @js.native
  abstract class DistributedProcess protected ()
    extends Entity
       with IProtocol {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: DistributedSystemArray[DistributedSystem]) = this()
    /**
      * @hidden
      */
    var _Complete_history: js.Any = js.native
    /**
      * @hidden
      */
    var _Compute_average_elapsed_time: js.Any = js.native
    /**
      * @hidden
      */
    var enforced_ : js.Any = js.native
    /**
      * @hidden
      */
    var history_list_ : js.Any = js.native
    /**
      * A name, represents and identifies this {@link DistributedProcess process}.
      *
      * This {@link name} is an identifier represents this {@link DistributedProcess process}. This {@link name} is
      * used in {@link DistributedSystemArray.getProcess} and {@link DistributedSystemArray.getProcess}, as a key elements.
      * Thus, this {@link name} should be unique in its parent {@link DistributedSystemArray} object.
      */
    var name: String = js.native
    /**
      * @hidden
      */
    var progress_list_ : js.Any = js.native
    /**
      * @hidden
      */
    var resource: js.Any = js.native
    /**
      * @hidden
      */
    var system_array_ : js.Any = js.native
    /**
      * Enforce resource index.
      *
      * Enforce *resource index* that indicates how much heavy the {@link DistributedProcess process is}. The
      * *resource index* will be fixed, never be **revaluated**.
      *
      * Note that, initial and average *resource index* of {@link DistributedProcess} objects are ```1.0```. If the
      * *resource index* is higher than other {@link DistributedProcess} objects, then this
      * {@link DistributedProcess} will be ordered to handle more processes than other {@link DistributedProcess}
      * objects. Otherwise, the *resource index* is lower than others, of course, less processes will be requested.
      *
      * The difference between {@link setResource} and this {@link enforceResource} is allowing **revaluation** or not.
      * This {@link enforceResource} does not allow the **revaluation**. The *resource index* is clearly fixed and
      * never be changed by the **revaluation**. But you've to keep in mind that, you can't avoid the **mis-valuation**
      * with this {@link enforceResource}.
      *
      * For example, there's a {@link DistributedProcess process} much heavier than any other, but you
      * **mis-estimated** it to the lightest. In that case, there's no way. The
      * {@link DistributedSystemArray entire distributed processing system} will be slower by the **mis-valuation**.
      * By the reason, using {@link enforceResource}, it's recommended only when you can clearly certain the
      * *resource index*. If you can't certain the *resource index* but want to recommend, then use {@link setResource}
      * instead.
      *
      * @param val New resource index to be fixed.
      */
    def enforceResource(`val`: Double): Unit = js.native
    /**
      * Get name, who represents and identifies this process.
      */
    def getName(): String = js.native
    /**
      * Get resource index.
      *
      * Get *resource index* that indicates how much this {@link DistributedProcess process} is heavy.
      *
      * If this {@link DistributedProcess process} does not have any	{@link Invoke} message had handled, then the
      * *resource index* will be ```1.0```, which means default and average value between all
      * {@link DistributedProcess} instances (that are belonged to a same {@link DistributedSystemArray} object).
      *
      * You can specify the *resource index* by yourself, but notice that, if the *resource index* is higher than
      * other {@link DistributedProcess} objects, then this {@link DistributedProcess process} will be ordered to
      * handle less processes than other {@link DistributedProcess} objects. Otherwise, the *resource index* is
      * lower than others, of course, much processes will be requested.
      *
      * - {@link setResource setResource()}
      * - {@link enforceResource enforceResource()}
      *
      * Unless {@link enforceResource enforceResource()} is called, This *resource index* is **revaluated** whenever
      * {@link sendData sendData()} is called.
      *
      * @return Resource index.
      */
    def getResource(): Double = js.native
    /**
      * Get parent {@link DistributedSystemArray} object.
      *
      * @return The parent {@link DistributedSystemArray} object.
      */
    def getSystemArray(): DistributedSystemArray[DistributedSystem] = js.native
    /**
      * Get parent {@link DistributedSystemArray} object.
      *
      * @return The parent {@link DistributedSystemArray} object.
      */
    @JSName("getSystemArray")
    def getSystemArray_SystemArray_DistributedSystemArrayDistributedSystem_SystemArray[SystemArray /* <: DistributedSystemArray[DistributedSystem] */](): SystemArray = js.native
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
    /**
      * Send an {@link Invoke} message.
      *
      * Sends an {@link Invoke} message requesting a **distributed process**. The {@link Invoke} message will be sent
      * to the most idle {@link DistributedSystem} object, which represents a slave system, and the most idle
      * {@link DistributedSystem} object will be returned.
      *
      * When the **distributed process** has completed, then the {@link DistributedSystemArray} object will revaluate
      * {@link getResource resource index} and {@link DistributedSystem.getPerformance performance index} of this
      * {@link DistributedSystem} and the most idle {@link DistributedSystem} objects basis on the execution time.
      *
      * @param invoke An {@link Invoke} message requesting distributed process.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is. Default is 1.
      *
      * @return The most idle {@link DistributedSystem} object who may send the {@link Invoke} message.
      */
    def sendData(invoke: Invoke, weight: Double): DistributedSystem = js.native
    /**
      * Set resource index.
      *
      * Set *resource index* that indicates how much this {@link DistributedProcess process} is heavy. This
      * *resource index* can be **revaulated**.
      *
      * Note that, initial and average *resource index* of {@link DistributedProcess} objects are ```1.0```. If the
      * *resource index* is higher than other {@link DistributedProcess} objects, then this
      * {@link DistributedProcess} will be ordered to handle more processes than other {@link DistributedProcess}
      * objects. Otherwise, the *resource index* is lower than others, of course, less processes will be requested.
      *
      * Unlike {@link enforceResource}, configuring *resource index* by this {@link setResource} allows the
      * **revaluation**. This **revaluation** prevents wrong valuation from user. For example, you *mis-valuated* the
      * *resource index*. The {@link DistributedProcess process} is much heavier than any other, but you estimated it
      * to the lightest one. It looks like a terrible case that causes
      * {@link DistributedSystemArray entire distributed processing system} to be slower, however, don't mind. The
      * {@link DistributedProcess process} will the direct to the *propriate resource index* eventually with the
      * **revaluation**.
      *
      * - The **revaluation** is caused by the {@link sendData sendData()} method.
      *
      * @param val New resource index, but can be revaluated.
      */
    def setResource(`val`: Double): Unit = js.native
  }
  
}

