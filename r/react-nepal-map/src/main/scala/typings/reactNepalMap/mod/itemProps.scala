package typings.reactNepalMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait itemProps extends js.Object {
  var code: String = js.native
  var name: String = js.native
  var province: Double = js.native
  var zip: Double = js.native
}

object itemProps {
  @scala.inline
  def apply(code: String, name: String, province: Double, zip: Double): itemProps = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[itemProps]
  }
  @scala.inline
  implicit class itemPropsOps[Self <: itemProps] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: Double): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setZip(value: Double): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
  
}

