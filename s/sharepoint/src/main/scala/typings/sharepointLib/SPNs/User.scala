package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.User")
@js.native
class User () extends Principal {
  def get_email(): java.lang.String = js.native
  def get_groups(): GroupCollection = js.native
  def get_isSiteAdmin(): scala.Boolean = js.native
  def get_userId(): UserIdInfo = js.native
  def set_email(value: java.lang.String): scala.Unit = js.native
  def set_isSiteAdmin(value: scala.Boolean): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

