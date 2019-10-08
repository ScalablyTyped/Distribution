package typings.atStorybookAddonDashLinks.distPreviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsCombo extends js.Object {
  var kind: String
  var story: String
}

object ParamsCombo {
  @scala.inline
  def apply(kind: String, story: String): ParamsCombo = {
    val __obj = js.Dynamic.literal(kind = kind, story = story)
  
    __obj.asInstanceOf[ParamsCombo]
  }
}

