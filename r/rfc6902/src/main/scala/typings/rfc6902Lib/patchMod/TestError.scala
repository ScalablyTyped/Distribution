package typings
package rfc6902Lib.patchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", "TestError")
@js.native
class TestError protected ()
  extends stdLib.Error {
  def this(actual: js.Any, expected: js.Any) = this()
  var actual: js.Any = js.native
  var expected: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

