package typings
package samchonLib.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "Invoke")
@js.native
/**
  * Default Constructor.
  */
class Invoke ()
  extends samchonLib.protocolInvokeInvokeMod.Invoke {
  /**
    * Copy Constructor.
    *
    * @param invoke
    */
  def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke) = this()
  def this(listener: java.lang.String) = this()
  /**
    * Construct from listener and parametric values.
    *
    * @param listener
    * @param parameters
    */
  def this(listener: java.lang.String, parameters: (scala.Boolean | scala.Double | java.lang.String | sxmlLib.sxmlMod.XML | stdLib.Uint8Array)*) = this()
}

