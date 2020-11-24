package typings.reactFoundation.thumbnailMod

import typings.react.mod.ImgHTMLAttributes
import typings.reactFoundation.enumsMod.Breakpoints
import typings.reactFoundation.enumsMod.ExtendedBreakpoints
import typings.reactFoundation.enumsMod.FloatTypes
import typings.reactFoundation.enumsMod.HorizontalAlignments
import typings.reactFoundation.enumsMod.SpaceControls
import typings.reactFoundation.enumsMod.VerticalAlignments
import typings.reactFoundation.reactFoundationStrings.large
import typings.reactFoundation.reactFoundationStrings.medium
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
- typings.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float
- typings.reactFoundation.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ @js.native
trait ThumbnailProps extends ImgHTMLAttributes[HTMLImageElement] {
  
  var alignX: js.UndefOr[HorizontalAlignments] = js.native
  
  var alignY: js.UndefOr[VerticalAlignments] = js.native
  
  var centerAlign: js.UndefOr[Boolean] = js.native
  
  var flexChild: js.UndefOr[SpaceControls] = js.native
  
  var flexContainer: js.UndefOr[Boolean] = js.native
  
  var flexDirCol: js.UndefOr[ExtendedBreakpoints] = js.native
  
  var flexDirColRev: js.UndefOr[ExtendedBreakpoints] = js.native
  
  var flexDirRow: js.UndefOr[ExtendedBreakpoints] = js.native
  
  var flexDirRowRev: js.UndefOr[ExtendedBreakpoints] = js.native
  
  var flexOrder: js.UndefOr[Double] = js.native
  
  var flexOrderLarge: js.UndefOr[Double] = js.native
  
  var flexOrderMedium: js.UndefOr[Double] = js.native
  
  var flexOrderSmall: js.UndefOr[Double] = js.native
  
  var float: js.UndefOr[FloatTypes] = js.native
  
  var hideFor: js.UndefOr[medium | large] = js.native
  
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
  
  var isClearfix: js.UndefOr[Boolean] = js.native
  
  var isHidden: js.UndefOr[Boolean] = js.native
  
  var isInvisible: js.UndefOr[Boolean] = js.native
  
  var noDefaultClassName: js.UndefOr[String] = js.native
  
  var selfAlignX: js.UndefOr[HorizontalAlignments] = js.native
  
  var selfAlignY: js.UndefOr[VerticalAlignments] = js.native
  
  var showFor: js.UndefOr[Breakpoints] = js.native
  
  var showForLandscape: js.UndefOr[Boolean] = js.native
  
  var showForPortrait: js.UndefOr[Boolean] = js.native
  
  var showForSr: js.UndefOr[Boolean] = js.native
  
  var showOnFocus: js.UndefOr[Boolean] = js.native
  
  var showOnlyFor: js.UndefOr[Breakpoints] = js.native
}
object ThumbnailProps {
  
  @scala.inline
  def apply(): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailProps]
  }
  
  @scala.inline
  implicit class ThumbnailPropsOps[Self <: ThumbnailProps] (val x: Self) extends AnyVal {
    
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
    def setAlignX(value: HorizontalAlignments): Self = this.set("alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignX: Self = this.set("alignX", js.undefined)
    
    @scala.inline
    def setAlignY(value: VerticalAlignments): Self = this.set("alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignY: Self = this.set("alignY", js.undefined)
    
    @scala.inline
    def setCenterAlign(value: Boolean): Self = this.set("centerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterAlign: Self = this.set("centerAlign", js.undefined)
    
    @scala.inline
    def setFlexChild(value: SpaceControls): Self = this.set("flexChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexChild: Self = this.set("flexChild", js.undefined)
    
    @scala.inline
    def setFlexContainer(value: Boolean): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    
    @scala.inline
    def setFlexDirCol(value: ExtendedBreakpoints): Self = this.set("flexDirCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirCol: Self = this.set("flexDirCol", js.undefined)
    
    @scala.inline
    def setFlexDirColRev(value: ExtendedBreakpoints): Self = this.set("flexDirColRev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirColRev: Self = this.set("flexDirColRev", js.undefined)
    
    @scala.inline
    def setFlexDirRow(value: ExtendedBreakpoints): Self = this.set("flexDirRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirRow: Self = this.set("flexDirRow", js.undefined)
    
    @scala.inline
    def setFlexDirRowRev(value: ExtendedBreakpoints): Self = this.set("flexDirRowRev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirRowRev: Self = this.set("flexDirRowRev", js.undefined)
    
    @scala.inline
    def setFlexOrder(value: Double): Self = this.set("flexOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexOrder: Self = this.set("flexOrder", js.undefined)
    
    @scala.inline
    def setFlexOrderLarge(value: Double): Self = this.set("flexOrderLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexOrderLarge: Self = this.set("flexOrderLarge", js.undefined)
    
    @scala.inline
    def setFlexOrderMedium(value: Double): Self = this.set("flexOrderMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexOrderMedium: Self = this.set("flexOrderMedium", js.undefined)
    
    @scala.inline
    def setFlexOrderSmall(value: Double): Self = this.set("flexOrderSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexOrderSmall: Self = this.set("flexOrderSmall", js.undefined)
    
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
    def setSelfAlignX(value: HorizontalAlignments): Self = this.set("selfAlignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfAlignX: Self = this.set("selfAlignX", js.undefined)
    
    @scala.inline
    def setSelfAlignY(value: VerticalAlignments): Self = this.set("selfAlignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfAlignY: Self = this.set("selfAlignY", js.undefined)
    
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
