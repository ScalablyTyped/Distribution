package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkpoint extends StObject {
  
  var checkpoint: EnvelopeString
  
  var hashes: js.Array[String]
  
  var logIndex: String
  
  var rootHash: String
  
  var treeSize: String
}
object Checkpoint {
  
  inline def apply(
    checkpoint: EnvelopeString,
    hashes: js.Array[String],
    logIndex: String,
    rootHash: String,
    treeSize: String
  ): Checkpoint = {
    val __obj = js.Dynamic.literal(checkpoint = checkpoint.asInstanceOf[js.Any], hashes = hashes.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any], treeSize = treeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkpoint] (val x: Self) extends AnyVal {
    
    inline def setCheckpoint(value: EnvelopeString): Self = StObject.set(x, "checkpoint", value.asInstanceOf[js.Any])
    
    inline def setHashes(value: js.Array[String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesVarargs(value: String*): Self = StObject.set(x, "hashes", js.Array(value*))
    
    inline def setLogIndex(value: String): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
    
    inline def setRootHash(value: String): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
    
    inline def setTreeSize(value: String): Self = StObject.set(x, "treeSize", value.asInstanceOf[js.Any])
  }
}
