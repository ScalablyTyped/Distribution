package typings.rcMenu

import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomEventItem extends js.Object {
  var domEvent: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]
  var item: ReactInstance
  var key: String | Double
  var keyPath: js.Array[String | Double]
}

object AnonDomEventItem {
  @scala.inline
  def apply(
    domEvent: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    item: ReactInstance,
    key: String | Double,
    keyPath: js.Array[String | Double]
  ): AnonDomEventItem = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomEventItem]
  }
}

