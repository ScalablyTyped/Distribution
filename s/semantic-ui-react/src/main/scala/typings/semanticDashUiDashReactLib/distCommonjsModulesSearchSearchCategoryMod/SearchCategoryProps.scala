package typings
package semanticDashUiDashReactLib.distCommonjsModulesSearchSearchCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCategoryProps
  extends StrictSearchCategoryProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object SearchCategoryProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    name: java.lang.String = null,
    renderer: /* props */ SearchCategoryProps => reactLib.reactMod.ReactElement[_] = null,
    results: js.Array[
      reactLib.reactMod.ComponentClass[
        semanticDashUiDashReactLib.distCommonjsModulesSearchSearchResultMod.SearchResultProps, 
        reactLib.reactMod.ComponentState
      ]
    ] = null
  ): SearchCategoryProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[SearchCategoryProps]
  }
}

