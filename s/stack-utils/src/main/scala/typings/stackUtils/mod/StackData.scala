package typings.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackData extends js.Object {
  var column: js.UndefOr[Double] = js.native
  var constructor: js.UndefOr[Boolean] = js.native
  var evalOrigin: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var function: js.UndefOr[String] = js.native
  var line: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var native: js.UndefOr[Boolean] = js.native
}

object StackData {
  @scala.inline
  def apply(): StackData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackData]
  }
  @scala.inline
  implicit class StackDataOps[Self <: StackData] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setConstructor(value: Boolean): Self = this.set("constructor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setEvalOrigin(value: String): Self = this.set("evalOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalOrigin: Self = this.set("evalOrigin", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
  }
  
}

