package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def generateIdentifier(): java.lang.String = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateIdentifier")().asInstanceOf[java.lang.String]

@scala.inline
def generateSessionId(): java.lang.String = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSessionId")().asInstanceOf[java.lang.String]

@scala.inline
def getDescription(blob: typings.sdp.mod.SDPBlob): typings.sdp.mod.SDPSection = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDescription")(blob.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPSection]

@scala.inline
def getDirection(mediaSection: typings.sdp.mod.SDPSection, sessionpart: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPDirection = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(mediaSection.asInstanceOf[js.Any], sessionpart.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPDirection]

@scala.inline
def getDtlsParameters(mediaSection: typings.sdp.mod.SDPSection, session: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPDtlsParameters = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDtlsParameters")(mediaSection.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPDtlsParameters]

@scala.inline
def getIceParameters(mediaSection: typings.sdp.mod.SDPSection, session: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPIceParameters = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getIceParameters")(mediaSection.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPIceParameters]

@scala.inline
def getKind(mediaSection: typings.sdp.mod.SDPSection): java.lang.String = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getKind")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def getMediaSections(blob: typings.sdp.mod.SDPBlob): js.Array[typings.sdp.mod.SDPSection] = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMediaSections")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sdp.mod.SDPSection]]

@scala.inline
def getMid(mediaSection: typings.sdp.mod.SDPSection): java.lang.String = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMid")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def isRejected(mediaSection: typings.sdp.mod.SDPSection): scala.Boolean = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRejected")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isValidSDP(blob: typings.sdp.mod.SDPBlob): scala.Boolean = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidSDP")(blob.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def localCname: java.lang.String = typings.sdp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("localCname").asInstanceOf[java.lang.String]

@scala.inline
def matchPrefix(blob: typings.sdp.mod.SDPBlob, prefix: java.lang.String): js.Array[typings.sdp.mod.SDPLine] = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPrefix")(blob.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.sdp.mod.SDPLine]]

@scala.inline
def parseCandidate(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPIceCandidate = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseCandidate")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPIceCandidate]

@scala.inline
def parseExtmap(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPHeaderExtension = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseExtmap")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPHeaderExtension]

@scala.inline
def parseFingerprint(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPFingerprint = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFingerprint")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPFingerprint]

@scala.inline
def parseFmtp(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPCodecAdditionalParameters = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFmtp")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPCodecAdditionalParameters]

@scala.inline
def parseIceOptions(line: typings.sdp.mod.SDPLine): js.Array[java.lang.String] = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseIceOptions")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def parseMLine(mediaSection: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPMLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseMLine")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPMLine]

@scala.inline
def parseMsid(mediaSection: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPMediaStreamId = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseMsid")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPMediaStreamId]

@scala.inline
def parseOLine(mediaSection: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPOLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseOLine")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPOLine]

@scala.inline
def parseRtcpFb(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPFeedbackParameter = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtcpFb")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPFeedbackParameter]

@scala.inline
def parseRtcpParameters(mediaSection: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPRtcpParameters = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtcpParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPRtcpParameters]

@scala.inline
def parseRtpEncodingParameters(mediaSection: typings.sdp.mod.SDPSection): js.Array[typings.sdp.mod.SDPEncodingParameters] = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpEncodingParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sdp.mod.SDPEncodingParameters]]

@scala.inline
def parseRtpMap(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPCodecParameters = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpMap")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPCodecParameters]

@scala.inline
def parseRtpParameters(mediaSection: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPRtpCapabilities = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPRtpCapabilities]

@scala.inline
def parseSctpDescription(mediaSection: typings.sdp.mod.SDPSection): typings.sdp.mod.SDPSctpDescription = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSctpDescription")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPSctpDescription]

@scala.inline
def parseSsrcGroup(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPMediaSourceGroup = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSsrcGroup")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPMediaSourceGroup]

@scala.inline
def parseSsrcMedia(line: typings.sdp.mod.SDPLine): typings.sdp.mod.SDPMediaSource = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSsrcMedia")(line.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPMediaSource]

@scala.inline
def splitLines(blob: typings.sdp.mod.SDPBlob): js.Array[typings.sdp.mod.SDPLine] = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitLines")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sdp.mod.SDPLine]]

@scala.inline
def splitSections(blob: typings.sdp.mod.SDPBlob): js.Array[typings.sdp.mod.SDPSection] = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitSections")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sdp.mod.SDPSection]]

@scala.inline
def writeCandidate(candidate: typings.sdp.mod.SDPIceCandidate): typings.sdp.mod.SDPLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeCandidate")(candidate.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeDtlsParameters(params: typings.sdp.mod.SDPDtlsParameters, setupType: java.lang.String): typings.sdp.mod.SDPLine = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeDtlsParameters")(params.asInstanceOf[js.Any], setupType.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeExtmap(headerExtension: typings.sdp.mod.SDPHeaderExtension): typings.sdp.mod.SDPLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeExtmap")(headerExtension.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeFmtp(codec: typings.sdp.mod.SDPCodec): typings.sdp.mod.SDPLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFmtp")(codec.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeIceParameters(params: typings.sdp.mod.SDPIceParameters): typings.sdp.mod.SDPLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeIceParameters")(params.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeRtcpFb(codec: typings.sdp.mod.SDPCodec): js.Array[typings.sdp.mod.SDPLine] = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtcpFb")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sdp.mod.SDPLine]]

@scala.inline
def writeRtcpParameters(params: typings.sdp.mod.SDPRtcpParameters): typings.sdp.mod.SDPLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtcpParameters")(params.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeRtpDescription(kind: java.lang.String, caps: typings.sdp.mod.SDPRtpCapabilities): typings.sdp.mod.SDPSection = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtpDescription")(kind.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPSection]

@scala.inline
def writeRtpMap(codec: typings.sdp.mod.SDPCodecParameters): typings.sdp.mod.SDPLine = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtpMap")(codec.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPLine]

@scala.inline
def writeSctpDescription(mediaSection: typings.sdp.mod.SDPMLine, desc: typings.sdp.mod.SDPSctpDescription): typings.sdp.mod.SDPSection = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSctpDescription")(mediaSection.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPSection]

@scala.inline
def writeSessionBoilerplate(): typings.sdp.mod.SDPBlob = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")().asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: java.lang.String): typings.sdp.mod.SDPBlob = typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any]).asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: java.lang.String, sessVer: scala.Double): typings.sdp.mod.SDPBlob = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: java.lang.String, sessVer: scala.Double, sessUser: java.lang.String): typings.sdp.mod.SDPBlob = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: java.lang.String, sessVer: scala.Unit, sessUser: java.lang.String): typings.sdp.mod.SDPBlob = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: scala.Unit, sessVer: scala.Double): typings.sdp.mod.SDPBlob = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: scala.Unit, sessVer: scala.Double, sessUser: java.lang.String): typings.sdp.mod.SDPBlob = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPBlob]
@scala.inline
def writeSessionBoilerplate(sessId: scala.Unit, sessVer: scala.Unit, sessUser: java.lang.String): typings.sdp.mod.SDPBlob = (typings.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typings.sdp.mod.SDPBlob]

type SDPBlob = java.lang.String

type SDPCodecAdditionalParameters = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type SDPLine = java.lang.String

type SDPSection = java.lang.String
