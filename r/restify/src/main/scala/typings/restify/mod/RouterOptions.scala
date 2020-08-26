package typings.restify.mod

import typings.bunyan.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[^] = js.native
  var onceNext: js.UndefOr[Boolean] = js.native
  var registry: js.UndefOr[RouterRegistryRadix] = js.native
  var strictNext: js.UndefOr[Boolean] = js.native
}

object RouterOptions {
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreTrailingSlash(value: Boolean): Self = this.set("ignoreTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTrailingSlash: Self = this.set("ignoreTrailingSlash", js.undefined)
    @scala.inline
    def setLog(value: ^): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setOnceNext(value: Boolean): Self = this.set("onceNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnceNext: Self = this.set("onceNext", js.undefined)
    @scala.inline
    def setRegistry(value: RouterRegistryRadix): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
    @scala.inline
    def setStrictNext(value: Boolean): Self = this.set("strictNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictNext: Self = this.set("strictNext", js.undefined)
  }
  
}

