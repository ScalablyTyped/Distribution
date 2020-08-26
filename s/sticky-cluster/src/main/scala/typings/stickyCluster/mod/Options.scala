package typings.stickyCluster.mod

import typings.stickyCluster.anon.Stickyclusterworkerindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var concurrency: js.UndefOr[Double] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[js.Function1[/* index */ Double, Stickyclusterworkerindex]] = js.native
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  var hardShutdownDelay: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
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
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEnv(value: /* index */ Double => Stickyclusterworkerindex): Self = this.set("env", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setErrorHandler(value: /* err */ js.Any => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setHardShutdownDelay(value: Double): Self = this.set("hardShutdownDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardShutdownDelay: Self = this.set("hardShutdownDelay", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

