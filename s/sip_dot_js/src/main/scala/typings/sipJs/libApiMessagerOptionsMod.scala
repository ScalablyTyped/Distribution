package typings.sipJs

import typings.sipJs.anon.FromDisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiMessagerOptionsMod {
  
  trait MessagerOptions extends StObject {
    
    /** Array of extra headers added to the MESSAGE. */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @deprecated TODO: provide alternative. */
    var params: js.UndefOr[FromDisplayName] = js.undefined
  }
  object MessagerOptions {
    
    inline def apply(): MessagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessagerOptions] (val x: Self) extends AnyVal {
      
      inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value*))
      
      inline def setParams(value: FromDisplayName): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
}
