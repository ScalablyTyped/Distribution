package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxBookmark...
  */
trait INxBookmark extends StObject {
  
  /**
    * List of selections for each state.
    */
  var qStateData: js.Array[IAlternateStateData]
  
  /**
    * Time when the bookmark was created.
    */
  var qUtcModifyTime: Double
  
  /**
    * List of the variables in the app at the time the bookmark was created.
    */
  var qVariableItems: js.Array[IBookmarkVariableItem]
}
object INxBookmark {
  
  inline def apply(
    qStateData: js.Array[IAlternateStateData],
    qUtcModifyTime: Double,
    qVariableItems: js.Array[IBookmarkVariableItem]
  ): INxBookmark = {
    val __obj = js.Dynamic.literal(qStateData = qStateData.asInstanceOf[js.Any], qUtcModifyTime = qUtcModifyTime.asInstanceOf[js.Any], qVariableItems = qVariableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxBookmark]
  }
  
  extension [Self <: INxBookmark](x: Self) {
    
    inline def setQStateData(value: js.Array[IAlternateStateData]): Self = StObject.set(x, "qStateData", value.asInstanceOf[js.Any])
    
    inline def setQStateDataVarargs(value: IAlternateStateData*): Self = StObject.set(x, "qStateData", js.Array(value*))
    
    inline def setQUtcModifyTime(value: Double): Self = StObject.set(x, "qUtcModifyTime", value.asInstanceOf[js.Any])
    
    inline def setQVariableItems(value: js.Array[IBookmarkVariableItem]): Self = StObject.set(x, "qVariableItems", value.asInstanceOf[js.Any])
    
    inline def setQVariableItemsVarargs(value: IBookmarkVariableItem*): Self = StObject.set(x, "qVariableItems", js.Array(value*))
  }
}
