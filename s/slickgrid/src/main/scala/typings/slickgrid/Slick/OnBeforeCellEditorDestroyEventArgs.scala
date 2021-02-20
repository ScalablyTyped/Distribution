package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBeforeCellEditorDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var editor: Editor[T] = js.native
}
object OnBeforeCellEditorDestroyEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](editor: Editor[T], grid: Grid[T]): OnBeforeCellEditorDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeCellEditorDestroyEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnBeforeCellEditorDestroyEventArgsMutableBuilder[Self <: OnBeforeCellEditorDestroyEventArgs[_], T /* <: SlickData */] (val x: Self with OnBeforeCellEditorDestroyEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setEditor(value: Editor[T]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
  }
}
