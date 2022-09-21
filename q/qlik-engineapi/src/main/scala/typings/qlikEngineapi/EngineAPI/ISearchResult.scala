package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchResult...
  */
trait ISearchResult extends StObject {
  
  /**
    * List of search groups.
    * The groups are numbered
    * from
    * the value of SearchPage.qOffset
    * to
    * the value of SearchPage.qOffset + SearchPage.qCount.
    */
  var qSearchGroupArray: ISearchGroup
  
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String]
  
  /**
    * Total number of groups.
    */
  var qTotalNumberOfGroups: Double
}
object ISearchResult {
  
  inline def apply(qSearchGroupArray: ISearchGroup, qSearchTerms: js.Array[String], qTotalNumberOfGroups: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(qSearchGroupArray = qSearchGroupArray.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qTotalNumberOfGroups = qTotalNumberOfGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  
  extension [Self <: ISearchResult](x: Self) {
    
    inline def setQSearchGroupArray(value: ISearchGroup): Self = StObject.set(x, "qSearchGroupArray", value.asInstanceOf[js.Any])
    
    inline def setQSearchTerms(value: js.Array[String]): Self = StObject.set(x, "qSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setQSearchTermsVarargs(value: String*): Self = StObject.set(x, "qSearchTerms", js.Array(value*))
    
    inline def setQTotalNumberOfGroups(value: Double): Self = StObject.set(x, "qTotalNumberOfGroups", value.asInstanceOf[js.Any])
  }
}
