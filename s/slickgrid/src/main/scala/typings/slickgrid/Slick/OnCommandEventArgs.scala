package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCommandEventArgs[T /* <: SlickData */] extends StObject {
  
  var button: HeaderButton = js.native
  
  var column: Column[T] = js.native
  
  var command: String = js.native
  
  var grid: Grid[T] = js.native
}
object OnCommandEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](button: HeaderButton, column: Column[T], command: String, grid: Grid[T]): OnCommandEventArgs[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCommandEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnCommandEventArgsMutableBuilder[Self <: OnCommandEventArgs[_], T /* <: SlickData */] (val x: Self with OnCommandEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setButton(value: HeaderButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid(value: Grid[T]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
