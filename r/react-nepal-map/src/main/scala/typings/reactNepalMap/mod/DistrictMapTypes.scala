package typings.reactNepalMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistrictMapTypes extends MapMetaDataTypes {
  
  var province: Double = js.native
  
  var zip: Double = js.native
}
object DistrictMapTypes {
  
  @scala.inline
  def apply(name: String, province: Double, shape: String, zip: Double): DistrictMapTypes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictMapTypes]
  }
  
  @scala.inline
  implicit class DistrictMapTypesOps[Self <: DistrictMapTypes] (val x: Self) extends AnyVal {
    
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
    def setProvince(value: Double): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZip(value: Double): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
}
