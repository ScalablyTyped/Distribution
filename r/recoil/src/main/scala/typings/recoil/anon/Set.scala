package typings.recoil.anon

import typings.recoil.mod.RecoilState
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set extends js.Object {
  def set[T](recoilVal: RecoilState[T], newVal: T): Unit
  def setUnvalidatedAtomValues(atomMap: Map[String, _]): Unit
}

object Set {
  @scala.inline
  def apply(set: (RecoilState[js.Any], js.Any) => Unit, setUnvalidatedAtomValues: Map[String, _] => Unit): Set = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), setUnvalidatedAtomValues = js.Any.fromFunction1(setUnvalidatedAtomValues))
    __obj.asInstanceOf[Set]
  }
}

