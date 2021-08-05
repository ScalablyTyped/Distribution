package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpandable extends StObject {
  
  var isExpandable: js.UndefOr[Boolean] = js.undefined
  
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}
object IsExpandable {
  
  inline def apply(): IsExpandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsExpandable]
  }
  
  extension [Self <: IsExpandable](x: Self) {
    
    inline def setIsExpandable(value: Boolean): Self = StObject.set(x, "isExpandable", value.asInstanceOf[js.Any])
    
    inline def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
  }
}
