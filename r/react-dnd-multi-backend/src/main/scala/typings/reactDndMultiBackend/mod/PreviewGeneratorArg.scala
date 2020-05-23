package typings.reactDndMultiBackend.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewGeneratorArg[T] extends js.Object {
  /**
    * The item being dragged (monitor.getItem())
    */
  var item: T
  /**
    * The type of the item (monitor.getItemType())
    */
  var itemType: String
  /**
    * An object representing the style to use for the item, it should be passed to
    * your component's style property and is used for positioning
    */
  var style: CSSProperties
}

object PreviewGeneratorArg {
  @scala.inline
  def apply[T](item: T, itemType: String, style: CSSProperties): PreviewGeneratorArg[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewGeneratorArg[T]]
  }
}

