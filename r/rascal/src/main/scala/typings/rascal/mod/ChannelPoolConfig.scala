package typings.rascal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelPoolConfig extends js.Object {
  
  var autostart: js.UndefOr[Boolean] = js.native
  
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.native
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var testOnBorrow: js.UndefOr[Boolean] = js.native
}
object ChannelPoolConfig {
  
  @scala.inline
  def apply(): ChannelPoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelPoolConfig]
  }
  
  @scala.inline
  implicit class ChannelPoolConfigOps[Self <: ChannelPoolConfig] (val x: Self) extends AnyVal {
    
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
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = this.set("evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvictionRunIntervalMillis: Self = this.set("evictionRunIntervalMillis", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = this.set("idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeoutMillis: Self = this.set("idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = this.set("testOnBorrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestOnBorrow: Self = this.set("testOnBorrow", js.undefined)
  }
}
