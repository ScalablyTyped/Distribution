package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BookmarkFieldItem...
  */
trait IBookmarkFieldItem extends StObject {
  
  /**
    * If set to true, selections within a list object are made in AND mode;
    * If you have a list object that lists all customers, by selecting Customer 1 and
    * Customer 2 while in and-mode, all records that are associated with Customer 1 and Customer 2 are selected.
    *
    * The default value is false; selections within a list object are made in OR mode. If you have a list object
    * that lists all customers, by selecting Customer 1 and Customer 2 while in or-mode, all records that are
    * associated with either Customer 1 or Customer 2 are selected.
    * This parameter is not returned if set to false.
    */
  var qAndMode: Boolean
  
  /**
    * Name and type of the field
    */
  var qDef: IFieldDefEx
  
  /**
    * List of excluded values.
    * Either the list of selected values or the list of excluded values is displayed.
    */
  var qExcludedValues: js.Array[IFieldValue]
  
  /**
    * Indicates if the field is locked.
    * Default is false.
    */
  var qLocked: Boolean
  
  /**
    * If set to true, the field has always one selection (not 0 and not more than 1).
    * If another value is selected, the previous one is unselected.
    * The default value is false. This parameter is not returned if set to false.
    */
  var qOneAndOnlyOne: Boolean
  
  /**
    * Information on the selections criteria
    */
  var qSelectInfo: ISelectInfo
  
  /**
    * List of the selected values
    * Either the list of selected values or the list of excluded values is displayed.
    */
  var qValues: js.Array[IFieldValue]
}
object IBookmarkFieldItem {
  
  @scala.inline
  def apply(
    qAndMode: Boolean,
    qDef: IFieldDefEx,
    qExcludedValues: js.Array[IFieldValue],
    qLocked: Boolean,
    qOneAndOnlyOne: Boolean,
    qSelectInfo: ISelectInfo,
    qValues: js.Array[IFieldValue]
  ): IBookmarkFieldItem = {
    val __obj = js.Dynamic.literal(qAndMode = qAndMode.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExcludedValues = qExcludedValues.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qOneAndOnlyOne = qOneAndOnlyOne.asInstanceOf[js.Any], qSelectInfo = qSelectInfo.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkFieldItem]
  }
  
  @scala.inline
  implicit class IBookmarkFieldItemMutableBuilder[Self <: IBookmarkFieldItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAndMode(value: Boolean): Self = StObject.set(x, "qAndMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDef(value: IFieldDefEx): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExcludedValues(value: js.Array[IFieldValue]): Self = StObject.set(x, "qExcludedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExcludedValuesVarargs(value: IFieldValue*): Self = StObject.set(x, "qExcludedValues", js.Array(value :_*))
    
    @scala.inline
    def setQLocked(value: Boolean): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOneAndOnlyOne(value: Boolean): Self = StObject.set(x, "qOneAndOnlyOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectInfo(value: ISelectInfo): Self = StObject.set(x, "qSelectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValues(value: js.Array[IFieldValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValuesVarargs(value: IFieldValue*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
