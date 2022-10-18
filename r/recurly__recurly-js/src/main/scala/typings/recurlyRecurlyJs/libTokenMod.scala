package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.libAddressMod.Address
import typings.recurlyRecurlyJs.libElementsMod.ElementsInstance
import typings.recurlyRecurlyJs.libErrorMod.RecurlyError
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokenMod {
  
  type CustomerData = Address
  
  type ElementsToken = js.Function3[
    /* elements */ ElementsInstance, 
    /* second */ HTMLFormElement | CustomerData, 
    /* third */ TokenHandler, 
    Unit
  ]
  
  type HostedFieldToken = js.Function2[/* form */ HTMLFormElement | CustomerData, /* second */ TokenHandler, Unit]
  
  @js.native
  trait Token
    extends HostedFieldToken
       with ElementsToken {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* form */ HTMLFormElement | CustomerData, arg2: /* second */ TokenHandler): Unit = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* elements */ ElementsInstance,
      arg2: /* second */ HTMLFormElement | CustomerData,
      arg3: /* third */ TokenHandler
    ): Unit = js.native
  }
  
  type TokenHandler = js.Function2[/* error */ RecurlyError | Null, /* token */ TokenPayload, Unit]
  
  trait TokenPayload extends StObject {
    
    var id: String
    
    var `type`: String
  }
  object TokenPayload {
    
    inline def apply(id: String, `type`: String): TokenPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPayload]
    }
    
    extension [Self <: TokenPayload](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
