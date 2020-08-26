package typings.reactNepalMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvinceMapTypes extends MapMetaDataTypes {
  var zip: Double = js.native
}

object ProvinceMapTypes {
  @scala.inline
  def apply(name: String, shape: String, zip: Double): ProvinceMapTypes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvinceMapTypes]
  }
  @scala.inline
  implicit class ProvinceMapTypesOps[Self <: ProvinceMapTypes] (val x: Self) extends AnyVal {
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
    def setZip(value: Double): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
  
}

