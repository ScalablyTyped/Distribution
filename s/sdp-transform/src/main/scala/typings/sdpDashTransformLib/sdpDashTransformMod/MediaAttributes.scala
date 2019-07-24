package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaAttributes extends SharedAttributes {
  // a=candidate
  var candidates: js.UndefOr[js.Array[sdpDashTransformLib.Anon_ComponentFoundation]] = js.undefined
  // a=crypto
  var crypto: js.UndefOr[sdpDashTransformLib.Anon_ConfigId] = js.undefined
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[java.lang.String] = js.undefined
  // a=fmtp
  var fmtp: js.Array[sdpDashTransformLib.Anon_ConfigPayload]
  // a=framerate
  var framerate: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Attrs1]] = js.undefined
  // a=maxptime
  var maxptime: js.UndefOr[scala.Double] = js.undefined
  // a=mid
  var mid: js.UndefOr[java.lang.String] = js.undefined
  // a=msid
  var msid: js.UndefOr[java.lang.String] = js.undefined
  var ptime: js.UndefOr[scala.Double] = js.undefined
  // a=remote-candidates
  var remoteCandidates: js.UndefOr[java.lang.String] = js.undefined
  // a=rid
  var rids: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Direction]] = js.undefined
  var rtcp: js.UndefOr[sdpDashTransformLib.Anon_AddressIpVer] = js.undefined
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[sdpDashTransformLib.Anon_Payload] = js.undefined
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[sdpDashTransformLib.Anon_PayloadValue] = js.undefined
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[java.lang.String] = js.undefined
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[java.lang.String] = js.undefined
  var rtp: js.Array[sdpDashTransformLib.Anon_Codec]
  // a=sctpmap
  var sctpmap: js.UndefOr[sdpDashTransformLib.Anon_App] = js.undefined
  var simulcast: js.UndefOr[sdpDashTransformLib.Anon_Dir1] = js.undefined
  var simulcast_03: js.UndefOr[sdpDashTransformLib.Anon_Value] = js.undefined
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Semantics]] = js.undefined
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Attribute]] = js.undefined
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[java.lang.String] = js.undefined
}

object MediaAttributes {
  @scala.inline
  def apply(
    fmtp: js.Array[sdpDashTransformLib.Anon_ConfigPayload],
    rtp: js.Array[sdpDashTransformLib.Anon_Codec],
    candidates: js.Array[sdpDashTransformLib.Anon_ComponentFoundation] = null,
    control: java.lang.String = null,
    crypto: sdpDashTransformLib.Anon_ConfigId = null,
    direction: sdpDashTransformLib.sdpDashTransformLibStrings.sendrecv | sdpDashTransformLib.sdpDashTransformLibStrings.recvonly | sdpDashTransformLib.sdpDashTransformLibStrings.sendonly | sdpDashTransformLib.sdpDashTransformLibStrings.inactive = null,
    endOfCandidates: java.lang.String = null,
    ext: js.Array[sdpDashTransformLib.Anon_Config] = null,
    fingerprint: sdpDashTransformLib.Anon_Hash = null,
    framerate: scala.Double | java.lang.String = null,
    icePwd: java.lang.String = null,
    iceUfrag: java.lang.String = null,
    imageattrs: js.Array[sdpDashTransformLib.Anon_Attrs1] = null,
    invalid: js.Array[sdpDashTransformLib.Anon_Value] = null,
    maxptime: scala.Int | scala.Double = null,
    mid: java.lang.String = null,
    msid: java.lang.String = null,
    ptime: scala.Int | scala.Double = null,
    remoteCandidates: java.lang.String = null,
    rids: js.Array[sdpDashTransformLib.Anon_Direction] = null,
    rtcp: sdpDashTransformLib.Anon_AddressIpVer = null,
    rtcpFb: sdpDashTransformLib.Anon_Payload = null,
    rtcpFbTrrInt: sdpDashTransformLib.Anon_PayloadValue = null,
    rtcpMux: java.lang.String = null,
    rtcpRsize: java.lang.String = null,
    sctpmap: sdpDashTransformLib.Anon_App = null,
    setup: java.lang.String = null,
    simulcast: sdpDashTransformLib.Anon_Dir1 = null,
    simulcast_03: sdpDashTransformLib.Anon_Value = null,
    sourceFilter: sdpDashTransformLib.Anon_AddressTypes = null,
    ssrcGroups: js.Array[sdpDashTransformLib.Anon_Semantics] = null,
    ssrcs: js.Array[sdpDashTransformLib.Anon_Attribute] = null,
    xGoogleFlag: java.lang.String = null
  ): MediaAttributes = {
    val __obj = js.Dynamic.literal(fmtp = fmtp, rtp = rtp)
    if (candidates != null) __obj.updateDynamic("candidates")(candidates)
    if (control != null) __obj.updateDynamic("control")(control)
    if (crypto != null) __obj.updateDynamic("crypto")(crypto)
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
    __obj.asInstanceOf[MediaAttributes]
  }
}

