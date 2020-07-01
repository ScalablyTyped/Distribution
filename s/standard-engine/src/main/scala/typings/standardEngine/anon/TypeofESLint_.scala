package typings.standardEngine.anon

import org.scalablytyped.runtime.Instantiable1
import typings.eslint.mod.ESLint
import typings.eslint.mod.ESLint.LintResult
import typings.eslint.mod.ESLint.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofESLint_ extends Instantiable1[/* options */ Options, ESLint] {
  var version: String = js.native
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  def outputFixes(results: js.Array[LintResult]): js.Promise[Unit] = js.native
}

