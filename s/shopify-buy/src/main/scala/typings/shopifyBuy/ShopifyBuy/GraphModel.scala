package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphModel extends js.Object {
  
  var attrs: js.UndefOr[js.Any] = js.native
  
  var onlineStoreUrl: js.UndefOr[String] = js.native
}
object GraphModel {
  
  @scala.inline
  def apply(): GraphModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphModel]
  }
  
  @scala.inline
  implicit class GraphModelOps[Self <: GraphModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttrs(value: js.Any): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setOnlineStoreUrl(value: String): Self = this.set("onlineStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlineStoreUrl: Self = this.set("onlineStoreUrl", js.undefined)
  }
}
