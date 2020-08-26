package typings.sourceMapSupport.mod

import typings.sourceMapSupport.sourceMapSupportStrings.auto
import typings.sourceMapSupport.sourceMapSupportStrings.browser
import typings.sourceMapSupport.sourceMapSupportStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.native
  var environment: js.UndefOr[auto | browser | node] = js.native
  var handleUncaughtExceptions: js.UndefOr[Boolean] = js.native
  var hookRequire: js.UndefOr[Boolean] = js.native
  var overrideRetrieveFile: js.UndefOr[Boolean] = js.native
  var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.native
  var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEmptyCacheBetweenOperations(value: Boolean): Self = this.set("emptyCacheBetweenOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyCacheBetweenOperations: Self = this.set("emptyCacheBetweenOperations", js.undefined)
    @scala.inline
    def setEnvironment(value: auto | browser | node): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setHandleUncaughtExceptions(value: Boolean): Self = this.set("handleUncaughtExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleUncaughtExceptions: Self = this.set("handleUncaughtExceptions", js.undefined)
    @scala.inline
    def setHookRequire(value: Boolean): Self = this.set("hookRequire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHookRequire: Self = this.set("hookRequire", js.undefined)
    @scala.inline
    def setOverrideRetrieveFile(value: Boolean): Self = this.set("overrideRetrieveFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideRetrieveFile: Self = this.set("overrideRetrieveFile", js.undefined)
    @scala.inline
    def setOverrideRetrieveSourceMap(value: Boolean): Self = this.set("overrideRetrieveSourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideRetrieveSourceMap: Self = this.set("overrideRetrieveSourceMap", js.undefined)
    @scala.inline
    def setRetrieveFile(value: /* path */ String => String): Self = this.set("retrieveFile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRetrieveFile: Self = this.set("retrieveFile", js.undefined)
    @scala.inline
    def setRetrieveSourceMap(value: /* source */ String => UrlAndMap | Null): Self = this.set("retrieveSourceMap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRetrieveSourceMap: Self = this.set("retrieveSourceMap", js.undefined)
  }
  
}

