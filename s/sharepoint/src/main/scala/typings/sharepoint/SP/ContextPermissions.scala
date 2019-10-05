package typings.sharepoint.SP

import typings.sharepoint.Anon_High
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ContextPermissions")
@js.native
class ContextPermissions () extends js.Object {
  def fromJson(json: Anon_High): Unit = js.native
  def has(perm: Double): Boolean = js.native
  def hasPermissions(high: Double, low: Double): Boolean = js.native
}

