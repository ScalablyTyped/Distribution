package typings.reactNavigationStack

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNavigationStack.anon.Height
import typings.reactNavigationStack.reactNavigationStackStrings.float
import typings.reactNavigationStack.reactNavigationStackStrings.screen
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerContainerMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    hasModeScenesLayoutInsetsGetPreviousSceneGetFocusedRouteOnContentHeightChangeGestureDirectionStyleInterpolatorStyle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasModeScenesLayoutInsetsGetPreviousSceneGetFocusedRouteOnContentHeightChangeGestureDirectionStyleInterpolatorStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var gestureDirection: GestureDirection
    
    def getFocusedRoute(): Route[String]
    
    def getPreviousScene(props: typings.reactNavigationStack.anon.Route): js.UndefOr[Scene[Route[String]]]
    
    var insets: EdgeInsets
    
    var layout: Layout
    
    var mode: float | screen
    
    var onContentHeightChange: js.UndefOr[js.Function1[/* props */ Height, Unit]] = js.undefined
    
    var scenes: js.Array[js.UndefOr[Scene[Route[String]]]]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styleInterpolator: StackHeaderStyleInterpolator
  }
  object Props {
    
    @scala.inline
    def apply(
      gestureDirection: GestureDirection,
      getFocusedRoute: () => Route[String],
      getPreviousScene: typings.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]],
      insets: EdgeInsets,
      layout: Layout,
      mode: float | screen,
      scenes: js.Array[js.UndefOr[Scene[Route[String]]]],
      styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
    ): Props = {
      val __obj = js.Dynamic.literal(gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousScene = js.Any.fromFunction1(getPreviousScene), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFocusedRoute(value: () => Route[String]): Self = StObject.set(x, "getFocusedRoute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousScene(value: typings.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = StObject.set(x, "getPreviousScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: float | screen): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContentHeightChange(value: /* props */ Height => Unit): Self = StObject.set(x, "onContentHeightChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentHeightChangeUndefined: Self = StObject.set(x, "onContentHeightChange", js.undefined)
      
      @scala.inline
      def setScenes(value: js.Array[js.UndefOr[Scene[Route[String]]]]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenesVarargs(value: js.UndefOr[Scene[Route[String]]]*): Self = StObject.set(x, "scenes", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
