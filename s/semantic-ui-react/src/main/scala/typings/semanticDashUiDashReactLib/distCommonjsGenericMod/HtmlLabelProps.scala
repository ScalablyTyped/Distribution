package typings
package semanticDashUiDashReactLib.distCommonjsGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlLabelProps
  extends StrictHtmlLabelProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object HtmlLabelProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNode = null
  ): HtmlLabelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlLabelProps]
  }
}

