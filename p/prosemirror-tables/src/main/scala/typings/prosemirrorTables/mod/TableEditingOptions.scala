package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait TableEditingOptions extends StObject {
  
  var allowTableNodeSelection: js.UndefOr[Boolean] = js.undefined
}
object TableEditingOptions {
  
  inline def apply(): TableEditingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableEditingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableEditingOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowTableNodeSelection(value: Boolean): Self = StObject.set(x, "allowTableNodeSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowTableNodeSelectionUndefined: Self = StObject.set(x, "allowTableNodeSelection", js.undefined)
  }
}
