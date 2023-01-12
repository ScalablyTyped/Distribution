package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VariableListObject...
  */
trait IVariableList extends StObject {
  
  var qItems: js.Array[INxVariableListItem]
}
object IVariableList {
  
  inline def apply(qItems: js.Array[INxVariableListItem]): IVariableList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVariableList] (val x: Self) extends AnyVal {
    
    inline def setQItems(value: js.Array[INxVariableListItem]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    inline def setQItemsVarargs(value: INxVariableListItem*): Self = StObject.set(x, "qItems", js.Array(value*))
  }
}
