package typings.atStorybookAddonDashViewport

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height
  extends /* styleName */ StringDictionary[js.Any] {
  var height: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    StringDictionary: /* styleName */ StringDictionary[js.Any] = null,
    height: String = null,
    width: String = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

