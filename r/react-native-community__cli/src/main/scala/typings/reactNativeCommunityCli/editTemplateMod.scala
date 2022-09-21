package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editTemplateMod {
  
  @JSImport("@react-native-community/cli/build/commands/init/editTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changePlaceholderInTemplate(hasProjectNamePlaceholderNamePlaceholderTitleProjectTitle: PlaceholderConfig): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("changePlaceholderInTemplate")(hasProjectNamePlaceholderNamePlaceholderTitleProjectTitle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait PlaceholderConfig extends StObject {
    
    var placeholderName: String
    
    var placeholderTitle: js.UndefOr[String] = js.undefined
    
    var projectName: String
    
    var projectTitle: js.UndefOr[String] = js.undefined
  }
  object PlaceholderConfig {
    
    inline def apply(placeholderName: String, projectName: String): PlaceholderConfig = {
      val __obj = js.Dynamic.literal(placeholderName = placeholderName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaceholderConfig]
    }
    
    extension [Self <: PlaceholderConfig](x: Self) {
      
      inline def setPlaceholderName(value: String): Self = StObject.set(x, "placeholderName", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTitle(value: String): Self = StObject.set(x, "placeholderTitle", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTitleUndefined: Self = StObject.set(x, "placeholderTitle", js.undefined)
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectTitle(value: String): Self = StObject.set(x, "projectTitle", value.asInstanceOf[js.Any])
      
      inline def setProjectTitleUndefined: Self = StObject.set(x, "projectTitle", js.undefined)
    }
  }
}
