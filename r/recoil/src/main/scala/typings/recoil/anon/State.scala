package typings.recoil.anon

import typings.recoil.mod.Loadable
import typings.recoil.mod.LoadablePromise
import typings.recoil.recoilStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State[T] extends Loadable[T] {
  
  var contents: LoadablePromise[T] = js.native
  
  var state: loading = js.native
}
object State {
  
  @scala.inline
  def apply[T](contents: LoadablePromise[T], state: loading): State[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T]]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State[_], T] (val x: Self with State[T]) extends AnyVal {
    
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
    def setContents(value: LoadablePromise[T]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: loading): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
