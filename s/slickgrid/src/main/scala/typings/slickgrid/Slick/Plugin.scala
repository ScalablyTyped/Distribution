package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin[T /* <: SlickData */] extends js.Object {
  
  def destroy(): Unit = js.native
  
  def init(grid: Grid[T]): Unit = js.native
}
object Plugin {
  
  @scala.inline
  def apply[T /* <: SlickData */](destroy: () => Unit, init: Grid[T] => Unit): Plugin[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin[T]]
  }
  
  @scala.inline
  implicit class PluginOps[Self <: Plugin[_], T /* <: SlickData */] (val x: Self with Plugin[T]) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: Grid[T] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
  }
}
