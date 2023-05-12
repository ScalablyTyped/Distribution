package typings.sigstore.anon

import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.TransparencyLogEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @sigstore/protobuf-specs.@sigstore/protobuf-specs.VerificationMaterial & {  content :std.NonNullable<@sigstore/protobuf-specs.@sigstore/protobuf-specs.VerificationMaterial['content']>} */
trait VerificationMaterialconteContent extends StObject {
  
  var content: js.UndefOr[
    typings.sigstoreProtobufSpecs.anon.Case | typings.sigstoreProtobufSpecs.anon.X509CertificateChain
  ] = js.undefined
  
  /** Timestamp verification data, over the artifact's signature. */
  var timestampVerificationData: js.UndefOr[
    typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.TimestampVerificationData
  ] = js.undefined
  
  /**
    * This is the inclusion promise and/or proof, where
    * the timestamp is coming from the transparency log.
    */
  var tlogEntries: js.Array[TransparencyLogEntry]
}
object VerificationMaterialconteContent {
  
  inline def apply(tlogEntries: js.Array[TransparencyLogEntry]): VerificationMaterialconteContent = {
    val __obj = js.Dynamic.literal(tlogEntries = tlogEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationMaterialconteContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerificationMaterialconteContent] (val x: Self) extends AnyVal {
    
    inline def setContent(
      value: typings.sigstoreProtobufSpecs.anon.Case | typings.sigstoreProtobufSpecs.anon.X509CertificateChain
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTimestampVerificationData(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.TimestampVerificationData): Self = StObject.set(x, "timestampVerificationData", value.asInstanceOf[js.Any])
    
    inline def setTimestampVerificationDataUndefined: Self = StObject.set(x, "timestampVerificationData", js.undefined)
    
    inline def setTlogEntries(value: js.Array[TransparencyLogEntry]): Self = StObject.set(x, "tlogEntries", value.asInstanceOf[js.Any])
    
    inline def setTlogEntriesVarargs(value: TransparencyLogEntry*): Self = StObject.set(x, "tlogEntries", js.Array(value*))
  }
}
