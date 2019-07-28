package typings.reactDashRte.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleConfig extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var label: String
  var style: String
}

object StyleConfig {
  @scala.inline
  def apply(label: String, style: String, className: String = null): StyleConfig = {
    val __obj = js.Dynamic.literal(label = label, style = style)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[StyleConfig]
  }
}

