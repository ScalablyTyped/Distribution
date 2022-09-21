package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  var isDisabled: Any
}
object IsDisabled {
  
  inline def apply(isDisabled: Any): IsDisabled = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDisabled]
  }
  
  extension [Self <: IsDisabled](x: Self) {
    
    inline def setIsDisabled(value: Any): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
  }
}
