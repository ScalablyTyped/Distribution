package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin[T /* <: SlickData */] extends StObject {
  
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
  implicit class PluginMutableBuilder[Self <: Plugin[_], T /* <: SlickData */] (val x: Self with Plugin[T]) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: Grid[T] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
