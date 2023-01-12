package typings.sqlQueryIdentifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AcceptTokens extends StObject {
    
    var acceptTokens: js.Array[Type]
    
    var requireBefore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AcceptTokens {
    
    inline def apply(acceptTokens: js.Array[Type]): AcceptTokens = {
      val __obj = js.Dynamic.literal(acceptTokens = acceptTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptTokens]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcceptTokens] (val x: Self) extends AnyVal {
      
      inline def setAcceptTokens(value: js.Array[Type]): Self = StObject.set(x, "acceptTokens", value.asInstanceOf[js.Any])
      
      inline def setAcceptTokensVarargs(value: Type*): Self = StObject.set(x, "acceptTokens", js.Array(value*))
      
      inline def setRequireBefore(value: js.Array[String]): Self = StObject.set(x, "requireBefore", value.asInstanceOf[js.Any])
      
      inline def setRequireBeforeUndefined: Self = StObject.set(x, "requireBefore", js.undefined)
      
      inline def setRequireBeforeVarargs(value: String*): Self = StObject.set(x, "requireBefore", js.Array(value*))
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
    
    var value: String
  }
  object Type {
    
    inline def apply(`type`: String, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
