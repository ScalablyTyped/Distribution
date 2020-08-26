package typings.recoil.anon

import typings.recoil.mod.RecoilState
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends js.Object {
  def set[T](recoilVal: RecoilState[T], newVal: T): Unit = js.native
  def setUnvalidatedAtomValues(atomMap: Map[String, _]): Unit = js.native
}

object Set {
  @scala.inline
  def apply(set: (RecoilState[js.Any], js.Any) => Unit, setUnvalidatedAtomValues: Map[String, _] => Unit): Set = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), setUnvalidatedAtomValues = js.Any.fromFunction1(setUnvalidatedAtomValues))
    __obj.asInstanceOf[Set]
  }
  @scala.inline
  implicit class SetOps[Self <: Set] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSet(value: (RecoilState[js.Any], js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSetUnvalidatedAtomValues(value: Map[String, _] => Unit): Self = this.set("setUnvalidatedAtomValues", js.Any.fromFunction1(value))
  }
  
}

