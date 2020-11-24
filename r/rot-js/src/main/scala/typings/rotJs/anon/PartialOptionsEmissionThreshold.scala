package typings.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rot-js.rot-js/lib/lighting.Options> */
@js.native
trait PartialOptionsEmissionThreshold extends js.Object {
  
  var emissionThreshold: js.UndefOr[Double] = js.native
  
  var passes: js.UndefOr[Double] = js.native
  
  var range: js.UndefOr[Double] = js.native
}
object PartialOptionsEmissionThreshold {
  
  @scala.inline
  def apply(): PartialOptionsEmissionThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsEmissionThreshold]
  }
  
  @scala.inline
  implicit class PartialOptionsEmissionThresholdOps[Self <: PartialOptionsEmissionThreshold] (val x: Self) extends AnyVal {
    
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
    def setEmissionThreshold(value: Double): Self = this.set("emissionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmissionThreshold: Self = this.set("emissionThreshold", js.undefined)
    
    @scala.inline
    def setPasses(value: Double): Self = this.set("passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasses: Self = this.set("passes", js.undefined)
    
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
