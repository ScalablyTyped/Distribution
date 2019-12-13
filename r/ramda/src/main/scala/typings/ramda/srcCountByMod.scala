package typings.ramda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/countBy", JSImport.Namespace)
@js.native
object srcCountByMod extends js.Object {
  def default[T](fn: js.Function1[/* a */ T, String | Double]): js.Function1[/* list */ js.Array[T], StringDictionary[Double]] = js.native
  def default[T](fn: js.Function1[/* a */ T, String | Double], list: js.Array[T]): StringDictionary[Double] = js.native
}

