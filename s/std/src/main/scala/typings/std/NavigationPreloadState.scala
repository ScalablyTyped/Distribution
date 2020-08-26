package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPreloadState extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.native
  var headerValue: js.UndefOr[java.lang.String] = js.native
}

object NavigationPreloadState {
  @scala.inline
  def apply(): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPreloadState]
  }
  @scala.inline
  implicit class NavigationPreloadStateOps[Self <: NavigationPreloadState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: scala.Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeaderValue(value: java.lang.String): Self = this.set("headerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderValue: Self = this.set("headerValue", js.undefined)
  }
  
}

