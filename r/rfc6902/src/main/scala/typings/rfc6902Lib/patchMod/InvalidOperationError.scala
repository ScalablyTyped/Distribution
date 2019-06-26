package typings
package rfc6902Lib.patchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", "InvalidOperationError")
@js.native
class InvalidOperationError protected ()
  extends stdLib.Error {
  def this(operation: rfc6902Lib.diffMod.Operation) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var operation: rfc6902Lib.diffMod.Operation = js.native
}

