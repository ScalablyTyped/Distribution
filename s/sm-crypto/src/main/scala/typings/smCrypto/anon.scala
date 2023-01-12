package typings.smCrypto

import typings.smCrypto.mod.KeyPairPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Der extends StObject {
    
    var der: js.UndefOr[Boolean] = js.undefined
    
    var hash: js.UndefOr[Boolean] = js.undefined
    
    var pointPool: js.UndefOr[js.Array[KeyPairPoint]] = js.undefined
    
    var publicKey: js.UndefOr[String] = js.undefined
  }
  object Der {
    
    inline def apply(): Der = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Der]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Der] (val x: Self) extends AnyVal {
      
      inline def setDer(value: Boolean): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setDerUndefined: Self = StObject.set(x, "der", js.undefined)
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPointPool(value: js.Array[KeyPairPoint]): Self = StObject.set(x, "pointPool", value.asInstanceOf[js.Any])
      
      inline def setPointPoolUndefined: Self = StObject.set(x, "pointPool", js.undefined)
      
      inline def setPointPoolVarargs(value: KeyPairPoint*): Self = StObject.set(x, "pointPool", js.Array(value*))
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
  
  trait Hash extends StObject {
    
    var der: js.UndefOr[Boolean] = js.undefined
    
    var hash: js.UndefOr[Boolean] = js.undefined
    
    var publicKey: js.UndefOr[String] = js.undefined
  }
  object Hash {
    
    inline def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      inline def setDer(value: Boolean): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setDerUndefined: Self = StObject.set(x, "der", js.undefined)
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
}
