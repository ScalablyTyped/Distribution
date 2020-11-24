package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
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
  implicit class OnBeforeCellEditorDestroyEventArgsOps[Self <: OnBeforeCellEditorDestroyEventArgs[_], T /* <: SlickData */] (val x: Self with OnBeforeCellEditorDestroyEventArgs[T]) extends AnyVal {
    
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
    def setEditor(value: Editor[T]): Self = this.set("editor", value.asInstanceOf[js.Any])
  }
}
