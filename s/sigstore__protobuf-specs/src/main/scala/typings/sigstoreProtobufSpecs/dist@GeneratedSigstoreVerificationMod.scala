package typings.sigstoreProtobufSpecs

import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.ObjectIdentifierValuePair
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKey
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeName
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TrustedRoot
import typings.sigstoreProtobufSpecs.anon.ArtifactUri
import typings.sigstoreProtobufSpecs.anon.PublicKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@GeneratedSigstoreVerificationMod` {
  
  trait Artifact extends StObject {
    
    var data: js.UndefOr[ArtifactUri | typings.sigstoreProtobufSpecs.anon.Artifact] = js.undefined
  }
  object Artifact {
    
    inline def apply(): Artifact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Artifact]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "Artifact")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Artifact = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Artifact]
    
    inline def toJSON(message: Artifact): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
      
      inline def setData(value: ArtifactUri | typings.sigstoreProtobufSpecs.anon.Artifact): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait ArtifactVerificationOptions extends StObject {
    
    /**
      * Optional options for certificate transparency log verification.
      * If none is provided, the default verification options are:
      * Threshold: 1
      * Detached SCT: false
      * Disable: false
      */
    var ctlogOptions: js.UndefOr[ArtifactVerificationOptionsCtlogOptions] = js.undefined
    
    var signers: js.UndefOr[typings.sigstoreProtobufSpecs.anon.CertificateIdentities | PublicKeys] = js.undefined
    
    /**
      * Optional options for artifact transparency log verification.
      * If none is provided, the default verification options are:
      * Threshold: 1
      * Online verification: false
      * Disable: false
      */
    var tlogOptions: js.UndefOr[ArtifactVerificationOptionsTlogOptions] = js.undefined
    
    /**
      * Optional options for certificate signed timestamp verification.
      * If none is provided, the default verification options are:
      * Threshold: 1
      * Disable: false
      */
    var tsaOptions: js.UndefOr[ArtifactVerificationOptionsTimestampAuthorityOptions] = js.undefined
  }
  object ArtifactVerificationOptions {
    
    inline def apply(): ArtifactVerificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArtifactVerificationOptions]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "ArtifactVerificationOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): ArtifactVerificationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ArtifactVerificationOptions]
    
    inline def toJSON(message: ArtifactVerificationOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArtifactVerificationOptions] (val x: Self) extends AnyVal {
      
      inline def setCtlogOptions(value: ArtifactVerificationOptionsCtlogOptions): Self = StObject.set(x, "ctlogOptions", value.asInstanceOf[js.Any])
      
      inline def setCtlogOptionsUndefined: Self = StObject.set(x, "ctlogOptions", js.undefined)
      
      inline def setSigners(value: typings.sigstoreProtobufSpecs.anon.CertificateIdentities | PublicKeys): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
      
      inline def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
      
      inline def setTlogOptions(value: ArtifactVerificationOptionsTlogOptions): Self = StObject.set(x, "tlogOptions", value.asInstanceOf[js.Any])
      
      inline def setTlogOptionsUndefined: Self = StObject.set(x, "tlogOptions", js.undefined)
      
      inline def setTsaOptions(value: ArtifactVerificationOptionsTimestampAuthorityOptions): Self = StObject.set(x, "tsaOptions", value.asInstanceOf[js.Any])
      
      inline def setTsaOptionsUndefined: Self = StObject.set(x, "tsaOptions", js.undefined)
    }
  }
  
  trait ArtifactVerificationOptionsCtlogOptions extends StObject {
    
    /**
      * Expect detached SCTs.
      * This is not supported right now as we can't capture an
      * detached SCT in the bundle.
      */
    var detachedSct: Boolean
    
    /** Disable ct transparency log verification */
    var disable: Boolean
    
    /**
      * The number of ct transparency logs the certificate must
      * appear on.
      */
    var threshold: Double
  }
  object ArtifactVerificationOptionsCtlogOptions {
    
    inline def apply(detachedSct: Boolean, disable: Boolean, threshold: Double): ArtifactVerificationOptionsCtlogOptions = {
      val __obj = js.Dynamic.literal(detachedSct = detachedSct.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactVerificationOptionsCtlogOptions]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "ArtifactVerificationOptions_CtlogOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): ArtifactVerificationOptionsCtlogOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ArtifactVerificationOptionsCtlogOptions]
    
    inline def toJSON(message: ArtifactVerificationOptionsCtlogOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArtifactVerificationOptionsCtlogOptions] (val x: Self) extends AnyVal {
      
      inline def setDetachedSct(value: Boolean): Self = StObject.set(x, "detachedSct", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArtifactVerificationOptionsTimestampAuthorityOptions extends StObject {
    
    /** Disable signed timestamp verification. */
    var disable: Boolean
    
    /** The number of signed timestamps that are expected. */
    var threshold: Double
  }
  object ArtifactVerificationOptionsTimestampAuthorityOptions {
    
    inline def apply(disable: Boolean, threshold: Double): ArtifactVerificationOptionsTimestampAuthorityOptions = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactVerificationOptionsTimestampAuthorityOptions]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "ArtifactVerificationOptions_TimestampAuthorityOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): ArtifactVerificationOptionsTimestampAuthorityOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ArtifactVerificationOptionsTimestampAuthorityOptions]
    
    inline def toJSON(message: ArtifactVerificationOptionsTimestampAuthorityOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArtifactVerificationOptionsTimestampAuthorityOptions] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArtifactVerificationOptionsTlogOptions extends StObject {
    
    /** Disable verification for transparency logs. */
    var disable: Boolean
    
    /** Perform an online inclusion proof. */
    var performOnlineVerification: Boolean
    
    /** Number of transparency logs the entry must appear on. */
    var threshold: Double
  }
  object ArtifactVerificationOptionsTlogOptions {
    
    inline def apply(disable: Boolean, performOnlineVerification: Boolean, threshold: Double): ArtifactVerificationOptionsTlogOptions = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], performOnlineVerification = performOnlineVerification.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactVerificationOptionsTlogOptions]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "ArtifactVerificationOptions_TlogOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): ArtifactVerificationOptionsTlogOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ArtifactVerificationOptionsTlogOptions]
    
    inline def toJSON(message: ArtifactVerificationOptionsTlogOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArtifactVerificationOptionsTlogOptions] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setPerformOnlineVerification(value: Boolean): Self = StObject.set(x, "performOnlineVerification", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateIdentities extends StObject {
    
    var identities: js.Array[CertificateIdentity]
  }
  object CertificateIdentities {
    
    inline def apply(identities: js.Array[CertificateIdentity]): CertificateIdentities = {
      val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateIdentities]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "CertificateIdentities")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): CertificateIdentities = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[CertificateIdentities]
    
    inline def toJSON(message: CertificateIdentities): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateIdentities] (val x: Self) extends AnyVal {
      
      inline def setIdentities(value: js.Array[CertificateIdentity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: CertificateIdentity*): Self = StObject.set(x, "identities", js.Array(value*))
    }
  }
  
  trait CertificateIdentity extends StObject {
    
    /** The X.509v3 issuer extension (OID 1.3.6.1.4.1.57264.1.1) */
    var issuer: String
    
    /**
      * An unordered list of OIDs that must be verified.
      * All OID/values provided in this list MUST exactly match against
      * the values in the certificate for verification to be successful.
      */
    var oids: js.Array[ObjectIdentifierValuePair]
    
    var san: js.UndefOr[SubjectAlternativeName] = js.undefined
  }
  object CertificateIdentity {
    
    inline def apply(issuer: String, oids: js.Array[ObjectIdentifierValuePair]): CertificateIdentity = {
      val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], oids = oids.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateIdentity]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "CertificateIdentity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): CertificateIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[CertificateIdentity]
    
    inline def toJSON(message: CertificateIdentity): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateIdentity] (val x: Self) extends AnyVal {
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setOids(value: js.Array[ObjectIdentifierValuePair]): Self = StObject.set(x, "oids", value.asInstanceOf[js.Any])
      
      inline def setOidsVarargs(value: ObjectIdentifierValuePair*): Self = StObject.set(x, "oids", js.Array(value*))
      
      inline def setSan(value: SubjectAlternativeName): Self = StObject.set(x, "san", value.asInstanceOf[js.Any])
      
      inline def setSanUndefined: Self = StObject.set(x, "san", js.undefined)
    }
  }
  
  trait Input extends StObject {
    
    /**
      * If the bundle contains a message signature, the artifact must be
      * provided.
      */
    var artifact: js.UndefOr[Artifact] = js.undefined
    
    /**
      * The verification materials provided during a bundle verification.
      * The running process is usually preloaded with a "global"
      * dev.sisgtore.trustroot.TrustedRoot.v1 instance. Prior to
      * verifying an artifact (i.e a bundle), and/or based on current
      * policy, some selection is expected to happen, to filter out the
      * exact certificate authority to use, which transparency logs are
      * relevant etc. The result should b ecaptured in the
      * `artifact_trust_root`.
      */
    var artifactTrustRoot: js.UndefOr[TrustedRoot] = js.undefined
    
    var artifactVerificationOptions: js.UndefOr[ArtifactVerificationOptions] = js.undefined
    
    var bundle: js.UndefOr[Bundle] = js.undefined
  }
  object Input {
    
    inline def apply(): Input = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "Input")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Input = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Input]
    
    inline def toJSON(message: Input): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      inline def setArtifact(value: Artifact): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
      
      inline def setArtifactTrustRoot(value: TrustedRoot): Self = StObject.set(x, "artifactTrustRoot", value.asInstanceOf[js.Any])
      
      inline def setArtifactTrustRootUndefined: Self = StObject.set(x, "artifactTrustRoot", js.undefined)
      
      inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
      
      inline def setArtifactVerificationOptions(value: ArtifactVerificationOptions): Self = StObject.set(x, "artifactVerificationOptions", value.asInstanceOf[js.Any])
      
      inline def setArtifactVerificationOptionsUndefined: Self = StObject.set(x, "artifactVerificationOptions", js.undefined)
      
      inline def setBundle(value: Bundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    }
  }
  
  trait PublicKeyIdentities extends StObject {
    
    var publicKeys: js.Array[PublicKey]
  }
  object PublicKeyIdentities {
    
    inline def apply(publicKeys: js.Array[PublicKey]): PublicKeyIdentities = {
      val __obj = js.Dynamic.literal(publicKeys = publicKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKeyIdentities]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_verification", "PublicKeyIdentities")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): PublicKeyIdentities = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[PublicKeyIdentities]
    
    inline def toJSON(message: PublicKeyIdentities): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicKeyIdentities] (val x: Self) extends AnyVal {
      
      inline def setPublicKeys(value: js.Array[PublicKey]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
      
      inline def setPublicKeysVarargs(value: PublicKey*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    }
  }
}
