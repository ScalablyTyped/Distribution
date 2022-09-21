package typings.stencilCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootOptions extends StObject {
  
  /**
    * When set to `true`, specifies behavior that mitigates custom element issues
    * around focusability. When a non-focusable part of the shadow DOM is clicked, the first
    * focusable part is given focus, and the shadow host is given any available `:focus` styling.
    */
  var delegatesFocus: js.UndefOr[Boolean] = js.undefined
}
object ShadowRootOptions {
  
  inline def apply(): ShadowRootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowRootOptions]
  }
  
  extension [Self <: ShadowRootOptions](x: Self) {
    
    inline def setDelegatesFocus(value: Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    inline def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
  }
}
