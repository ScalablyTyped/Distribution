package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/partition", JSImport.Namespace)
@js.native
object srcPartitionMod extends js.Object {
  def default(fn: js.Function1[/* a */ String, Boolean]): js.Function1[/* list */ js.Array[String], js.Tuple2[js.Array[String], js.Array[String]]] = js.native
  def default(fn: js.Function1[/* a */ String, Boolean], list: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = js.native
  @JSName("default")
  def default_T[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  @JSName("default")
  def default_T[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
}

