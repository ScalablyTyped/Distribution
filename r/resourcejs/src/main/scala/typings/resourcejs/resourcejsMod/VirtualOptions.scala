package typings.resourcejs.resourcejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualOptions extends HttpMethodOptions {
  var path: js.UndefOr[String] = js.undefined
}

object VirtualOptions {
  @scala.inline
  def apply(after: HttpHandler = null, before: HttpHandler = null, path: String = null): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[VirtualOptions]
  }
}

