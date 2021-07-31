package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :string,   port :number,   protocol :string,   payloads :string | undefined} & sdp-transform.sdp-transform.MediaDescription */
trait typestringportnumberproto extends StObject {
  
  // b=AS:4000
  var bandwidth: js.UndefOr[js.Array[Limit]] = js.undefined
  
  // a=candidate
  var candidates: js.UndefOr[js.Array[Foundation]] = js.undefined
  
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[Ip] = js.undefined
  
  // a=control
  var control: js.UndefOr[String] = js.undefined
  
  // a=crypto
  var crypto: js.UndefOr[Id] = js.undefined
  
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
  var ext: js.UndefOr[js.Array[Uri]] = js.undefined
  
  var fingerprint: js.UndefOr[Hash] = js.undefined
  
  // a=fmtp
  var fmtp: js.Array[Config]
  
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.undefined
  
  var icePwd: js.UndefOr[String] = js.undefined
  
  var iceUfrag: js.UndefOr[String] = js.undefined
  
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[Attrs1]] = js.undefined
  
  var invalid: js.UndefOr[js.Array[ValueString]] = js.undefined
  
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
  
  // a=setup
  var setup: js.UndefOr[String] = js.undefined
  
  var simulcast: js.UndefOr[Dir1] = js.undefined
  
  var simulcast_03: js.UndefOr[ValueString] = js.undefined
  
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AddressTypes] = js.undefined
  
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[Semantics]] = js.undefined
  
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var `type`: String
  
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.undefined
}
object typestringportnumberproto {
  
  @scala.inline
  def apply(fmtp: js.Array[Config], port: Double, protocol: String, rtp: js.Array[Codec], `type`: String): typestringportnumberproto = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typestringportnumberproto]
  }
  
  @scala.inline
  implicit class typestringportnumberprotoMutableBuilder[Self <: typestringportnumberproto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: js.Array[Limit]): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setBandwidthVarargs(value: Limit*): Self = StObject.set(x, "bandwidth", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[Foundation]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    @scala.inline
    def setCandidatesVarargs(value: Foundation*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    
    @scala.inline
    def setConnection(value: Ip): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setCrypto(value: Id): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDirection(value: sendrecv | recvonly | sendonly | inactive): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEndOfCandidates(value: String): Self = StObject.set(x, "endOfCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfCandidatesUndefined: Self = StObject.set(x, "endOfCandidates", js.undefined)
    
    @scala.inline
    def setExt(value: js.Array[Uri]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: Uri*): Self = StObject.set(x, "ext", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: Hash): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setFmtp(value: js.Array[Config]): Self = StObject.set(x, "fmtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmtpVarargs(value: Config*): Self = StObject.set(x, "fmtp", js.Array(value :_*))
    
    @scala.inline
    def setFramerate(value: Double | String): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
    
    @scala.inline
    def setIcePwd(value: String): Self = StObject.set(x, "icePwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcePwdUndefined: Self = StObject.set(x, "icePwd", js.undefined)
    
    @scala.inline
    def setIceUfrag(value: String): Self = StObject.set(x, "iceUfrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceUfragUndefined: Self = StObject.set(x, "iceUfrag", js.undefined)
    
    @scala.inline
    def setImageattrs(value: js.Array[Attrs1]): Self = StObject.set(x, "imageattrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageattrsUndefined: Self = StObject.set(x, "imageattrs", js.undefined)
    
    @scala.inline
    def setImageattrsVarargs(value: Attrs1*): Self = StObject.set(x, "imageattrs", js.Array(value :_*))
    
    @scala.inline
    def setInvalid(value: js.Array[ValueString]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setInvalidVarargs(value: ValueString*): Self = StObject.set(x, "invalid", js.Array(value :_*))
    
    @scala.inline
    def setMaxptime(value: Double): Self = StObject.set(x, "maxptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxptimeUndefined: Self = StObject.set(x, "maxptime", js.undefined)
    
    @scala.inline
    def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
    
    @scala.inline
    def setMsid(value: String): Self = StObject.set(x, "msid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsidUndefined: Self = StObject.set(x, "msid", js.undefined)
    
    @scala.inline
    def setPayloads(value: String): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtime(value: Double): Self = StObject.set(x, "ptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtimeUndefined: Self = StObject.set(x, "ptime", js.undefined)
    
    @scala.inline
    def setRemoteCandidates(value: String): Self = StObject.set(x, "remoteCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCandidatesUndefined: Self = StObject.set(x, "remoteCandidates", js.undefined)
    
    @scala.inline
    def setRids(value: js.Array[Direction]): Self = StObject.set(x, "rids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRidsUndefined: Self = StObject.set(x, "rids", js.undefined)
    
    @scala.inline
    def setRidsVarargs(value: Direction*): Self = StObject.set(x, "rids", js.Array(value :_*))
    
    @scala.inline
    def setRtcp(value: IpVer): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpFb(value: js.Array[Payload]): Self = StObject.set(x, "rtcpFb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpFbTrrInt(value: js.Array[Value]): Self = StObject.set(x, "rtcpFbTrrInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpFbTrrIntUndefined: Self = StObject.set(x, "rtcpFbTrrInt", js.undefined)
    
    @scala.inline
    def setRtcpFbTrrIntVarargs(value: Value*): Self = StObject.set(x, "rtcpFbTrrInt", js.Array(value :_*))
    
    @scala.inline
    def setRtcpFbUndefined: Self = StObject.set(x, "rtcpFb", js.undefined)
    
    @scala.inline
    def setRtcpFbVarargs(value: Payload*): Self = StObject.set(x, "rtcpFb", js.Array(value :_*))
    
    @scala.inline
    def setRtcpMux(value: String): Self = StObject.set(x, "rtcpMux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpMuxUndefined: Self = StObject.set(x, "rtcpMux", js.undefined)
    
    @scala.inline
    def setRtcpRsize(value: String): Self = StObject.set(x, "rtcpRsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpRsizeUndefined: Self = StObject.set(x, "rtcpRsize", js.undefined)
    
    @scala.inline
    def setRtcpUndefined: Self = StObject.set(x, "rtcp", js.undefined)
    
    @scala.inline
    def setRtp(value: js.Array[Codec]): Self = StObject.set(x, "rtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtpVarargs(value: Codec*): Self = StObject.set(x, "rtp", js.Array(value :_*))
    
    @scala.inline
    def setSctpmap(value: App): Self = StObject.set(x, "sctpmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSctpmapUndefined: Self = StObject.set(x, "sctpmap", js.undefined)
    
    @scala.inline
    def setSetup(value: String): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    @scala.inline
    def setSimulcast(value: Dir1): Self = StObject.set(x, "simulcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulcastUndefined: Self = StObject.set(x, "simulcast", js.undefined)
    
    @scala.inline
    def setSimulcast_03(value: ValueString): Self = StObject.set(x, "simulcast_03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulcast_03Undefined: Self = StObject.set(x, "simulcast_03", js.undefined)
    
    @scala.inline
    def setSourceFilter(value: AddressTypes): Self = StObject.set(x, "sourceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFilterUndefined: Self = StObject.set(x, "sourceFilter", js.undefined)
    
    @scala.inline
    def setSsrcGroups(value: js.Array[Semantics]): Self = StObject.set(x, "ssrcGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcGroupsUndefined: Self = StObject.set(x, "ssrcGroups", js.undefined)
    
    @scala.inline
    def setSsrcGroupsVarargs(value: Semantics*): Self = StObject.set(x, "ssrcGroups", js.Array(value :_*))
    
    @scala.inline
    def setSsrcs(value: js.Array[Attribute]): Self = StObject.set(x, "ssrcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcsUndefined: Self = StObject.set(x, "ssrcs", js.undefined)
    
    @scala.inline
    def setSsrcsVarargs(value: Attribute*): Self = StObject.set(x, "ssrcs", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXGoogleFlag(value: String): Self = StObject.set(x, "xGoogleFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXGoogleFlagUndefined: Self = StObject.set(x, "xGoogleFlag", js.undefined)
  }
}
