package typings.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicatorOptions extends js.Object {
  var colorEnd: js.UndefOr[String] = js.native
  var colorStart: js.UndefOr[String] = js.native
  var colorTrigger: js.UndefOr[String] = js.native
  var indent: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[ElementOrSelector] = js.native
}

object IndicatorOptions {
  @scala.inline
  def apply(): IndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorOptions]
  }
  @scala.inline
  implicit class IndicatorOptionsOps[Self <: IndicatorOptions] (val x: Self) extends AnyVal {
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
    def setColorEnd(value: String): Self = this.set("colorEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorEnd: Self = this.set("colorEnd", js.undefined)
    @scala.inline
    def setColorStart(value: String): Self = this.set("colorStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStart: Self = this.set("colorStart", js.undefined)
    @scala.inline
    def setColorTrigger(value: String): Self = this.set("colorTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorTrigger: Self = this.set("colorTrigger", js.undefined)
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: ElementOrSelector): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

