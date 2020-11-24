package typings.reduxTestkit.mod

import typings.redux.mod.Action
import typings.reduxTestkit.anon.ToChangeInState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReducerTestkit extends js.Object {
  
  def execute(action: Action[_]): js.Any = js.native
  
  def expect(action: Action[_]): ToChangeInState = js.native
}
object ReducerTestkit {
  
  @scala.inline
  def apply(execute: Action[_] => js.Any, expect: Action[_] => ToChangeInState): ReducerTestkit = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect))
    __obj.asInstanceOf[ReducerTestkit]
  }
  
  @scala.inline
  implicit class ReducerTestkitOps[Self <: ReducerTestkit] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: Action[_] => js.Any): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpect(value: Action[_] => ToChangeInState): Self = this.set("expect", js.Any.fromFunction1(value))
  }
}
