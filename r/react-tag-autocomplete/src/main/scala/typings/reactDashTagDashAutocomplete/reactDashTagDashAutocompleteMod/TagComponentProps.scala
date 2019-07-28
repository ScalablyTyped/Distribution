package typings.reactDashTagDashAutocomplete.reactDashTagDashAutocompleteMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagComponentProps extends js.Object {
  var classNames: ClassNames
  var tag: Tag
  def onDelete(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
}

object TagComponentProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    onDelete: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    tag: Tag
  ): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, onDelete = js.Any.fromFunction1(onDelete), tag = tag)
  
    __obj.asInstanceOf[TagComponentProps]
  }
}

