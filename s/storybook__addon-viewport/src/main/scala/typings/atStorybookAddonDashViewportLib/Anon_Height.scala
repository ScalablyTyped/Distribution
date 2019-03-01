package typings
package atStorybookAddonDashViewportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height
  extends /* styleName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var height: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    StringDictionary: /* styleName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    height: java.lang.String = null,
    width: java.lang.String = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

