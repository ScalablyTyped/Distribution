package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  var provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider
}
object Provider {
  
  inline def apply(provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
