package typings.resourcejs.mod

import typings.express.mod.NextFunction
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
    after: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    afterGet: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    afterIndex: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    afterPatch: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    afterPost: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    afterPut: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    before: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    beforeGet: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    beforeIndex: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    beforePatch: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    beforePost: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    beforePut: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null
  ): RestOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (afterGet != null) __obj.updateDynamic("afterGet")(js.Any.fromFunction3(afterGet))
    if (afterIndex != null) __obj.updateDynamic("afterIndex")(js.Any.fromFunction3(afterIndex))
    if (afterPatch != null) __obj.updateDynamic("afterPatch")(js.Any.fromFunction3(afterPatch))
    if (afterPost != null) __obj.updateDynamic("afterPost")(js.Any.fromFunction3(afterPost))
    if (afterPut != null) __obj.updateDynamic("afterPut")(js.Any.fromFunction3(afterPut))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3(before))
    if (beforeGet != null) __obj.updateDynamic("beforeGet")(js.Any.fromFunction3(beforeGet))
    if (beforeIndex != null) __obj.updateDynamic("beforeIndex")(js.Any.fromFunction3(beforeIndex))
    if (beforePatch != null) __obj.updateDynamic("beforePatch")(js.Any.fromFunction3(beforePatch))
    if (beforePost != null) __obj.updateDynamic("beforePost")(js.Any.fromFunction3(beforePost))
    if (beforePut != null) __obj.updateDynamic("beforePut")(js.Any.fromFunction3(beforePut))
    __obj.asInstanceOf[RestOptions]
  }
}

