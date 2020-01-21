package typings.scErrors.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "ProcessExitError")
@js.native
class ProcessExitError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: Double) = this()
  var code: js.UndefOr[Double] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

