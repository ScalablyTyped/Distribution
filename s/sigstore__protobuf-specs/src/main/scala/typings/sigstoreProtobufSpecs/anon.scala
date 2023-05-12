package typings.sigstoreProtobufSpecs

import typings.node.bufferMod.global.Buffer
import typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyIdentifier
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.PublicKeyIdentities
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.artifact
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.artifactUri
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.certificateIdentities
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.dsseEnvelope
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.messageSignature
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.publicKey
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.publicKeys
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.regexp
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.value
import typings.sigstoreProtobufSpecs.sigstoreProtobufSpecsStrings.x509CertificateChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Artifact extends StObject {
    
    @JSName("$case")
    var $case: artifact
    
    var artifact: Buffer
  }
  object Artifact {
    
    inline def apply(artifact: Buffer): Artifact = {
      val __obj = js.Dynamic.literal($case = "artifact", artifact = artifact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artifact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
      
      inline def set$case(value: artifact): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setArtifact(value: Buffer): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArtifactUri extends StObject {
    
    @JSName("$case")
    var $case: artifactUri
    
    var artifactUri: String
  }
  object ArtifactUri {
    
    inline def apply(artifactUri: String): ArtifactUri = {
      val __obj = js.Dynamic.literal($case = "artifactUri", artifactUri = artifactUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactUri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArtifactUri] (val x: Self) extends AnyVal {
      
      inline def set$case(value: artifactUri): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Case extends StObject {
    
    @JSName("$case")
    var $case: publicKey
    
    var publicKey: PublicKeyIdentifier
  }
  object Case {
    
    inline def apply(publicKey: PublicKeyIdentifier): Case = {
      val __obj = js.Dynamic.literal($case = "publicKey", publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Case]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Case] (val x: Self) extends AnyVal {
      
      inline def set$case(value: publicKey): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: PublicKeyIdentifier): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateIdentities extends StObject {
    
    @JSName("$case")
    var $case: certificateIdentities
    
    var certificateIdentities: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.CertificateIdentities
  }
  object CertificateIdentities {
    
    inline def apply(
      certificateIdentities: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.CertificateIdentities
    ): CertificateIdentities = {
      val __obj = js.Dynamic.literal($case = "certificateIdentities", certificateIdentities = certificateIdentities.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateIdentities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificateIdentities] (val x: Self) extends AnyVal {
      
      inline def set$case(value: certificateIdentities): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setCertificateIdentities(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.CertificateIdentities): Self = StObject.set(x, "certificateIdentities", value.asInstanceOf[js.Any])
    }
  }
  
  trait DsseEnvelope extends StObject {
    
    @JSName("$case")
    var $case: dsseEnvelope
    
    var dsseEnvelope: Envelope
  }
  object DsseEnvelope {
    
    inline def apply(dsseEnvelope: Envelope): DsseEnvelope = {
      val __obj = js.Dynamic.literal($case = "dsseEnvelope", dsseEnvelope = dsseEnvelope.asInstanceOf[js.Any])
      __obj.asInstanceOf[DsseEnvelope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DsseEnvelope] (val x: Self) extends AnyVal {
      
      inline def set$case(value: dsseEnvelope): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setDsseEnvelope(value: Envelope): Self = StObject.set(x, "dsseEnvelope", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageSignature extends StObject {
    
    @JSName("$case")
    var $case: messageSignature
    
    var messageSignature: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.MessageSignature
  }
  object MessageSignature {
    
    inline def apply(messageSignature: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.MessageSignature): MessageSignature = {
      val __obj = js.Dynamic.literal($case = "messageSignature", messageSignature = messageSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageSignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageSignature] (val x: Self) extends AnyVal {
      
      inline def set$case(value: messageSignature): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setMessageSignature(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.MessageSignature): Self = StObject.set(x, "messageSignature", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublicKeys extends StObject {
    
    @JSName("$case")
    var $case: publicKeys
    
    var publicKeys: PublicKeyIdentities
  }
  object PublicKeys {
    
    inline def apply(publicKeys: PublicKeyIdentities): PublicKeys = {
      val __obj = js.Dynamic.literal($case = "publicKeys", publicKeys = publicKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKeys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicKeys] (val x: Self) extends AnyVal {
      
      inline def set$case(value: publicKeys): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setPublicKeys(value: PublicKeyIdentities): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait Regexp extends StObject {
    
    @JSName("$case")
    var $case: regexp
    
    var regexp: String
  }
  object Regexp {
    
    inline def apply(regexp: String): Regexp = {
      val __obj = js.Dynamic.literal($case = "regexp", regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regexp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Regexp] (val x: Self) extends AnyVal {
      
      inline def set$case(value: regexp): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    @JSName("$case")
    var $case: value
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal($case = "value", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def set$case(value: value): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait X509CertificateChain extends StObject {
    
    @JSName("$case")
    var $case: x509CertificateChain
    
    var x509CertificateChain: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.X509CertificateChain
  }
  object X509CertificateChain {
    
    inline def apply(
      x509CertificateChain: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.X509CertificateChain
    ): X509CertificateChain = {
      val __obj = js.Dynamic.literal($case = "x509CertificateChain", x509CertificateChain = x509CertificateChain.asInstanceOf[js.Any])
      __obj.asInstanceOf[X509CertificateChain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X509CertificateChain] (val x: Self) extends AnyVal {
      
      inline def set$case(value: x509CertificateChain): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
      
      inline def setX509CertificateChain(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.X509CertificateChain): Self = StObject.set(x, "x509CertificateChain", value.asInstanceOf[js.Any])
    }
  }
}
