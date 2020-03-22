package typings.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsDocReturns extends js.Object {
  var description: js.UndefOr[String] = js.native
}

object JsDocReturns {
  @scala.inline
  def apply(description: String = null): JsDocReturns = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsDocReturns]
  }
}

