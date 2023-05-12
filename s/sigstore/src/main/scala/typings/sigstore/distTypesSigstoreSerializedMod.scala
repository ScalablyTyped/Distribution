package typings.sigstore

import typings.sigstore.anon.Checkpoint
import typings.sigstore.anon.Digest
import typings.sigstore.anon.DsseEnvelope
import typings.sigstore.anon.KeyId_
import typings.sigstore.anon.MediaType
import typings.sigstore.anon.Sig
import typings.sigstore.anon.SignedEntryTimestamp
import typings.sigstore.anon.SignedTimestamp
import typings.sigstore.anon.Version
import typings.sigstore.distTypesUtilityMod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSigstoreSerializedMod {
  
  type SerializedBundle = MediaType & OneOf[DsseEnvelope]
  
  trait SerializedDSSEEnvelope extends StObject {
    
    var payload: String
    
    var payloadType: String
    
    var signatures: js.Array[Sig]
  }
  object SerializedDSSEEnvelope {
    
    inline def apply(payload: String, payloadType: String, signatures: js.Array[Sig]): SerializedDSSEEnvelope = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedDSSEEnvelope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedDSSEEnvelope] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[Sig]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: Sig*): Self = StObject.set(x, "signatures", js.Array(value*))
    }
  }
  
  trait SerializedEnvelope extends StObject {
    
    var payload: String
    
    var payloadType: String
    
    var signatures: js.Array[SerializedSignature]
  }
  object SerializedEnvelope {
    
    inline def apply(payload: String, payloadType: String, signatures: js.Array[SerializedSignature]): SerializedEnvelope = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedEnvelope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedEnvelope] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[SerializedSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: SerializedSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
    }
  }
  
  trait SerializedMessageSignature extends StObject {
    
    var messageDigest: js.UndefOr[Digest] = js.undefined
    
    var signature: String
  }
  object SerializedMessageSignature {
    
    inline def apply(signature: String): SerializedMessageSignature = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedMessageSignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedMessageSignature] (val x: Self) extends AnyVal {
      
      inline def setMessageDigest(value: Digest): Self = StObject.set(x, "messageDigest", value.asInstanceOf[js.Any])
      
      inline def setMessageDigestUndefined: Self = StObject.set(x, "messageDigest", js.undefined)
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedSignature extends StObject {
    
    var keyid: String
    
    var sig: String
  }
  object SerializedSignature {
    
    inline def apply(keyid: String, sig: String): SerializedSignature = {
      val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedSignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedSignature] (val x: Self) extends AnyVal {
      
      inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedTLogEntry extends StObject {
    
    var canonicalizedBody: String
    
    var inclusionPromise: SignedEntryTimestamp
    
    var inclusionProof: js.UndefOr[Checkpoint] = js.undefined
    
    var integratedTime: String
    
    var kindVersion: js.UndefOr[Version] = js.undefined
    
    var logId: KeyId_
    
    var logIndex: String
  }
  object SerializedTLogEntry {
    
    inline def apply(
      canonicalizedBody: String,
      inclusionPromise: SignedEntryTimestamp,
      integratedTime: String,
      logId: KeyId_,
      logIndex: String
    ): SerializedTLogEntry = {
      val __obj = js.Dynamic.literal(canonicalizedBody = canonicalizedBody.asInstanceOf[js.Any], inclusionPromise = inclusionPromise.asInstanceOf[js.Any], integratedTime = integratedTime.asInstanceOf[js.Any], logId = logId.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedTLogEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedTLogEntry] (val x: Self) extends AnyVal {
      
      inline def setCanonicalizedBody(value: String): Self = StObject.set(x, "canonicalizedBody", value.asInstanceOf[js.Any])
      
      inline def setInclusionPromise(value: SignedEntryTimestamp): Self = StObject.set(x, "inclusionPromise", value.asInstanceOf[js.Any])
      
      inline def setInclusionProof(value: Checkpoint): Self = StObject.set(x, "inclusionProof", value.asInstanceOf[js.Any])
      
      inline def setInclusionProofUndefined: Self = StObject.set(x, "inclusionProof", js.undefined)
      
      inline def setIntegratedTime(value: String): Self = StObject.set(x, "integratedTime", value.asInstanceOf[js.Any])
      
      inline def setKindVersion(value: Version): Self = StObject.set(x, "kindVersion", value.asInstanceOf[js.Any])
      
      inline def setKindVersionUndefined: Self = StObject.set(x, "kindVersion", js.undefined)
      
      inline def setLogId(value: KeyId_): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
      
      inline def setLogIndex(value: String): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedTimestampVerificationData extends StObject {
    
    var rfc3161Timestamps: js.Array[SignedTimestamp]
  }
  object SerializedTimestampVerificationData {
    
    inline def apply(rfc3161Timestamps: js.Array[SignedTimestamp]): SerializedTimestampVerificationData = {
      val __obj = js.Dynamic.literal(rfc3161Timestamps = rfc3161Timestamps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedTimestampVerificationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedTimestampVerificationData] (val x: Self) extends AnyVal {
      
      inline def setRfc3161Timestamps(value: js.Array[SignedTimestamp]): Self = StObject.set(x, "rfc3161Timestamps", value.asInstanceOf[js.Any])
      
      inline def setRfc3161TimestampsVarargs(value: SignedTimestamp*): Self = StObject.set(x, "rfc3161Timestamps", js.Array(value*))
    }
  }
}
