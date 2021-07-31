package typings.reactNavigationCore

import typings.reactNavigationCore.anon.GetCurrentOptions
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOptionsGettersMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOptionsGetters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasKeyOptionsNavigation: Options): GetCurrentOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasKeyOptionsNavigation.asInstanceOf[js.Any]).asInstanceOf[GetCurrentOptions]
  
  trait Options extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var navigation: js.UndefOr[
        NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
      ] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNavigation(value: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
