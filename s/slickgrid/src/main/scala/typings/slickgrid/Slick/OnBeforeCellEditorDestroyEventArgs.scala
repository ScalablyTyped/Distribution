package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeCellEditorDestroyEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var editor: Editor[T]
}
object OnBeforeCellEditorDestroyEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](editor: Editor[T], grid: Grid[T]): OnBeforeCellEditorDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeCellEditorDestroyEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnBeforeCellEditorDestroyEventArgsMutableBuilder[Self <: OnBeforeCellEditorDestroyEventArgs[?], T /* <: SlickData */] (val x: Self & OnBeforeCellEditorDestroyEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setEditor(value: Editor[T]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
  }
}
