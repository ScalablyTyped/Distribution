package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VariableListObject...
  */
@js.native
trait IVariableList extends StObject {
  
  var qItems: js.Array[INxVariableListItem] = js.native
}
object IVariableList {
  
  @scala.inline
  def apply(qItems: js.Array[INxVariableListItem]): IVariableList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableList]
  }
  
  @scala.inline
  implicit class IVariableListMutableBuilder[Self <: IVariableList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQItems(value: js.Array[INxVariableListItem]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQItemsVarargs(value: INxVariableListItem*): Self = StObject.set(x, "qItems", js.Array(value :_*))
  }
}
