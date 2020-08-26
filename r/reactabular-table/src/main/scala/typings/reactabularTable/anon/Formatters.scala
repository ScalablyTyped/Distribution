package typings.reactabularTable.anon

import typings.reactabularTable.mod.CellFormatter
import typings.reactabularTable.mod.CellTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatters extends js.Object {
  var formatters: js.UndefOr[js.Array[CellFormatter]] = js.native
  var transforms: js.UndefOr[js.Array[CellTransform]] = js.native
}

object Formatters {
  @scala.inline
  def apply(): Formatters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatters]
  }
  @scala.inline
  implicit class FormattersOps[Self <: Formatters] (val x: Self) extends AnyVal {
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
    def setFormattersVarargs(value: CellFormatter*): Self = this.set("formatters", js.Array(value :_*))
    @scala.inline
    def setFormatters(value: js.Array[CellFormatter]): Self = this.set("formatters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatters: Self = this.set("formatters", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: CellTransform*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[CellTransform]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

