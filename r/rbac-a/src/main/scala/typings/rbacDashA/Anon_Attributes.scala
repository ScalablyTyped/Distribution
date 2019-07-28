package typings.rbacDashA

import typings.rbacDashA.rbacDashAMod.AttributesManager
import typings.rbacDashA.rbacDashAMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes[P /* <: Provider */, AM /* <: AttributesManager */] extends js.Object {
  var attributes: js.UndefOr[AM] = js.undefined
  var provider: P
}

object Anon_Attributes {
  @scala.inline
  def apply[P /* <: Provider */, AM /* <: AttributesManager */](provider: P, attributes: AM = null): Anon_Attributes[P, AM] = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes[P, AM]]
  }
}

