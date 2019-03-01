package typings
package semanticDashUiDashReactLib.distCommonjsElementsPlaceholderPlaceholderLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderLineProps
  extends StrictPlaceholderLineProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object PlaceholderLineProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: java.lang.String = null,
    length: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.full | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very long`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.long | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.medium | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.short | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very short`) = null
  ): PlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderLineProps]
  }
}

