package typings.sentryHub

import org.scalablytyped.runtime.StringDictionary
import typings.sentryHub.anon.Extensions
import typings.sentryHub.scopeMod.Scope
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  trait Carrier extends StObject {
    
    var __SENTRY__ : js.UndefOr[Extensions] = js.undefined
  }
  object Carrier {
    
    inline def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    extension [Self <: Carrier](x: Self) {
      
      inline def set__SENTRY__(value: Extensions): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
      
      inline def set__SENTRY__Undefined: Self = StObject.set(x, "__SENTRY__", js.undefined)
    }
  }
  
  trait DomainAsCarrier
    extends StObject
       with Carrier {
    
    var members: js.Array[StringDictionary[js.Any]]
  }
  object DomainAsCarrier {
    
    inline def apply(members: js.Array[StringDictionary[js.Any]]): DomainAsCarrier = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainAsCarrier]
    }
    
    extension [Self <: DomainAsCarrier](x: Self) {
      
      inline def setMembers(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "members", js.Array(value :_*))
    }
  }
  
  trait Layer extends StObject {
    
    var client: js.UndefOr[Client[Options]] = js.undefined
    
    var scope: js.UndefOr[Scope] = js.undefined
  }
  object Layer {
    
    inline def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setClient(value: Client[Options]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
