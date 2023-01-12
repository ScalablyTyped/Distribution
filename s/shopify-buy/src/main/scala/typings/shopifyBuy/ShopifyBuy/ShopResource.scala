package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShopResource extends StObject {
  
  def fetchInfo(): js.Promise[Shop]
  
  def fetchPolicies(): js.Promise[Shop]
}
object ShopResource {
  
  inline def apply(fetchInfo: () => js.Promise[Shop], fetchPolicies: () => js.Promise[Shop]): ShopResource = {
    val __obj = js.Dynamic.literal(fetchInfo = js.Any.fromFunction0(fetchInfo), fetchPolicies = js.Any.fromFunction0(fetchPolicies))
    __obj.asInstanceOf[ShopResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShopResource] (val x: Self) extends AnyVal {
    
    inline def setFetchInfo(value: () => js.Promise[Shop]): Self = StObject.set(x, "fetchInfo", js.Any.fromFunction0(value))
    
    inline def setFetchPolicies(value: () => js.Promise[Shop]): Self = StObject.set(x, "fetchPolicies", js.Any.fromFunction0(value))
  }
}
