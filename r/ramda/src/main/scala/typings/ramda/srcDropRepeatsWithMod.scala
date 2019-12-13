package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/dropRepeatsWith", JSImport.Namespace)
@js.native
object srcDropRepeatsWithMod extends js.Object {
  def default[T](predicate: js.Function2[/* left */ T, /* right */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T](predicate: js.Function2[/* left */ T, /* right */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
}

