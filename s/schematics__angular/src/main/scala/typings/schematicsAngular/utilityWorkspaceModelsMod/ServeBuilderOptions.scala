package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeBuilderOptions extends StObject {
  
  var browserTarget: String
}
object ServeBuilderOptions {
  
  inline def apply(browserTarget: String): ServeBuilderOptions = {
    val __obj = js.Dynamic.literal(browserTarget = browserTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeBuilderOptions]
  }
  
  extension [Self <: ServeBuilderOptions](x: Self) {
    
    inline def setBrowserTarget(value: String): Self = StObject.set(x, "browserTarget", value.asInstanceOf[js.Any])
  }
}
