package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prepared extends StObject {
  
  var prepared: js.UndefOr[Boolean] = js.undefined
  
  var provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider
}
object Prepared {
  
  inline def apply(provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Prepared = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prepared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prepared] (val x: Self) extends AnyVal {
    
    inline def setPrepared(value: Boolean): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
    
    inline def setPreparedUndefined: Self = StObject.set(x, "prepared", js.undefined)
    
    inline def setProvider(value: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
