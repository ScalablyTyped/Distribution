package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeCellEditorDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var editor: slickgridLib.SlickNs.EditorsNs.Editor[T]
}

object OnBeforeCellEditorDestroyEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](editor: slickgridLib.SlickNs.EditorsNs.Editor[T], grid: Grid[T]): OnBeforeCellEditorDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("grid")(grid)
    __obj.asInstanceOf[OnBeforeCellEditorDestroyEventArgs[T]]
  }
}

