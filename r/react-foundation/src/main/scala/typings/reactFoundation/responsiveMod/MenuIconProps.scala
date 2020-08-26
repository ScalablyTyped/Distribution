package typings.reactFoundation.responsiveMod

import typings.react.mod.ButtonHTMLAttributes
import typings.reactFoundation.enumsMod.Breakpoints
import typings.reactFoundation.enumsMod.FloatTypes
import typings.reactFoundation.reactFoundationStrings.large
import typings.reactFoundation.reactFoundationStrings.medium
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
- typings.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
trait MenuIconProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var float: js.UndefOr[FloatTypes] = js.native
  var hideFor: js.UndefOr[medium | large] = js.native
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
  var isClearfix: js.UndefOr[Boolean] = js.native
  var isHidden: js.UndefOr[Boolean] = js.native
  var isInvisible: js.UndefOr[Boolean] = js.native
  var noDefaultClassName: js.UndefOr[String] = js.native
  var showFor: js.UndefOr[Breakpoints] = js.native
  var showForLandscape: js.UndefOr[Boolean] = js.native
  var showForPortrait: js.UndefOr[Boolean] = js.native
  var showForSr: js.UndefOr[Boolean] = js.native
  var showOnFocus: js.UndefOr[Boolean] = js.native
  var showOnlyFor: js.UndefOr[Breakpoints] = js.native
}

object MenuIconProps {
  @scala.inline
  def apply(): MenuIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuIconProps]
  }
  @scala.inline
  implicit class MenuIconPropsOps[Self <: MenuIconProps] (val x: Self) extends AnyVal {
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
    def setFloat(value: FloatTypes): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setHideFor(value: medium | large): Self = this.set("hideFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFor: Self = this.set("hideFor", js.undefined)
    @scala.inline
    def setHideOnlyFor(value: Breakpoints): Self = this.set("hideOnlyFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnlyFor: Self = this.set("hideOnlyFor", js.undefined)
    @scala.inline
    def setIsClearfix(value: Boolean): Self = this.set("isClearfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClearfix: Self = this.set("isClearfix", js.undefined)
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    @scala.inline
    def setIsInvisible(value: Boolean): Self = this.set("isInvisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInvisible: Self = this.set("isInvisible", js.undefined)
    @scala.inline
    def setNoDefaultClassName(value: String): Self = this.set("noDefaultClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDefaultClassName: Self = this.set("noDefaultClassName", js.undefined)
    @scala.inline
    def setShowFor(value: Breakpoints): Self = this.set("showFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFor: Self = this.set("showFor", js.undefined)
    @scala.inline
    def setShowForLandscape(value: Boolean): Self = this.set("showForLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowForLandscape: Self = this.set("showForLandscape", js.undefined)
    @scala.inline
    def setShowForPortrait(value: Boolean): Self = this.set("showForPortrait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowForPortrait: Self = this.set("showForPortrait", js.undefined)
    @scala.inline
    def setShowForSr(value: Boolean): Self = this.set("showForSr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowForSr: Self = this.set("showForSr", js.undefined)
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnFocus: Self = this.set("showOnFocus", js.undefined)
    @scala.inline
    def setShowOnlyFor(value: Breakpoints): Self = this.set("showOnlyFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnlyFor: Self = this.set("showOnlyFor", js.undefined)
  }
  
}

