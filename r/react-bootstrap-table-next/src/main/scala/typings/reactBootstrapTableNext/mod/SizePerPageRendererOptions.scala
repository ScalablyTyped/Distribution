package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizePerPageRendererOptions extends js.Object {
  /**
    * current size per page
    */
  var currentSizePerPage: Double
  /**
    * dropdown options
    */
  var options: js.Array[Text]
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit
}

object SizePerPageRendererOptions {
  @scala.inline
  def apply(currentSizePerPage: Double, onSizePerPageChange: (Double, Double) => Unit, options: js.Array[Text]): SizePerPageRendererOptions = {
    val __obj = js.Dynamic.literal(currentSizePerPage = currentSizePerPage.asInstanceOf[js.Any], onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageRendererOptions]
  }
}

