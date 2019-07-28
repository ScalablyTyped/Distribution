package typings.slickgrid.SlickNs

import typings.slickgrid.SlickNs.EditorsNs.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFactory extends js.Object {
  def getEditor[T](column: Column[T]): Editor[T]
}

object EditorFactory {
  @scala.inline
  def apply(getEditor: Column[js.Any] => Editor[js.Any]): EditorFactory = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction1(getEditor))
  
    __obj.asInstanceOf[EditorFactory]
  }
}

