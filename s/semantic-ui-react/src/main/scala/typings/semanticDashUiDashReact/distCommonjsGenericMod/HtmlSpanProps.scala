package typings.semanticDashUiDashReact.distCommonjsGenericMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlSpanProps
  extends StrictHtmlSpanProps
     with /* key */ StringDictionary[js.Any]

object HtmlSpanProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, children: ReactNode = null): HtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlSpanProps]
  }
}

