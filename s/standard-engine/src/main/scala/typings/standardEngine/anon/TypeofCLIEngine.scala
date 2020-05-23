package typings.standardEngine.anon

import org.scalablytyped.runtime.Instantiable1
import typings.eslint.mod.CLIEngine
import typings.eslint.mod.CLIEngine.Formatter
import typings.eslint.mod.CLIEngine.LintReport
import typings.eslint.mod.CLIEngine.LintResult
import typings.eslint.mod.CLIEngine.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCLIEngine extends Instantiable1[/* options */ Options, CLIEngine] {
  var version: String = js.native
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  def getFormatter(): Formatter = js.native
  def getFormatter(format: String): Formatter = js.native
  def outputFixes(report: LintReport): Unit = js.native
}

