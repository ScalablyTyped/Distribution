package typings.prosemirrorView.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  var dom: HTMLElement
  var text: String
}

object Dom {
  @scala.inline
  def apply(dom: HTMLElement, text: String): Dom = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dom]
  }
}

