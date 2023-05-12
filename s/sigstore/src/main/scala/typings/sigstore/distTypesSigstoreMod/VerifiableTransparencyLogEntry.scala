package typings.sigstore.distTypesSigstoreMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sigstore.sigstore/dist/types/utility.WithRequired<@sigstore/protobuf-specs.@sigstore/protobuf-specs.TransparencyLogEntry, 'logId' | 'inclusionPromise' | 'kindVersion'> */
trait VerifiableTransparencyLogEntry extends StObject {
  
  /**
    * The canonicalized transparency log entry, used to reconstruct
    * the Signed Entry Timestamp (SET) during verification.
    * The contents of this field are the same as the `body` field in
    * a Rekor response, meaning that it does **not** include the "full"
    * canonicalized form (of log index, ID, etc.) which are
    * exposed as separate fields. The verifier is responsible for
    * combining the `canonicalized_body`, `log_index`, `log_id`,
    * and `integrated_time` into the payload that the SET's signature
    * is generated over.
    *
    * Clients MUST verify that the signatured referenced in the
    * `canonicalized_body` matches the signature provided in the
    * `Bundle.content`.
    */
  var canonicalizedBody: Buffer
  
  /** The inclusion promise/signed entry timestamp from the log. */
  var inclusionPromise: js.UndefOr[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.InclusionPromise] = js.undefined
  
  /**
    * The inclusion proof can be used for online verification that the
    * entry was appended to the log, and that the log has not been
    * altered.
    */
  var inclusionProof: js.UndefOr[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.InclusionProof] = js.undefined
  
  /** The UNIX timestamp from the log when the entry was persisted. */
  var integratedTime: String
  
  /**
    * The kind (type) and version of the object associated with this
    * entry. These values are required to construct the entry during
    * verification.
    */
  var kindVersion: js.UndefOr[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.KindVersion] = js.undefined
  
  /** The unique identifier of the log. */
  var logId: js.UndefOr[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.LogId] = js.undefined
  
  /** The index of the entry in the log. */
  var logIndex: String
}
object VerifiableTransparencyLogEntry {
  
  inline def apply(canonicalizedBody: Buffer, integratedTime: String, logIndex: String): VerifiableTransparencyLogEntry = {
    val __obj = js.Dynamic.literal(canonicalizedBody = canonicalizedBody.asInstanceOf[js.Any], integratedTime = integratedTime.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifiableTransparencyLogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiableTransparencyLogEntry] (val x: Self) extends AnyVal {
    
    inline def setCanonicalizedBody(value: Buffer): Self = StObject.set(x, "canonicalizedBody", value.asInstanceOf[js.Any])
    
    inline def setInclusionPromise(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.InclusionPromise): Self = StObject.set(x, "inclusionPromise", value.asInstanceOf[js.Any])
    
    inline def setInclusionPromiseUndefined: Self = StObject.set(x, "inclusionPromise", js.undefined)
    
    inline def setInclusionProof(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.InclusionProof): Self = StObject.set(x, "inclusionProof", value.asInstanceOf[js.Any])
    
    inline def setInclusionProofUndefined: Self = StObject.set(x, "inclusionProof", js.undefined)
    
    inline def setIntegratedTime(value: String): Self = StObject.set(x, "integratedTime", value.asInstanceOf[js.Any])
    
    inline def setKindVersion(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.KindVersion): Self = StObject.set(x, "kindVersion", value.asInstanceOf[js.Any])
    
    inline def setKindVersionUndefined: Self = StObject.set(x, "kindVersion", js.undefined)
    
    inline def setLogId(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.LogId): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
    
    inline def setLogIdUndefined: Self = StObject.set(x, "logId", js.undefined)
    
    inline def setLogIndex(value: String): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
  }
}
