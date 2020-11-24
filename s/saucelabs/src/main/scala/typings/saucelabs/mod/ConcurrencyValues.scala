package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrencyValues
  extends /* key */ StringDictionary[js.Any] {
  
  var id: js.UndefOr[String] = js.native
  
  var mac_vms: js.UndefOr[Double] = js.native
  
  var rds: js.UndefOr[Double] = js.native
  
  var vms: js.UndefOr[Double] = js.native
}
object ConcurrencyValues {
  
  @scala.inline
  def apply(): ConcurrencyValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrencyValues]
  }
  
  @scala.inline
  implicit class ConcurrencyValuesOps[Self <: ConcurrencyValues] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMac_vms(value: Double): Self = this.set("mac_vms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac_vms: Self = this.set("mac_vms", js.undefined)
    
    @scala.inline
    def setRds(value: Double): Self = this.set("rds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRds: Self = this.set("rds", js.undefined)
    
    @scala.inline
    def setVms(value: Double): Self = this.set("vms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVms: Self = this.set("vms", js.undefined)
  }
}
