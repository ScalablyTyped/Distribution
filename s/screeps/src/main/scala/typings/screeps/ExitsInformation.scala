package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type SD<K extends ResourceConstant> = {
//   [P in K]: number;
//   energy: number;
// }
/* Inlined std.Partial<std.Record<screeps.ExitKey, string>> */
trait ExitsInformation extends js.Object {
  var `1`: js.UndefOr[String] = js.undefined
  var `3`: js.UndefOr[String] = js.undefined
  var `5`: js.UndefOr[String] = js.undefined
  var `7`: js.UndefOr[String] = js.undefined
}

object ExitsInformation {
  @scala.inline
  def apply(`1`: String = null, `3`: String = null, `5`: String = null, `7`: String = null): ExitsInformation = {
    val __obj = js.Dynamic.literal()
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    if (`5` != null) __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    if (`7` != null) __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitsInformation]
  }
}

