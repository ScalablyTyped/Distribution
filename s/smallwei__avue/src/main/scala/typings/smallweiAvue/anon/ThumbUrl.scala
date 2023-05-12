package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbUrl extends StObject {
  
  var thumbUrl: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ThumbUrl {
  
  inline def apply(): ThumbUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThumbUrl] (val x: Self) extends AnyVal {
    
    inline def setThumbUrl(value: String): Self = StObject.set(x, "thumbUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbUrlUndefined: Self = StObject.set(x, "thumbUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
