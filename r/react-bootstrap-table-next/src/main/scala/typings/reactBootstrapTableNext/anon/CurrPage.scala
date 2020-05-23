package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrPage extends js.Object {
  var currPage: Double
  var currSizePerPage: Double
}

object CurrPage {
  @scala.inline
  def apply(currPage: Double, currSizePerPage: Double): CurrPage = {
    val __obj = js.Dynamic.literal(currPage = currPage.asInstanceOf[js.Any], currSizePerPage = currSizePerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrPage]
  }
}

