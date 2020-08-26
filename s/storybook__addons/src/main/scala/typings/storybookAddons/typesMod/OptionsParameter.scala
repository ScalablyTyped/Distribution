package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import typings.std.RegExp
import typings.storybookAddons.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsParameter
  extends Object
     with /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: js.UndefOr[String] = js.native
  var hierarchySeparator: js.UndefOr[RegExp] = js.native
  var showRoots: js.UndefOr[Boolean] = js.native
  var storySort: js.UndefOr[js.Any] = js.native
  var theme: js.UndefOr[Base] = js.native
}

object OptionsParameter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): OptionsParameter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[OptionsParameter]
  }
  @scala.inline
  implicit class OptionsParameterOps[Self <: OptionsParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHierarchyRootSeparator(value: String): Self = this.set("hierarchyRootSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchyRootSeparator: Self = this.set("hierarchyRootSeparator", js.undefined)
    @scala.inline
    def setHierarchySeparator(value: RegExp): Self = this.set("hierarchySeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchySeparator: Self = this.set("hierarchySeparator", js.undefined)
    @scala.inline
    def setShowRoots(value: Boolean): Self = this.set("showRoots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoots: Self = this.set("showRoots", js.undefined)
    @scala.inline
    def setStorySort(value: js.Any): Self = this.set("storySort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorySort: Self = this.set("storySort", js.undefined)
    @scala.inline
    def setTheme(value: Base): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

