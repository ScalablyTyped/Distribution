package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64Options extends StObject {
  
  /**
    * optional parameter defaulting to true which will require = padding if true or make padding optional if false
    */
  var paddingRequired: js.UndefOr[Boolean] = js.undefined
}
object Base64Options {
  
  inline def apply(): Base64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base64Options]
  }
  
  extension [Self <: Base64Options](x: Self) {
    
    inline def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
    
    inline def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
  }
}
