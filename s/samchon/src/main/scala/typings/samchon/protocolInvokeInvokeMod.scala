package typings.samchon

import typings.samchon.protocolEntityEntityArrayMod.EntityArray
import typings.samchon.protocolInvokeInvokeParameterMod.InvokeParameter
import typings.std.Uint8Array
import typings.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/invoke/Invoke", JSImport.Namespace)
@js.native
object protocolInvokeInvokeMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke () extends EntityArray[InvokeParameter] {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: Invoke) = this()
    def this(listener: String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: String, parameters: (Boolean | Double | String | XML | Uint8Array)*) = this()
    /**
      * Listener, represent function's name.
      */
    var listener: js.Any = js.native
    /**
      * Apply to a matched function.
      *
      * @param obj Target object to find matched function.
      * @return Whether succeded to find matched function.
      */
    @JSName("apply")
    def apply(obj: js.Object): Boolean = js.native
    /**
      * Apply to a function.
      *
      * @param thisArg Owner of the function.
      * @param func Function to call.
      */
    @JSName("apply")
    def apply(thisArg: js.Object, func: js.Function): Unit = js.native
    /**
      * Get arguments for Function.apply().
      *
      * @return An array containing values of the contained parameters.
      */
    def getArguments(): js.Array[_] = js.native
    /**
      * Get listener.
      */
    def getListener(): String = js.native
  }
  
}

