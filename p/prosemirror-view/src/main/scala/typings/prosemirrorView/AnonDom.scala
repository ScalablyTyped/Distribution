package typings.prosemirrorView

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDom extends js.Object {
  var dom: HTMLElement
  var text: String
}

object AnonDom {
  @scala.inline
  def apply(dom: HTMLElement, text: String): AnonDom = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDom]
  }
}

