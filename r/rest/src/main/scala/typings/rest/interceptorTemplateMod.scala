package typings.rest

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorTemplateMod extends Shortcut {
  
  @JSImport("rest/interceptor/template", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `interceptorTemplateMod.foo` */
  override def _to: Interceptor[Config] = ^
}
