package typings.pulumiAws

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routingRulesMod {
  
  @js.native
  trait Condition extends StObject {
    
    /**
      * The HTTP error code that must match for the redirect to apply. If an error occurs, and if the error code meets
      * this value, then the specified redirect applies.
      *
      * `HttpErrorCodeReturnedEquals` is required if `KeyPrefixEquals` is not specified. If both `KeyPrefixEquals` and
      * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
      */
    var HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.native
    
    /**
      * The prefix of the object key name from which requests are redirected.
      *
      * `KeyPrefixEquals` is required if `HttpErrorCodeReturnedEquals` is not specified. If both `KeyPrefixEquals` and
      * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
      */
    var KeyPrefixEquals: js.UndefOr[String] = js.native
  }
  object Condition {
    
    @scala.inline
    def apply(): Condition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpErrorCodeReturnedEquals(value: String): Self = StObject.set(x, "HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpErrorCodeReturnedEqualsUndefined: Self = StObject.set(x, "HttpErrorCodeReturnedEquals", js.undefined)
      
      @scala.inline
      def setKeyPrefixEquals(value: String): Self = StObject.set(x, "KeyPrefixEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefixEqualsUndefined: Self = StObject.set(x, "KeyPrefixEquals", js.undefined)
    }
  }
  
  @js.native
  trait Redirect extends StObject {
    
    /**
      * The hostname to be used in the Location header that is returned in the response.
      *
      * If another property is set, `HostName` is not required.
      */
    var HostName: js.UndefOr[String] = js.native
    
    /**
      * The HTTP redirect code to be used in the Location header that is returned in the response.
      *
      * If another property is set, `HttpRedirectCode` is not required.
      */
    var HttpRedirectCode: js.UndefOr[String] = js.native
    
    /**
      * The protocol, http or https, to be used in the Location header that is returned in the response.
      *
      * If another property is set, `Protocol` is not required.
      */
    var Protocol: js.UndefOr[String] = js.native
    
    /**
      * The prefix of the object key name that replaces the value of `KeyPrefixEquals` in the redirect request.
      *
      * If another property is set, `ReplaceKeyPrefixWith` is not required.
      * It can be set only if `ReplaceKeyWith` is not set.
      */
    var ReplaceKeyPrefixWith: js.UndefOr[String] = js.native
    
    /**
      * The object key to be used in the Location header that is returned in the response.
      *
      * If another property is set, `ReplaceKeyWith` is not required.
      * It can be set only if `ReplaceKeyPrefixWith` is not set.
      */
    var ReplaceKeyWith: js.UndefOr[String] = js.native
  }
  object Redirect {
    
    @scala.inline
    def apply(): Redirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
      
      @scala.inline
      def setHttpRedirectCode(value: String): Self = StObject.set(x, "HttpRedirectCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpRedirectCodeUndefined: Self = StObject.set(x, "HttpRedirectCode", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
      
      @scala.inline
      def setReplaceKeyPrefixWith(value: String): Self = StObject.set(x, "ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceKeyPrefixWithUndefined: Self = StObject.set(x, "ReplaceKeyPrefixWith", js.undefined)
      
      @scala.inline
      def setReplaceKeyWith(value: String): Self = StObject.set(x, "ReplaceKeyWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceKeyWithUndefined: Self = StObject.set(x, "ReplaceKeyWith", js.undefined)
    }
  }
  
  @js.native
  trait RoutingRule extends StObject {
    
    /**
      * A condition that must be met for the specified redirect to be applied.
      * If not included, the rule is applied to all requests.
      */
    var Condition: js.UndefOr[typings.pulumiAws.routingRulesMod.Condition] = js.native
    
    /**
      * Provides instructions for redirecting the request. You can redirect requests to another host or another page,
      * or you can specify another protocol to use.
      */
    var Redirect: typings.pulumiAws.routingRulesMod.Redirect = js.native
  }
  object RoutingRule {
    
    @scala.inline
    def apply(Redirect: Redirect): RoutingRule = {
      val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingRule]
    }
    
    @scala.inline
    implicit class RoutingRuleMutableBuilder[Self <: RoutingRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      @scala.inline
      def setRedirect(value: Redirect): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    }
  }
}
