package typings.simplebar.simplebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesOptions extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var scrollContent: js.UndefOr[String] = js.undefined
  var scrollbar: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[String] = js.undefined
}

object ClassNamesOptions {
  @scala.inline
  def apply(
    content: String = null,
    scrollContent: String = null,
    scrollbar: String = null,
    track: String = null
  ): ClassNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (scrollContent != null) __obj.updateDynamic("scrollContent")(scrollContent.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNamesOptions]
  }
}

