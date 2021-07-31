package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphModel extends StObject {
  
  var attrs: js.UndefOr[js.Any] = js.undefined
  
  var onlineStoreUrl: js.UndefOr[String] = js.undefined
}
object GraphModel {
  
  @scala.inline
  def apply(): GraphModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphModel]
  }
  
  @scala.inline
  implicit class GraphModelMutableBuilder[Self <: GraphModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: js.Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setOnlineStoreUrl(value: String): Self = StObject.set(x, "onlineStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineStoreUrlUndefined: Self = StObject.set(x, "onlineStoreUrl", js.undefined)
  }
}
