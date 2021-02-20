package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Interceptor
import typings.rest.registryMod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeMod extends Shortcut {
  
  @JSImport("rest/interceptor/mime", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var accept: js.UndefOr[String] = js.native
    
    var mime: js.UndefOr[String] = js.native
    
    var permissive: js.UndefOr[Boolean] = js.native
    
    var registry: js.UndefOr[Registry] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      @scala.inline
      def setPermissive(value: Boolean): Self = StObject.set(x, "permissive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissiveUndefined: Self = StObject.set(x, "permissive", js.undefined)
      
      @scala.inline
      def setRegistry(value: Registry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `mimeMod.foo` */
  override def _to: Interceptor[Config] = ^
}
