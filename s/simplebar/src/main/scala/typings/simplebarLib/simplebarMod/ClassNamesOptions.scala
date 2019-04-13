package typings
package simplebarLib.simplebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesOptions extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var scrollContent: js.UndefOr[java.lang.String] = js.undefined
  var scrollbar: js.UndefOr[java.lang.String] = js.undefined
  var track: js.UndefOr[java.lang.String] = js.undefined
}

object ClassNamesOptions {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    scrollContent: java.lang.String = null,
    scrollbar: java.lang.String = null,
    track: java.lang.String = null
  ): ClassNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (scrollContent != null) __obj.updateDynamic("scrollContent")(scrollContent)
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar)
    if (track != null) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[ClassNamesOptions]
  }
}

