package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeouts extends js.Object {
  /**
    * The maximum amount of time, in milliseconds, to spend attempting to
    * {@linkplain ./webdriver.IWebDriver#findElement locate} an element on the
    * current page.
    */
  var `implicit`: js.UndefOr[Double] = js.native
  /**
    * The timeout, in milliseconds, to apply to navigation events along with the
    * {@link PageLoadStrategy}.
    */
  var pageLoad: js.UndefOr[Double] = js.native
  /**
    * Defines when, in milliseconds, to interrupt a script that is being
    * {@linkplain ./webdriver.IWebDriver#executeScript evaluated}.
    */
  var script: js.UndefOr[Double] = js.native
}

object ITimeouts {
  @scala.inline
  def apply(): ITimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeouts]
  }
  @scala.inline
  implicit class ITimeoutsOps[Self <: ITimeouts] (val x: Self) extends AnyVal {
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
    def setImplicit(value: Double): Self = this.set("implicit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicit: Self = this.set("implicit", js.undefined)
    @scala.inline
    def setPageLoad(value: Double): Self = this.set("pageLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLoad: Self = this.set("pageLoad", js.undefined)
    @scala.inline
    def setScript(value: Double): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
  }
  
}

