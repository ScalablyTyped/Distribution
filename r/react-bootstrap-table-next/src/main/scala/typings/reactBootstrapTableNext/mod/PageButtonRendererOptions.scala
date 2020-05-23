package typings.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageButtonRendererOptions extends js.Object {
  /**
    * is this page the current page or not
    */
  var active: Boolean
  /**
    *  is this page disabled or not
    */
  var disabled: Boolean
  /**
    * page number
    */
  var page: Double | String
  /**
    * page title
    */
  var title: String
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit
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
}

