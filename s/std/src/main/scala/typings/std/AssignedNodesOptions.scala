package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedNodesOptions extends StObject {
  
  /* standard dom */
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
}
object AssignedNodesOptions {
  
  inline def apply(): AssignedNodesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedNodesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignedNodesOptions] (val x: Self) extends AnyVal {
    
    inline def setFlatten(value: scala.Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
  }
}
