package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AlternateStateData...
  */
trait IAlternateStateData extends StObject {
  
  /**
    * List of the selections <Array of BookmarkFieldItem>
    */
  var qFieldItems: js.Array[IBookmarkFieldItem]
  
  /**
    * Name of the alternate state.
    * Default is current selections: $
    */
  var qStateName: String
}
object IAlternateStateData {
  
  inline def apply(qFieldItems: js.Array[IBookmarkFieldItem], qStateName: String): IAlternateStateData = {
    val __obj = js.Dynamic.literal(qFieldItems = qFieldItems.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlternateStateData]
  }
  
  extension [Self <: IAlternateStateData](x: Self) {
    
    inline def setQFieldItems(value: js.Array[IBookmarkFieldItem]): Self = StObject.set(x, "qFieldItems", value.asInstanceOf[js.Any])
    
    inline def setQFieldItemsVarargs(value: IBookmarkFieldItem*): Self = StObject.set(x, "qFieldItems", js.Array(value*))
    
    inline def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
