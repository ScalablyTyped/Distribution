package typings.rollupDashPluginDashTypescript2.distTscacheMod

import typings.typescript.typescriptMod.DiagnosticCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiagnostics extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var fileLine: js.UndefOr[String] = js.undefined
  var flatMessage: String
  var formatted: String
  var `type`: String
}

object IDiagnostics {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    flatMessage: String,
    formatted: String,
    `type`: String,
    fileLine: String = null
  ): IDiagnostics = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], flatMessage = flatMessage.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fileLine != null) __obj.updateDynamic("fileLine")(fileLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiagnostics]
  }
}

