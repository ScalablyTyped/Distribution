package typings.reduxDashPack

import typings.reduxDashPack.reduxDashPackMod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReduxpackLIFECYCLE extends js.Object {
  var `redux-pack/LIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.undefined
  var `redux-pack/TRANSACTION`: js.UndefOr[String] = js.undefined
}

object Anon_ReduxpackLIFECYCLE {
  @scala.inline
  def apply(`redux-pack/LIFECYCLE`: LIFECYCLEValues = null, `redux-pack/TRANSACTION`: String = null): Anon_ReduxpackLIFECYCLE = {
    val __obj = js.Dynamic.literal()
    if (`redux-pack/LIFECYCLE` != null) __obj.updateDynamic("redux-pack/LIFECYCLE")(`redux-pack/LIFECYCLE`.asInstanceOf[js.Any])
    if (`redux-pack/TRANSACTION` != null) __obj.updateDynamic("redux-pack/TRANSACTION")(`redux-pack/TRANSACTION`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReduxpackLIFECYCLE]
  }
}

