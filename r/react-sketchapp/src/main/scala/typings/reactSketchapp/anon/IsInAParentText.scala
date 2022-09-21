package typings.reactSketchapp.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInAParentText extends StObject {
  
  var isInAParentText: Requireable[Boolean]
}
object IsInAParentText {
  
  inline def apply(isInAParentText: Requireable[Boolean]): IsInAParentText = {
    val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInAParentText]
  }
  
  extension [Self <: IsInAParentText](x: Self) {
    
    inline def setIsInAParentText(value: Requireable[Boolean]): Self = StObject.set(x, "isInAParentText", value.asInstanceOf[js.Any])
  }
}
