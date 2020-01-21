package typings.reachRect

import typings.react.mod.Ref
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRect extends js.Object {
  var rect: DOMRect
  var ref: Ref[_]
}

object AnonRect {
  @scala.inline
  def apply(rect: DOMRect, ref: Ref[_] = null): AnonRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRect]
  }
}

