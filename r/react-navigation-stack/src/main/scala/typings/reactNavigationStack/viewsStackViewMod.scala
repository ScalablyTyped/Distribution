package typings.reactNavigationStack

import typings.react.mod.global.JSX.Element
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsStackViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/views/StackView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasNavigationOriginalDescriptorsNavigationConfigRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasNavigationOriginalDescriptorsNavigationConfigRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var descriptors: StackDescriptorMap
    
    var navigation: StackNavigationHelpers
    
    var navigationConfig: StackNavigationConfig
    
    var screenProps: js.Any
  }
  object Props {
    
    @scala.inline
    def apply(
      descriptors: StackDescriptorMap,
      navigation: StackNavigationHelpers,
      navigationConfig: StackNavigationConfig,
      screenProps: js.Any
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationConfig(value: StackNavigationConfig): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    }
  }
}
