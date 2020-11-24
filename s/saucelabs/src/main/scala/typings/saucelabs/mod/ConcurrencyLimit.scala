package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrencyLimit
  extends /* key */ StringDictionary[js.Any] {
  
  var mac: js.UndefOr[Double] = js.native
  
  var overall: js.UndefOr[Double] = js.native
  
  var real_device: js.UndefOr[Double] = js.native
  
  var scout: js.UndefOr[Double] = js.native
}
object ConcurrencyLimit {
  
  @scala.inline
  def apply(): ConcurrencyLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrencyLimit]
  }
  
  @scala.inline
  implicit class ConcurrencyLimitOps[Self <: ConcurrencyLimit] (val x: Self) extends AnyVal {
    
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
    def setMac(value: Double): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    
    @scala.inline
    def setOverall(value: Double): Self = this.set("overall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverall: Self = this.set("overall", js.undefined)
    
    @scala.inline
    def setReal_device(value: Double): Self = this.set("real_device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReal_device: Self = this.set("real_device", js.undefined)
    
    @scala.inline
    def setScout(value: Double): Self = this.set("scout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScout: Self = this.set("scout", js.undefined)
  }
}
