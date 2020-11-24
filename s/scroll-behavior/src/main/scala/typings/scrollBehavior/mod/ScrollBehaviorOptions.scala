package typings.scrollBehavior.mod

import typings.scrollBehavior.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBehaviorOptions[TLocation /* <: LocationBase */, TContext] extends js.Object {
  
  def addTransitionHook(hook: TransitionHook): js.Function0[Unit] = js.native
  
  def getCurrentLocation(): TLocation = js.native
  
  var shouldUpdateScroll: js.UndefOr[ShouldUpdateScroll[TContext]] = js.native
  
  var stateStorage: Read[TLocation] = js.native
}
object ScrollBehaviorOptions {
  
  @scala.inline
  def apply[TLocation /* <: LocationBase */, TContext](
    addTransitionHook: TransitionHook => js.Function0[Unit],
    getCurrentLocation: () => TLocation,
    stateStorage: Read[TLocation]
  ): ScrollBehaviorOptions[TLocation, TContext] = {
    val __obj = js.Dynamic.literal(addTransitionHook = js.Any.fromFunction1(addTransitionHook), getCurrentLocation = js.Any.fromFunction0(getCurrentLocation), stateStorage = stateStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBehaviorOptions[TLocation, TContext]]
  }
  
  @scala.inline
  implicit class ScrollBehaviorOptionsOps[Self <: ScrollBehaviorOptions[_, _], TLocation /* <: LocationBase */, TContext] (val x: Self with (ScrollBehaviorOptions[TLocation, TContext])) extends AnyVal {
    
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
    def setAddTransitionHook(value: TransitionHook => js.Function0[Unit]): Self = this.set("addTransitionHook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentLocation(value: () => TLocation): Self = this.set("getCurrentLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStateStorage(value: Read[TLocation]): Self = this.set("stateStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUpdateScroll(value: (/* prevContext */ TContext | Null, TContext) => ScrollTarget): Self = this.set("shouldUpdateScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldUpdateScroll: Self = this.set("shouldUpdateScroll", js.undefined)
  }
}
