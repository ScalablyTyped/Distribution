package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/innerJoin", JSImport.Namespace)
@js.native
object srcInnerJoinMod extends js.Object {
  def default[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean]): js.Function2[/* list1 */ js.Array[T1], /* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def default[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean], list1: js.Array[T1]): js.Function1[/* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def default[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean], list1: js.Array[T1], list2: js.Array[T2]): js.Array[T1] = js.native
}

