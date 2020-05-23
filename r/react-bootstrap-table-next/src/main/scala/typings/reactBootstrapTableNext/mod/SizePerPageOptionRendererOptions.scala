package typings.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizePerPageOptionRendererOptions extends js.Object {
  /**
    * size of per page option
    */
  var page: Double
  /**
    * text of the option
    */
  var text: String
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit
}

object SizePerPageOptionRendererOptions {
  @scala.inline
  def apply(onSizePerPageChange: (Double, Double) => Unit, page: Double, text: String): SizePerPageOptionRendererOptions = {
    val __obj = js.Dynamic.literal(onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), page = page.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageOptionRendererOptions]
  }
}

