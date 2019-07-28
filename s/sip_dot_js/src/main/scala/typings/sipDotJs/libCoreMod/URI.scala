package typings.sipDotJs.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "URI")
@js.native
class URI protected ()
  extends typings.sipDotJs.libCoreMessagesMod.URI {
  /**
    * Constructor
    * @param scheme
    * @param user
    * @param host
    * @param port
    * @param parameters
    * @param headers
    */
  def this(scheme: String, user: String, host: String) = this()
  def this(scheme: String, user: String, host: String, port: Double) = this()
  def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
  def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
}

