package typings.reactNativeScreens

import typings.react.mod.global.JSX.Element
import typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackDescriptorMap
import typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigationHelpers
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackNavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackViewsNativeStackViewMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack/views/NativeStackView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var descriptors: NativeStackDescriptorMap
    
    var navigation: NativeStackNavigationHelpers
    
    var state: StackNavigationState[ParamListBase]
  }
  object Props {
    
    inline def apply(
      descriptors: NativeStackDescriptorMap,
      navigation: NativeStackNavigationHelpers,
      state: StackNavigationState[ParamListBase]
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setDescriptors(value: NativeStackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NativeStackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setState(value: StackNavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
