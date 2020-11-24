package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketOptions extends js.Object {
  
  var market: js.UndefOr[String] = js.native
}
object MarketOptions {
  
  @scala.inline
  def apply(): MarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketOptions]
  }
  
  @scala.inline
  implicit class MarketOptionsOps[Self <: MarketOptions] (val x: Self) extends AnyVal {
    
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
    def setMarket(value: String): Self = this.set("market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarket: Self = this.set("market", js.undefined)
  }
}
