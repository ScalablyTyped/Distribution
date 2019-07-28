package typings.sdpDashTransform.sdpDashTransformMod

import typings.sdpDashTransform.Anon_AS
import typings.sdpDashTransform.Anon_AddressIpVer
import typings.sdpDashTransform.Anon_AddressTypes
import typings.sdpDashTransform.Anon_App
import typings.sdpDashTransform.Anon_Attribute
import typings.sdpDashTransform.Anon_Attrs1
import typings.sdpDashTransform.Anon_Codec
import typings.sdpDashTransform.Anon_ComponentFoundation
import typings.sdpDashTransform.Anon_Config
import typings.sdpDashTransform.Anon_ConfigId
import typings.sdpDashTransform.Anon_ConfigPayload
import typings.sdpDashTransform.Anon_Dir1
import typings.sdpDashTransform.Anon_Direction
import typings.sdpDashTransform.Anon_Hash
import typings.sdpDashTransform.Anon_Ip
import typings.sdpDashTransform.Anon_Payload
import typings.sdpDashTransform.Anon_PayloadValue
import typings.sdpDashTransform.Anon_Semantics
import typings.sdpDashTransform.Anon_Value
import typings.sdpDashTransform.sdpDashTransformStrings.inactive
import typings.sdpDashTransform.sdpDashTransformStrings.recvonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDescription
  extends MediaAttributes
     with SharedDescriptionFields

object MediaDescription {
  @scala.inline
  def apply(
    fmtp: js.Array[Anon_ConfigPayload],
    rtp: js.Array[Anon_Codec],
    bandwidth: Anon_AS = null,
    candidates: js.Array[Anon_ComponentFoundation] = null,
    connection: Anon_Ip = null,
    control: String = null,
    crypto: Anon_ConfigId = null,
    description: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    endOfCandidates: String = null,
    ext: js.Array[Anon_Config] = null,
    fingerprint: Anon_Hash = null,
    framerate: Double | String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    imageattrs: js.Array[Anon_Attrs1] = null,
    invalid: js.Array[Anon_Value] = null,
    maxptime: Int | Double = null,
    mid: String = null,
    msid: String = null,
    ptime: Int | Double = null,
    remoteCandidates: String = null,
    rids: js.Array[Anon_Direction] = null,
    rtcp: Anon_AddressIpVer = null,
    rtcpFb: Anon_Payload = null,
    rtcpFbTrrInt: Anon_PayloadValue = null,
    rtcpMux: String = null,
    rtcpRsize: String = null,
    sctpmap: Anon_App = null,
    setup: String = null,
    simulcast: Anon_Dir1 = null,
    simulcast_03: Anon_Value = null,
    sourceFilter: Anon_AddressTypes = null,
    ssrcGroups: js.Array[Anon_Semantics] = null,
    ssrcs: js.Array[Anon_Attribute] = null,
    xGoogleFlag: String = null
  ): MediaDescription = {
    val __obj = js.Dynamic.literal(fmtp = fmtp, rtp = rtp)
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth)
    if (candidates != null) __obj.updateDynamic("candidates")(candidates)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (control != null) __obj.updateDynamic("control")(control)
    if (crypto != null) __obj.updateDynamic("crypto")(crypto)
    if (description != null) __obj.updateDynamic("description")(description)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (endOfCandidates != null) __obj.updateDynamic("endOfCandidates")(endOfCandidates)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd)
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag)
    if (imageattrs != null) __obj.updateDynamic("imageattrs")(imageattrs)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (maxptime != null) __obj.updateDynamic("maxptime")(maxptime.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid)
    if (msid != null) __obj.updateDynamic("msid")(msid)
    if (ptime != null) __obj.updateDynamic("ptime")(ptime.asInstanceOf[js.Any])
    if (remoteCandidates != null) __obj.updateDynamic("remoteCandidates")(remoteCandidates)
    if (rids != null) __obj.updateDynamic("rids")(rids)
    if (rtcp != null) __obj.updateDynamic("rtcp")(rtcp)
    if (rtcpFb != null) __obj.updateDynamic("rtcpFb")(rtcpFb)
    if (rtcpFbTrrInt != null) __obj.updateDynamic("rtcpFbTrrInt")(rtcpFbTrrInt)
    if (rtcpMux != null) __obj.updateDynamic("rtcpMux")(rtcpMux)
    if (rtcpRsize != null) __obj.updateDynamic("rtcpRsize")(rtcpRsize)
    if (sctpmap != null) __obj.updateDynamic("sctpmap")(sctpmap)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (simulcast != null) __obj.updateDynamic("simulcast")(simulcast)
    if (simulcast_03 != null) __obj.updateDynamic("simulcast_03")(simulcast_03)
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter)
    if (ssrcGroups != null) __obj.updateDynamic("ssrcGroups")(ssrcGroups)
    if (ssrcs != null) __obj.updateDynamic("ssrcs")(ssrcs)
    if (xGoogleFlag != null) __obj.updateDynamic("xGoogleFlag")(xGoogleFlag)
    __obj.asInstanceOf[MediaDescription]
  }
}

