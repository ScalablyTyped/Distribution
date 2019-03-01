package typings
package prosemirrorDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentDOM extends js.Object {
  var contentDOM: js.UndefOr[stdLib.Node | scala.Null] = js.undefined
  var dom: stdLib.Node
}

object Anon_ContentDOM {
  @scala.inline
  def apply(dom: stdLib.Node, contentDOM: stdLib.Node = null): Anon_ContentDOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dom")(dom)
    if (contentDOM != null) __obj.updateDynamic("contentDOM")(contentDOM)
    __obj.asInstanceOf[Anon_ContentDOM]
  }
}

