package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackProps extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var kind: java.lang.String
  var label: java.lang.String
  var src: java.lang.String
  var srcLang: java.lang.String
}

object TrackProps {
  @scala.inline
  def apply(
    kind: java.lang.String,
    label: java.lang.String,
    src: java.lang.String,
    srcLang: java.lang.String,
    default: js.UndefOr[scala.Boolean] = js.undefined
  ): TrackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("srcLang")(srcLang)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[TrackProps]
  }
}

