package typings.qlikDashVisualizationextensions.ExtensionAPINs

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
    val __obj = js.Dynamic.literal(label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomControl]
  }
}

