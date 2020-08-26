package typings.reactOnsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifiersNumber extends js.Object {
  var default: js.UndefOr[Double] = js.native
  var material: js.UndefOr[Double] = js.native
}

object ModifiersNumber {
  @scala.inline
  def apply(): ModifiersNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiersNumber]
  }
  @scala.inline
  implicit class ModifiersNumberOps[Self <: ModifiersNumber] (val x: Self) extends AnyVal {
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
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setMaterial(value: Double): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
  }
  
}

