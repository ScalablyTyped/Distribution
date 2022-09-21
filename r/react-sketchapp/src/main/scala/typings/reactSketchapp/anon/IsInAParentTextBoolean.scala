package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInAParentTextBoolean extends StObject {
  
  var isInAParentText: Boolean
}
object IsInAParentTextBoolean {
  
  inline def apply(isInAParentText: Boolean): IsInAParentTextBoolean = {
    val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInAParentTextBoolean]
  }
  
  extension [Self <: IsInAParentTextBoolean](x: Self) {
    
    inline def setIsInAParentText(value: Boolean): Self = StObject.set(x, "isInAParentText", value.asInstanceOf[js.Any])
  }
}
