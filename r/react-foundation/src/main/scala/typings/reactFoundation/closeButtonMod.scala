package typings.reactFoundation

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.StatelessComponent
import typings.reactFoundation.enumsMod.Breakpoints
import typings.reactFoundation.enumsMod.ExtendedBreakpoints
import typings.reactFoundation.enumsMod.FloatTypes
import typings.reactFoundation.enumsMod.HorizontalAlignments
import typings.reactFoundation.enumsMod.SpaceControls
import typings.reactFoundation.enumsMod.VerticalAlignments
import typings.reactFoundation.reactFoundationStrings.large
import typings.reactFoundation.reactFoundationStrings.medium
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeButtonMod {
  
  @JSImport("react-foundation/components/close-button", "CloseButton")
  @js.native
  val CloseButton: StatelessComponent[CloseButtonProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typings.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float
  - typings.reactFoundation.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ @js.native
  trait CloseButtonProps extends ButtonHTMLAttributes[HTMLButtonElement] {
    
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
  object CloseButtonProps {
    
    @scala.inline
    def apply(): CloseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseButtonProps]
    }
    
    @scala.inline
    implicit class CloseButtonPropsMutableBuilder[Self <: CloseButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignX(value: HorizontalAlignments): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
      
      @scala.inline
      def setAlignY(value: VerticalAlignments): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
      
      @scala.inline
      def setCenterAlign(value: Boolean): Self = StObject.set(x, "centerAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterAlignUndefined: Self = StObject.set(x, "centerAlign", js.undefined)
      
      @scala.inline
      def setFlexChild(value: SpaceControls): Self = StObject.set(x, "flexChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexChildUndefined: Self = StObject.set(x, "flexChild", js.undefined)
      
      @scala.inline
      def setFlexContainer(value: Boolean): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexContainerUndefined: Self = StObject.set(x, "flexContainer", js.undefined)
      
      @scala.inline
      def setFlexDirCol(value: ExtendedBreakpoints): Self = StObject.set(x, "flexDirCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirColRev(value: ExtendedBreakpoints): Self = StObject.set(x, "flexDirColRev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirColRevUndefined: Self = StObject.set(x, "flexDirColRev", js.undefined)
      
      @scala.inline
      def setFlexDirColUndefined: Self = StObject.set(x, "flexDirCol", js.undefined)
      
      @scala.inline
      def setFlexDirRow(value: ExtendedBreakpoints): Self = StObject.set(x, "flexDirRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirRowRev(value: ExtendedBreakpoints): Self = StObject.set(x, "flexDirRowRev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirRowRevUndefined: Self = StObject.set(x, "flexDirRowRev", js.undefined)
      
      @scala.inline
      def setFlexDirRowUndefined: Self = StObject.set(x, "flexDirRow", js.undefined)
      
      @scala.inline
      def setFlexOrder(value: Double): Self = StObject.set(x, "flexOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexOrderLarge(value: Double): Self = StObject.set(x, "flexOrderLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexOrderLargeUndefined: Self = StObject.set(x, "flexOrderLarge", js.undefined)
      
      @scala.inline
      def setFlexOrderMedium(value: Double): Self = StObject.set(x, "flexOrderMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexOrderMediumUndefined: Self = StObject.set(x, "flexOrderMedium", js.undefined)
      
      @scala.inline
      def setFlexOrderSmall(value: Double): Self = StObject.set(x, "flexOrderSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexOrderSmallUndefined: Self = StObject.set(x, "flexOrderSmall", js.undefined)
      
      @scala.inline
      def setFlexOrderUndefined: Self = StObject.set(x, "flexOrder", js.undefined)
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setSelfAlignX(value: HorizontalAlignments): Self = StObject.set(x, "selfAlignX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfAlignXUndefined: Self = StObject.set(x, "selfAlignX", js.undefined)
      
      @scala.inline
      def setSelfAlignY(value: VerticalAlignments): Self = StObject.set(x, "selfAlignY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfAlignYUndefined: Self = StObject.set(x, "selfAlignY", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
    }
  }
}
