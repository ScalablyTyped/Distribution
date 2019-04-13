package typings
package resourcejsLib.resourcejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestOptions extends HttpMethodOptions {
  var afterGet: js.UndefOr[HttpHandler] = js.undefined
  var afterIndex: js.UndefOr[HttpHandler] = js.undefined
  var afterPatch: js.UndefOr[HttpHandler] = js.undefined
  var afterPost: js.UndefOr[HttpHandler] = js.undefined
  var afterPut: js.UndefOr[HttpHandler] = js.undefined
  var beforeGet: js.UndefOr[HttpHandler] = js.undefined
  var beforeIndex: js.UndefOr[HttpHandler] = js.undefined
  var beforePatch: js.UndefOr[HttpHandler] = js.undefined
  var beforePost: js.UndefOr[HttpHandler] = js.undefined
  var beforePut: js.UndefOr[HttpHandler] = js.undefined
}

object RestOptions {
  @scala.inline
  def apply(
    after: HttpHandler = null,
    afterGet: HttpHandler = null,
    afterIndex: HttpHandler = null,
    afterPatch: HttpHandler = null,
    afterPost: HttpHandler = null,
    afterPut: HttpHandler = null,
    before: HttpHandler = null,
    beforeGet: HttpHandler = null,
    beforeIndex: HttpHandler = null,
    beforePatch: HttpHandler = null,
    beforePost: HttpHandler = null,
    beforePut: HttpHandler = null
  ): RestOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterGet != null) __obj.updateDynamic("afterGet")(afterGet)
    if (afterIndex != null) __obj.updateDynamic("afterIndex")(afterIndex)
    if (afterPatch != null) __obj.updateDynamic("afterPatch")(afterPatch)
    if (afterPost != null) __obj.updateDynamic("afterPost")(afterPost)
    if (afterPut != null) __obj.updateDynamic("afterPut")(afterPut)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeGet != null) __obj.updateDynamic("beforeGet")(beforeGet)
    if (beforeIndex != null) __obj.updateDynamic("beforeIndex")(beforeIndex)
    if (beforePatch != null) __obj.updateDynamic("beforePatch")(beforePatch)
    if (beforePost != null) __obj.updateDynamic("beforePost")(beforePost)
    if (beforePut != null) __obj.updateDynamic("beforePut")(beforePut)
    __obj.asInstanceOf[RestOptions]
  }
}

