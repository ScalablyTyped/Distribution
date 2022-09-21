package typings.schematicsAngular.workspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractI18nOptions extends StObject {
  
  var browserTarget: String
}
object ExtractI18nOptions {
  
  inline def apply(browserTarget: String): ExtractI18nOptions = {
    val __obj = js.Dynamic.literal(browserTarget = browserTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractI18nOptions]
  }
  
  extension [Self <: ExtractI18nOptions](x: Self) {
    
    inline def setBrowserTarget(value: String): Self = StObject.set(x, "browserTarget", value.asInstanceOf[js.Any])
  }
}
