package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticDir extends StObject {
  
  var staticDir: String
  
  var staticPath: String
  
  var targetDir: String
  
  var targetEndpoint: String
}
object StaticDir {
  
  inline def apply(staticDir: String, staticPath: String, targetDir: String, targetEndpoint: String): StaticDir = {
    val __obj = js.Dynamic.literal(staticDir = staticDir.asInstanceOf[js.Any], staticPath = staticPath.asInstanceOf[js.Any], targetDir = targetDir.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticDir] (val x: Self) extends AnyVal {
    
    inline def setStaticDir(value: String): Self = StObject.set(x, "staticDir", value.asInstanceOf[js.Any])
    
    inline def setStaticPath(value: String): Self = StObject.set(x, "staticPath", value.asInstanceOf[js.Any])
    
    inline def setTargetDir(value: String): Self = StObject.set(x, "targetDir", value.asInstanceOf[js.Any])
    
    inline def setTargetEndpoint(value: String): Self = StObject.set(x, "targetEndpoint", value.asInstanceOf[js.Any])
  }
}
