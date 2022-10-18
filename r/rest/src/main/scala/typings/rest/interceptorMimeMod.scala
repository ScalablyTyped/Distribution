package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mimeRegistryMod.Registry
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorMimeMod extends Shortcut {
  
  @JSImport("rest/interceptor/mime", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var mime: js.UndefOr[String] = js.undefined
    
    var permissive: js.UndefOr[Boolean] = js.undefined
    
    var registry: js.UndefOr[Registry] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      inline def setPermissive(value: Boolean): Self = StObject.set(x, "permissive", value.asInstanceOf[js.Any])
      
      inline def setPermissiveUndefined: Self = StObject.set(x, "permissive", js.undefined)
      
      inline def setRegistry(value: Registry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `interceptorMimeMod.foo` */
  override def _to: Interceptor[Config] = ^
}
