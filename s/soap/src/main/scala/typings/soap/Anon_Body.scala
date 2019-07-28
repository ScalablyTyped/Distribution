package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: js.Any = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Anon_Body]
  }
}

