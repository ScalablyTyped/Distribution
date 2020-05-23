package typings.reactModal.anon

import typings.std.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: Null | HTMLDivElement
  var overlay: Null | Element
}

object Content {
  @scala.inline
  def apply(content: HTMLDivElement = null, overlay: Element = null): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

