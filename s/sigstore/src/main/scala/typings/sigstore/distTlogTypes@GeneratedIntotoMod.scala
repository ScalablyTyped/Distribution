package typings.sigstore

import typings.sigstore.anon.Envelope
import typings.sigstore.anon.PayloadHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTlogTypes@GeneratedIntotoMod` {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV001Schema
    - typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV002Schema
  */
  trait IntotoSchema extends StObject
  object IntotoSchema {
    
    inline def IntotoV001Schema(content: Envelope, publicKey: String): typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV001Schema = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV001Schema]
    }
    
    inline def IntotoV002Schema(content: PayloadHash): typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV002Schema = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV002Schema]
    }
  }
  
  trait IntotoV001Schema
    extends StObject
       with IntotoSchema {
    
    var content: Envelope
    
    /**
      * The public key that can verify the signature
      */
    var publicKey: String
  }
  object IntotoV001Schema {
    
    inline def apply(content: Envelope, publicKey: String): IntotoV001Schema = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntotoV001Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntotoV001Schema] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Envelope): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntotoV002Schema
    extends StObject
       with IntotoSchema {
    
    var content: PayloadHash
  }
  object IntotoV002Schema {
    
    inline def apply(content: PayloadHash): IntotoV002Schema = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntotoV002Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntotoV002Schema] (val x: Self) extends AnyVal {
      
      inline def setContent(value: PayloadHash): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
