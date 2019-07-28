package typings.semanticDashUiDashReact.distCommonjsGenericMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlIframeProps
  extends StrictHtmlIframeProps
     with /* key */ StringDictionary[js.Any]

object HtmlIframeProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, src: String = null): HtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[HtmlIframeProps]
  }
}

