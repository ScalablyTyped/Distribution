package typings.sdpTransform

import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :string,   port  :number,   protocol  :string,   payloads ? :string} & sdp-transform.sdp-transform.MediaDescription */
trait typestringportnumberproto extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[AnonLimit] = js.undefined
  // a=candidate
  var candidates: js.UndefOr[js.Array[AnonFoundation]] = js.undefined
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[AnonIp] = js.undefined
  // a=control
  var control: js.UndefOr[String] = js.undefined
  // a=crypto
  var crypto: js.UndefOr[AnonId] = js.undefined
  // i=
  var description: js.UndefOr[String] = js.undefined
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.undefined
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.undefined
  // a=extmap
  var ext: js.UndefOr[js.Array[AnonUri]] = js.undefined
  var fingerprint: js.UndefOr[AnonHash] = js.undefined
  // a=fmtp
  var fmtp: js.Array[AnonConfig]
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.undefined
  var icePwd: js.UndefOr[String] = js.undefined
  var iceUfrag: js.UndefOr[String] = js.undefined
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[AnonAttrs1]] = js.undefined
  var invalid: js.UndefOr[js.Array[AnonValueString]] = js.undefined
  // a=maxptime
  var maxptime: js.UndefOr[Double] = js.undefined
  // a=mid
  var mid: js.UndefOr[String] = js.undefined
  // a=msid
  var msid: js.UndefOr[String] = js.undefined
  var payloads: js.UndefOr[String] = js.undefined
  var port: Double
  var protocol: String
  var ptime: js.UndefOr[Double] = js.undefined
  // a=remote-candidates
  var remoteCandidates: js.UndefOr[String] = js.undefined
  // a=rid
  var rids: js.UndefOr[js.Array[AnonDirection]] = js.undefined
  var rtcp: js.UndefOr[AnonIpVer] = js.undefined
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[AnonPayload] = js.undefined
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[AnonValue] = js.undefined
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[String] = js.undefined
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[String] = js.undefined
  var rtp: js.Array[AnonCodec]
  // a=sctpmap
  var sctpmap: js.UndefOr[AnonApp] = js.undefined
  // a=setup
  var setup: js.UndefOr[String] = js.undefined
  var simulcast: js.UndefOr[AnonDir1] = js.undefined
  var simulcast_03: js.UndefOr[AnonValueString] = js.undefined
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AnonAddressTypes] = js.undefined
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[AnonSemantics]] = js.undefined
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[AnonAttribute]] = js.undefined
  var `type`: String
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.undefined
}

object typestringportnumberproto {
  @scala.inline
  def apply(
    fmtp: js.Array[AnonConfig],
    port: Double,
    protocol: String,
    rtp: js.Array[AnonCodec],
    `type`: String,
    bandwidth: AnonLimit = null,
    candidates: js.Array[AnonFoundation] = null,
    connection: AnonIp = null,
    control: String = null,
    crypto: AnonId = null,
    description: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    endOfCandidates: String = null,
    ext: js.Array[AnonUri] = null,
    fingerprint: AnonHash = null,
    framerate: Double | String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    imageattrs: js.Array[AnonAttrs1] = null,
    invalid: js.Array[AnonValueString] = null,
    maxptime: Int | Double = null,
    mid: String = null,
    msid: String = null,
    payloads: String = null,
    ptime: Int | Double = null,
    remoteCandidates: String = null,
    rids: js.Array[AnonDirection] = null,
    rtcp: AnonIpVer = null,
    rtcpFb: AnonPayload = null,
    rtcpFbTrrInt: AnonValue = null,
    rtcpMux: String = null,
    rtcpRsize: String = null,
    sctpmap: AnonApp = null,
    setup: String = null,
    simulcast: AnonDir1 = null,
    simulcast_03: AnonValueString = null,
    sourceFilter: AnonAddressTypes = null,
    ssrcGroups: js.Array[AnonSemantics] = null,
    ssrcs: js.Array[AnonAttribute] = null,
    xGoogleFlag: String = null
  ): typestringportnumberproto = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (candidates != null) __obj.updateDynamic("candidates")(candidates.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (crypto != null) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (endOfCandidates != null) __obj.updateDynamic("endOfCandidates")(endOfCandidates.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (imageattrs != null) __obj.updateDynamic("imageattrs")(imageattrs.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (maxptime != null) __obj.updateDynamic("maxptime")(maxptime.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (msid != null) __obj.updateDynamic("msid")(msid.asInstanceOf[js.Any])
    if (payloads != null) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    if (ptime != null) __obj.updateDynamic("ptime")(ptime.asInstanceOf[js.Any])
    if (remoteCandidates != null) __obj.updateDynamic("remoteCandidates")(remoteCandidates.asInstanceOf[js.Any])
    if (rids != null) __obj.updateDynamic("rids")(rids.asInstanceOf[js.Any])
    if (rtcp != null) __obj.updateDynamic("rtcp")(rtcp.asInstanceOf[js.Any])
    if (rtcpFb != null) __obj.updateDynamic("rtcpFb")(rtcpFb.asInstanceOf[js.Any])
    if (rtcpFbTrrInt != null) __obj.updateDynamic("rtcpFbTrrInt")(rtcpFbTrrInt.asInstanceOf[js.Any])
    if (rtcpMux != null) __obj.updateDynamic("rtcpMux")(rtcpMux.asInstanceOf[js.Any])
    if (rtcpRsize != null) __obj.updateDynamic("rtcpRsize")(rtcpRsize.asInstanceOf[js.Any])
    if (sctpmap != null) __obj.updateDynamic("sctpmap")(sctpmap.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (simulcast != null) __obj.updateDynamic("simulcast")(simulcast.asInstanceOf[js.Any])
    if (simulcast_03 != null) __obj.updateDynamic("simulcast_03")(simulcast_03.asInstanceOf[js.Any])
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter.asInstanceOf[js.Any])
    if (ssrcGroups != null) __obj.updateDynamic("ssrcGroups")(ssrcGroups.asInstanceOf[js.Any])
    if (ssrcs != null) __obj.updateDynamic("ssrcs")(ssrcs.asInstanceOf[js.Any])
    if (xGoogleFlag != null) __obj.updateDynamic("xGoogleFlag")(xGoogleFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[typestringportnumberproto]
  }
}

