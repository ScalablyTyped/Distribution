package typings
package semanticDashUiDashReactLib.distCommonjsModulesModalModalContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalContentProps
  extends StrictModalContentProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object ModalContentProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    image: js.UndefOr[scala.Boolean] = js.undefined,
    scrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalContentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(scrolling)) __obj.updateDynamic("scrolling")(scrolling)
    __obj.asInstanceOf[ModalContentProps]
  }
}

