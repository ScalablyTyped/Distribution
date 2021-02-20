package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxBookmark...
  */
@js.native
trait INxBookmark extends StObject {
  
  /**
    * List of selections for each state.
    */
  var qStateData: js.Array[IAlternateStateData] = js.native
  
  /**
    * Time when the bookmark was created.
    */
  var qUtcModifyTime: Double = js.native
  
  /**
    * List of the variables in the app at the time the bookmark was created.
    */
  var qVariableItems: js.Array[IBookmarkVariableItem] = js.native
}
object INxBookmark {
  
  @scala.inline
  def apply(
    qStateData: js.Array[IAlternateStateData],
    qUtcModifyTime: Double,
    qVariableItems: js.Array[IBookmarkVariableItem]
  ): INxBookmark = {
    val __obj = js.Dynamic.literal(qStateData = qStateData.asInstanceOf[js.Any], qUtcModifyTime = qUtcModifyTime.asInstanceOf[js.Any], qVariableItems = qVariableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxBookmark]
  }
  
  @scala.inline
  implicit class INxBookmarkMutableBuilder[Self <: INxBookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQStateData(value: js.Array[IAlternateStateData]): Self = StObject.set(x, "qStateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateDataVarargs(value: IAlternateStateData*): Self = StObject.set(x, "qStateData", js.Array(value :_*))
    
    @scala.inline
    def setQUtcModifyTime(value: Double): Self = StObject.set(x, "qUtcModifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQVariableItems(value: js.Array[IBookmarkVariableItem]): Self = StObject.set(x, "qVariableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQVariableItemsVarargs(value: IBookmarkVariableItem*): Self = StObject.set(x, "qVariableItems", js.Array(value :_*))
  }
}
