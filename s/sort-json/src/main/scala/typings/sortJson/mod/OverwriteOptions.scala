package typings.sortJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverwriteOptions extends VisitOptions {
  /**
    * Formats the file content with an indentation of spaces. Use a number
    * greater then 0 for the value (default: detects the used indentation
    * of the file)
    */
  var indentSize: js.UndefOr[Double] = js.native
  /** Default: `false` */
  var noFinalNewLine: js.UndefOr[Boolean] = js.native
}

object OverwriteOptions {
  @scala.inline
  def apply(): OverwriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverwriteOptions]
  }
  @scala.inline
  implicit class OverwriteOptionsOps[Self <: OverwriteOptions] (val x: Self) extends AnyVal {
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
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentSize: Self = this.set("indentSize", js.undefined)
    @scala.inline
    def setNoFinalNewLine(value: Boolean): Self = this.set("noFinalNewLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFinalNewLine: Self = this.set("noFinalNewLine", js.undefined)
  }
  
}

