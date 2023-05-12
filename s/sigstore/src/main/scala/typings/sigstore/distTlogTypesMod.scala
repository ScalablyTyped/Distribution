package typings.sigstore

import typings.sigstore.`distTlogTypes@GeneratedHashedrekordMod`.HashedRekorV001Schema
import typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV001Schema
import typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV002Schema
import typings.sigstore.sigstoreStrings.`0Dot0Dot1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTlogTypesMod {
  
  @JSImport("sigstore/dist/tlog/types", "HASHEDREKORD_KIND")
  @js.native
  val HASHEDREKORD_KIND: /* "hashedrekord" */ String = js.native
  
  @JSImport("sigstore/dist/tlog/types", "INTOTO_KIND")
  @js.native
  val INTOTO_KIND: /* "intoto" */ String = js.native
  
  trait Entry extends StObject {
    
    var attestation: js.UndefOr[js.Object] = js.undefined
    
    var body: String
    
    var integratedTime: Double
    
    var logID: String
    
    var logIndex: Double
    
    var uuid: String
    
    var verification: EntryVerification
  }
  object Entry {
    
    inline def apply(
      body: String,
      integratedTime: Double,
      logID: String,
      logIndex: Double,
      uuid: String,
      verification: EntryVerification
    ): Entry = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], integratedTime = integratedTime.asInstanceOf[js.Any], logID = logID.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setAttestation(value: js.Object): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
      
      inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setIntegratedTime(value: Double): Self = StObject.set(x, "integratedTime", value.asInstanceOf[js.Any])
      
      inline def setLogID(value: String): Self = StObject.set(x, "logID", value.asInstanceOf[js.Any])
      
      inline def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVerification(value: EntryVerification): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sigstore.distTlogTypesMod.HashedRekordKind
    - typings.sigstore.distTlogTypesMod.IntotoKind
  */
  trait EntryKind extends StObject
  object EntryKind {
    
    inline def ApiVersion(kind: /* "intoto" */ String, spec: IntotoV001Schema): typings.sigstore.anon.ApiVersion = {
      val __obj = js.Dynamic.literal(apiVersion = "0.0.1", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.anon.ApiVersion]
    }
    
    inline def HashedRekordKind(kind: /* "hashedrekord" */ String, spec: HashedRekorV001Schema): typings.sigstore.distTlogTypesMod.HashedRekordKind = {
      val __obj = js.Dynamic.literal(apiVersion = "0.0.1", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.distTlogTypesMod.HashedRekordKind]
    }
    
    inline def Kind(kind: /* "intoto" */ String, spec: IntotoV002Schema): typings.sigstore.anon.Kind = {
      val __obj = js.Dynamic.literal(apiVersion = "0.0.2", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.anon.Kind]
    }
  }
  
  trait EntryVerification extends StObject {
    
    var inclusionProof: InclusionProof
    
    var signedEntryTimestamp: String
  }
  object EntryVerification {
    
    inline def apply(inclusionProof: InclusionProof, signedEntryTimestamp: String): EntryVerification = {
      val __obj = js.Dynamic.literal(inclusionProof = inclusionProof.asInstanceOf[js.Any], signedEntryTimestamp = signedEntryTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryVerification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryVerification] (val x: Self) extends AnyVal {
      
      inline def setInclusionProof(value: InclusionProof): Self = StObject.set(x, "inclusionProof", value.asInstanceOf[js.Any])
      
      inline def setSignedEntryTimestamp(value: String): Self = StObject.set(x, "signedEntryTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashedRekordKind
    extends StObject
       with EntryKind {
    
    var apiVersion: `0Dot0Dot1`
    
    var kind: /* "hashedrekord" */ String
    
    var spec: HashedRekorV001Schema
  }
  object HashedRekordKind {
    
    inline def apply(kind: /* "hashedrekord" */ String, spec: HashedRekorV001Schema): HashedRekordKind = {
      val __obj = js.Dynamic.literal(apiVersion = "0.0.1", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashedRekordKind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashedRekordKind] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: `0Dot0Dot1`): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: /* "hashedrekord" */ String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: HashedRekorV001Schema): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  trait InclusionProof extends StObject {
    
    var hashes: js.Array[String]
    
    var logIndex: Double
    
    var rootHash: String
    
    var treeSize: Double
  }
  object InclusionProof {
    
    inline def apply(hashes: js.Array[String], logIndex: Double, rootHash: String, treeSize: Double): InclusionProof = {
      val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any], treeSize = treeSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[InclusionProof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InclusionProof] (val x: Self) extends AnyVal {
      
      inline def setHashes(value: js.Array[String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
      
      inline def setHashesVarargs(value: String*): Self = StObject.set(x, "hashes", js.Array(value*))
      
      inline def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      inline def setRootHash(value: String): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
      
      inline def setTreeSize(value: Double): Self = StObject.set(x, "treeSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sigstore.anon.ApiVersion
    - typings.sigstore.anon.Kind
  */
  trait IntotoKind
    extends StObject
       with EntryKind
  object IntotoKind {
    
    inline def ApiVersion(kind: /* "intoto" */ String, spec: IntotoV001Schema): typings.sigstore.anon.ApiVersion = {
      val __obj = js.Dynamic.literal(apiVersion = "0.0.1", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.anon.ApiVersion]
    }
    
    inline def Kind(kind: /* "intoto" */ String, spec: IntotoV002Schema): typings.sigstore.anon.Kind = {
      val __obj = js.Dynamic.literal(apiVersion = "0.0.2", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.anon.Kind]
    }
  }
}
