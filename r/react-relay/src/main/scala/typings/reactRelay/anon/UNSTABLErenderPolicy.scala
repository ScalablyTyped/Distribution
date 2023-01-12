package typings.reactRelay.anon

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UNSTABLErenderPolicy extends StObject {
  
  var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
}
object UNSTABLErenderPolicy {
  
  inline def apply(): UNSTABLErenderPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UNSTABLErenderPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UNSTABLErenderPolicy] (val x: Self) extends AnyVal {
    
    inline def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
    
    inline def setUNSTABLE_renderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_renderPolicy", js.undefined)
  }
}
