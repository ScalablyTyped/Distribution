package typings.sigstore

import typings.sigstore.anon.Hash
import typings.sigstore.anon.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTlogTypes@GeneratedHashedrekordMod` {
  
  trait HashedRekorV001Schema extends StObject {
    
    /**
      * Information about the content associated with the entry
      */
    var data: Hash
    
    /**
      * Information about the detached signature associated with the entry
      */
    var signature: PublicKey
  }
  object HashedRekorV001Schema {
    
    inline def apply(data: Hash, signature: PublicKey): HashedRekorV001Schema = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashedRekorV001Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashedRekorV001Schema] (val x: Self) extends AnyVal {
      
      inline def setData(value: Hash): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: PublicKey): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  type RekorSchema = HashedRekorV001Schema
}
