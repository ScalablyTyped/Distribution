package typings
package samchonLib.protocolInvokeInvokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/invoke/Invoke", "Invoke")
@js.native
/**
  * Default Constructor.
  */
class Invoke ()
  extends samchonLib.protocolEntityEntityArrayMod.EntityArray[samchonLib.protocolInvokeInvokeParameterMod.InvokeParameter] {
  /**
    * Copy Constructor.
    *
    * @param invoke
    */
  def this(invoke: Invoke) = this()
  def this(listener: java.lang.String) = this()
  /**
    * Construct from listener and parametric values.
    *
    * @param listener
    * @param parameters
    */
  def this(listener: java.lang.String, parameters: (scala.Boolean | scala.Double | java.lang.String | sxmlLib.sxmlMod.XML | stdLib.Uint8Array)*) = this()
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
  def apply(obj: js.Object): scala.Boolean = js.native
  /**
    * Apply to a function.
    *
    * @param thisArg Owner of the function.
    * @param func Function to call.
    */
  @JSName("apply")
  def apply(thisArg: js.Object, func: js.Function): scala.Unit = js.native
  /**
    * Get arguments for Function.apply().
    *
    * @return An array containing values of the contained parameters.
    */
  def getArguments(): js.Array[_] = js.native
  /**
    * Get listener.
    */
  def getListener(): java.lang.String = js.native
}

