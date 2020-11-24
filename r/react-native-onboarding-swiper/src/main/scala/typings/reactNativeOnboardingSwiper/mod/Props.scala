package typings.reactNativeOnboardingSwiper.mod

import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Done Button.
    */
  var DoneButtonComponent: js.UndefOr[FC[DoneButtonProps]] = js.native
  
  /**
    * Dot for the pagination, gets selected as prop to indicate the active page.
    */
  var DotComponent: js.UndefOr[FC[DotProps]] = js.native
  
  /**
    * Next Button, gets nextLabel as prop.
    */
  var NextButtonComponent: js.UndefOr[FC[NextButtonProps]] = js.native
  
  // CUSTOM COMPONENTS
  /**
    * Skip Button, gets skipLabel as prop.
    */
  var SkipButtonComponent: js.UndefOr[FC[SkipButtonProps]] = js.native
  
  /**
    * Font scaling can cause troubles with high-resolution screens. You may want to disable it.
    * @default true
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * BackgroundColor of the bottom bar.
    * @default "transparent"
    */
  var bottomBarColor: js.UndefOr[String] = js.native
  
  // GENERAL
  /**
    * A number for the height of the bottom bar.
    * @default 60
    */
  var bottomBarHeight: js.UndefOr[Double] = js.native
  
  /**
    * A bool flag indicating whether the bottom bar should be highlighted.
    * @default true
    */
  var bottomBarHighlight: js.UndefOr[Boolean] = js.native
  
  // DEFAULT PAGE STYLES
  /**
    * Override the default container styles.
    */
  var containerStyles: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * A bool flag indicating whether the status bar should change with the background color.
    * @default true
    */
  var controlStatusBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional props for the FlatList which holds all the pages.
    */
  var flatlistProps: js.UndefOr[FlatListProps[Page]] = js.native
  
  /**
    * Override the default image container styles e.g. the paddingBottom of 60.
    */
  var imageContainerStyles: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  // BUTTONS
  /**
    * A string OR a React-Native component for the Next label.
    * @default "Next"
    */
  var nextLabel: js.UndefOr[String | Element] = js.native
  
  /**
    * A callback that is fired after the Onboarding is completed.
    */
  var onDone: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * A callback that is fired if the Onboarding is skipped.
    */
  var onSkip: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * A function that receives the page index as a parameter on page change. Example Usage.
    */
  var pageIndexCallback: js.UndefOr[js.Function1[/* pageIndex */ Double, _]] = js.native
  
  /**
    * An array of pages in the following shape.
    */
  var pages: js.Array[Page] = js.native
  
  /**
    * A bool flag indicating whether the Done checkmark button is visible.
    * @default true
    */
  var showDone: js.UndefOr[Boolean] = js.native
  
  /**
    * A bool flag indicating whether the Next button is visible.
    * @default true
    */
  var showNext: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the bottom pagination bar.
    * @default true
    */
  var showPagination: js.UndefOr[Boolean] = js.native
  
  /**
    * A bool flag indicating whether the Skip button is visible.
    * @default true
    */
  var showSkip: js.UndefOr[Boolean] = js.native
  
  /**
    * A string OR a React-Native component for the Skip label.
    * @default "Skip"
    */
  var skipLabel: js.UndefOr[String | Element] = js.native
  
  /**
    * When pressing skip, go to that page (e.g. skipToPage={2}). If this prop is provided, ignores onSkip.
    */
  var skipToPage: js.UndefOr[Double] = js.native
  
  /**
    * Override the default subtitle styles.
    */
  var subTitleStyles: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Override the default title styles.
    */
  var titleStyles: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * The duration in milliseconds for the animation of the background color for the page transition.
    * @default 500
    */
  var transitionAnimationDuration: js.UndefOr[Double] = js.native
}
object Props {
  
  @scala.inline
  def apply(pages: js.Array[Page]): Props = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneButtonComponent(value: FC[DoneButtonProps]): Self = this.set("DoneButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneButtonComponent: Self = this.set("DoneButtonComponent", js.undefined)
    
    @scala.inline
    def setDotComponent(value: FC[DotProps]): Self = this.set("DotComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotComponent: Self = this.set("DotComponent", js.undefined)
    
    @scala.inline
    def setNextButtonComponent(value: FC[NextButtonProps]): Self = this.set("NextButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButtonComponent: Self = this.set("NextButtonComponent", js.undefined)
    
    @scala.inline
    def setSkipButtonComponent(value: FC[SkipButtonProps]): Self = this.set("SkipButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipButtonComponent: Self = this.set("SkipButtonComponent", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setBottomBarColor(value: String): Self = this.set("bottomBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBarColor: Self = this.set("bottomBarColor", js.undefined)
    
    @scala.inline
    def setBottomBarHeight(value: Double): Self = this.set("bottomBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBarHeight: Self = this.set("bottomBarHeight", js.undefined)
    
    @scala.inline
    def setBottomBarHighlight(value: Boolean): Self = this.set("bottomBarHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBarHighlight: Self = this.set("bottomBarHighlight", js.undefined)
    
    @scala.inline
    def setContainerStyles(value: StyleProp[ViewStyle]): Self = this.set("containerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyles: Self = this.set("containerStyles", js.undefined)
    
    @scala.inline
    def setContainerStylesNull: Self = this.set("containerStyles", null)
    
    @scala.inline
    def setControlStatusBar(value: Boolean): Self = this.set("controlStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlStatusBar: Self = this.set("controlStatusBar", js.undefined)
    
    @scala.inline
    def setFlatlistProps(value: FlatListProps[Page]): Self = this.set("flatlistProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatlistProps: Self = this.set("flatlistProps", js.undefined)
    
    @scala.inline
    def setImageContainerStyles(value: StyleProp[ViewStyle]): Self = this.set("imageContainerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageContainerStyles: Self = this.set("imageContainerStyles", js.undefined)
    
    @scala.inline
    def setImageContainerStylesNull: Self = this.set("imageContainerStyles", null)
    
    @scala.inline
    def setNextLabel(value: String | Element): Self = this.set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLabel: Self = this.set("nextLabel", js.undefined)
    
    @scala.inline
    def setOnDone(value: () => _): Self = this.set("onDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDone: Self = this.set("onDone", js.undefined)
    
    @scala.inline
    def setOnSkip(value: () => _): Self = this.set("onSkip", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSkip: Self = this.set("onSkip", js.undefined)
    
    @scala.inline
    def setPageIndexCallback(value: /* pageIndex */ Double => _): Self = this.set("pageIndexCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePageIndexCallback: Self = this.set("pageIndexCallback", js.undefined)
    
    @scala.inline
    def setShowDone(value: Boolean): Self = this.set("showDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDone: Self = this.set("showDone", js.undefined)
    
    @scala.inline
    def setShowNext(value: Boolean): Self = this.set("showNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNext: Self = this.set("showNext", js.undefined)
    
    @scala.inline
    def setShowPagination(value: Boolean): Self = this.set("showPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPagination: Self = this.set("showPagination", js.undefined)
    
    @scala.inline
    def setShowSkip(value: Boolean): Self = this.set("showSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSkip: Self = this.set("showSkip", js.undefined)
    
    @scala.inline
    def setSkipLabel(value: String | Element): Self = this.set("skipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLabel: Self = this.set("skipLabel", js.undefined)
    
    @scala.inline
    def setSkipToPage(value: Double): Self = this.set("skipToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipToPage: Self = this.set("skipToPage", js.undefined)
    
    @scala.inline
    def setSubTitleStyles(value: StyleProp[TextStyle]): Self = this.set("subTitleStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleStyles: Self = this.set("subTitleStyles", js.undefined)
    
    @scala.inline
    def setSubTitleStylesNull: Self = this.set("subTitleStyles", null)
    
    @scala.inline
    def setTitleStyles(value: StyleProp[TextStyle]): Self = this.set("titleStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyles: Self = this.set("titleStyles", js.undefined)
    
    @scala.inline
    def setTitleStylesNull: Self = this.set("titleStyles", null)
    
    @scala.inline
    def setTransitionAnimationDuration(value: Double): Self = this.set("transitionAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAnimationDuration: Self = this.set("transitionAnimationDuration", js.undefined)
  }
}
