package typings.soap.libSecurityWSSecurityMod

import typings.soap.libTypesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/WSSecurity", "WSSecurity")
@js.native
class WSSecurity protected () extends ISecurity {
  def this(username: String, password: String) = this()
  def this(username: String, password: String, options: String) = this()
  def this(username: String, password: String, options: IWSSecurityOptions) = this()
  var _actor: js.Any = js.native
  var _hasNonce: js.Any = js.native
  var _hasTimeStamp: js.Any = js.native
  var _hasTokenCreated: js.Any = js.native
  var _mustUnderstand: js.Any = js.native
  var _password: js.Any = js.native
  var _passwordType: js.Any = js.native
  var _username: js.Any = js.native
  @JSName("toXML")
  def toXML_MWSSecurity(): String = js.native
}

