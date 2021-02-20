package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config definitions
  */
@js.native
trait ConfigOptions extends StObject {
  
  // Hard to type
  var constraintsValidation: js.UndefOr[js.Function1[/* constraints */ js.Any, _]] = js.native
  
  var endpoint: js.UndefOr[String] = js.native
  
  def homepage(): Obj = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var routingBasePath: js.UndefOr[String] = js.native
  
  var tenant: String = js.native
  
  var visitorAuthentication: js.UndefOr[Boolean] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(homepage: () => Obj, tenant: String): ConfigOptions = {
    val __obj = js.Dynamic.literal(homepage = js.Any.fromFunction0(homepage), tenant = tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintsValidation(value: /* constraints */ js.Any => _): Self = StObject.set(x, "constraintsValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstraintsValidationUndefined: Self = StObject.set(x, "constraintsValidation", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setHomepage(value: () => Obj): Self = StObject.set(x, "homepage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setRoutingBasePath(value: String): Self = StObject.set(x, "routingBasePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingBasePathUndefined: Self = StObject.set(x, "routingBasePath", js.undefined)
    
    @scala.inline
    def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorAuthentication(value: Boolean): Self = StObject.set(x, "visitorAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorAuthenticationUndefined: Self = StObject.set(x, "visitorAuthentication", js.undefined)
  }
}
