package typings.atStorybookAddonDashNotes.distPanelMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxHighlighterProps
  extends /* key */ StringDictionary[js.Any] {
  var children: ReactElement
  var className: js.UndefOr[String] = js.undefined
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(
    children: ReactElement,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null
  ): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
}

