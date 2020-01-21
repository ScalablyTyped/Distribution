package typings.ramda

import typings.ramda.ramdaStrings.deep
import typings.ramda.toolsMod.Merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/mergeDeepLeft", JSImport.Namespace)
@js.native
object mergeDeepLeftMod extends js.Object {
  def default[O1 /* <: js.Object */](o1: O1): js.Function1[/* o2 */ js.Object, Merge[O1, js.Object, deep]] = js.native
  def default[O1 /* <: js.Object */, O2 /* <: js.Object */](o1: O1, o2: O2): Merge[O1, O2, deep] = js.native
}

