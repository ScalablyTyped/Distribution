package typings.rfc6902

import typings.rfc6902.diffMod.Operation
import typings.rfc6902.diffMod.TestOperation
import typings.rfc6902.diffMod.VoidableDiff
import typings.rfc6902.patchMod.InvalidOperationError
import typings.rfc6902.patchMod.MissingError
import typings.rfc6902.patchMod.TestError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902", JSImport.Namespace)
@js.native
object rfc6902Mod extends js.Object {
  def applyPatch(`object`: js.Any, patch: js.Array[Operation]): js.Array[MissingError | TestError | InvalidOperationError] = js.native
  def createPatch(input: js.Any, output: js.Any): js.Array[Operation] = js.native
  def createPatch(input: js.Any, output: js.Any, diff: VoidableDiff): js.Array[Operation] = js.native
  def createTests(input: js.Any, patch: js.Array[Operation]): js.Array[TestOperation] = js.native
  type Patch = js.Array[Operation]
}

