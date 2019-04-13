package typings
package semanticDashUiDashReactLib.srcGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlSpanProps
  extends StrictHtmlSpanProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object HtmlSpanProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNode = null
  ): HtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlSpanProps]
  }
}

