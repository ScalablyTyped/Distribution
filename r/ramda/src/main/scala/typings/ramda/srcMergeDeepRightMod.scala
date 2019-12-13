package typings.ramda

import typings.ramda.ramdaStrings.deep
import typings.ramda.toolsMod.Merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/mergeDeepRight", JSImport.Namespace)
@js.native
object srcMergeDeepRightMod extends js.Object {
  def default[O1 /* <: js.Object */](a: O1): js.Function1[/* o2 */ js.Object, Merge[js.Object, O1, deep]] = js.native
  def default[O1 /* <: js.Object */, O2 /* <: js.Object */](o1: O1, o2: O2): Merge[O2, O1, deep] = js.native
}

