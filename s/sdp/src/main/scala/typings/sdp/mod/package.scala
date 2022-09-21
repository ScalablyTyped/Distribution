package typings.sdp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sdp.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def generateIdentifier(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateIdentifier")().asInstanceOf[String]

inline def generateSessionId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSessionId")().asInstanceOf[String]

inline def getDescription(blob: SDPBlob): SDPSection = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescription")(blob.asInstanceOf[js.Any]).asInstanceOf[SDPSection]

inline def getDirection(mediaSection: SDPSection, sessionpart: SDPSection): SDPDirection = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(mediaSection.asInstanceOf[js.Any], sessionpart.asInstanceOf[js.Any])).asInstanceOf[SDPDirection]

inline def getDtlsParameters(mediaSection: SDPSection, session: SDPSection): SDPDtlsParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("getDtlsParameters")(mediaSection.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[SDPDtlsParameters]

inline def getIceParameters(mediaSection: SDPSection, session: SDPSection): SDPIceParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("getIceParameters")(mediaSection.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[SDPIceParameters]

inline def getKind(mediaSection: SDPSection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKind")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getMediaSections(blob: SDPBlob): js.Array[SDPSection] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMediaSections")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[SDPSection]]

inline def getMid(mediaSection: SDPSection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMid")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[String]

inline def isRejected(mediaSection: SDPSection): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejected")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isValidSDP(blob: SDPBlob): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSDP")(blob.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def localCname: String = ^.asInstanceOf[js.Dynamic].selectDynamic("localCname").asInstanceOf[String]

inline def matchPrefix(blob: SDPBlob, prefix: String): js.Array[SDPLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPrefix")(blob.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[SDPLine]]

inline def parseCandidate(line: SDPLine): SDPIceCandidate = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCandidate")(line.asInstanceOf[js.Any]).asInstanceOf[SDPIceCandidate]

inline def parseExtmap(line: SDPLine): SDPHeaderExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExtmap")(line.asInstanceOf[js.Any]).asInstanceOf[SDPHeaderExtension]

inline def parseFingerprint(line: SDPLine): SDPFingerprint = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFingerprint")(line.asInstanceOf[js.Any]).asInstanceOf[SDPFingerprint]

inline def parseFmtp(line: SDPLine): SDPCodecAdditionalParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFmtp")(line.asInstanceOf[js.Any]).asInstanceOf[SDPCodecAdditionalParameters]

inline def parseIceOptions(line: SDPLine): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIceOptions")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def parseMLine(mediaSection: SDPSection): SDPMLine = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMLine")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[SDPMLine]

inline def parseMsid(mediaSection: SDPSection): SDPMediaStreamId = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMsid")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[SDPMediaStreamId]

inline def parseOLine(mediaSection: SDPSection): SDPOLine = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOLine")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[SDPOLine]

inline def parseRtcpFb(line: SDPLine): SDPFeedbackParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtcpFb")(line.asInstanceOf[js.Any]).asInstanceOf[SDPFeedbackParameter]

inline def parseRtcpParameters(mediaSection: SDPSection): SDPRtcpParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtcpParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[SDPRtcpParameters]

inline def parseRtpEncodingParameters(mediaSection: SDPSection): js.Array[SDPEncodingParameters] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpEncodingParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[js.Array[SDPEncodingParameters]]

inline def parseRtpMap(line: SDPLine): SDPCodecParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpMap")(line.asInstanceOf[js.Any]).asInstanceOf[SDPCodecParameters]

inline def parseRtpParameters(mediaSection: SDPSection): SDPRtpCapabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[SDPRtpCapabilities]

inline def parseSctpDescription(mediaSection: SDPSection): SDPSctpDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSctpDescription")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[SDPSctpDescription]

inline def parseSsrcGroup(line: SDPLine): SDPMediaSourceGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSsrcGroup")(line.asInstanceOf[js.Any]).asInstanceOf[SDPMediaSourceGroup]

inline def parseSsrcMedia(line: SDPLine): SDPMediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSsrcMedia")(line.asInstanceOf[js.Any]).asInstanceOf[SDPMediaSource]

inline def splitLines(blob: SDPBlob): js.Array[SDPLine] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitLines")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[SDPLine]]

inline def splitSections(blob: SDPBlob): js.Array[SDPSection] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitSections")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[SDPSection]]

inline def writeCandidate(candidate: SDPIceCandidate): SDPLine = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCandidate")(candidate.asInstanceOf[js.Any]).asInstanceOf[SDPLine]

inline def writeDtlsParameters(params: SDPDtlsParameters, setupType: String): SDPLine = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDtlsParameters")(params.asInstanceOf[js.Any], setupType.asInstanceOf[js.Any])).asInstanceOf[SDPLine]

inline def writeExtmap(headerExtension: SDPHeaderExtension): SDPLine = ^.asInstanceOf[js.Dynamic].applyDynamic("writeExtmap")(headerExtension.asInstanceOf[js.Any]).asInstanceOf[SDPLine]

inline def writeFmtp(codec: SDPCodec): SDPLine = ^.asInstanceOf[js.Dynamic].applyDynamic("writeFmtp")(codec.asInstanceOf[js.Any]).asInstanceOf[SDPLine]

inline def writeIceParameters(params: SDPIceParameters): SDPLine = ^.asInstanceOf[js.Dynamic].applyDynamic("writeIceParameters")(params.asInstanceOf[js.Any]).asInstanceOf[SDPLine]

inline def writeRtcpFb(codec: SDPCodec): js.Array[SDPLine] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeRtcpFb")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Array[SDPLine]]

inline def writeRtcpParameters(params: SDPRtcpParameters): SDPLine = ^.asInstanceOf[js.Dynamic].applyDynamic("writeRtcpParameters")(params.asInstanceOf[js.Any]).asInstanceOf[SDPLine]

inline def writeRtpDescription(kind: String, caps: SDPRtpCapabilities): SDPSection = (^.asInstanceOf[js.Dynamic].applyDynamic("writeRtpDescription")(kind.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[SDPSection]

inline def writeRtpMap(codec: SDPCodecParameters): SDPLine = ^.asInstanceOf[js.Dynamic].applyDynamic("writeRtpMap")(codec.asInstanceOf[js.Any]).asInstanceOf[SDPLine]

inline def writeSctpDescription(mediaSection: SDPMLine, desc: SDPSctpDescription): SDPSection = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSctpDescription")(mediaSection.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[SDPSection]

inline def writeSessionBoilerplate(): SDPBlob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")().asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: String): SDPBlob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any]).asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: String, sessVer: Double): SDPBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any])).asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: String, sessVer: Double, sessUser: String): SDPBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: String, sessVer: Unit, sessUser: String): SDPBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: Unit, sessVer: Double): SDPBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any])).asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: Unit, sessVer: Double, sessUser: String): SDPBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[SDPBlob]
inline def writeSessionBoilerplate(sessId: Unit, sessVer: Unit, sessUser: String): SDPBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[SDPBlob]

type SDPBlob = String

type SDPCodecAdditionalParameters = StringDictionary[String]

type SDPLine = String

type SDPSection = String
