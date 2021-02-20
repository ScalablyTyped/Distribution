package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.addressMod.Address
import typings.recurlyRecurlyJs.elementsMod.ElementsInstance
import typings.recurlyRecurlyJs.errorMod.RecurlyError
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  type CustomerData = Address
  
  type ElementsToken = js.Function3[
    /* elements */ ElementsInstance, 
    /* second */ HTMLFormElement | CustomerData, 
    /* third */ TokenHandler, 
    Unit
  ]
  
  type HostedFieldToken = js.Function2[/* form */ HTMLFormElement | CustomerData, /* second */ TokenHandler, Unit]
  
  type Token = HostedFieldToken with ElementsToken
  
  type TokenHandler = js.Function2[/* error */ RecurlyError | Null, /* token */ TokenPayload, Unit]
  
  @js.native
  trait TokenPayload extends StObject {
    
    var id: String = js.native
    
    var `type`: String = js.native
  }
  object TokenPayload {
    
    @scala.inline
    def apply(id: String, `type`: String): TokenPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPayload]
    }
    
    @scala.inline
    implicit class TokenPayloadMutableBuilder[Self <: TokenPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
