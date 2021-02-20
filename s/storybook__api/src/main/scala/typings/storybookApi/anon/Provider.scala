package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends StObject {
  
  var provider: typings.storybookApi.providerMod.Provider = js.native
}
object Provider {
  
  @scala.inline
  def apply(provider: typings.storybookApi.providerMod.Provider): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: typings.storybookApi.providerMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
