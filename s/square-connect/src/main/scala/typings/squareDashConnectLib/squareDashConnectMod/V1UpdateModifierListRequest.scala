package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1UpdateModifierListRequest")
@js.native
class V1UpdateModifierListRequest () extends js.Object {
  /**
    * The modifier list's name.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates whether multiple options from the modifier list can be applied to a single item. See
    * [V1UpdateModifierListRequestSelectionType](#type-v1updatemodifierlistrequestselectiontype) for possible values
    */
  var selection_type: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.V1UpdateModifierListRequestNs.SelectionTypeEnum
  ] = js.native
}

