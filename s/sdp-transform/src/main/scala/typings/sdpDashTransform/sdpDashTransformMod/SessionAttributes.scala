package typings.sdpDashTransform.sdpDashTransformMod

import typings.sdpDashTransform.Anon_AddressTypes
import typings.sdpDashTransform.Anon_Config
import typings.sdpDashTransform.Anon_Hash
import typings.sdpDashTransform.Anon_Mids
import typings.sdpDashTransform.Anon_Semantic
import typings.sdpDashTransform.Anon_Value
import typings.sdpDashTransform.sdpDashTransformStrings.inactive
import typings.sdpDashTransform.sdpDashTransformStrings.recvonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionAttributes extends SharedAttributes {
  // a=group:BUNDLE audio video
  var groups: js.UndefOr[js.Array[Anon_Mids]] = js.undefined
  // a=ice-options:google-ice
  var iceOptions: js.UndefOr[String] = js.undefined
  var icelite: js.UndefOr[String] = js.undefined
  // a=msid-semantic: WMS Jvlam5X3SX1OP6pn20zWogvaKJz5Hjf9OnlV
  var msidSemantic: js.UndefOr[Anon_Semantic] = js.undefined
}

object SessionAttributes {
  @scala.inline
  def apply(
    control: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    ext: js.Array[Anon_Config] = null,
    fingerprint: Anon_Hash = null,
    groups: js.Array[Anon_Mids] = null,
    iceOptions: String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    icelite: String = null,
    invalid: js.Array[Anon_Value] = null,
    msidSemantic: Anon_Semantic = null,
    setup: String = null,
    sourceFilter: Anon_AddressTypes = null
  ): SessionAttributes = {
    val __obj = js.Dynamic.literal()
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (iceOptions != null) __obj.updateDynamic("iceOptions")(iceOptions.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (icelite != null) __obj.updateDynamic("icelite")(icelite.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (msidSemantic != null) __obj.updateDynamic("msidSemantic")(msidSemantic.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAttributes]
  }
}

