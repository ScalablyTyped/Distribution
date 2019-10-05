package typings.soap.soapMod.security

import typings.soap.libSecurityWSSecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security.WSSecurity")
@js.native
class WSSecurityCls protected ()
  extends typings.soap.libSecurityMod.WSSecurity {
  def this(username: String, password: String) = this()
  def this(username: String, password: String, options: String) = this()
  def this(username: String, password: String, options: IWSSecurityOptions) = this()
}

