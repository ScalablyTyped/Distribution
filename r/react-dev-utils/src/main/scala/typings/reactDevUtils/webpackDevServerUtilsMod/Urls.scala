package typings.reactDevUtils.webpackDevServerUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Urls extends js.Object {
  var lanUrlForConfig: js.UndefOr[String] = js.native
  var lanUrlForTerminal: js.UndefOr[String] = js.native
  var localUrlForBrowser: String = js.native
  var localUrlForTerminal: String = js.native
}

object Urls {
  @scala.inline
  def apply(localUrlForBrowser: String, localUrlForTerminal: String): Urls = {
    val __obj = js.Dynamic.literal(localUrlForBrowser = localUrlForBrowser.asInstanceOf[js.Any], localUrlForTerminal = localUrlForTerminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urls]
  }
  @scala.inline
  implicit class UrlsOps[Self <: Urls] (val x: Self) extends AnyVal {
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
    def setLocalUrlForBrowser(value: String): Self = this.set("localUrlForBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalUrlForTerminal(value: String): Self = this.set("localUrlForTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanUrlForConfig(value: String): Self = this.set("lanUrlForConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanUrlForConfig: Self = this.set("lanUrlForConfig", js.undefined)
    @scala.inline
    def setLanUrlForTerminal(value: String): Self = this.set("lanUrlForTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanUrlForTerminal: Self = this.set("lanUrlForTerminal", js.undefined)
  }
  
}

