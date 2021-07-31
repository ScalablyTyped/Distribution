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
    
    @scala.inline
    def apply(): Der = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Der]
    }
    
    @scala.inline
    implicit class DerMutableBuilder[Self <: Der] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDer(value: Boolean): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerUndefined: Self = StObject.set(x, "der", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setPointPool(value: js.Array[KeyPairPoint]): Self = StObject.set(x, "pointPool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointPoolUndefined: Self = StObject.set(x, "pointPool", js.undefined)
      
      @scala.inline
      def setPointPoolVarargs(value: KeyPairPoint*): Self = StObject.set(x, "pointPool", js.Array(value :_*))
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
  
  trait Hash extends StObject {
    
    var der: js.UndefOr[Boolean] = js.undefined
    
    var hash: js.UndefOr[Boolean] = js.undefined
    
    var publicKey: js.UndefOr[String] = js.undefined
  }
  object Hash {
    
    @scala.inline
    def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDer(value: Boolean): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerUndefined: Self = StObject.set(x, "der", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
}
