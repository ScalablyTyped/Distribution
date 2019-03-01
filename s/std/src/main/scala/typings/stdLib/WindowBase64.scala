package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBase64 extends js.Object {
  def atob(encodedString: java.lang.String): java.lang.String
  def btoa(rawString: java.lang.String): java.lang.String
}

object WindowBase64 {
  @scala.inline
  def apply(
    atob: js.Function1[java.lang.String, java.lang.String],
    btoa: js.Function1[java.lang.String, java.lang.String]
  ): WindowBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atob")(atob)
    __obj.updateDynamic("btoa")(btoa)
    __obj.asInstanceOf[WindowBase64]
  }
}

