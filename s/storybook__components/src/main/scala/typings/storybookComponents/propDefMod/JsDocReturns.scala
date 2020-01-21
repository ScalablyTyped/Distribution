package typings.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsDocReturns extends js.Object {
  var description: js.UndefOr[String] = js.undefined
}

object JsDocReturns {
  @scala.inline
  def apply(description: String = null): JsDocReturns = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsDocReturns]
  }
}

