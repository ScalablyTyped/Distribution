package typings.resourcejs.mod

import typings.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualOptions extends HttpMethodOptions {
  var path: js.UndefOr[String] = js.undefined
}

object VirtualOptions {
  @scala.inline
  def apply(
    after: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    before: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    path: String = null
  ): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3(before))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualOptions]
  }
}

