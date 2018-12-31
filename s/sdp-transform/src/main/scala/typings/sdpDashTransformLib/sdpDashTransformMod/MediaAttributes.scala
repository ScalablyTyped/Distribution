package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaAttributes extends SharedAttributes {
  // a=candidate
  var candidates: js.UndefOr[js.Array[sdpDashTransformLib.Anon_IpRport]] = js.undefined
  // a=crypto
  var crypto: js.UndefOr[sdpDashTransformLib.Anon_Suite] = js.undefined
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[java.lang.String] = js.undefined
  // a=fmtp
  var fmtp: js.UndefOr[sdpDashTransformLib.Anon_Config] = js.undefined
  // a=framerate
  var framerate: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Pt]] = js.undefined
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
  var rtcp: js.UndefOr[sdpDashTransformLib.Anon_Address] = js.undefined
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[sdpDashTransformLib.Anon_Type] = js.undefined
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[sdpDashTransformLib.Anon_Value] = js.undefined
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[java.lang.String] = js.undefined
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[java.lang.String] = js.undefined
  var rtp: js.UndefOr[sdpDashTransformLib.Anon_Encoding] = js.undefined
  // a=sctpmap
  var sctpmap: js.UndefOr[sdpDashTransformLib.Anon_SctpmapNumber] = js.undefined
  var simulcast: js.UndefOr[sdpDashTransformLib.Anon_Dir2] = js.undefined
  var simulcast_03: js.UndefOr[sdpDashTransformLib.Anon_ValueString] = js.undefined
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Ssrcs]] = js.undefined
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[sdpDashTransformLib.Anon_ValueId]] = js.undefined
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[java.lang.String] = js.undefined
}

