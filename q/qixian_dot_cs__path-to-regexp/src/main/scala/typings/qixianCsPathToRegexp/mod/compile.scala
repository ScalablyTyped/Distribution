package typings.qixianCsPathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@qixian.cs/path-to-regexp", "compile")
@js.native
object compile extends js.Object {
  def apply[P /* <: js.Object */](str: String): PathFunction[P] = js.native
  def apply[P /* <: js.Object */](str: String, options: ParseOptions with TokensToFunctionOptions): PathFunction[P] = js.native
}

