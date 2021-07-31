package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
import typings.reactNavigationDrawer.typesMod.DrawerContentComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/views/DrawerView.DrawerOptions & {  contentComponent :react.react.ComponentType<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerContentComponentProps> | undefined,   unmountInactiveRoutes :boolean | undefined,   contentOptions :object | undefined} */
trait DrawerOptionscontentCompo extends StObject {
  
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
  
  var drawerPosition: left | right
  
  var drawerType: front | back | slide
  
  var drawerWidth: Double | js.Function0[Double]
  
  var edgeWidth: Double
  
  var gestureHandlerProps: js.UndefOr[
    ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]
  ] = js.undefined
  
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  
  var keyboardDismissMode: js.UndefOr[`on-drag` | none] = js.undefined
  
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var overlayColor: js.UndefOr[String] = js.undefined
  
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  
  var statusBarAnimation: slide | none | fade
  
  var style: js.UndefOr[ViewStyle] = js.undefined
  
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}
object DrawerOptionscontentCompo {
  
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    drawerWidth: Double | js.Function0[Double],
    edgeWidth: Double,
    statusBarAnimation: slide | none | fade
  ): DrawerOptionscontentCompo = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptionscontentCompo]
  }
  
  @scala.inline
  implicit class DrawerOptionscontentCompoMutableBuilder[Self <: DrawerOptionscontentCompo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentComponent(value: ComponentType[DrawerContentComponentProps]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
    
    @scala.inline
    def setContentOptions(value: js.Object): Self = StObject.set(x, "contentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOptionsUndefined: Self = StObject.set(x, "contentOptions", js.undefined)
    
    @scala.inline
    def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
    
    @scala.inline
    def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
    
    @scala.inline
    def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerWidthFunction0(value: () => Double): Self = StObject.set(x, "drawerWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureHandlerProps(value: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureHandlerPropsUndefined: Self = StObject.set(x, "gestureHandlerProps", js.undefined)
    
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: `on-drag` | none): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
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
    def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    @scala.inline
    def setSceneContainerStyle(value: ViewStyle): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
    
    @scala.inline
    def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnmountInactiveRoutes(value: Boolean): Self = StObject.set(x, "unmountInactiveRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmountInactiveRoutesUndefined: Self = StObject.set(x, "unmountInactiveRoutes", js.undefined)
  }
}
