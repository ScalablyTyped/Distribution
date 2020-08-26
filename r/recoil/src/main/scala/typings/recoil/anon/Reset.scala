package typings.recoil.anon

import typings.recoil.mod.DefaultValue
import typings.recoil.mod.GetRecoilValue
import typings.recoil.mod.RecoilState
import typings.recoil.mod.RecoilValue
import typings.recoil.mod.ResetRecoilState
import typings.recoil.mod.SetRecoilState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reset extends js.Object {
  var get: GetRecoilValue = js.native
  var reset: ResetRecoilState = js.native
  var set: SetRecoilState = js.native
}

object Reset {
  @scala.inline
  def apply(
    get: /* recoilVal */ RecoilValue[js.Any] => js.Any,
    reset: /* recoilVal */ RecoilState[js.Any] => Unit,
    set: (/* recoilVal */ RecoilState[js.Any], /* newVal */ js.Any | DefaultValue | (js.Function1[/* prevValue */ js.Any, js.Any | DefaultValue])) => Unit
  ): Reset = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Reset]
  }
  @scala.inline
  implicit class ResetOps[Self <: Reset] (val x: Self) extends AnyVal {
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
    def setGet(value: /* recoilVal */ RecoilValue[js.Any] => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: /* recoilVal */ RecoilState[js.Any] => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(
      value: (/* recoilVal */ RecoilState[js.Any], /* newVal */ js.Any | DefaultValue | (js.Function1[/* prevValue */ js.Any, js.Any | DefaultValue])) => Unit
    ): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

