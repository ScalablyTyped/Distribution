package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleConfig extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var style: java.lang.String
}

object StyleConfig {
  @scala.inline
  def apply(label: java.lang.String, style: java.lang.String, className: java.lang.String = null): StyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("style")(style)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[StyleConfig]
  }
}

