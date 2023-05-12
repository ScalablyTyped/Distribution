package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineStorePublishable extends StObject {
  
  var onlineStoreUrl: js.UndefOr[URL] = js.undefined
}
object OnlineStorePublishable {
  
  inline def apply(): OnlineStorePublishable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineStorePublishable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineStorePublishable] (val x: Self) extends AnyVal {
    
    inline def setOnlineStoreUrl(value: URL): Self = StObject.set(x, "onlineStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setOnlineStoreUrlUndefined: Self = StObject.set(x, "onlineStoreUrl", js.undefined)
  }
}
