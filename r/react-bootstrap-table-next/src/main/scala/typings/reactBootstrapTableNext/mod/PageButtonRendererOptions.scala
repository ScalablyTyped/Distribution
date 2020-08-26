package typings.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageButtonRendererOptions extends js.Object {
  /**
    * is this page the current page or not
    */
  var active: Boolean = js.native
  /**
    *  is this page disabled or not
    */
  var disabled: Boolean = js.native
  /**
    * page number
    */
  var page: Double | String = js.native
  /**
    * page title
    */
  var title: String = js.native
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit = js.native
}

object PageButtonRendererOptions {
  @scala.inline
  def apply(
    active: Boolean,
    disabled: Boolean,
    onPageChange: (Double, Double) => Unit,
    page: Double | String,
    title: String
  ): PageButtonRendererOptions = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onPageChange = js.Any.fromFunction2(onPageChange), page = page.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageButtonRendererOptions]
  }
  @scala.inline
  implicit class PageButtonRendererOptionsOps[Self <: PageButtonRendererOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPageChange(value: (Double, Double) => Unit): Self = this.set("onPageChange", js.Any.fromFunction2(value))
    @scala.inline
    def setPage(value: Double | String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

