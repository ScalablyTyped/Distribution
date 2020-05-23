package typings.sdpTransform.mod

import typings.sdpTransform.anon.AddressTypes
import typings.sdpTransform.anon.App
import typings.sdpTransform.anon.Attribute
import typings.sdpTransform.anon.Attrs1
import typings.sdpTransform.anon.Codec
import typings.sdpTransform.anon.Config
import typings.sdpTransform.anon.Dir1
import typings.sdpTransform.anon.Direction
import typings.sdpTransform.anon.Foundation
import typings.sdpTransform.anon.Hash
import typings.sdpTransform.anon.Id
import typings.sdpTransform.anon.IpVer
import typings.sdpTransform.anon.Payload
import typings.sdpTransform.anon.Semantics
import typings.sdpTransform.anon.Uri
import typings.sdpTransform.anon.Value
import typings.sdpTransform.anon.ValueString
import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaAttributes extends SharedAttributes {
  // a=candidate
  var candidates: js.UndefOr[js.Array[Foundation]] = js.undefined
  // a=crypto
  var crypto: js.UndefOr[Id] = js.undefined
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.undefined
  // a=fmtp
  var fmtp: js.Array[Config]
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.undefined
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[Attrs1]] = js.undefined
  // a=maxptime
  var maxptime: js.UndefOr[Double] = js.undefined
  // a=mid
  var mid: js.UndefOr[String] = js.undefined
  // a=msid
  var msid: js.UndefOr[String] = js.undefined
  var ptime: js.UndefOr[Double] = js.undefined
  // a=remote-candidates
  var remoteCandidates: js.UndefOr[String] = js.undefined
  // a=rid
  var rids: js.UndefOr[js.Array[Direction]] = js.undefined
  var rtcp: js.UndefOr[IpVer] = js.undefined
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[js.Array[Payload]] = js.undefined
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[js.Array[Value]] = js.undefined
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[String] = js.undefined
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[String] = js.undefined
  var rtp: js.Array[Codec]
  // a=sctpmap
  var sctpmap: js.UndefOr[App] = js.undefined
  var simulcast: js.UndefOr[Dir1] = js.undefined
  var simulcast_03: js.UndefOr[ValueString] = js.undefined
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[Semantics]] = js.undefined
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[Attribute]] = js.undefined
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.undefined
}

object MediaAttributes {
  @scala.inline
  def apply(
    fmtp: js.Array[Config],
    rtp: js.Array[Codec],
    candidates: js.Array[Foundation] = null,
    control: String = null,
    crypto: Id = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    endOfCandidates: String = null,
    ext: js.Array[Uri] = null,
    fingerprint: Hash = null,
    framerate: Double | String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    imageattrs: js.Array[Attrs1] = null,
    invalid: js.Array[ValueString] = null,
    maxptime: js.UndefOr[Double] = js.undefined,
    mid: String = null,
    msid: String = null,
    ptime: js.UndefOr[Double] = js.undefined,
    remoteCandidates: String = null,
    rids: js.Array[Direction] = null,
    rtcp: IpVer = null,
    rtcpFb: js.Array[Payload] = null,
    rtcpFbTrrInt: js.Array[Value] = null,
    rtcpMux: String = null,
    rtcpRsize: String = null,
    sctpmap: App = null,
    setup: String = null,
    simulcast: Dir1 = null,
    simulcast_03: ValueString = null,
    sourceFilter: AddressTypes = null,
    ssrcGroups: js.Array[Semantics] = null,
    ssrcs: js.Array[Attribute] = null,
    xGoogleFlag: String = null
  ): MediaAttributes = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    if (candidates != null) __obj.updateDynamic("candidates")(candidates.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (crypto != null) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (endOfCandidates != null) __obj.updateDynamic("endOfCandidates")(endOfCandidates.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (imageattrs != null) __obj.updateDynamic("imageattrs")(imageattrs.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (!js.isUndefined(maxptime)) __obj.updateDynamic("maxptime")(maxptime.get.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (msid != null) __obj.updateDynamic("msid")(msid.asInstanceOf[js.Any])
    if (!js.isUndefined(ptime)) __obj.updateDynamic("ptime")(ptime.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MediaAttributes]
  }
}

