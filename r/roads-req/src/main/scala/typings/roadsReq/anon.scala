package typings.roadsReq

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encoding extends StObject {
    
    var encoding: BufferEncoding
  }
  object Encoding {
    
    @scala.inline
    def apply(encoding: BufferEncoding): Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pw extends StObject {
    
    var pw: String
    
    var un: String
  }
  object Pw {
    
    @scala.inline
    def apply(pw: String, un: String): Pw = {
      val __obj = js.Dynamic.literal(pw = pw.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pw]
    }
    
    @scala.inline
    implicit class PwMutableBuilder[Self <: Pw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPw(value: String): Self = StObject.set(x, "pw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUn(value: String): Self = StObject.set(x, "un", value.asInstanceOf[js.Any])
    }
  }
}
