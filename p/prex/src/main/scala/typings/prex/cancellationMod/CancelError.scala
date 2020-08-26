package typings.prex.cancellationMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/cancellation", "CancelError")
@js.native
class CancelError () extends Error {
  def this(message: String) = this()
}

