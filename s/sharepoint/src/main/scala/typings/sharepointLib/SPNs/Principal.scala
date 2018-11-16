package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Principal")
@js.native
class Principal () extends ClientObject {
  def get_id(): scala.Double = js.native
  def get_isHiddenInUI(): scala.Boolean = js.native
  def get_loginName(): java.lang.String = js.native
  def get_principalType(): sharepointLib.SPNs.UtilitiesNs.PrincipalType = js.native
  def get_title(): java.lang.String = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
}

