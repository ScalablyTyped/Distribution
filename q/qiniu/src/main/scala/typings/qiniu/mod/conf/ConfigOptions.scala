package typings.qiniu.mod.conf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  /**
    * @default true
    */
  var useCdnDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var useHttpsDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * @default null
    */
  var zone: js.UndefOr[Zone] = js.native
  
  /**
    * @default -1
    */
  var zoneExpire: js.UndefOr[Double] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setUseCdnDomain(value: Boolean): Self = this.set("useCdnDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCdnDomain: Self = this.set("useCdnDomain", js.undefined)
    
    @scala.inline
    def setUseHttpsDomain(value: Boolean): Self = this.set("useHttpsDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHttpsDomain: Self = this.set("useHttpsDomain", js.undefined)
    
    @scala.inline
    def setZone(value: Zone): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
    
    @scala.inline
    def setZoneExpire(value: Double): Self = this.set("zoneExpire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneExpire: Self = this.set("zoneExpire", js.undefined)
  }
}
