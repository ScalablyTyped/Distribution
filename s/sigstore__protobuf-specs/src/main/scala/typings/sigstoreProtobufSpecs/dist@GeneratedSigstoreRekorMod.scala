package typings.sigstoreProtobufSpecs

import typings.node.bufferMod.global.Buffer
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.LogId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@GeneratedSigstoreRekorMod` {
  
  trait Checkpoint extends StObject {
    
    var envelope: String
  }
  object Checkpoint {
    
    inline def apply(envelope: String): Checkpoint = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Checkpoint]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_rekor", "Checkpoint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Checkpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Checkpoint]
    
    inline def toJSON(message: Checkpoint): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Checkpoint] (val x: Self) extends AnyVal {
      
      inline def setEnvelope(value: String): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    }
  }
  
  trait InclusionPromise extends StObject {
    
    var signedEntryTimestamp: Buffer
  }
  object InclusionPromise {
    
    inline def apply(signedEntryTimestamp: Buffer): InclusionPromise = {
      val __obj = js.Dynamic.literal(signedEntryTimestamp = signedEntryTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[InclusionPromise]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_rekor", "InclusionPromise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): InclusionPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[InclusionPromise]
    
    inline def toJSON(message: InclusionPromise): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InclusionPromise] (val x: Self) extends AnyVal {
      
      inline def setSignedEntryTimestamp(value: Buffer): Self = StObject.set(x, "signedEntryTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait InclusionProof extends StObject {
    
    /**
      * Signature of the tree head, as of the time of this proof was
      * generated. See above info on 'Checkpoint' for more details.
      */
    var checkpoint: js.UndefOr[Checkpoint] = js.undefined
    
    /**
      * A list of hashes required to compute the inclusion proof, sorted
      * in order from leaf to root.
      * Not that leaf and root hashes are not included.
      * The root has is available separately in this message, and the
      * leaf hash should be calculated by the client.
      */
    var hashes: js.Array[Buffer]
    
    /** The index of the entry in the log. */
    var logIndex: String
    
    /**
      * The hash digest stored at the root of the merkle tree at the time
      * the proof was generated.
      */
    var rootHash: Buffer
    
    /** The size of the merkle tree at the time the proof was generated. */
    var treeSize: String
  }
  object InclusionProof {
    
    inline def apply(hashes: js.Array[Buffer], logIndex: String, rootHash: Buffer, treeSize: String): InclusionProof = {
      val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any], treeSize = treeSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[InclusionProof]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_rekor", "InclusionProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): InclusionProof = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[InclusionProof]
    
    inline def toJSON(message: InclusionProof): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InclusionProof] (val x: Self) extends AnyVal {
      
      inline def setCheckpoint(value: Checkpoint): Self = StObject.set(x, "checkpoint", value.asInstanceOf[js.Any])
      
      inline def setCheckpointUndefined: Self = StObject.set(x, "checkpoint", js.undefined)
      
      inline def setHashes(value: js.Array[Buffer]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
      
      inline def setHashesVarargs(value: Buffer*): Self = StObject.set(x, "hashes", js.Array(value*))
      
      inline def setLogIndex(value: String): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      inline def setRootHash(value: Buffer): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
      
      inline def setTreeSize(value: String): Self = StObject.set(x, "treeSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait KindVersion extends StObject {
    
    /**
      * Kind is the type of entry being stored in the log.
      * See here for a list: https://github.com/sigstore/rekor/tree/main/pkg/types
      */
    var kind: String
    
    /** The specific api version of the type. */
    var version: String
  }
  object KindVersion {
    
    inline def apply(kind: String, version: String): KindVersion = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[KindVersion]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_rekor", "KindVersion")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): KindVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[KindVersion]
    
    inline def toJSON(message: KindVersion): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KindVersion] (val x: Self) extends AnyVal {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransparencyLogEntry extends StObject {
    
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
    var inclusionPromise: js.UndefOr[InclusionPromise] = js.undefined
    
    /**
      * The inclusion proof can be used for online verification that the
      * entry was appended to the log, and that the log has not been
      * altered.
      */
    var inclusionProof: js.UndefOr[InclusionProof] = js.undefined
    
    /** The UNIX timestamp from the log when the entry was persisted. */
    var integratedTime: String
    
    /**
      * The kind (type) and version of the object associated with this
      * entry. These values are required to construct the entry during
      * verification.
      */
    var kindVersion: js.UndefOr[KindVersion] = js.undefined
    
    /** The unique identifier of the log. */
    var logId: js.UndefOr[LogId] = js.undefined
    
    /** The index of the entry in the log. */
    var logIndex: String
  }
  object TransparencyLogEntry {
    
    inline def apply(canonicalizedBody: Buffer, integratedTime: String, logIndex: String): TransparencyLogEntry = {
      val __obj = js.Dynamic.literal(canonicalizedBody = canonicalizedBody.asInstanceOf[js.Any], integratedTime = integratedTime.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransparencyLogEntry]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_rekor", "TransparencyLogEntry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): TransparencyLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[TransparencyLogEntry]
    
    inline def toJSON(message: TransparencyLogEntry): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransparencyLogEntry] (val x: Self) extends AnyVal {
      
      inline def setCanonicalizedBody(value: Buffer): Self = StObject.set(x, "canonicalizedBody", value.asInstanceOf[js.Any])
      
      inline def setInclusionPromise(value: InclusionPromise): Self = StObject.set(x, "inclusionPromise", value.asInstanceOf[js.Any])
      
      inline def setInclusionPromiseUndefined: Self = StObject.set(x, "inclusionPromise", js.undefined)
      
      inline def setInclusionProof(value: InclusionProof): Self = StObject.set(x, "inclusionProof", value.asInstanceOf[js.Any])
      
      inline def setInclusionProofUndefined: Self = StObject.set(x, "inclusionProof", js.undefined)
      
      inline def setIntegratedTime(value: String): Self = StObject.set(x, "integratedTime", value.asInstanceOf[js.Any])
      
      inline def setKindVersion(value: KindVersion): Self = StObject.set(x, "kindVersion", value.asInstanceOf[js.Any])
      
      inline def setKindVersionUndefined: Self = StObject.set(x, "kindVersion", js.undefined)
      
      inline def setLogId(value: LogId): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
      
      inline def setLogIdUndefined: Self = StObject.set(x, "logId", js.undefined)
      
      inline def setLogIndex(value: String): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
    }
  }
}
