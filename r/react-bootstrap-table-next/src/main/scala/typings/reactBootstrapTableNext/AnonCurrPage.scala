package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrPage extends js.Object {
  var currPage: Double
  var currSizePerPage: Double
}

object AnonCurrPage {
  @scala.inline
  def apply(currPage: Double, currSizePerPage: Double): AnonCurrPage = {
    val __obj = js.Dynamic.literal(currPage = currPage.asInstanceOf[js.Any], currSizePerPage = currSizePerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrPage]
  }
}

