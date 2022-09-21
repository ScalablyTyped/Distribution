package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView.Props> */
trait ReadonlyProps extends StObject {
  
  val descriptors: StackDescriptorMap
  
  val detachInactiveScreens: js.UndefOr[Boolean] = js.undefined
  
  val headerMode: js.UndefOr[StackHeaderMode] = js.undefined
  
  val keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined
  
  val mode: js.UndefOr[StackCardMode] = js.undefined
  
  val navigation: StackNavigationHelpers
  
  val screenProps: Any
  
  val state: NavigationState
}
object ReadonlyProps {
  
  inline def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: Any,
    state: NavigationState
  ): ReadonlyProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  extension [Self <: ReadonlyProps](x: Self) {
    
    inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
    
    inline def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
    
    inline def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
    
    inline def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
    
    inline def setKeyboardHandlingEnabled(value: Boolean): Self = StObject.set(x, "keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    inline def setKeyboardHandlingEnabledUndefined: Self = StObject.set(x, "keyboardHandlingEnabled", js.undefined)
    
    inline def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    inline def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
