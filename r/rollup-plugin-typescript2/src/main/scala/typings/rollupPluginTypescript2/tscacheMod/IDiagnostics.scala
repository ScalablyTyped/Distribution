package typings.rollupPluginTypescript2.tscacheMod

import typings.typescript.mod.DiagnosticCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiagnostics extends js.Object {
  var category: DiagnosticCategory = js.native
  var code: Double = js.native
  var fileLine: js.UndefOr[String] = js.native
  var flatMessage: String = js.native
  var formatted: String = js.native
  var `type`: String = js.native
}

object IDiagnostics {
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, flatMessage: String, formatted: String, `type`: String): IDiagnostics = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], flatMessage = flatMessage.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiagnostics]
  }
  @scala.inline
  implicit class IDiagnosticsOps[Self <: IDiagnostics] (val x: Self) extends AnyVal {
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
    def setCategory(value: DiagnosticCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatMessage(value: String): Self = this.set("flatMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileLine(value: String): Self = this.set("fileLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileLine: Self = this.set("fileLine", js.undefined)
  }
  
}

