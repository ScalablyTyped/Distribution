package typings.sigstore

import typings.sigstore.anon.VerificationMaterialconteContent
import typings.sigstore.anon.`1`
import typings.sigstore.anon.`2`
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import typings.sigstoreProtobufSpecs.anon.DsseEnvelope
import typings.sigstoreProtobufSpecs.anon.MessageSignature
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSigstoreValidateMod {
  
  @JSImport("sigstore/dist/types/sigstore/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertValidBundle(b: Bundle): /* asserts b is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(sigstore), TsIdentModule(None,List(sigstore, dist, types, sigstore, validate)), TsIdentSimple(ValidBundle))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertValidBundle")(b.asInstanceOf[js.Any]).asInstanceOf[/* asserts b is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(sigstore), TsIdentModule(None,List(sigstore, dist, types, sigstore, validate)), TsIdentSimple(ValidBundle))),IArray())*/ Boolean]
  
  trait ValidBundle
    extends StObject
       with Bundle {
    
    @JSName("content")
    var content_ValidBundle: ((Extract[js.UndefOr[MessageSignature | DsseEnvelope], `1`]) & typings.sigstore.anon.MessageSignature) | (Extract[js.UndefOr[MessageSignature | DsseEnvelope], `2`])
    
    @JSName("verificationMaterial")
    var verificationMaterial_ValidBundle: VerificationMaterialconteContent
  }
  object ValidBundle {
    
    inline def apply(mediaType: String, verificationMaterial: VerificationMaterialconteContent): ValidBundle = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], verificationMaterial = verificationMaterial.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidBundle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidBundle] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: ((Extract[js.UndefOr[MessageSignature | DsseEnvelope], `1`]) & typings.sigstore.anon.MessageSignature) | (Extract[js.UndefOr[MessageSignature | DsseEnvelope], `2`])
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setVerificationMaterial(value: VerificationMaterialconteContent): Self = StObject.set(x, "verificationMaterial", value.asInstanceOf[js.Any])
    }
  }
}
