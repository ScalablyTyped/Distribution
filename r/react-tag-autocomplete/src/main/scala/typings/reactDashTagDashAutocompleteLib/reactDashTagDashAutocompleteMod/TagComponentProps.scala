package typings
package reactDashTagDashAutocompleteLib.reactDashTagDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagComponentProps extends js.Object {
  var classNames: ClassNames
  var tag: Tag
  def onDelete(event: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit
}

object TagComponentProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    onDelete: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent] => scala.Unit,
    tag: Tag
  ): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, onDelete = js.Any.fromFunction1(onDelete), tag = tag)
  
    __obj.asInstanceOf[TagComponentProps]
  }
}

