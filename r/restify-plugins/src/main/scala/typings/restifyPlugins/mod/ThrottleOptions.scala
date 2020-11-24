package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrottleOptions extends js.Object {
  
  var burst: js.UndefOr[Double] = js.native
  
  var ip: js.UndefOr[Boolean] = js.native
  
  var maxKeys: js.UndefOr[Double] = js.native
  
  var overrides: js.UndefOr[js.Any] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var tokensTable: js.UndefOr[js.Any] = js.native
  
  var username: js.UndefOr[Boolean] = js.native
  
  var xff: js.UndefOr[Boolean] = js.native
}
object ThrottleOptions {
  
  @scala.inline
  def apply(): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleOptions]
  }
  
  @scala.inline
  implicit class ThrottleOptionsOps[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
    
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
    def setBurst(value: Double): Self = this.set("burst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurst: Self = this.set("burst", js.undefined)
    
    @scala.inline
    def setIp(value: Boolean): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("maxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("maxKeys", js.undefined)
    
    @scala.inline
    def setOverrides(value: js.Any): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setTokensTable(value: js.Any): Self = this.set("tokensTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokensTable: Self = this.set("tokensTable", js.undefined)
    
    @scala.inline
    def setUsername(value: Boolean): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setXff(value: Boolean): Self = this.set("xff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXff: Self = this.set("xff", js.undefined)
  }
}
