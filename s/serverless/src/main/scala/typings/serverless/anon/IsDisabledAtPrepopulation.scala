package typings.serverless.anon

import typings.serverless.pluginMod.VariableResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabledAtPrepopulation extends StObject {
  
  var isDisabledAtPrepopulation: js.UndefOr[Boolean] = js.undefined
  
  def resolver(variableSource: String): js.Promise[js.Any]
  @JSName("resolver")
  var resolver_Original: VariableResolver
  
  var serviceName: js.UndefOr[String] = js.undefined
}
object IsDisabledAtPrepopulation {
  
  @scala.inline
  def apply(resolver: /* variableSource */ String => js.Promise[js.Any]): IsDisabledAtPrepopulation = {
    val __obj = js.Dynamic.literal(resolver = js.Any.fromFunction1(resolver))
    __obj.asInstanceOf[IsDisabledAtPrepopulation]
  }
  
  @scala.inline
  implicit class IsDisabledAtPrepopulationMutableBuilder[Self <: IsDisabledAtPrepopulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDisabledAtPrepopulation(value: Boolean): Self = StObject.set(x, "isDisabledAtPrepopulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabledAtPrepopulationUndefined: Self = StObject.set(x, "isDisabledAtPrepopulation", js.undefined)
    
    @scala.inline
    def setResolver(value: /* variableSource */ String => js.Promise[js.Any]): Self = StObject.set(x, "resolver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
