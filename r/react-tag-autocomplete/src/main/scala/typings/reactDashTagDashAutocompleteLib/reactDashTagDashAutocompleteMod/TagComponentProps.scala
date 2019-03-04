package typings
package reactDashTagDashAutocompleteLib.reactDashTagDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagComponentProps extends js.Object {
  var classNames: ClassNames
  var tag: Tag
  def onDelete(event: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit
}

object TagComponentProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    onDelete: js.Function1[
      reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ],
    tag: Tag
  ): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, onDelete = onDelete, tag = tag)
  
    __obj.asInstanceOf[TagComponentProps]
  }
}

