package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBase64 extends js.Object {
  def atob(encodedString: java.lang.String): java.lang.String
  def btoa(rawString: java.lang.String): java.lang.String
}

object WindowBase64 {
  @scala.inline
  def apply(atob: java.lang.String => java.lang.String, btoa: java.lang.String => java.lang.String): WindowBase64 = {
    val __obj = js.Dynamic.literal(atob = js.Any.fromFunction1(atob), btoa = js.Any.fromFunction1(btoa))
  
    __obj.asInstanceOf[WindowBase64]
  }
}

