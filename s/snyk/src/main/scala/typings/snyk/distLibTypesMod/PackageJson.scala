package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJson extends StObject {
  
  var dependencies: Any
  
  var devDependencies: Any
  
  var scripts: Any
  
  var snyk: Boolean
}
object PackageJson {
  
  inline def apply(dependencies: Any, devDependencies: Any, scripts: Any, snyk: Boolean): PackageJson = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], snyk = snyk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
    
    inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDevDependencies(value: Any): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: Any): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setSnyk(value: Boolean): Self = StObject.set(x, "snyk", value.asInstanceOf[js.Any])
  }
}
