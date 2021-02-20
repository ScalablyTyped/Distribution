package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView.Props> */
@js.native
trait ReadonlyProps extends StObject {
  
  val descriptors: StackDescriptorMap = js.native
  
  val detachInactiveScreens: js.UndefOr[Boolean] = js.native
  
  val headerMode: js.UndefOr[StackHeaderMode] = js.native
  
  val keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
  
  val mode: js.UndefOr[StackCardMode] = js.native
  
  val navigation: StackNavigationHelpers = js.native
  
  val screenProps: js.Any = js.native
  
  val state: NavigationState = js.native
}
object ReadonlyProps {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: js.Any,
    state: NavigationState
  ): ReadonlyProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  @scala.inline
  implicit class ReadonlyPropsMutableBuilder[Self <: ReadonlyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
    
    @scala.inline
    def setKeyboardHandlingEnabled(value: Boolean): Self = StObject.set(x, "keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardHandlingEnabledUndefined: Self = StObject.set(x, "keyboardHandlingEnabled", js.undefined)
    
    @scala.inline
    def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
