package typings.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(encoding: String = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

