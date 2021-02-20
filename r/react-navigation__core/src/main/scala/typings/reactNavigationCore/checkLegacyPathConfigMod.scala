package typings.reactNavigationCore

import typings.reactNavigationCore.typesMod.PathConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkLegacyPathConfigMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/checkLegacyPathConfig", JSImport.Default)
  @js.native
  def default(): js.Tuple2[Boolean, js.UndefOr[Options]] = js.native
  @JSImport("@react-navigation/core/lib/typescript/src/checkLegacyPathConfig", JSImport.Default)
  @js.native
  def default(config: Options): js.Tuple2[Boolean, js.UndefOr[Options]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.native
    
    var screens: PathConfigMap = js.native
  }
  object Options {
    
    @scala.inline
    def apply(screens: PathConfigMap): Options = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
}
