package typings.ramda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/groupBy", JSImport.Namespace)
@js.native
object groupByMod extends js.Object {
  def default[T](fn: js.Function1[/* a */ T, String]): js.Function1[/* list */ js.Array[T], StringDictionary[js.Array[T]]] = js.native
  def default[T](fn: js.Function1[/* a */ T, String], list: js.Array[T]): StringDictionary[js.Array[T]] = js.native
}

