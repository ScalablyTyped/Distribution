package typings.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewProps extends js.Object {
  /**
    * Callback function to generate a preview object when dragging. This preview will only be used
    * with backends that have the 'preview' flag set to true.
    * @param type: the type of the item (monitor.getItemType())
    * @param item: the item being dragged (monitor.getItem())
    * @param style: an object representing the style to use for the item, it should be passed to
    *               your component's style property and is used for positioning.
    * @returns The JSX element to display for the drag preview.
    */
  def generator(`type`: String, item: js.Any, style: CSSProperties): Element
}

object PreviewProps {
  @scala.inline
  def apply(generator: (String, js.Any, CSSProperties) => Element): PreviewProps = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction3(generator))
  
    __obj.asInstanceOf[PreviewProps]
  }
}

