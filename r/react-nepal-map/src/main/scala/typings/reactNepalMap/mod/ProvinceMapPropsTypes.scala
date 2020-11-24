package typings.reactNepalMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvinceMapPropsTypes extends MapPropsTypes {
  
  var provinceColor: js.UndefOr[js.Array[String]] = js.native
}
object ProvinceMapPropsTypes {
  
  @scala.inline
  def apply(): ProvinceMapPropsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvinceMapPropsTypes]
  }
  
  @scala.inline
  implicit class ProvinceMapPropsTypesOps[Self <: ProvinceMapPropsTypes] (val x: Self) extends AnyVal {
    
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
    def setProvinceColorVarargs(value: String*): Self = this.set("provinceColor", js.Array(value :_*))
    
    @scala.inline
    def setProvinceColor(value: js.Array[String]): Self = this.set("provinceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvinceColor: Self = this.set("provinceColor", js.undefined)
  }
}
