package typings.rfc6902.patchMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", "MissingError")
@js.native
class MissingError protected () extends Error {
  def this(path: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var path: String = js.native
}

