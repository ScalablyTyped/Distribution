package typings
package rfc6902Lib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/errors", "InvalidOperationError")
@js.native
class InvalidOperationError protected ()
  extends stdLib.Error {
  def this(op: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var op: java.lang.String = js.native
}

