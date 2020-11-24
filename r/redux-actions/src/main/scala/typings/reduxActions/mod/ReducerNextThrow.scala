package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReducerNextThrow[State, Payload] extends _ReducerMapValue[State, Payload] {
  
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.native
  
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.native
}
object ReducerNextThrow {
  
  @scala.inline
  def apply[State, Payload](): ReducerNextThrow[State, Payload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
  }
  
  @scala.inline
  implicit class ReducerNextThrowOps[Self <: ReducerNextThrow[_, _], State, Payload] (val x: Self with (ReducerNextThrow[State, Payload])) extends AnyVal {
    
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
    def setNext(value: (/* state */ State, /* action */ Action[Payload]) => State): Self = this.set("next", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setThrow(value: (/* state */ State, /* action */ Action[Payload]) => State): Self = this.set("throw", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteThrow: Self = this.set("throw", js.undefined)
  }
}
