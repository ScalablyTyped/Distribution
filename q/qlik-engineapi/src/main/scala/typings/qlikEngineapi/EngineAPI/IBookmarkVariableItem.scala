package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BookmarkVariableItem...
  */
@js.native
trait IBookmarkVariableItem extends StObject {
  
  /**
    * Name of the variable.
    */
  var qName: String = js.native
  
  /**
    * Value of the variable.
    */
  var qValue: IFieldValue = js.native
}
object IBookmarkVariableItem {
  
  @scala.inline
  def apply(qName: String, qValue: IFieldValue): IBookmarkVariableItem = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkVariableItem]
  }
  
  @scala.inline
  implicit class IBookmarkVariableItemMutableBuilder[Self <: IBookmarkVariableItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: IFieldValue): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
