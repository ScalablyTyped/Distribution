package typings.reactDndMultiBackend.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewProps[T] extends js.Object {
  /**
    * Callback function to generate a preview object when dragging. This preview will only be used
    * with backends that have the 'preview' flag set to true.
    * @param arg.itemType: the type of the item (monitor.getItemType())
    * @param arg.item: the item being dragged (monitor.getItem())
    * @param arg.style: an object representing the style to use for the item, it should be passed to
    *               your component's style property and is used for positioning.
    * @returns The JSX element to display for the drag preview.
    */
  var generator: PreviewGenerator[T] = js.native
}

object PreviewProps {
  @scala.inline
  def apply[T](generator: /* arg */ PreviewGeneratorArg[T] => ReactNode): PreviewProps[T] = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
    __obj.asInstanceOf[PreviewProps[T]]
  }
  @scala.inline
  implicit class PreviewPropsOps[Self <: PreviewProps[_], T] (val x: Self with PreviewProps[T]) extends AnyVal {
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
    def setGenerator(value: /* arg */ PreviewGeneratorArg[T] => ReactNode): Self = this.set("generator", js.Any.fromFunction1(value))
  }
  
}

