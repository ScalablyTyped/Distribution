package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFactory extends js.Object {
  def getEditor[T](column: Column[T]): slickgridLib.SlickNs.EditorsNs.Editor[T]
}

object EditorFactory {
  @scala.inline
  def apply(getEditor: Column[js.Any] => slickgridLib.SlickNs.EditorsNs.Editor[js.Any]): EditorFactory = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction1(getEditor))
  
    __obj.asInstanceOf[EditorFactory]
  }
}

