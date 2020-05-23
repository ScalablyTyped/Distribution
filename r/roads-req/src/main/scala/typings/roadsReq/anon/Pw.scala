package typings.roadsReq.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pw extends js.Object {
  var pw: String
  var un: String
}

object Pw {
  @scala.inline
  def apply(pw: String, un: String): Pw = {
    val __obj = js.Dynamic.literal(pw = pw.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pw]
  }
}

