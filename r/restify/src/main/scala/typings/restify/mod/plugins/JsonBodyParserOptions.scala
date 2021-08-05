package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonBodyParserOptions extends StObject {
  
  var bodyReader: js.UndefOr[Boolean] = js.undefined
  
  var mapParams: js.UndefOr[Boolean] = js.undefined
  
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]] = js.undefined
}
object JsonBodyParserOptions {
  
  inline def apply(): JsonBodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonBodyParserOptions]
  }
  
  extension [Self <: JsonBodyParserOptions](x: Self) {
    
    inline def setBodyReader(value: Boolean): Self = StObject.set(x, "bodyReader", value.asInstanceOf[js.Any])
    
    inline def setBodyReaderUndefined: Self = StObject.set(x, "bodyReader", js.undefined)
    
    inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
    
    inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
    
    inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
    
    inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    
    inline def setReviver(value: (/* key */ js.Any, /* value */ js.Any) => js.Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
    
    inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
  }
}
