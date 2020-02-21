package typings.roadsReq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPw extends js.Object {
  var pw: String
  var un: String
}

object AnonPw {
  @scala.inline
  def apply(pw: String, un: String): AnonPw = {
    val __obj = js.Dynamic.literal(pw = pw.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPw]
  }
}

