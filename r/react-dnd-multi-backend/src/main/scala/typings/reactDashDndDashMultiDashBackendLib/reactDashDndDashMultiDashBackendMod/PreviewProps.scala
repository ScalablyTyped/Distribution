package typings
package reactDashDndDashMultiDashBackendLib.reactDashDndDashMultiDashBackendMod

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
  def generator(`type`: java.lang.String, item: js.Any, style: reactLib.reactMod.ReactNs.CSSProperties): reactLib.reactMod.Global.JSXNs.Element
}

