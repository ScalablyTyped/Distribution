package typings.rnSwipeablePanel

import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rn-swipeable-panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rn-swipeable-panel", "LARGE_PANEL_CONTENT_HEIGHT")
  @js.native
  def LARGE_PANEL_CONTENT_HEIGHT: Double = js.native
  @scala.inline
  def LARGE_PANEL_CONTENT_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE_PANEL_CONTENT_HEIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("rn-swipeable-panel", "SMALL_PANEL_CONTENT_HEIGHT")
  @js.native
  def SMALL_PANEL_CONTENT_HEIGHT: Double = js.native
  @scala.inline
  def SMALL_PANEL_CONTENT_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL_PANEL_CONTENT_HEIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("rn-swipeable-panel", "SwipeablePanel")
  @js.native
  class SwipeablePanel protected ()
    extends Component[SwipeablePanelProps, js.Any, js.Any] {
    def this(props: SwipeablePanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwipeablePanelProps, context: js.Any) = this()
  }
  
  trait SwipeablePanelProps
    extends StObject
       with Props[SwipeablePanel] {
    
    /**
      * Set true if you want to make toucable outside of panel
      */
    var allowTouchOutside: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this prop to override bar style
      */
    var barStyle: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Use this prop to override close button icon style
      */
    var closeIconStyle: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Set true if you want to close panel by touching outside
      */
    var closeOnTouchOutside: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this prop to override close button background style
      */
    var closeRootStyle: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Set true if you want to make full with panel
      */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Required prop for panels actual state. Set true if you want to open panel
      */
    var isActive: Boolean
    
    /**
      * Set true if you want to disable black background opacity
      */
    var noBackgroundOpacity: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set true if you want to remove gray bar
      */
    var noBar: js.UndefOr[Boolean] = js.undefined
    
    // Event Handlers
    /**
      * Required prop to keep panel's state sync with your parent components'state. Will be fired when panel is closed. See the example project.
      */
    def onClose(): Unit
    
    /**
      * Set true if you want to let panel open just large mode
      */
    var onlyLarge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set true if you want to let panel open just small mode
      */
    var onlySmall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set true if you want to open panel large by default
      */
    var openLarge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set true if you want to show close button
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this prop to override panel style
      */
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SwipeablePanelProps {
    
    @scala.inline
    def apply(isActive: Boolean, onClose: () => Unit): SwipeablePanelProps = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
      __obj.asInstanceOf[SwipeablePanelProps]
    }
    
    @scala.inline
    implicit class SwipeablePanelPropsMutableBuilder[Self <: SwipeablePanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTouchOutside(value: Boolean): Self = StObject.set(x, "allowTouchOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTouchOutsideUndefined: Self = StObject.set(x, "allowTouchOutside", js.undefined)
      
      @scala.inline
      def setBarStyle(value: js.Object): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      @scala.inline
      def setCloseIconStyle(value: js.Object): Self = StObject.set(x, "closeIconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconStyleUndefined: Self = StObject.set(x, "closeIconStyle", js.undefined)
      
      @scala.inline
      def setCloseOnTouchOutside(value: Boolean): Self = StObject.set(x, "closeOnTouchOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnTouchOutsideUndefined: Self = StObject.set(x, "closeOnTouchOutside", js.undefined)
      
      @scala.inline
      def setCloseRootStyle(value: js.Object): Self = StObject.set(x, "closeRootStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseRootStyleUndefined: Self = StObject.set(x, "closeRootStyle", js.undefined)
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBackgroundOpacity(value: Boolean): Self = StObject.set(x, "noBackgroundOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBackgroundOpacityUndefined: Self = StObject.set(x, "noBackgroundOpacity", js.undefined)
      
      @scala.inline
      def setNoBar(value: Boolean): Self = StObject.set(x, "noBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBarUndefined: Self = StObject.set(x, "noBar", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnlyLarge(value: Boolean): Self = StObject.set(x, "onlyLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyLargeUndefined: Self = StObject.set(x, "onlyLarge", js.undefined)
      
      @scala.inline
      def setOnlySmall(value: Boolean): Self = StObject.set(x, "onlySmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlySmallUndefined: Self = StObject.set(x, "onlySmall", js.undefined)
      
      @scala.inline
      def setOpenLarge(value: Boolean): Self = StObject.set(x, "openLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenLargeUndefined: Self = StObject.set(x, "openLarge", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
