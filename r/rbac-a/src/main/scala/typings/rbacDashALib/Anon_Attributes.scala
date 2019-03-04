package typings
package rbacDashALib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes[P /* <: rbacDashALib.rbacDashAMod.Provider */, AM /* <: rbacDashALib.rbacDashAMod.AttributesManager */] extends js.Object {
  var attributes: js.UndefOr[AM] = js.undefined
  var provider: P
}

object Anon_Attributes {
  @scala.inline
  def apply[P /* <: rbacDashALib.rbacDashAMod.Provider */, AM /* <: rbacDashALib.rbacDashAMod.AttributesManager */](provider: P, attributes: AM = null): Anon_Attributes[P, AM] = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes[P, AM]]
  }
}

