package typings.rnSwipeablePanel

import typings.react.mod.Component
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.Animated.ValueXY
import typings.reactNative.mod.ScrollViewProps
import typings.rnSwipeablePanel.rnSwipeablePanelStrings.landscape
import typings.rnSwipeablePanel.rnSwipeablePanelStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPanelMod {
  
  @JSImport("rn-swipeable-panel/dist/Panel", "LARGE_PANEL_CONTENT_HEIGHT")
  @js.native
  val LARGE_PANEL_CONTENT_HEIGHT: Double = js.native
  
  @JSImport("rn-swipeable-panel/dist/Panel", "SMALL_PANEL_CONTENT_HEIGHT")
  @js.native
  val SMALL_PANEL_CONTENT_HEIGHT: Double = js.native
  
  @JSImport("rn-swipeable-panel/dist/Panel", "SwipeablePanel")
  @js.native
  open class SwipeablePanel protected () extends Component[SwipeablePanelProps, SwipeablePanelState, Any] {
    def this(props: SwipeablePanelProps) = this()
    
    def _animateTo(): Unit = js.native
    def _animateTo(newStatus: Double): Unit = js.native
    
    def _onOrientationChange(): Unit = js.native
    
    var _panResponder: Any = js.native
    
    var animatedValueY: Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSwipeablePanel(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSwipeablePanel(prevProps: SwipeablePanelProps, prevState: SwipeablePanelState): Unit = js.native
    
    var isClosing: Boolean = js.native
    
    var pan: ValueXY = js.native
  }
  
  trait SwipeablePanelProps extends StObject {
    
    var allowTouchOutside: js.UndefOr[Boolean] = js.undefined
    
    var barContainerStyle: js.UndefOr[js.Object] = js.undefined
    
    var barStyle: js.UndefOr[js.Object] = js.undefined
    
    var closeIconStyle: js.UndefOr[js.Object] = js.undefined
    
    var closeOnTouchOutside: js.UndefOr[Boolean] = js.undefined
    
    var closeRootStyle: js.UndefOr[js.Object] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var isActive: Boolean
    
    var noBackgroundOpacity: js.UndefOr[Boolean] = js.undefined
    
    var noBar: js.UndefOr[Boolean] = js.undefined
    
    def onClose(): Unit
    
    var onlyLarge: js.UndefOr[Boolean] = js.undefined
    
    var onlySmall: js.UndefOr[Boolean] = js.undefined
    
    var openLarge: js.UndefOr[Boolean] = js.undefined
    
    var scrollViewProps: js.UndefOr[ScrollViewProps] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var smallPanelHeight: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SwipeablePanelProps {
    
    inline def apply(isActive: Boolean, onClose: () => Unit): SwipeablePanelProps = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
      __obj.asInstanceOf[SwipeablePanelProps]
    }
    
    extension [Self <: SwipeablePanelProps](x: Self) {
      
      inline def setAllowTouchOutside(value: Boolean): Self = StObject.set(x, "allowTouchOutside", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchOutsideUndefined: Self = StObject.set(x, "allowTouchOutside", js.undefined)
      
      inline def setBarContainerStyle(value: js.Object): Self = StObject.set(x, "barContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setBarContainerStyleUndefined: Self = StObject.set(x, "barContainerStyle", js.undefined)
      
      inline def setBarStyle(value: js.Object): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setCloseIconStyle(value: js.Object): Self = StObject.set(x, "closeIconStyle", value.asInstanceOf[js.Any])
      
      inline def setCloseIconStyleUndefined: Self = StObject.set(x, "closeIconStyle", js.undefined)
      
      inline def setCloseOnTouchOutside(value: Boolean): Self = StObject.set(x, "closeOnTouchOutside", value.asInstanceOf[js.Any])
      
      inline def setCloseOnTouchOutsideUndefined: Self = StObject.set(x, "closeOnTouchOutside", js.undefined)
      
      inline def setCloseRootStyle(value: js.Object): Self = StObject.set(x, "closeRootStyle", value.asInstanceOf[js.Any])
      
      inline def setCloseRootStyleUndefined: Self = StObject.set(x, "closeRootStyle", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setNoBackgroundOpacity(value: Boolean): Self = StObject.set(x, "noBackgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setNoBackgroundOpacityUndefined: Self = StObject.set(x, "noBackgroundOpacity", js.undefined)
      
      inline def setNoBar(value: Boolean): Self = StObject.set(x, "noBar", value.asInstanceOf[js.Any])
      
      inline def setNoBarUndefined: Self = StObject.set(x, "noBar", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnlyLarge(value: Boolean): Self = StObject.set(x, "onlyLarge", value.asInstanceOf[js.Any])
      
      inline def setOnlyLargeUndefined: Self = StObject.set(x, "onlyLarge", js.undefined)
      
      inline def setOnlySmall(value: Boolean): Self = StObject.set(x, "onlySmall", value.asInstanceOf[js.Any])
      
      inline def setOnlySmallUndefined: Self = StObject.set(x, "onlySmall", js.undefined)
      
      inline def setOpenLarge(value: Boolean): Self = StObject.set(x, "openLarge", value.asInstanceOf[js.Any])
      
      inline def setOpenLargeUndefined: Self = StObject.set(x, "openLarge", js.undefined)
      
      inline def setScrollViewProps(value: ScrollViewProps): Self = StObject.set(x, "scrollViewProps", value.asInstanceOf[js.Any])
      
      inline def setScrollViewPropsUndefined: Self = StObject.set(x, "scrollViewProps", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setSmallPanelHeight(value: Double): Self = StObject.set(x, "smallPanelHeight", value.asInstanceOf[js.Any])
      
      inline def setSmallPanelHeightUndefined: Self = StObject.set(x, "smallPanelHeight", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SwipeablePanelState extends StObject {
    
    var canScroll: Boolean
    
    var deviceHeight: Double
    
    var deviceWidth: Double
    
    var isActive: Boolean
    
    var opacity: Value
    
    var orientation: portrait | landscape
    
    var pan: Any
    
    var panelHeight: Double
    
    var showComponent: Boolean
    
    var status: Double
  }
  object SwipeablePanelState {
    
    inline def apply(
      canScroll: Boolean,
      deviceHeight: Double,
      deviceWidth: Double,
      isActive: Boolean,
      opacity: Value,
      orientation: portrait | landscape,
      pan: Any,
      panelHeight: Double,
      showComponent: Boolean,
      status: Double
    ): SwipeablePanelState = {
      val __obj = js.Dynamic.literal(canScroll = canScroll.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], panelHeight = panelHeight.asInstanceOf[js.Any], showComponent = showComponent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeablePanelState]
    }
    
    extension [Self <: SwipeablePanelState](x: Self) {
      
      inline def setCanScroll(value: Boolean): Self = StObject.set(x, "canScroll", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Value): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setPan(value: Any): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanelHeight(value: Double): Self = StObject.set(x, "panelHeight", value.asInstanceOf[js.Any])
      
      inline def setShowComponent(value: Boolean): Self = StObject.set(x, "showComponent", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
