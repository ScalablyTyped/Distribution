package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetInfo extends NotifyInfo {
  var `type`: reset
}

object ResetInfo {
  @scala.inline
  def apply(`type`: reset): ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetInfo]
  }
}

