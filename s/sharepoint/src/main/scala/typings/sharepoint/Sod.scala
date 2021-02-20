package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sod extends StObject {
  
  var depkeys: js.UndefOr[js.Array[String]] = js.native
  
  var key: String = js.native
  
  var loaded: Boolean = js.native
  
  var qfn: js.UndefOr[js.Array[_]] = js.native
  
  var reset: js.UndefOr[Boolean] = js.native
  
  var state: Sods = js.native
  
  var url: String = js.native
}
object Sod {
  
  @scala.inline
  def apply(key: String, loaded: Boolean, state: Sods, url: String): Sod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sod]
  }
  
  @scala.inline
  implicit class SodMutableBuilder[Self <: Sod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepkeys(value: js.Array[String]): Self = StObject.set(x, "depkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepkeysUndefined: Self = StObject.set(x, "depkeys", js.undefined)
    
    @scala.inline
    def setDepkeysVarargs(value: String*): Self = StObject.set(x, "depkeys", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQfn(value: js.Array[_]): Self = StObject.set(x, "qfn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQfnUndefined: Self = StObject.set(x, "qfn", js.undefined)
    
    @scala.inline
    def setQfnVarargs(value: js.Any*): Self = StObject.set(x, "qfn", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setState(value: Sods): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
