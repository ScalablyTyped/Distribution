package typings.semanticUiReact.genericMod

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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlIframeProps]
  }
}

