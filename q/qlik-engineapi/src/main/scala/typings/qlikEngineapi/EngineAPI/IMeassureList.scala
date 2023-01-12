package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IMeassureList
  */
trait IMeassureList extends StObject {
  
  var qItems: js.Array[IMeassureListItemLayout]
}
object IMeassureList {
  
  inline def apply(qItems: js.Array[IMeassureListItemLayout]): IMeassureList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeassureList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMeassureList] (val x: Self) extends AnyVal {
    
    inline def setQItems(value: js.Array[IMeassureListItemLayout]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    inline def setQItemsVarargs(value: IMeassureListItemLayout*): Self = StObject.set(x, "qItems", js.Array(value*))
  }
}
