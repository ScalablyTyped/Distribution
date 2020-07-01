package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeCellEditorDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var editor: Editor[T]
}

object OnBeforeCellEditorDestroyEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](editor: Editor[T], grid: Grid[T]): OnBeforeCellEditorDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeCellEditorDestroyEventArgs[T]]
  }
}

