package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageListRendererOptions extends js.Object {
  /**
    * current page
    */
  var pages: js.Array[Active]
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit
}

object PageListRendererOptions {
  @scala.inline
  def apply(onPageChange: (Double, Double) => Unit, pages: js.Array[Active]): PageListRendererOptions = {
    val __obj = js.Dynamic.literal(onPageChange = js.Any.fromFunction2(onPageChange), pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListRendererOptions]
  }
}

