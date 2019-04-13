package typings
package reduxDashPackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReduxpackLIFECYCLE extends js.Object {
  var `redux-pack/LIFECYCLE`: js.UndefOr[reduxDashPackLib.reduxDashPackMod.LIFECYCLEValues] = js.undefined
  var `redux-pack/TRANSACTION`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ReduxpackLIFECYCLE {
  @scala.inline
  def apply(
    `redux-pack/LIFECYCLE`: reduxDashPackLib.reduxDashPackMod.LIFECYCLEValues = null,
    `redux-pack/TRANSACTION`: java.lang.String = null
  ): Anon_ReduxpackLIFECYCLE = {
    val __obj = js.Dynamic.literal()
    if (`redux-pack/LIFECYCLE` != null) __obj.updateDynamic("redux-pack/LIFECYCLE")(`redux-pack/LIFECYCLE`)
    if (`redux-pack/TRANSACTION` != null) __obj.updateDynamic("redux-pack/TRANSACTION")(`redux-pack/TRANSACTION`)
    __obj.asInstanceOf[Anon_ReduxpackLIFECYCLE]
  }
}

