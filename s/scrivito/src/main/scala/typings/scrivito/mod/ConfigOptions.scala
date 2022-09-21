package typings.scrivito.mod

import typings.scrivito.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config definitions
  */
trait ConfigOptions extends StObject {
  
  var adoptUi: js.UndefOr[Boolean] = js.undefined
  
  var baseUrlForSite: js.UndefOr[js.Function1[/* siteId */ String, js.UndefOr[String]]] = js.undefined
  
  // Hard to type
  var constraintsValidation: js.UndefOr[js.Function1[/* constraints */ Any, Any]] = js.undefined
  
  var endpoint: js.UndefOr[String] = js.undefined
  
  var homepage: js.UndefOr[js.Function0[Obj | Null]] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[Priority] = js.undefined
  
  var routingBasePath: js.UndefOr[String] = js.undefined
  
  var siteForUrl: js.UndefOr[js.Function1[/* url */ String, js.UndefOr[BaseUrl]]] = js.undefined
  
  var tenant: String
  
  var visitorAuthentication: js.UndefOr[Boolean] = js.undefined
}
object ConfigOptions {
  
  inline def apply(tenant: String): ConfigOptions = {
    val __obj = js.Dynamic.literal(tenant = tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setAdoptUi(value: Boolean): Self = StObject.set(x, "adoptUi", value.asInstanceOf[js.Any])
    
    inline def setAdoptUiUndefined: Self = StObject.set(x, "adoptUi", js.undefined)
    
    inline def setBaseUrlForSite(value: /* siteId */ String => js.UndefOr[String]): Self = StObject.set(x, "baseUrlForSite", js.Any.fromFunction1(value))
    
    inline def setBaseUrlForSiteUndefined: Self = StObject.set(x, "baseUrlForSite", js.undefined)
    
    inline def setConstraintsValidation(value: /* constraints */ Any => Any): Self = StObject.set(x, "constraintsValidation", js.Any.fromFunction1(value))
    
    inline def setConstraintsValidationUndefined: Self = StObject.set(x, "constraintsValidation", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHomepage(value: () => Obj | Null): Self = StObject.set(x, "homepage", js.Any.fromFunction0(value))
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRoutingBasePath(value: String): Self = StObject.set(x, "routingBasePath", value.asInstanceOf[js.Any])
    
    inline def setRoutingBasePathUndefined: Self = StObject.set(x, "routingBasePath", js.undefined)
    
    inline def setSiteForUrl(value: /* url */ String => js.UndefOr[BaseUrl]): Self = StObject.set(x, "siteForUrl", js.Any.fromFunction1(value))
    
    inline def setSiteForUrlUndefined: Self = StObject.set(x, "siteForUrl", js.undefined)
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setVisitorAuthentication(value: Boolean): Self = StObject.set(x, "visitorAuthentication", value.asInstanceOf[js.Any])
    
    inline def setVisitorAuthenticationUndefined: Self = StObject.set(x, "visitorAuthentication", js.undefined)
  }
}
