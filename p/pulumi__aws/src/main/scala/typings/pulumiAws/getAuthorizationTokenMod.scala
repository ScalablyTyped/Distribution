package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAuthorizationTokenMod {
  
  @JSImport("@pulumi/aws/codeartifact/getAuthorizationToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  
  trait GetAuthorizationTokenArgs extends StObject {
    
    /**
      * The name of the domain that is in scope for the generated authorization token.
      */
    val domain: String
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[String] = js.undefined
    
    /**
      * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
      */
    val durationSeconds: js.UndefOr[Double] = js.undefined
  }
  object GetAuthorizationTokenArgs {
    
    inline def apply(domain: String): GetAuthorizationTokenArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAuthorizationTokenArgs]
    }
    
    extension [Self <: GetAuthorizationTokenArgs](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainOwner(value: String): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    }
  }
  
  trait GetAuthorizationTokenResult extends StObject {
    
    /**
      * Temporary authorization token.
      */
    val authorizationToken: String
    
    val domain: String
    
    val domainOwner: String
    
    val durationSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * The time in UTC RFC3339 format when the authorization token expires.
      */
    val expiration: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetAuthorizationTokenResult {
    
    inline def apply(authorizationToken: String, domain: String, domainOwner: String, expiration: String, id: String): GetAuthorizationTokenResult = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], domainOwner = domainOwner.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAuthorizationTokenResult]
    }
    
    extension [Self <: GetAuthorizationTokenResult](x: Self) {
      
      inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainOwner(value: String): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
      
      inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
