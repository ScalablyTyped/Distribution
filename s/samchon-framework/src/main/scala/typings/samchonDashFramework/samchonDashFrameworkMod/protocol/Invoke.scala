package typings.samchonDashFramework.samchonDashFrameworkMod.protocol

import typings.std.Uint8Array
import typings.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.Invoke")
@js.native
/**
  * Default Constructor.
  */
class Invoke ()
  extends typings.samchon.samchonMod.protocol.Invoke {
  /**
    * Copy Constructor.
    *
    * @param invoke
    */
  def this(invoke: typings.samchon.protocolInvokeInvokeMod.Invoke) = this()
  def this(listener: String) = this()
  /**
    * Construct from listener and parametric values.
    *
    * @param listener
    * @param parameters
    */
  def this(listener: String, parameters: (Boolean | Double | String | XML | Uint8Array)*) = this()
}

