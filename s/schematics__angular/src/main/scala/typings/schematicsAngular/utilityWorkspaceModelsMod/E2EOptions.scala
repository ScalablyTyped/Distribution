package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait E2EOptions extends StObject {
  
  var devServerTarget: String
  
  var protractorConfig: String
}
object E2EOptions {
  
  inline def apply(devServerTarget: String, protractorConfig: String): E2EOptions = {
    val __obj = js.Dynamic.literal(devServerTarget = devServerTarget.asInstanceOf[js.Any], protractorConfig = protractorConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[E2EOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: E2EOptions] (val x: Self) extends AnyVal {
    
    inline def setDevServerTarget(value: String): Self = StObject.set(x, "devServerTarget", value.asInstanceOf[js.Any])
    
    inline def setProtractorConfig(value: String): Self = StObject.set(x, "protractorConfig", value.asInstanceOf[js.Any])
  }
}
