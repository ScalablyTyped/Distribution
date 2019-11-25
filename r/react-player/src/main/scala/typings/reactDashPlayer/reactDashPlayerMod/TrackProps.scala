package typings.reactDashPlayer.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackProps extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var kind: String
  var label: String
  var src: String
  var srcLang: String
}

object TrackProps {
  @scala.inline
  def apply(
    kind: String,
    label: String,
    src: String,
    srcLang: String,
    default: js.UndefOr[Boolean] = js.undefined
  ): TrackProps = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcLang = srcLang.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackProps]
  }
}

