package typings.sentryTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPackageMod {
  
  trait Package extends StObject {
    
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var version: String
  }
  object Package {
    
    inline def apply(name: String, version: String): Package = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
