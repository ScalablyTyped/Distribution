package typings.reactSortableTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreCollapsed extends StObject {
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
}
object IgnoreCollapsed {
  
  inline def apply(): IgnoreCollapsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreCollapsed]
  }
  
  extension [Self <: IgnoreCollapsed](x: Self) {
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
  }
}
