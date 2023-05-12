package typings.sigstore.distTypesSigstoreMod

import typings.sigstoreProtobufSpecs.anon.PublicKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sigstore.sigstore/dist/types/utility.WithRequired<@sigstore/protobuf-specs.@sigstore/protobuf-specs.ArtifactVerificationOptions, 'ctlogOptions' | 'tlogOptions'> */
trait RequiredArtifactVerificationOptions extends StObject {
  
  /**
    * Optional options for certificate transparency log verification.
    * If none is provided, the default verification options are:
    * Threshold: 1
    * Detached SCT: false
    * Disable: false
    */
  var ctlogOptions: js.UndefOr[
    typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsCtlogOptions
  ] = js.undefined
  
  var signers: js.UndefOr[typings.sigstoreProtobufSpecs.anon.CertificateIdentities | PublicKeys] = js.undefined
  
  /**
    * Optional options for artifact transparency log verification.
    * If none is provided, the default verification options are:
    * Threshold: 1
    * Online verification: false
    * Disable: false
    */
  var tlogOptions: js.UndefOr[
    typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsTlogOptions
  ] = js.undefined
  
  /**
    * Optional options for certificate signed timestamp verification.
    * If none is provided, the default verification options are:
    * Threshold: 1
    * Disable: false
    */
  var tsaOptions: js.UndefOr[
    typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsTimestampAuthorityOptions
  ] = js.undefined
}
object RequiredArtifactVerificationOptions {
  
  inline def apply(): RequiredArtifactVerificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredArtifactVerificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredArtifactVerificationOptions] (val x: Self) extends AnyVal {
    
    inline def setCtlogOptions(
      value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsCtlogOptions
    ): Self = StObject.set(x, "ctlogOptions", value.asInstanceOf[js.Any])
    
    inline def setCtlogOptionsUndefined: Self = StObject.set(x, "ctlogOptions", js.undefined)
    
    inline def setSigners(value: typings.sigstoreProtobufSpecs.anon.CertificateIdentities | PublicKeys): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
    
    inline def setTlogOptions(
      value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsTlogOptions
    ): Self = StObject.set(x, "tlogOptions", value.asInstanceOf[js.Any])
    
    inline def setTlogOptionsUndefined: Self = StObject.set(x, "tlogOptions", js.undefined)
    
    inline def setTsaOptions(
      value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsTimestampAuthorityOptions
    ): Self = StObject.set(x, "tsaOptions", value.asInstanceOf[js.Any])
    
    inline def setTsaOptionsUndefined: Self = StObject.set(x, "tsaOptions", js.undefined)
  }
}
