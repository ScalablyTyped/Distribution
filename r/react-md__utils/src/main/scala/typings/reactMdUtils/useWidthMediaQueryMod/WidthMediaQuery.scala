package typings.reactMdUtils.useWidthMediaQueryMod

import typings.reactMdUtils.sizingConstantsMod.QuerySize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidthMediaQuery extends js.Object {
  var max: js.UndefOr[QuerySize] = js.native
  var min: js.UndefOr[QuerySize] = js.native
}

object WidthMediaQuery {
  @scala.inline
  def apply(): WidthMediaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthMediaQuery]
  }
  @scala.inline
  implicit class WidthMediaQueryOps[Self <: WidthMediaQuery] (val x: Self) extends AnyVal {
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
    def setMax(value: QuerySize): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: QuerySize): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

