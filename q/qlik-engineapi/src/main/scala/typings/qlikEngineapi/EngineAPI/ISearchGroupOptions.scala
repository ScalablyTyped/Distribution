package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchGroupOptions...
  */
trait ISearchGroupOptions extends StObject {
  
  /**
    * Maximum number of items per group (in qItems[ ]).
    * The default value is -1;
    * all values are returned.
    */
  var qCount: Double
  
  /**
    * Type of the group. Can be:
    * - GenericObjectType: the type of the search group item is a generic object.
    *   Groups have this type when you are calling SearchObjects.
    * - DatasetType: type of the search group item is a dataset association.
    *   Groups have this type when you are calling SearchResults.
    */
  var qGroupType: Any
  
  /**
    * Position starting from 0.
    * >> The default value is 0.
    */
  var qOffset: Double
}
object ISearchGroupOptions {
  
  inline def apply(qCount: Double, qGroupType: Any, qOffset: Double): ISearchGroupOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupType = qGroupType.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchGroupOptions] (val x: Self) extends AnyVal {
    
    inline def setQCount(value: Double): Self = StObject.set(x, "qCount", value.asInstanceOf[js.Any])
    
    inline def setQGroupType(value: Any): Self = StObject.set(x, "qGroupType", value.asInstanceOf[js.Any])
    
    inline def setQOffset(value: Double): Self = StObject.set(x, "qOffset", value.asInstanceOf[js.Any])
  }
}
