package typings.sharepoint.SP

import typings.sharepoint.AnonHigh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ContextPermissions")
@js.native
class ContextPermissions () extends js.Object {
  def fromJson(json: AnonHigh): Unit = js.native
  def has(perm: Double): Boolean = js.native
  def hasPermissions(high: Double, low: Double): Boolean = js.native
}

