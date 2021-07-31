package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchGroupItemOptions...
  */
trait ISearchGroupItemOptions extends StObject {
  
  /**
    * Maximum number of matches per item (in qItemMatches[ ]).
    * The default value is -1: all values are returned.
    */
  var qCount: Double
  
  /**
    * Type of the group item. Can be
    *
    * - GenericObject: the type of the search group item is a generic object.
    *   Group items have this type when you are calling SearchObjects.
    *
    * - Field: the type of the search group item is a field.
    *   Group items have this type when you are calling SearchResults.
    */
  var qGroupItemType: IGenericObject
  
  /**
    * Position starting from 0.
    * The default value is 0.
    */
  var qOffset: Double
}
object ISearchGroupItemOptions {
  
  @scala.inline
  def apply(qCount: Double, qGroupItemType: IGenericObject, qOffset: Double): ISearchGroupItemOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupItemType = qGroupItemType.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupItemOptions]
  }
  
  @scala.inline
  implicit class ISearchGroupItemOptionsMutableBuilder[Self <: ISearchGroupItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCount(value: Double): Self = StObject.set(x, "qCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupItemType(value: IGenericObject): Self = StObject.set(x, "qGroupItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOffset(value: Double): Self = StObject.set(x, "qOffset", value.asInstanceOf[js.Any])
  }
}
