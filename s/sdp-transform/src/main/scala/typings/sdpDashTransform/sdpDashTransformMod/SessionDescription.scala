package typings.sdpDashTransform.sdpDashTransformMod

import typings.sdpDashTransform.Anon_AS
import typings.sdpDashTransform.Anon_Address
import typings.sdpDashTransform.Anon_AddressTypes
import typings.sdpDashTransform.Anon_Config
import typings.sdpDashTransform.Anon_Hash
import typings.sdpDashTransform.Anon_Ip
import typings.sdpDashTransform.Anon_Mids
import typings.sdpDashTransform.Anon_Payloads
import typings.sdpDashTransform.Anon_Semantic
import typings.sdpDashTransform.Anon_Start
import typings.sdpDashTransform.Anon_Value
import typings.sdpDashTransform.sdpDashTransformStrings.inactive
import typings.sdpDashTransform.sdpDashTransformStrings.recvonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescription
  extends SessionAttributes
     with SharedDescriptionFields {
  // e=
  var email: js.UndefOr[String] = js.undefined
  // m=
  var media: js.Array[Anon_Payloads with MediaDescription]
  // s=
  var name: js.UndefOr[String] = js.undefined
  // o=
  var origin: js.UndefOr[Anon_Address] = js.undefined
  // p=
  var phone: js.UndefOr[String] = js.undefined
  // r=
  var repeats: js.UndefOr[String] = js.undefined
  // z=
  var timezones: js.UndefOr[String] = js.undefined
  // t=0 0
  var timing: js.UndefOr[Anon_Start] = js.undefined
  // u=
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object SessionDescription {
  @scala.inline
  def apply(
    media: js.Array[Anon_Payloads with MediaDescription],
    bandwidth: Anon_AS = null,
    connection: Anon_Ip = null,
    control: String = null,
    description: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    email: String = null,
    ext: js.Array[Anon_Config] = null,
    fingerprint: Anon_Hash = null,
    groups: js.Array[Anon_Mids] = null,
    iceOptions: String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    icelite: String = null,
    invalid: js.Array[Anon_Value] = null,
    msidSemantic: Anon_Semantic = null,
    name: String = null,
    origin: Anon_Address = null,
    phone: String = null,
    repeats: String = null,
    setup: String = null,
    sourceFilter: Anon_AddressTypes = null,
    timezones: String = null,
    timing: Anon_Start = null,
    uri: String = null,
    version: Int | Double = null
  ): SessionDescription = {
    val __obj = js.Dynamic.literal(media = media)
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (control != null) __obj.updateDynamic("control")(control)
    if (description != null) __obj.updateDynamic("description")(description)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (iceOptions != null) __obj.updateDynamic("iceOptions")(iceOptions)
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd)
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag)
    if (icelite != null) __obj.updateDynamic("icelite")(icelite)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (msidSemantic != null) __obj.updateDynamic("msidSemantic")(msidSemantic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (repeats != null) __obj.updateDynamic("repeats")(repeats)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter)
    if (timezones != null) __obj.updateDynamic("timezones")(timezones)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDescription]
  }
}

