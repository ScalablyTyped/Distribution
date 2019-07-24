package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionAttributes extends SharedAttributes {
  // a=group:BUNDLE audio video
  var groups: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Mids]] = js.undefined
  // a=ice-options:google-ice
  var iceOptions: js.UndefOr[java.lang.String] = js.undefined
  var icelite: js.UndefOr[java.lang.String] = js.undefined
  // a=msid-semantic: WMS Jvlam5X3SX1OP6pn20zWogvaKJz5Hjf9OnlV
  var msidSemantic: js.UndefOr[sdpDashTransformLib.Anon_Semantic] = js.undefined
}

object SessionAttributes {
  @scala.inline
  def apply(
    control: java.lang.String = null,
    direction: sdpDashTransformLib.sdpDashTransformLibStrings.sendrecv | sdpDashTransformLib.sdpDashTransformLibStrings.recvonly | sdpDashTransformLib.sdpDashTransformLibStrings.sendonly | sdpDashTransformLib.sdpDashTransformLibStrings.inactive = null,
    ext: js.Array[sdpDashTransformLib.Anon_Config] = null,
    fingerprint: sdpDashTransformLib.Anon_Hash = null,
    groups: js.Array[sdpDashTransformLib.Anon_Mids] = null,
    iceOptions: java.lang.String = null,
    icePwd: java.lang.String = null,
    iceUfrag: java.lang.String = null,
    icelite: java.lang.String = null,
    invalid: js.Array[sdpDashTransformLib.Anon_Value] = null,
    msidSemantic: sdpDashTransformLib.Anon_Semantic = null,
    setup: java.lang.String = null,
    sourceFilter: sdpDashTransformLib.Anon_AddressTypes = null
  ): SessionAttributes = {
    val __obj = js.Dynamic.literal()
    if (control != null) __obj.updateDynamic("control")(control)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (iceOptions != null) __obj.updateDynamic("iceOptions")(iceOptions)
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd)
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag)
    if (icelite != null) __obj.updateDynamic("icelite")(icelite)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (msidSemantic != null) __obj.updateDynamic("msidSemantic")(msidSemantic)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter)
    __obj.asInstanceOf[SessionAttributes]
  }
}

