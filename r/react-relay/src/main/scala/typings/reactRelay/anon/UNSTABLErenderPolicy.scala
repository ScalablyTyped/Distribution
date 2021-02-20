package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UNSTABLErenderPolicy extends StObject {
  
  var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.native
}
object UNSTABLErenderPolicy {
  
  @scala.inline
  def apply(): UNSTABLErenderPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UNSTABLErenderPolicy]
  }
  
  @scala.inline
  implicit class UNSTABLErenderPolicyMutableBuilder[Self <: UNSTABLErenderPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSTABLE_renderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_renderPolicy", js.undefined)
  }
}
