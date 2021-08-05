package typings.pulumiAws

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routingRulesMod {
  
  trait Condition extends StObject {
    
    /**
      * The HTTP error code that must match for the redirect to apply. If an error occurs, and if the error code meets
      * this value, then the specified redirect applies.
      *
      * `HttpErrorCodeReturnedEquals` is required if `KeyPrefixEquals` is not specified. If both `KeyPrefixEquals` and
      * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
      */
    var HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.undefined
    
    /**
      * The prefix of the object key name from which requests are redirected.
      *
      * `KeyPrefixEquals` is required if `HttpErrorCodeReturnedEquals` is not specified. If both `KeyPrefixEquals` and
      * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
      */
    var KeyPrefixEquals: js.UndefOr[String] = js.undefined
  }
  object Condition {
    
    inline def apply(): Condition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setHttpErrorCodeReturnedEquals(value: String): Self = StObject.set(x, "HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
      
      inline def setHttpErrorCodeReturnedEqualsUndefined: Self = StObject.set(x, "HttpErrorCodeReturnedEquals", js.undefined)
      
      inline def setKeyPrefixEquals(value: String): Self = StObject.set(x, "KeyPrefixEquals", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixEqualsUndefined: Self = StObject.set(x, "KeyPrefixEquals", js.undefined)
    }
  }
  
  trait Redirect extends StObject {
    
    /**
      * The hostname to be used in the Location header that is returned in the response.
      *
      * If another property is set, `HostName` is not required.
      */
    var HostName: js.UndefOr[String] = js.undefined
    
    /**
      * The HTTP redirect code to be used in the Location header that is returned in the response.
      *
      * If another property is set, `HttpRedirectCode` is not required.
      */
    var HttpRedirectCode: js.UndefOr[String] = js.undefined
    
    /**
      * The protocol, http or https, to be used in the Location header that is returned in the response.
      *
      * If another property is set, `Protocol` is not required.
      */
    var Protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The prefix of the object key name that replaces the value of `KeyPrefixEquals` in the redirect request.
      *
      * If another property is set, `ReplaceKeyPrefixWith` is not required.
      * It can be set only if `ReplaceKeyWith` is not set.
      */
    var ReplaceKeyPrefixWith: js.UndefOr[String] = js.undefined
    
    /**
      * The object key to be used in the Location header that is returned in the response.
      *
      * If another property is set, `ReplaceKeyWith` is not required.
      * It can be set only if `ReplaceKeyPrefixWith` is not set.
      */
    var ReplaceKeyWith: js.UndefOr[String] = js.undefined
  }
  object Redirect {
    
    inline def apply(): Redirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirect]
    }
    
    extension [Self <: Redirect](x: Self) {
      
      inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
      
      inline def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
      
      inline def setHttpRedirectCode(value: String): Self = StObject.set(x, "HttpRedirectCode", value.asInstanceOf[js.Any])
      
      inline def setHttpRedirectCodeUndefined: Self = StObject.set(x, "HttpRedirectCode", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
      
      inline def setReplaceKeyPrefixWith(value: String): Self = StObject.set(x, "ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceKeyPrefixWithUndefined: Self = StObject.set(x, "ReplaceKeyPrefixWith", js.undefined)
      
      inline def setReplaceKeyWith(value: String): Self = StObject.set(x, "ReplaceKeyWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceKeyWithUndefined: Self = StObject.set(x, "ReplaceKeyWith", js.undefined)
    }
  }
  
  trait RoutingRule extends StObject {
    
    /**
      * A condition that must be met for the specified redirect to be applied.
      * If not included, the rule is applied to all requests.
      */
    var Condition: js.UndefOr[typings.pulumiAws.routingRulesMod.Condition] = js.undefined
    
    /**
      * Provides instructions for redirecting the request. You can redirect requests to another host or another page,
      * or you can specify another protocol to use.
      */
    var Redirect: typings.pulumiAws.routingRulesMod.Redirect
  }
  object RoutingRule {
    
    inline def apply(Redirect: Redirect): RoutingRule = {
      val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingRule]
    }
    
    extension [Self <: RoutingRule](x: Self) {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      inline def setRedirect(value: Redirect): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    }
  }
}
