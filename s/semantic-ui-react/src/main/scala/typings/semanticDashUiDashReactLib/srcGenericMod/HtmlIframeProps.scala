package typings
package semanticDashUiDashReactLib.srcGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlIframeProps
  extends StrictHtmlIframeProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object HtmlIframeProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    src: java.lang.String = null
  ): HtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[HtmlIframeProps]
  }
}

