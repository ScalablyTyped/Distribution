package typings
package semanticDashUiDashReactLib.srcGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlImageProps
  extends StrictHtmlImageProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object HtmlImageProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    src: java.lang.String = null
  ): HtmlImageProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[HtmlImageProps]
  }
}

