package typings.reactTagAutocomplete.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
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
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagComponentProps]
  }
}

