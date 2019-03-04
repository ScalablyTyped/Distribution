package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultProps
  extends StrictSearchResultProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object SearchResultProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    description: java.lang.String = null,
    id: scala.Double | java.lang.String = null,
    image: java.lang.String = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ SearchResultProps, 
      scala.Unit
    ] = null,
    price: java.lang.String = null,
    renderer: js.Function1[/* props */ SearchResultProps, js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]] = null
  ): SearchResultProps = {
    val __obj = js.Dynamic.literal(title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (price != null) __obj.updateDynamic("price")(price)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[SearchResultProps]
  }
}

