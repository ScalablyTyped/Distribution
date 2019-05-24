package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSSecurity")
@js.native
class WSSecurity protected ()
  extends soapLib.libSecurityMod.WSSecurity {
  def this(username: java.lang.String, password: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, options: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, options: soapLib.libSecurityWSSecurityMod.IWSSecurityOptions) = this()
}

