package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.inactive
import typings.sdpTransform.sdpTransformStrings.recvonly
import typings.sdpTransform.sdpTransformStrings.sendonly
import typings.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :string,   port :number,   protocol :string,   payloads :string | undefined} & sdp-transform.sdp-transform.MediaDescription */
@js.native
trait typestringportnumberproto extends js.Object {
  
  // b=AS:4000
  var bandwidth: js.UndefOr[js.Array[Limit]] = js.native
  
  // a=candidate
  var candidates: js.UndefOr[js.Array[Foundation]] = js.native
  
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[Ip] = js.native
  
  // a=control
  var control: js.UndefOr[String] = js.native
  
  // a=crypto
  var crypto: js.UndefOr[Id] = js.native
  
  // i=
  var description: js.UndefOr[String] = js.native
  
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.native
  
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.native
  
  // a=extmap
  var ext: js.UndefOr[js.Array[Uri]] = js.native
  
  var fingerprint: js.UndefOr[Hash] = js.native
  
  // a=fmtp
  var fmtp: js.Array[Config] = js.native
  
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.native
  
  var icePwd: js.UndefOr[String] = js.native
  
  var iceUfrag: js.UndefOr[String] = js.native
  
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[Attrs1]] = js.native
  
  var invalid: js.UndefOr[js.Array[ValueString]] = js.native
  
  // a=maxptime
  var maxptime: js.UndefOr[Double] = js.native
  
  // a=mid
  var mid: js.UndefOr[String] = js.native
  
  // a=msid
  var msid: js.UndefOr[String] = js.native
  
  var payloads: js.UndefOr[String] = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var ptime: js.UndefOr[Double] = js.native
  
  // a=remote-candidates
  var remoteCandidates: js.UndefOr[String] = js.native
  
  // a=rid
  var rids: js.UndefOr[js.Array[Direction]] = js.native
  
  var rtcp: js.UndefOr[IpVer] = js.native
  
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[js.Array[Payload]] = js.native
  
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[js.Array[Value]] = js.native
  
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[String] = js.native
  
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[String] = js.native
  
  var rtp: js.Array[Codec] = js.native
  
  // a=sctpmap
  var sctpmap: js.UndefOr[App] = js.native
  
  // a=setup
  var setup: js.UndefOr[String] = js.native
  
  var simulcast: js.UndefOr[Dir1] = js.native
  
  var simulcast_03: js.UndefOr[ValueString] = js.native
  
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AddressTypes] = js.native
  
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[Semantics]] = js.native
  
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[Attribute]] = js.native
  
  var `type`: String = js.native
  
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.native
}
object typestringportnumberproto {
  
  @scala.inline
  def apply(fmtp: js.Array[Config], port: Double, protocol: String, rtp: js.Array[Codec], `type`: String): typestringportnumberproto = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typestringportnumberproto]
  }
  
  @scala.inline
  implicit class typestringportnumberprotoOps[Self <: typestringportnumberproto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFmtpVarargs(value: Config*): Self = this.set("fmtp", js.Array(value :_*))
    
    @scala.inline
    def setFmtp(value: js.Array[Config]): Self = this.set("fmtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtpVarargs(value: Codec*): Self = this.set("rtp", js.Array(value :_*))
    
    @scala.inline
    def setRtp(value: js.Array[Codec]): Self = this.set("rtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthVarargs(value: Limit*): Self = this.set("bandwidth", js.Array(value :_*))
    
    @scala.inline
    def setBandwidth(value: js.Array[Limit]): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setCandidatesVarargs(value: Foundation*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[Foundation]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandidates: Self = this.set("candidates", js.undefined)
    
    @scala.inline
    def setConnection(value: Ip): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setControl(value: String): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setCrypto(value: Id): Self = this.set("crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrypto: Self = this.set("crypto", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDirection(value: sendrecv | recvonly | sendonly | inactive): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEndOfCandidates(value: String): Self = this.set("endOfCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOfCandidates: Self = this.set("endOfCandidates", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: Uri*): Self = this.set("ext", js.Array(value :_*))
    
    @scala.inline
    def setExt(value: js.Array[Uri]): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setFingerprint(value: Hash): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setFramerate(value: Double | String): Self = this.set("framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerate: Self = this.set("framerate", js.undefined)
    
    @scala.inline
    def setIcePwd(value: String): Self = this.set("icePwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcePwd: Self = this.set("icePwd", js.undefined)
    
    @scala.inline
    def setIceUfrag(value: String): Self = this.set("iceUfrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceUfrag: Self = this.set("iceUfrag", js.undefined)
    
    @scala.inline
    def setImageattrsVarargs(value: Attrs1*): Self = this.set("imageattrs", js.Array(value :_*))
    
    @scala.inline
    def setImageattrs(value: js.Array[Attrs1]): Self = this.set("imageattrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageattrs: Self = this.set("imageattrs", js.undefined)
    
    @scala.inline
    def setInvalidVarargs(value: ValueString*): Self = this.set("invalid", js.Array(value :_*))
    
    @scala.inline
    def setInvalid(value: js.Array[ValueString]): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setMaxptime(value: Double): Self = this.set("maxptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxptime: Self = this.set("maxptime", js.undefined)
    
    @scala.inline
    def setMid(value: String): Self = this.set("mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMid: Self = this.set("mid", js.undefined)
    
    @scala.inline
    def setMsid(value: String): Self = this.set("msid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsid: Self = this.set("msid", js.undefined)
    
    @scala.inline
    def setPayloads(value: String): Self = this.set("payloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloads: Self = this.set("payloads", js.undefined)
    
    @scala.inline
    def setPtime(value: Double): Self = this.set("ptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePtime: Self = this.set("ptime", js.undefined)
    
    @scala.inline
    def setRemoteCandidates(value: String): Self = this.set("remoteCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteCandidates: Self = this.set("remoteCandidates", js.undefined)
    
    @scala.inline
    def setRidsVarargs(value: Direction*): Self = this.set("rids", js.Array(value :_*))
    
    @scala.inline
    def setRids(value: js.Array[Direction]): Self = this.set("rids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRids: Self = this.set("rids", js.undefined)
    
    @scala.inline
    def setRtcp(value: IpVer): Self = this.set("rtcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcp: Self = this.set("rtcp", js.undefined)
    
    @scala.inline
    def setRtcpFbVarargs(value: Payload*): Self = this.set("rtcpFb", js.Array(value :_*))
    
    @scala.inline
    def setRtcpFb(value: js.Array[Payload]): Self = this.set("rtcpFb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcpFb: Self = this.set("rtcpFb", js.undefined)
    
    @scala.inline
    def setRtcpFbTrrIntVarargs(value: Value*): Self = this.set("rtcpFbTrrInt", js.Array(value :_*))
    
    @scala.inline
    def setRtcpFbTrrInt(value: js.Array[Value]): Self = this.set("rtcpFbTrrInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcpFbTrrInt: Self = this.set("rtcpFbTrrInt", js.undefined)
    
    @scala.inline
    def setRtcpMux(value: String): Self = this.set("rtcpMux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcpMux: Self = this.set("rtcpMux", js.undefined)
    
    @scala.inline
    def setRtcpRsize(value: String): Self = this.set("rtcpRsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcpRsize: Self = this.set("rtcpRsize", js.undefined)
    
    @scala.inline
    def setSctpmap(value: App): Self = this.set("sctpmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSctpmap: Self = this.set("sctpmap", js.undefined)
    
    @scala.inline
    def setSetup(value: String): Self = this.set("setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setSimulcast(value: Dir1): Self = this.set("simulcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulcast: Self = this.set("simulcast", js.undefined)
    
    @scala.inline
    def setSimulcast_03(value: ValueString): Self = this.set("simulcast_03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulcast_03: Self = this.set("simulcast_03", js.undefined)
    
    @scala.inline
    def setSourceFilter(value: AddressTypes): Self = this.set("sourceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFilter: Self = this.set("sourceFilter", js.undefined)
    
    @scala.inline
    def setSsrcGroupsVarargs(value: Semantics*): Self = this.set("ssrcGroups", js.Array(value :_*))
    
    @scala.inline
    def setSsrcGroups(value: js.Array[Semantics]): Self = this.set("ssrcGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrcGroups: Self = this.set("ssrcGroups", js.undefined)
    
    @scala.inline
    def setSsrcsVarargs(value: Attribute*): Self = this.set("ssrcs", js.Array(value :_*))
    
    @scala.inline
    def setSsrcs(value: js.Array[Attribute]): Self = this.set("ssrcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrcs: Self = this.set("ssrcs", js.undefined)
    
    @scala.inline
    def setXGoogleFlag(value: String): Self = this.set("xGoogleFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXGoogleFlag: Self = this.set("xGoogleFlag", js.undefined)
  }
}
