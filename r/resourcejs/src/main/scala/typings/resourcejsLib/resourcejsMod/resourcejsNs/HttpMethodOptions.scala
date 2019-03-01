package typings
package resourcejsLib.resourcejsMod.resourcejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMethodOptions extends js.Object {
  var after: js.UndefOr[HttpHandler] = js.undefined
  var before: js.UndefOr[HttpHandler] = js.undefined
}

object HttpMethodOptions {
  @scala.inline
  def apply(after: HttpHandler = null, before: HttpHandler = null): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[HttpMethodOptions]
  }
}

