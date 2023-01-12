package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sod extends StObject {
  
  var depkeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var key: String
  
  var loaded: Boolean
  
  var qfn: js.UndefOr[js.Array[Any]] = js.undefined
  
  var reset: js.UndefOr[Boolean] = js.undefined
  
  var state: Sods
  
  var url: String
}
object Sod {
  
  inline def apply(key: String, loaded: Boolean, state: Sods, url: String): Sod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sod] (val x: Self) extends AnyVal {
    
    inline def setDepkeys(value: js.Array[String]): Self = StObject.set(x, "depkeys", value.asInstanceOf[js.Any])
    
    inline def setDepkeysUndefined: Self = StObject.set(x, "depkeys", js.undefined)
    
    inline def setDepkeysVarargs(value: String*): Self = StObject.set(x, "depkeys", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setQfn(value: js.Array[Any]): Self = StObject.set(x, "qfn", value.asInstanceOf[js.Any])
    
    inline def setQfnUndefined: Self = StObject.set(x, "qfn", js.undefined)
    
    inline def setQfnVarargs(value: Any*): Self = StObject.set(x, "qfn", js.Array(value*))
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setState(value: Sods): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
