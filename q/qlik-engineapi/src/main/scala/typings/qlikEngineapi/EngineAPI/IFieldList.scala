package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldListObject...
  */
trait IFieldList extends StObject {
  
  /**
    * NxFieldDescription[]
    */
  var qItems: js.Array[INxFieldDescription]
}
object IFieldList {
  
  inline def apply(qItems: js.Array[INxFieldDescription]): IFieldList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldList] (val x: Self) extends AnyVal {
    
    inline def setQItems(value: js.Array[INxFieldDescription]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    inline def setQItemsVarargs(value: INxFieldDescription*): Self = StObject.set(x, "qItems", js.Array(value*))
  }
}
