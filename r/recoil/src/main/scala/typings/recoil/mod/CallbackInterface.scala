package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{getPromise <T>(recoilVal : recoil.recoil.RecoilValue<T>): std.Promise<T>, getLoadable <T>(recoilVal : recoil.recoil.RecoilValue<T>): recoil.recoil.Loadable<T>, set <T>(recoilVal : recoil.recoil.RecoilState<T>, valOrUpdater : (currVal : T): T | T): void, reset (recoilVal : recoil.recoil.RecoilState<any>): void}> */
@js.native
trait CallbackInterface extends js.Object {
  
  val getLoadable: js.Function1[/* recoilVal */ RecoilValue[_], Loadable[_]] = js.native
  
  val getPromise: js.Function1[/* recoilVal */ RecoilValue[_], js.Promise[_]] = js.native
  
  val reset: js.Function1[/* recoilVal */ RecoilState[_], Unit] = js.native
  
  val set: js.Function2[
    /* recoilVal */ RecoilState[_], 
    /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any, 
    Unit
  ] = js.native
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
  
  @scala.inline
  implicit class CallbackInterfaceOps[Self <: CallbackInterface] (val x: Self) extends AnyVal {
    
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
    def setGetLoadable(value: /* recoilVal */ RecoilValue[_] => Loadable[_]): Self = this.set("getLoadable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPromise(value: /* recoilVal */ RecoilValue[_] => js.Promise[_]): Self = this.set("getPromise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: /* recoilVal */ RecoilState[_] => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(
      value: (/* recoilVal */ RecoilState[_], /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any) => Unit
    ): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
