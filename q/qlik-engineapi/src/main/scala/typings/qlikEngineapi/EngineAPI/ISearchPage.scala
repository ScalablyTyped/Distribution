package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchPage...
  */
trait ISearchPage extends StObject {
  
  /**
    * Number of search groups to return (in qSearchGroupArray).
    */
  var qCount: Double
  
  /**
    * Options of the search group items.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupItemOptions: js.Array[ISearchGroupItemOptions]
  
  /**
    * Options of the search groups.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupOptions: js.Array[ISearchGroupOptions]
  
  /**
    * Maximum number of matching values to return per search result.
    * The default value is -1; all values are returned.
    * This property is to be used with the SearchAssociations method.
    */
  var qMaxNbrFieldMatches: Double
  
  /**
    * Position from the top, starting from 0.
    * If the offset is set to 0, the first search result to be returned is at position 0.
    */
  var qOffset: Double
}
object ISearchPage {
  
  inline def apply(
    qCount: Double,
    qGroupItemOptions: js.Array[ISearchGroupItemOptions],
    qGroupOptions: js.Array[ISearchGroupOptions],
    qMaxNbrFieldMatches: Double,
    qOffset: Double
  ): ISearchPage = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupItemOptions = qGroupItemOptions.asInstanceOf[js.Any], qGroupOptions = qGroupOptions.asInstanceOf[js.Any], qMaxNbrFieldMatches = qMaxNbrFieldMatches.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchPage] (val x: Self) extends AnyVal {
    
    inline def setQCount(value: Double): Self = StObject.set(x, "qCount", value.asInstanceOf[js.Any])
    
    inline def setQGroupItemOptions(value: js.Array[ISearchGroupItemOptions]): Self = StObject.set(x, "qGroupItemOptions", value.asInstanceOf[js.Any])
    
    inline def setQGroupItemOptionsVarargs(value: ISearchGroupItemOptions*): Self = StObject.set(x, "qGroupItemOptions", js.Array(value*))
    
    inline def setQGroupOptions(value: js.Array[ISearchGroupOptions]): Self = StObject.set(x, "qGroupOptions", value.asInstanceOf[js.Any])
    
    inline def setQGroupOptionsVarargs(value: ISearchGroupOptions*): Self = StObject.set(x, "qGroupOptions", js.Array(value*))
    
    inline def setQMaxNbrFieldMatches(value: Double): Self = StObject.set(x, "qMaxNbrFieldMatches", value.asInstanceOf[js.Any])
    
    inline def setQOffset(value: Double): Self = StObject.set(x, "qOffset", value.asInstanceOf[js.Any])
  }
}
