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

trait Reset extends js.Object {
  var get: GetRecoilValue
  var reset: ResetRecoilState
  var set: SetRecoilState
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
}

