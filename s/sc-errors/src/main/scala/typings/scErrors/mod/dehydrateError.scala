package typings.scErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "dehydrateError")
@js.native
object dehydrateError extends js.Object {
  def apply(error: js.Any): DehydratedError = js.native
  def apply(error: js.Any, includeStackTrace: Boolean): DehydratedError = js.native
}

