package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSessionOptions extends StObject {
  
  var skipLegacyListener: js.UndefOr[Boolean] = js.undefined
}
object ClearSessionOptions {
  
  inline def apply(): ClearSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearSessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearSessionOptions] (val x: Self) extends AnyVal {
    
    inline def setSkipLegacyListener(value: Boolean): Self = StObject.set(x, "skipLegacyListener", value.asInstanceOf[js.Any])
    
    inline def setSkipLegacyListenerUndefined: Self = StObject.set(x, "skipLegacyListener", js.undefined)
  }
}
