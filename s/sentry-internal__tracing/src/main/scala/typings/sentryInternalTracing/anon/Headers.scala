package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryInternalTracing.typesBrowserRequestMod.PolymorphicRequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: js.UndefOr[
    (StringDictionary[js.UndefOr[js.Array[String] | String]]) | PolymorphicRequestHeaders
  ] = js.undefined
}
object Headers {
  
  inline def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: (StringDictionary[js.UndefOr[js.Array[String] | String]]) | PolymorphicRequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
  }
}
