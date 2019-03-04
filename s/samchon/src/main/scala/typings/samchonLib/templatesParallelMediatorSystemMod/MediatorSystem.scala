package typings
package samchonLib.templatesParallelMediatorSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/MediatorSystem", "MediatorSystem")
@js.native
abstract class MediatorSystem protected ()
  extends samchonLib.templatesSlaveSlaveSystemMod.SlaveSystem {
  /**
    * Construct from parent {@link DistributedSystemArrayMediator} object.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  /**
    * Construct from parent {@link ParallelSystemArrayMediator} object.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  /**
    * @hidden
    */
  var _Complete_history: js.Any = js.native
  /**
    * @hidden
    */
  var progress_list_ : js.Any = js.native
  /**
    * @hidden
    */
  var system_array_ : js.Any = js.native
  /**
    * Get parent {@link ParallelSystemArrayMediator} or {@link DistributedSystemArrayMediator} object.
    */
  def getSystemArray(): samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem] | samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem] = js.native
  /**
    * Get parent {@link DistributedSystemArrayMediator} object.
    */
  @JSName("getSystemArray")
  def getSystemArray_SystemArrayDistributedSystemArraySystemArray[SystemArray /* <: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem] */](): SystemArray = js.native
  /**
    * Get parent {@link ParallelSystemArrayMediator} object.
    */
  @JSName("getSystemArray")
  def getSystemArray_SystemArrayParallelSystemArraySystemArray[SystemArray /* <: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelParallelSystemMod.ParallelSystem] */](): SystemArray = js.native
  /**
    * Start interaction.
    *
    * The {@link start start()} is an abstract method starting interaction with the **master** system. If the
    * **master** is a server, then connects to the **master**. Otherwise, the **master** is client, then this
    * {@link MediatorSystem} object wil open a server accepting the **master**.
    */
  def start(): scala.Unit = js.native
}

