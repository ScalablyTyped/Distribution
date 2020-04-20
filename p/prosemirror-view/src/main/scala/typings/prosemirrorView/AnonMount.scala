package typings.prosemirrorView

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMount extends js.Object {
  var mount: Node
}

object AnonMount {
  @scala.inline
  def apply(mount: Node): AnonMount = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMount]
  }
}

