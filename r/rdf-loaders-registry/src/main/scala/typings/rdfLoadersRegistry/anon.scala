package typings.rdfLoadersRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LoaderRegistry extends StObject {
    
    var loaderRegistry: typings.rdfLoadersRegistry.mod.LoaderRegistry
  }
  object LoaderRegistry {
    
    inline def apply(loaderRegistry: typings.rdfLoadersRegistry.mod.LoaderRegistry): LoaderRegistry = {
      val __obj = js.Dynamic.literal(loaderRegistry = loaderRegistry.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoaderRegistry] (val x: Self) extends AnyVal {
      
      inline def setLoaderRegistry(value: typings.rdfLoadersRegistry.mod.LoaderRegistry): Self = StObject.set(x, "loaderRegistry", value.asInstanceOf[js.Any])
    }
  }
}
