package typings
package rfc6902Lib.patchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(`object`: js.Any, operation: rfc6902Lib.diffMod.AddOperation): MissingError | scala.Null = js.native
  @JSName("apply")
  def apply(`object`: js.Any, operation: rfc6902Lib.diffMod.Operation): MissingError | InvalidOperationError | TestError | scala.Null = js.native
  def copy(`object`: js.Any, operation: rfc6902Lib.diffMod.CopyOperation): MissingError | scala.Null = js.native
  def move(`object`: js.Any, operation: rfc6902Lib.diffMod.MoveOperation): MissingError | scala.Null = js.native
  def remove(`object`: js.Any, operation: rfc6902Lib.diffMod.RemoveOperation): MissingError | scala.Null = js.native
  def replace(`object`: js.Any, operation: rfc6902Lib.diffMod.ReplaceOperation): MissingError | scala.Null = js.native
  def test(`object`: js.Any, operation: rfc6902Lib.diffMod.TestOperation): TestError | scala.Null = js.native
}

