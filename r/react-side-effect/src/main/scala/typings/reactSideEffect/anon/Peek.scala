package typings.reactSideEffect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peek[TPeek, TRewind] extends js.Object {
  
  def peek(): TPeek = js.native
  
  def rewind(): TRewind = js.native
}
object Peek {
  
  @scala.inline
  def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): Peek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
    __obj.asInstanceOf[Peek[TPeek, TRewind]]
  }
  
  @scala.inline
  implicit class PeekOps[Self <: Peek[_, _], TPeek, TRewind] (val x: Self with (Peek[TPeek, TRewind])) extends AnyVal {
    
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
    def setPeek(value: () => TPeek): Self = this.set("peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRewind(value: () => TRewind): Self = this.set("rewind", js.Any.fromFunction0(value))
  }
}
