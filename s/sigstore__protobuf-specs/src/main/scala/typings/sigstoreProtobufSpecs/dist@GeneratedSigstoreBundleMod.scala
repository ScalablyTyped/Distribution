package typings.sigstoreProtobufSpecs

import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.RFC3161SignedTimestamp
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.TransparencyLogEntry
import typings.sigstoreProtobufSpecs.anon.Case
import typings.sigstoreProtobufSpecs.anon.DsseEnvelope
import typings.sigstoreProtobufSpecs.anon.MessageSignature
import typings.sigstoreProtobufSpecs.anon.X509CertificateChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@GeneratedSigstoreBundleMod` {
  
  trait Bundle extends StObject {
    
    var content: js.UndefOr[MessageSignature | DsseEnvelope] = js.undefined
    
    /**
      * MUST be application/vnd.dev.sigstore.bundle+json;version=0.1
      * when encoded as JSON.
      */
    var mediaType: String
    
    /**
      * When a signer is identified by a X.509 certificate, a verifier MUST
      * verify that the signature was computed at the time the certificate
      * was valid as described in the Sigstore client spec: "Verification
      * using a Bundle".
      * <https://docs.google.com/document/d/1kbhK2qyPPk8SLavHzYSDM8-Ueul9_oxIMVFuWMWKz0E/edit#heading=h.x8bduppe89ln>
      */
    var verificationMaterial: js.UndefOr[VerificationMaterial] = js.undefined
  }
  object Bundle {
    
    inline def apply(mediaType: String): Bundle = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bundle]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_bundle", "Bundle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Bundle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Bundle]
    
    inline def toJSON(message: Bundle): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
      
      inline def setContent(value: MessageSignature | DsseEnvelope): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setVerificationMaterial(value: VerificationMaterial): Self = StObject.set(x, "verificationMaterial", value.asInstanceOf[js.Any])
      
      inline def setVerificationMaterialUndefined: Self = StObject.set(x, "verificationMaterial", js.undefined)
    }
  }
  
  trait TimestampVerificationData extends StObject {
    
    /**
      * A list of RFC3161 signed timestamps provided by the user.
      * This can be used when the entry has not been stored on a
      * transparency log, or in conjunction for a stronger trust model.
      * Clients MUST verify the hashed message in the message imprint
      * against the signature in the bundle.
      */
    var rfc3161Timestamps: js.Array[RFC3161SignedTimestamp]
  }
  object TimestampVerificationData {
    
    inline def apply(rfc3161Timestamps: js.Array[RFC3161SignedTimestamp]): TimestampVerificationData = {
      val __obj = js.Dynamic.literal(rfc3161Timestamps = rfc3161Timestamps.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimestampVerificationData]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_bundle", "TimestampVerificationData")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): TimestampVerificationData = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[TimestampVerificationData]
    
    inline def toJSON(message: TimestampVerificationData): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimestampVerificationData] (val x: Self) extends AnyVal {
      
      inline def setRfc3161Timestamps(value: js.Array[RFC3161SignedTimestamp]): Self = StObject.set(x, "rfc3161Timestamps", value.asInstanceOf[js.Any])
      
      inline def setRfc3161TimestampsVarargs(value: RFC3161SignedTimestamp*): Self = StObject.set(x, "rfc3161Timestamps", js.Array(value*))
    }
  }
  
  trait VerificationMaterial extends StObject {
    
    var content: js.UndefOr[Case | X509CertificateChain] = js.undefined
    
    /** Timestamp verification data, over the artifact's signature. */
    var timestampVerificationData: js.UndefOr[TimestampVerificationData] = js.undefined
    
    /**
      * This is the inclusion promise and/or proof, where
      * the timestamp is coming from the transparency log.
      */
    var tlogEntries: js.Array[TransparencyLogEntry]
  }
  object VerificationMaterial {
    
    inline def apply(tlogEntries: js.Array[TransparencyLogEntry]): VerificationMaterial = {
      val __obj = js.Dynamic.literal(tlogEntries = tlogEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationMaterial]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_bundle", "VerificationMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): VerificationMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[VerificationMaterial]
    
    inline def toJSON(message: VerificationMaterial): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerificationMaterial] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Case | X509CertificateChain): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTimestampVerificationData(value: TimestampVerificationData): Self = StObject.set(x, "timestampVerificationData", value.asInstanceOf[js.Any])
      
      inline def setTimestampVerificationDataUndefined: Self = StObject.set(x, "timestampVerificationData", js.undefined)
      
      inline def setTlogEntries(value: js.Array[TransparencyLogEntry]): Self = StObject.set(x, "tlogEntries", value.asInstanceOf[js.Any])
      
      inline def setTlogEntriesVarargs(value: TransparencyLogEntry*): Self = StObject.set(x, "tlogEntries", js.Array(value*))
    }
  }
}
