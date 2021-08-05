package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchAssociationResult...
  */
trait ISearchAssociationResult extends StObject {
  
  /**
    * Information about the fields containing search hits.
    */
  var qFieldDictionaries: js.Array[ISearchFieldDictionary]
  
  /**
    * List of the fields that contains search associations.
    */
  var qFieldNames: js.Array[String]
  
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String]
  
  /**
    * List of search results.
    * The maximum number of search results in this list is set by qPage/qCount.
    */
  var qSearchTermsMatched: js.Array[ISearchMatchCombinations]
  
  /**
    * Total number of search results.
    * This number is not limited by qPage/qCount.
    */
  var qTotalSearchResults: Double
}
object ISearchAssociationResult {
  
  inline def apply(
    qFieldDictionaries: js.Array[ISearchFieldDictionary],
    qFieldNames: js.Array[String],
    qSearchTerms: js.Array[String],
    qSearchTermsMatched: js.Array[ISearchMatchCombinations],
    qTotalSearchResults: Double
  ): ISearchAssociationResult = {
    val __obj = js.Dynamic.literal(qFieldDictionaries = qFieldDictionaries.asInstanceOf[js.Any], qFieldNames = qFieldNames.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qSearchTermsMatched = qSearchTermsMatched.asInstanceOf[js.Any], qTotalSearchResults = qTotalSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAssociationResult]
  }
  
  extension [Self <: ISearchAssociationResult](x: Self) {
    
    inline def setQFieldDictionaries(value: js.Array[ISearchFieldDictionary]): Self = StObject.set(x, "qFieldDictionaries", value.asInstanceOf[js.Any])
    
    inline def setQFieldDictionariesVarargs(value: ISearchFieldDictionary*): Self = StObject.set(x, "qFieldDictionaries", js.Array(value :_*))
    
    inline def setQFieldNames(value: js.Array[String]): Self = StObject.set(x, "qFieldNames", value.asInstanceOf[js.Any])
    
    inline def setQFieldNamesVarargs(value: String*): Self = StObject.set(x, "qFieldNames", js.Array(value :_*))
    
    inline def setQSearchTerms(value: js.Array[String]): Self = StObject.set(x, "qSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setQSearchTermsMatched(value: js.Array[ISearchMatchCombinations]): Self = StObject.set(x, "qSearchTermsMatched", value.asInstanceOf[js.Any])
    
    inline def setQSearchTermsMatchedVarargs(value: ISearchMatchCombinations*): Self = StObject.set(x, "qSearchTermsMatched", js.Array(value :_*))
    
    inline def setQSearchTermsVarargs(value: String*): Self = StObject.set(x, "qSearchTerms", js.Array(value :_*))
    
    inline def setQTotalSearchResults(value: Double): Self = StObject.set(x, "qTotalSearchResults", value.asInstanceOf[js.Any])
  }
}
