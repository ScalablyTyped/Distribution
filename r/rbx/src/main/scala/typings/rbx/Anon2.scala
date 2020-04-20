package typings.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(className: String = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

