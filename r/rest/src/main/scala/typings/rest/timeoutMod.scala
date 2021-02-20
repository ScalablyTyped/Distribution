package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutMod extends Shortcut {
  
  @JSImport("rest/interceptor/timeout", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
    
    var transient: js.UndefOr[Boolean] = js.native
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
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransient(value: Boolean): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `timeoutMod.foo` */
  override def _to: Interceptor[Config] = ^
}
