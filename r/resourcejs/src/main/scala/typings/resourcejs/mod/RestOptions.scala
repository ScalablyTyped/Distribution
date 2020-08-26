package typings.resourcejs.mod

import typings.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestOptions extends HttpMethodOptions {
  var afterGet: js.UndefOr[HttpHandler] = js.native
  var afterIndex: js.UndefOr[HttpHandler] = js.native
  var afterPatch: js.UndefOr[HttpHandler] = js.native
  var afterPost: js.UndefOr[HttpHandler] = js.native
  var afterPut: js.UndefOr[HttpHandler] = js.native
  var beforeGet: js.UndefOr[HttpHandler] = js.native
  var beforeIndex: js.UndefOr[HttpHandler] = js.native
  var beforePatch: js.UndefOr[HttpHandler] = js.native
  var beforePost: js.UndefOr[HttpHandler] = js.native
  var beforePut: js.UndefOr[HttpHandler] = js.native
}

object RestOptions {
  @scala.inline
  def apply(): RestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestOptions]
  }
  @scala.inline
  implicit class RestOptionsOps[Self <: RestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterGet(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("afterGet", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterGet: Self = this.set("afterGet", js.undefined)
    @scala.inline
    def setAfterIndex(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("afterIndex", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterIndex: Self = this.set("afterIndex", js.undefined)
    @scala.inline
    def setAfterPatch(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("afterPatch", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterPatch: Self = this.set("afterPatch", js.undefined)
    @scala.inline
    def setAfterPost(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("afterPost", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterPost: Self = this.set("afterPost", js.undefined)
    @scala.inline
    def setAfterPut(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("afterPut", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterPut: Self = this.set("afterPut", js.undefined)
    @scala.inline
    def setBeforeGet(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("beforeGet", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeGet: Self = this.set("beforeGet", js.undefined)
    @scala.inline
    def setBeforeIndex(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("beforeIndex", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeIndex: Self = this.set("beforeIndex", js.undefined)
    @scala.inline
    def setBeforePatch(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("beforePatch", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforePatch: Self = this.set("beforePatch", js.undefined)
    @scala.inline
    def setBeforePost(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("beforePost", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforePost: Self = this.set("beforePost", js.undefined)
    @scala.inline
    def setBeforePut(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("beforePut", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforePut: Self = this.set("beforePut", js.undefined)
  }
  
}

