package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchResult...
  */
@js.native
trait ISearchResult extends StObject {
  
  /**
    * List of search groups.
    * The groups are numbered
    * from
    * the value of SearchPage.qOffset
    * to
    * the value of SearchPage.qOffset + SearchPage.qCount.
    */
  var qSearchGroupArray: ISearchGroup = js.native
  
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String] = js.native
  
  /**
    * Total number of groups.
    */
  var qTotalNumberOfGroups: Double = js.native
}
object ISearchResult {
  
  @scala.inline
  def apply(qSearchGroupArray: ISearchGroup, qSearchTerms: js.Array[String], qTotalNumberOfGroups: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(qSearchGroupArray = qSearchGroupArray.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qTotalNumberOfGroups = qTotalNumberOfGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  
  @scala.inline
  implicit class ISearchResultMutableBuilder[Self <: ISearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQSearchGroupArray(value: ISearchGroup): Self = StObject.set(x, "qSearchGroupArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSearchTerms(value: js.Array[String]): Self = StObject.set(x, "qSearchTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSearchTermsVarargs(value: String*): Self = StObject.set(x, "qSearchTerms", js.Array(value :_*))
    
    @scala.inline
    def setQTotalNumberOfGroups(value: Double): Self = StObject.set(x, "qTotalNumberOfGroups", value.asInstanceOf[js.Any])
  }
}
