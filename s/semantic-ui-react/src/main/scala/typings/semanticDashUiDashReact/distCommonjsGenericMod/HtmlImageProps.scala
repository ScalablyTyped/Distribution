package typings.semanticDashUiDashReact.distCommonjsGenericMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlImageProps
  extends StrictHtmlImageProps
     with /* key */ StringDictionary[js.Any]

object HtmlImageProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, src: String = null): HtmlImageProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlImageProps]
  }
}

