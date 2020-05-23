package typings.slimerjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charset extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  var mode: String
}

object Charset {
  @scala.inline
  def apply(mode: String, charset: String = null): Charset = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charset]
  }
}

