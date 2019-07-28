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
    val __obj = js.Dynamic.literal(kind = kind, label = label, src = src, srcLang = srcLang)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[TrackProps]
  }
}

