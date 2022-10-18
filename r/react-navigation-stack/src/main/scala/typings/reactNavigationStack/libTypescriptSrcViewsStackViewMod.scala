package typings.reactNavigationStack

import typings.react.mod.global.JSX.Element
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewsStackViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/views/StackView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasNavigationOriginalDescriptorsNavigationConfigRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasNavigationOriginalDescriptorsNavigationConfigRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var descriptors: StackDescriptorMap
    
    var navigation: StackNavigationHelpers
    
    var navigationConfig: StackNavigationConfig
    
    var screenProps: Any
  }
  object Props {
    
    inline def apply(
      descriptors: StackDescriptorMap,
      navigation: StackNavigationHelpers,
      navigationConfig: StackNavigationConfig,
      screenProps: Any
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationConfig(value: StackNavigationConfig): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    }
  }
}
