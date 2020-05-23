package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import typings.std.RegExp
import typings.storybookAddons.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsParameter
  extends Object
     with /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: js.UndefOr[String] = js.undefined
  var hierarchySeparator: js.UndefOr[RegExp] = js.undefined
  var showRoots: js.UndefOr[Boolean] = js.undefined
  var storySort: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[Base] = js.undefined
}

object OptionsParameter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    hierarchyRootSeparator: String = null,
    hierarchySeparator: RegExp = null,
    showRoots: js.UndefOr[Boolean] = js.undefined,
    storySort: js.Any = null,
    theme: Base = null
  ): OptionsParameter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hierarchyRootSeparator != null) __obj.updateDynamic("hierarchyRootSeparator")(hierarchyRootSeparator.asInstanceOf[js.Any])
    if (hierarchySeparator != null) __obj.updateDynamic("hierarchySeparator")(hierarchySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoots)) __obj.updateDynamic("showRoots")(showRoots.get.asInstanceOf[js.Any])
    if (storySort != null) __obj.updateDynamic("storySort")(storySort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsParameter]
  }
}

