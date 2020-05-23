package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.NotifyInfo
import typings.rcFieldForm.rcFieldFormStrings.reset
import typings.rcFieldForm.rcFieldFormStrings.validateFinish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends NotifyInfo {
  var `type`: validateFinish | reset
}

object Type {
  @scala.inline
  def apply(`type`: validateFinish | reset): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

