package typings.simplePeer

import typings.simplePeer.mod._SignalData
import typings.simplePeer.simplePeerBooleans.`true`
import typings.simplePeer.simplePeerStrings.IPv4
import typings.simplePeer.simplePeerStrings.IPv6
import typings.simplePeer.simplePeerStrings.candidate
import typings.simplePeer.simplePeerStrings.renegotiate
import typings.simplePeer.simplePeerStrings.transceiverRequest
import typings.std.AlgorithmIdentifier
import typings.std.RTCCertificate
import typings.std.RTCRtpTransceiverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: Unit
    
    var family: Unit
    
    var port: Unit
  }
  object Address {
    
    inline def apply(address: Unit, family: Unit, port: Unit): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: Unit): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: Unit): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Unit): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Candidate
    extends StObject
       with _SignalData {
    
    var candidate: typings.std.RTCIceCandidate
    
    var `type`: candidate
  }
  object Candidate {
    
    inline def apply(candidate: typings.std.RTCIceCandidate): Candidate = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[Candidate]
    }
    
    extension [Self <: Candidate](x: Self) {
      
      inline def setCandidate(value: typings.std.RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      inline def setType(value: candidate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Family extends StObject {
    
    var address: String
    
    var family: IPv6 | IPv4
    
    var port: Double
  }
  object Family {
    
    inline def apply(address: String, family: IPv6 | IPv4, port: Double): Family = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Family]
    }
    
    extension [Self <: Family](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: IPv6 | IPv4): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Init extends StObject {
    
    var init: js.UndefOr[RTCRtpTransceiverInit] = js.undefined
    
    var kind: String
  }
  object Init {
    
    inline def apply(kind: String): Init = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Init]
    }
    
    extension [Self <: Init](x: Self) {
      
      inline def setInit(value: RTCRtpTransceiverInit): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait RTCIceCandidate extends StObject {
    
    var RTCIceCandidate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCIceCandidate */ Any
    
    var RTCPeerConnection: TypeofRTCPeerConnection
    
    var RTCSessionDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCSessionDescription */ Any
  }
  object RTCIceCandidate {
    
    inline def apply(
      RTCIceCandidate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCIceCandidate */ Any,
      RTCPeerConnection: TypeofRTCPeerConnection,
      RTCSessionDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCSessionDescription */ Any
    ): RTCIceCandidate = {
      val __obj = js.Dynamic.literal(RTCIceCandidate = RTCIceCandidate.asInstanceOf[js.Any], RTCPeerConnection = RTCPeerConnection.asInstanceOf[js.Any], RTCSessionDescription = RTCSessionDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCIceCandidate]
    }
    
    extension [Self <: RTCIceCandidate](x: Self) {
      
      inline def setRTCIceCandidate(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCIceCandidate */ Any
      ): Self = StObject.set(x, "RTCIceCandidate", value.asInstanceOf[js.Any])
      
      inline def setRTCPeerConnection(value: TypeofRTCPeerConnection): Self = StObject.set(x, "RTCPeerConnection", value.asInstanceOf[js.Any])
      
      inline def setRTCSessionDescription(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RTCSessionDescription */ Any
      ): Self = StObject.set(x, "RTCSessionDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait Renegotiate
    extends StObject
       with _SignalData {
    
    var renegotiate: `true`
    
    var `type`: renegotiate
  }
  object Renegotiate {
    
    inline def apply(): Renegotiate = {
      val __obj = js.Dynamic.literal(renegotiate = true)
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[Renegotiate]
    }
    
    extension [Self <: Renegotiate](x: Self) {
      
      inline def setRenegotiate(value: `true`): Self = StObject.set(x, "renegotiate", value.asInstanceOf[js.Any])
      
      inline def setType(value: renegotiate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransceiverRequest
    extends StObject
       with _SignalData {
    
    var transceiverRequest: Init
    
    var `type`: transceiverRequest
  }
  object TransceiverRequest {
    
    inline def apply(transceiverRequest: Init): TransceiverRequest = {
      val __obj = js.Dynamic.literal(transceiverRequest = transceiverRequest.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transceiverRequest")
      __obj.asInstanceOf[TransceiverRequest]
    }
    
    extension [Self <: TransceiverRequest](x: Self) {
      
      inline def setTransceiverRequest(value: Init): Self = StObject.set(x, "transceiverRequest", value.asInstanceOf[js.Any])
      
      inline def setType(value: transceiverRequest): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofRTCPeerConnection extends StObject {
    
    /* standard dom */
    def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[RTCCertificate]
  }
  object TypeofRTCPeerConnection {
    
    inline def apply(generateCertificate: AlgorithmIdentifier => js.Promise[RTCCertificate]): TypeofRTCPeerConnection = {
      val __obj = js.Dynamic.literal(generateCertificate = js.Any.fromFunction1(generateCertificate))
      __obj.asInstanceOf[TypeofRTCPeerConnection]
    }
    
    extension [Self <: TypeofRTCPeerConnection](x: Self) {
      
      inline def setGenerateCertificate(value: AlgorithmIdentifier => js.Promise[RTCCertificate]): Self = StObject.set(x, "generateCertificate", js.Any.fromFunction1(value))
    }
  }
}
