package typings
package rfc6902Lib.rfc6902Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(`object`: js.Any, patch: js.Array[rfc6902Lib.diffMod.Operation]): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_rfc6902/patch.MissingError */ _
  ] = js.native
  def createPatch(input: js.Any, output: js.Any): js.Array[rfc6902Lib.diffMod.Operation] = js.native
  def createPatch(input: js.Any, output: js.Any, diff: rfc6902Lib.diffMod.VoidableDiff): js.Array[rfc6902Lib.diffMod.Operation] = js.native
  def createTests(input: js.Any, patch: js.Array[rfc6902Lib.diffMod.Operation]): js.Array[rfc6902Lib.diffMod.TestOperation] = js.native
}

