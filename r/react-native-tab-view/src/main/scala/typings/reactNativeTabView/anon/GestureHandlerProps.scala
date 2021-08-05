package typings.reactNativeTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.pagerMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlerProps extends StObject {
  
  var keyboardDismissMode: String
  
  var `lazy`: Boolean
  
  var lazyPreloadDistance: Double
  
  var removeClippedSubviews: Boolean
  
  def renderLazyPlaceholder(): Null
  
  def renderPager(props: Props[js.Any]): Element
  
  def renderTabBar[P /* <: typings.reactNativeTabView.typesMod.Route */](props: typings.reactNativeTabView.tabBarMod.Props[P]): Element
  
  var swipeEnabled: Boolean
  
  var tabBarPosition: String
}
object GestureHandlerProps {
  
  inline def apply(
    keyboardDismissMode: String,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    removeClippedSubviews: Boolean,
    renderLazyPlaceholder: () => Null,
    renderPager: Props[js.Any] => Element,
    renderTabBar: typings.reactNativeTabView.tabBarMod.Props[js.Any] => Element,
    swipeEnabled: Boolean,
    tabBarPosition: String
  ): GestureHandlerProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], removeClippedSubviews = removeClippedSubviews.asInstanceOf[js.Any], renderLazyPlaceholder = js.Any.fromFunction0(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderTabBar = js.Any.fromFunction1(renderTabBar), swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerProps]
  }
  
  extension [Self <: GestureHandlerProps](x: Self) {
    
    inline def setKeyboardDismissMode(value: String): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRenderLazyPlaceholder(value: () => Null): Self = StObject.set(x, "renderLazyPlaceholder", js.Any.fromFunction0(value))
    
    inline def setRenderPager(value: Props[js.Any] => Element): Self = StObject.set(x, "renderPager", js.Any.fromFunction1(value))
    
    inline def setRenderTabBar(value: typings.reactNativeTabView.tabBarMod.Props[js.Any] => Element): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
    
    inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
    
    inline def setTabBarPosition(value: String): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
  }
}
