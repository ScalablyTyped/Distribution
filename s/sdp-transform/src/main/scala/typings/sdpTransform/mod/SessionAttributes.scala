package typings.sdpTransform.mod

import typings.sdpTransform.AnonAddressTypes
import typings.sdpTransform.AnonConfig
import typings.sdpTransform.AnonHash
import typings.sdpTransform.AnonMids
import typings.sdpTransform.AnonSemantic
import typings.sdpTransform.AnonValue
import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionAttributes extends SharedAttributes {
  // a=group:BUNDLE audio video
  var groups: js.UndefOr[js.Array[AnonMids]] = js.undefined
  // a=ice-options:google-ice
  var iceOptions: js.UndefOr[String] = js.undefined
  var icelite: js.UndefOr[String] = js.undefined
  // a=msid-semantic: WMS Jvlam5X3SX1OP6pn20zWogvaKJz5Hjf9OnlV
  var msidSemantic: js.UndefOr[AnonSemantic] = js.undefined
}

object SessionAttributes {
  @scala.inline
  def apply(
    control: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    ext: js.Array[AnonConfig] = null,
    fingerprint: AnonHash = null,
    groups: js.Array[AnonMids] = null,
    iceOptions: String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    icelite: String = null,
    invalid: js.Array[AnonValue] = null,
    msidSemantic: AnonSemantic = null,
    setup: String = null,
    sourceFilter: AnonAddressTypes = null
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

