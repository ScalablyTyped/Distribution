package typings.reactCoinhive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoinHiveProps extends js.Object {
  var autoThreads: js.UndefOr[Boolean] = js.native
  var onInit: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
  var onStart: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
  var onStop: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.native
  var run: js.UndefOr[Boolean] = js.native
  var siteKey: String = js.native
  var src: js.UndefOr[String] = js.native
  var threads: js.UndefOr[Double] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var userName: js.UndefOr[String] = js.native
}

object CoinHiveProps {
  @scala.inline
  def apply(siteKey: String): CoinHiveProps = {
    val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinHiveProps]
  }
  @scala.inline
  implicit class CoinHivePropsOps[Self <: CoinHiveProps] (val x: Self) extends AnyVal {
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
    def setSiteKey(value: String): Self = this.set("siteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoThreads(value: Boolean): Self = this.set("autoThreads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoThreads: Self = this.set("autoThreads", js.undefined)
    @scala.inline
    def setOnInit(value: /* callback */ js.Any => Unit): Self = this.set("onInit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    @scala.inline
    def setOnStart(value: /* callback */ js.Any => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStop(value: /* callback */ js.Any => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setRun(value: Boolean): Self = this.set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

