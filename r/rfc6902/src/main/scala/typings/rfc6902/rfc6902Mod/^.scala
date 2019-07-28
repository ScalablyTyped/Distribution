package typings.rfc6902.rfc6902Mod

import typings.rfc6902.diffMod.Operation
import typings.rfc6902.diffMod.TestOperation
import typings.rfc6902.diffMod.VoidableDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(`object`: js.Any, patch: js.Array[Operation]): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_rfc6902/patch.MissingError */ _
  ] = js.native
  def createPatch(input: js.Any, output: js.Any): js.Array[Operation] = js.native
  def createPatch(input: js.Any, output: js.Any, diff: VoidableDiff): js.Array[Operation] = js.native
  def createTests(input: js.Any, patch: js.Array[Operation]): js.Array[TestOperation] = js.native
}

