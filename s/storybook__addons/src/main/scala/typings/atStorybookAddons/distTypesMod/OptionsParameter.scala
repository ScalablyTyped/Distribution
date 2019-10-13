package typings.atStorybookAddons.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookAddons.Anon_Base
import typings.std.Object
import typings.std.PropertyKey
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsParameter
  extends Object
     with /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: js.UndefOr[String] = js.undefined
  var hierarchySeparator: js.UndefOr[RegExp] = js.undefined
  var storySort: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[Anon_Base] = js.undefined
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
    storySort: js.Any = null,
    theme: Anon_Base = null
  ): OptionsParameter = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hierarchyRootSeparator != null) __obj.updateDynamic("hierarchyRootSeparator")(hierarchyRootSeparator)
    if (hierarchySeparator != null) __obj.updateDynamic("hierarchySeparator")(hierarchySeparator)
    if (storySort != null) __obj.updateDynamic("storySort")(storySort)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[OptionsParameter]
  }
}

