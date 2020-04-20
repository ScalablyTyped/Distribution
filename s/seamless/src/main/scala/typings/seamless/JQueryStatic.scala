package typings.seamless

import typings.seamless.Seamless.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var seamless: Static
}

object JQueryStatic {
  @scala.inline
  def apply(seamless: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(seamless = seamless.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

