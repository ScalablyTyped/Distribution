package typings.rfc6902.patchMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", "TestError")
@js.native
class TestError protected () extends Error {
  def this(actual: js.Any, expected: js.Any) = this()
  var actual: js.Any = js.native
  var expected: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

