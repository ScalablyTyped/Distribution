package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpanded extends StObject {
  
  var isExpanded: Boolean
}
object IsExpanded {
  
  inline def apply(isExpanded: Boolean): IsExpanded = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
  
  extension [Self <: IsExpanded](x: Self) {
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
  }
}
