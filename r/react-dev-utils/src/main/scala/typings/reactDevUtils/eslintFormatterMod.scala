package typings.reactDevUtils

import typings.eslint.mod.CLIEngine.LintResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/eslintFormatter", JSImport.Namespace)
@js.native
object eslintFormatterMod extends js.Object {
  /**
    * This is our custom ESLint formatter that integrates well with
    * Create React App console output.
    */
  def apply(results: js.Array[LintResult]): String = js.native
}

