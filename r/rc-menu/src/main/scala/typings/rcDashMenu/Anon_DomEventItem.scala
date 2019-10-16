package typings.rcDashMenu

import typings.react.reactMod.ReactInstance
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEventItem extends js.Object {
  var domEvent: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]
  var item: ReactInstance
  var key: String | Double
  var keyPath: js.Array[String | Double]
}

object Anon_DomEventItem {
  @scala.inline
  def apply(
    domEvent: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent],
    item: ReactInstance,
    key: String | Double,
    keyPath: js.Array[String | Double]
  ): Anon_DomEventItem = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath)
  
    __obj.asInstanceOf[Anon_DomEventItem]
  }
}

