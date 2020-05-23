package typings.reduxPack.anon

import typings.reduxPack.mod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxpackLIFECYCLE extends js.Object {
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.undefined
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.undefined
}

object ReduxpackLIFECYCLE {
  @scala.inline
  def apply(`redux-packSlashLIFECYCLE`: LIFECYCLEValues = null, `redux-packSlashTRANSACTION`: String = null): ReduxpackLIFECYCLE = {
    val __obj = js.Dynamic.literal()
    if (`redux-packSlashLIFECYCLE` != null) __obj.updateDynamic("redux-pack/LIFECYCLE")(`redux-packSlashLIFECYCLE`.asInstanceOf[js.Any])
    if (`redux-packSlashTRANSACTION` != null) __obj.updateDynamic("redux-pack/TRANSACTION")(`redux-packSlashTRANSACTION`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxpackLIFECYCLE]
  }
}

