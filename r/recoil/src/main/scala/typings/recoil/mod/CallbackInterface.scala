package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{getPromise <T>(recoilVal : recoil.recoil.RecoilValue<T>): std.Promise<T>, getLoadable <T>(recoilVal : recoil.recoil.RecoilValue<T>): recoil.recoil.Loadable<T>, set <T>(recoilVal : recoil.recoil.RecoilState<T>, valOrUpdater : (currVal : T): T | T): void, reset (recoilVal : recoil.recoil.RecoilState<any>): void}> */
trait CallbackInterface extends js.Object {
  val getLoadable: js.Function1[/* recoilVal */ RecoilValue[_], Loadable[_]]
  val getPromise: js.Function1[/* recoilVal */ RecoilValue[_], js.Promise[_]]
  val reset: js.Function1[/* recoilVal */ RecoilState[_], Unit]
  val set: js.Function2[
    /* recoilVal */ RecoilState[_], 
    /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any, 
    Unit
  ]
}

object CallbackInterface {
  @scala.inline
  def apply(
    getLoadable: /* recoilVal */ RecoilValue[_] => Loadable[_],
    getPromise: /* recoilVal */ RecoilValue[_] => js.Promise[_],
    reset: /* recoilVal */ RecoilState[_] => Unit,
    set: (/* recoilVal */ RecoilState[_], /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any) => Unit
  ): CallbackInterface = {
    val __obj = js.Dynamic.literal(getLoadable = js.Any.fromFunction1(getLoadable), getPromise = js.Any.fromFunction1(getPromise), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CallbackInterface]
  }
}

