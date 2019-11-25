package typings.qlikDashVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomControl extends js.Object {
  var label: String
  var ref: String
  var `type`: String
}

object ICustomControl {
  @scala.inline
  def apply(label: String, ref: String, `type`: String): ICustomControl = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomControl]
  }
}

