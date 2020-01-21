package typings.rbacA

import typings.rbacA.mod.AttributesManager
import typings.rbacA.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes[P /* <: Provider */, AM /* <: AttributesManager */] extends js.Object {
  var attributes: js.UndefOr[AM] = js.undefined
  var provider: P
}

object AnonAttributes {
  @scala.inline
  def apply[P /* <: Provider */, AM /* <: AttributesManager */](provider: P, attributes: AM = null): AnonAttributes[P, AM] = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes[P, AM]]
  }
}

