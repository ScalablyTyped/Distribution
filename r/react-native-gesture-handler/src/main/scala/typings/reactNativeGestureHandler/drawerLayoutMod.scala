package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StatusBarAnimation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerLayoutMod {
  
  @JSImport("react-native-gesture-handler/DrawerLayout", JSImport.Default)
  @js.native
  class default () extends DrawerLayout
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag`
  */
  trait DrawerKeyboardDismissMode extends StObject
  object DrawerKeyboardDismissMode {
    
    @scala.inline
    def none: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none = "none".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none]
    
    @scala.inline
    def `on-drag`: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag` = "on-drag".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag`]
  }
  
  @js.native
  trait DrawerLayout
    extends Component[DrawerLayoutProperties, js.Object, js.Any] {
    
    def closeDrawer(): Unit = js.native
    def closeDrawer(options: DrawerMovementOptionType): Unit = js.native
    
    def openDrawer(): Unit = js.native
    def openDrawer(options: DrawerMovementOptionType): Unit = js.native
  }
  
  @js.native
  trait DrawerLayoutProperties extends StObject {
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var drawerBackgroundColor: js.UndefOr[String] = js.native
    
    var drawerLockMode: js.UndefOr[DrawerLockMode] = js.native
    
    var drawerPosition: js.UndefOr[DrawerPosition] = js.native
    
    var drawerType: js.UndefOr[DrawerType] = js.native
    
    var drawerWidth: js.UndefOr[Double] = js.native
    
    var edgeWidth: js.UndefOr[Double] = js.native
    
    var hideStatusBar: js.UndefOr[Boolean] = js.native
    
    var keyboardDismissMode: js.UndefOr[DrawerKeyboardDismissMode] = js.native
    
    var minSwipeDistance: js.UndefOr[Double] = js.native
    
    var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDrawerStateChanged: js.UndefOr[js.Function2[/* newState */ DrawerState, /* drawerWillShow */ Boolean, Unit]] = js.native
    
    var overlayColor: js.UndefOr[String] = js.native
    
    def renderNavigationView(progressAnimatedValue: Value): ReactNode = js.native
    
    var statusBarAnimation: js.UndefOr[StatusBarAnimation] = js.native
    
    var useNativeAnimations: js.UndefOr[Boolean] = js.native
  }
  object DrawerLayoutProperties {
    
    @scala.inline
    def apply(renderNavigationView: Value => ReactNode): DrawerLayoutProperties = {
      val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
      __obj.asInstanceOf[DrawerLayoutProperties]
    }
    
    @scala.inline
    implicit class DrawerLayoutPropertiesMutableBuilder[Self <: DrawerLayoutProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      @scala.inline
      def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      @scala.inline
      def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      @scala.inline
      def setDrawerLockMode(value: DrawerLockMode): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      @scala.inline
      def setDrawerPosition(value: DrawerPosition): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerPositionUndefined: Self = StObject.set(x, "drawerPosition", js.undefined)
      
      @scala.inline
      def setDrawerType(value: DrawerType): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerTypeUndefined: Self = StObject.set(x, "drawerType", js.undefined)
      
      @scala.inline
      def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
      
      @scala.inline
      def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeWidthUndefined: Self = StObject.set(x, "edgeWidth", js.undefined)
      
      @scala.inline
      def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
      
      @scala.inline
      def setKeyboardDismissMode(value: DrawerKeyboardDismissMode): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      @scala.inline
      def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSwipeDistanceUndefined: Self = StObject.set(x, "minSwipeDistance", js.undefined)
      
      @scala.inline
      def setOnDrawerClose(value: () => Unit): Self = StObject.set(x, "onDrawerClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
      
      @scala.inline
      def setOnDrawerOpen(value: () => Unit): Self = StObject.set(x, "onDrawerOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
      
      @scala.inline
      def setOnDrawerStateChanged(value: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDrawerStateChangedUndefined: Self = StObject.set(x, "onDrawerStateChanged", js.undefined)
      
      @scala.inline
      def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      @scala.inline
      def setRenderNavigationView(value: Value => ReactNode): Self = StObject.set(x, "renderNavigationView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatusBarAnimation(value: StatusBarAnimation): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarAnimationUndefined: Self = StObject.set(x, "statusBarAnimation", js.undefined)
      
      @scala.inline
      def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open`
  */
  trait DrawerLockMode extends StObject
  object DrawerLockMode {
    
    @scala.inline
    def `locked-closed`: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed` = "locked-closed".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed`]
    
    @scala.inline
    def `locked-open`: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open` = "locked-open".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open`]
    
    @scala.inline
    def unlocked: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked = "unlocked".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked]
  }
  
  @js.native
  trait DrawerMovementOptionType extends StObject {
    
    var velocity: js.UndefOr[Double] = js.native
  }
  object DrawerMovementOptionType {
    
    @scala.inline
    def apply(): DrawerMovementOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerMovementOptionType]
    }
    
    @scala.inline
    implicit class DrawerMovementOptionTypeMutableBuilder[Self <: DrawerMovementOptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right
  */
  trait DrawerPosition extends StObject
  object DrawerPosition {
    
    @scala.inline
    def left: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left = "left".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left]
    
    @scala.inline
    def right: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right = "right".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
  */
  trait DrawerState extends StObject
  object DrawerState {
    
    @scala.inline
    def Dragging: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging = "Dragging".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging]
    
    @scala.inline
    def Idle: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle = "Idle".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle]
    
    @scala.inline
    def Settling: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling = "Settling".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.front
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.back
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.slide
  */
  trait DrawerType extends StObject
  object DrawerType {
    
    @scala.inline
    def back: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.back = "back".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.back]
    
    @scala.inline
    def front: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.front = "front".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.front]
    
    @scala.inline
    def slide: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.slide = "slide".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.slide]
  }
}
