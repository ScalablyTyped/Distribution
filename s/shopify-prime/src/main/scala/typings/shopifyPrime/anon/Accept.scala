package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  var Accept: String
  var `User-Agent`: String
}

object Accept {
  @scala.inline
  def apply(Accept: String, `User-Agent`: String): Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}

