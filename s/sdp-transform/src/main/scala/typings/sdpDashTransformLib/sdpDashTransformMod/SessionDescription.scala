package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescription
  extends SessionAttributes
     with SharedDescriptionFields {
  // e=
  var email: js.UndefOr[java.lang.String] = js.undefined
  // m=
  var media: js.Array[sdpDashTransformLib.Anon_Payloads with MediaDescription]
  // s=
  var name: js.UndefOr[java.lang.String] = js.undefined
  // o=
  var origin: js.UndefOr[sdpDashTransformLib.Anon_Address] = js.undefined
  // p=
  var phone: js.UndefOr[java.lang.String] = js.undefined
  // r=
  var repeats: js.UndefOr[java.lang.String] = js.undefined
  // z=
  var timezones: js.UndefOr[java.lang.String] = js.undefined
  // t=0 0
  var timing: js.UndefOr[sdpDashTransformLib.Anon_Start] = js.undefined
  // u=
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object SessionDescription {
  @scala.inline
  def apply(
    media: js.Array[sdpDashTransformLib.Anon_Payloads with MediaDescription],
    bandwidth: sdpDashTransformLib.Anon_AS = null,
    connection: sdpDashTransformLib.Anon_Ip = null,
    control: java.lang.String = null,
    description: java.lang.String = null,
    direction: sdpDashTransformLib.sdpDashTransformLibStrings.sendrecv | sdpDashTransformLib.sdpDashTransformLibStrings.recvonly | sdpDashTransformLib.sdpDashTransformLibStrings.sendonly | sdpDashTransformLib.sdpDashTransformLibStrings.inactive = null,
    email: java.lang.String = null,
    ext: sdpDashTransformLib.Anon_Config = null,
    fingerprint: sdpDashTransformLib.Anon_Hash = null,
    groups: js.Array[sdpDashTransformLib.Anon_Mids] = null,
    iceOptions: java.lang.String = null,
    icePwd: java.lang.String = null,
    iceUfrag: java.lang.String = null,
    icelite: java.lang.String = null,
    invalid: js.Array[sdpDashTransformLib.Anon_Value] = null,
    msidSemantic: sdpDashTransformLib.Anon_Semantic = null,
    name: java.lang.String = null,
    origin: sdpDashTransformLib.Anon_Address = null,
    phone: java.lang.String = null,
    repeats: java.lang.String = null,
    setup: java.lang.String = null,
    sourceFilter: sdpDashTransformLib.Anon_AddressTypes = null,
    timezones: java.lang.String = null,
    timing: sdpDashTransformLib.Anon_Start = null,
    uri: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): SessionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("media")(media)
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

