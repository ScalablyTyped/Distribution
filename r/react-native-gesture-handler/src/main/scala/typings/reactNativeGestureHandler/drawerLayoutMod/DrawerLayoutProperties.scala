package typings.reactNativeGestureHandler.drawerLayoutMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StatusBarAnimation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerLayoutProperties extends js.Object {
  
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
  implicit class DrawerLayoutPropertiesOps[Self <: DrawerLayoutProperties] (val x: Self) extends AnyVal {
    
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
    def setRenderNavigationView(value: Value => ReactNode): Self = this.set("renderNavigationView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
    @scala.inline
    def setDrawerBackgroundColor(value: String): Self = this.set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerBackgroundColor: Self = this.set("drawerBackgroundColor", js.undefined)
    
    @scala.inline
    def setDrawerLockMode(value: DrawerLockMode): Self = this.set("drawerLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerLockMode: Self = this.set("drawerLockMode", js.undefined)
    
    @scala.inline
    def setDrawerPosition(value: DrawerPosition): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerPosition: Self = this.set("drawerPosition", js.undefined)
    
    @scala.inline
    def setDrawerType(value: DrawerType): Self = this.set("drawerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerType: Self = this.set("drawerType", js.undefined)
    
    @scala.inline
    def setDrawerWidth(value: Double): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerWidth: Self = this.set("drawerWidth", js.undefined)
    
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeWidth: Self = this.set("edgeWidth", js.undefined)
    
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = this.set("hideStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideStatusBar: Self = this.set("hideStatusBar", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: DrawerKeyboardDismissMode): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setMinSwipeDistance(value: Double): Self = this.set("minSwipeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSwipeDistance: Self = this.set("minSwipeDistance", js.undefined)
    
    @scala.inline
    def setOnDrawerClose(value: () => Unit): Self = this.set("onDrawerClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDrawerClose: Self = this.set("onDrawerClose", js.undefined)
    
    @scala.inline
    def setOnDrawerOpen(value: () => Unit): Self = this.set("onDrawerOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDrawerOpen: Self = this.set("onDrawerOpen", js.undefined)
    
    @scala.inline
    def setOnDrawerStateChanged(value: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit): Self = this.set("onDrawerStateChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDrawerStateChanged: Self = this.set("onDrawerStateChanged", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    
    @scala.inline
    def setStatusBarAnimation(value: StatusBarAnimation): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarAnimation: Self = this.set("statusBarAnimation", js.undefined)
    
    @scala.inline
    def setUseNativeAnimations(value: Boolean): Self = this.set("useNativeAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeAnimations: Self = this.set("useNativeAnimations", js.undefined)
  }
}
