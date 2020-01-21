package typings.sdpTransform.mod

import typings.sdpTransform.AnonAS
import typings.sdpTransform.AnonAddress
import typings.sdpTransform.AnonAddressTypes
import typings.sdpTransform.AnonConfig
import typings.sdpTransform.AnonHash
import typings.sdpTransform.AnonIp
import typings.sdpTransform.AnonMids
import typings.sdpTransform.AnonPayloads
import typings.sdpTransform.AnonSemantic
import typings.sdpTransform.AnonStart
import typings.sdpTransform.AnonValue
import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescription
  extends SessionAttributes
     with SharedDescriptionFields {
  // e=
  var email: js.UndefOr[String] = js.undefined
  // m=
  var media: js.Array[AnonPayloads with MediaDescription]
  // s=
  var name: js.UndefOr[String] = js.undefined
  // o=
  var origin: js.UndefOr[AnonAddress] = js.undefined
  // p=
  var phone: js.UndefOr[String] = js.undefined
  // r=
  var repeats: js.UndefOr[String] = js.undefined
  // z=
  var timezones: js.UndefOr[String] = js.undefined
  // t=0 0
  var timing: js.UndefOr[AnonStart] = js.undefined
  // u=
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object SessionDescription {
  @scala.inline
  def apply(
    media: js.Array[AnonPayloads with MediaDescription],
    bandwidth: AnonAS = null,
    connection: AnonIp = null,
    control: String = null,
    description: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    email: String = null,
    ext: js.Array[AnonConfig] = null,
    fingerprint: AnonHash = null,
    groups: js.Array[AnonMids] = null,
    iceOptions: String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    icelite: String = null,
    invalid: js.Array[AnonValue] = null,
    msidSemantic: AnonSemantic = null,
    name: String = null,
    origin: AnonAddress = null,
    phone: String = null,
    repeats: String = null,
    setup: String = null,
    sourceFilter: AnonAddressTypes = null,
    timezones: String = null,
    timing: AnonStart = null,
    uri: String = null,
    version: Int | Double = null
  ): SessionDescription = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (iceOptions != null) __obj.updateDynamic("iceOptions")(iceOptions.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (icelite != null) __obj.updateDynamic("icelite")(icelite.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (msidSemantic != null) __obj.updateDynamic("msidSemantic")(msidSemantic.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (repeats != null) __obj.updateDynamic("repeats")(repeats.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter.asInstanceOf[js.Any])
    if (timezones != null) __obj.updateDynamic("timezones")(timezones.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDescription]
  }
}

