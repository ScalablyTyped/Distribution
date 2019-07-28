package typings.rfc6902.patchMod

import typings.rfc6902.diffMod.Operation
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", "InvalidOperationError")
@js.native
class InvalidOperationError protected () extends Error {
  def this(operation: Operation) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var operation: Operation = js.native
}

