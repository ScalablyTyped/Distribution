package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charset extends js.Object {
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var mode: java.lang.String
}

object Anon_Charset {
  @scala.inline
  def apply(mode: java.lang.String, charset: java.lang.String = null): Anon_Charset = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    __obj.asInstanceOf[Anon_Charset]
  }
}

