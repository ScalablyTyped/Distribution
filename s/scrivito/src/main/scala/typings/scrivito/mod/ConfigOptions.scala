package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config definitions
  */
@js.native
trait ConfigOptions extends js.Object {
  
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
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHomepage(value: () => Obj): Self = this.set("homepage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTenant(value: String): Self = this.set("tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsValidation(value: /* constraints */ js.Any => _): Self = this.set("constraintsValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConstraintsValidation: Self = this.set("constraintsValidation", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setRoutingBasePath(value: String): Self = this.set("routingBasePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingBasePath: Self = this.set("routingBasePath", js.undefined)
    
    @scala.inline
    def setVisitorAuthentication(value: Boolean): Self = this.set("visitorAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitorAuthentication: Self = this.set("visitorAuthentication", js.undefined)
  }
}
