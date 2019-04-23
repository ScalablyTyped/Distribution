package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyExtraHeaders extends js.Object {
  var body: js.UndefOr[java.lang.String | Anon_Body] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_BodyExtraHeaders {
  @scala.inline
  def apply(body: java.lang.String | Anon_Body = null, extraHeaders: js.Array[java.lang.String] = null): Anon_BodyExtraHeaders = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    __obj.asInstanceOf[Anon_BodyExtraHeaders]
  }
}

