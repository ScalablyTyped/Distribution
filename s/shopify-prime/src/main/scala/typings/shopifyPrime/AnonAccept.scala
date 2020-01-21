package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  var Accept: String
  var `User-Agent`: String
}

object AnonAccept {
  @scala.inline
  def apply(Accept: String, `User-Agent`: String): AnonAccept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccept]
  }
}

