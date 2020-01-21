package typings.ramda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/indexBy", JSImport.Namespace)
@js.native
object indexByMod extends js.Object {
  def default[T](fn: js.Function1[/* a */ T, String]): js.Function1[/* list */ js.Array[T], StringDictionary[T]] = js.native
  def default[T](fn: js.Function1[/* a */ T, String], list: js.Array[T]): StringDictionary[T] = js.native
}

