package typings.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod

import org.scalablytyped.runtime.StringDictionary
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very long`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very short`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.full
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.long
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderLineProps
  extends StrictPlaceholderLineProps
     with /* key */ StringDictionary[js.Any]

object PlaceholderLineProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null
  ): PlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderLineProps]
  }
}

