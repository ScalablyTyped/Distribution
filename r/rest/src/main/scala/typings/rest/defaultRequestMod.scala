package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultRequestMod extends Shortcut {
  
  @JSImport("rest/interceptor/defaultRequest", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var entity: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mixin: js.UndefOr[js.Any] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
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
      def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMixin(value: js.Any): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `defaultRequestMod.foo` */
  override def _to: Interceptor[Config] = ^
}
