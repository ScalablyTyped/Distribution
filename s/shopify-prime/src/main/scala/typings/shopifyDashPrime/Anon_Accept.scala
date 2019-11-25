package typings.shopifyDashPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var Accept: String
  var `User-Agent`: String
}

object Anon_Accept {
  @scala.inline
  def apply(Accept: String, `User-Agent`: String): Anon_Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accept]
  }
}

