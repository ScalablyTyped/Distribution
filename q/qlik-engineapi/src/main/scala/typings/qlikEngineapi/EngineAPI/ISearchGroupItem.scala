package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchGroupItem...
  */
@js.native
trait ISearchGroupItem extends StObject {
  
  /**
    * Identifier of the item.
    * It corresponds to:
    *
    * - The name of the field, if the type of the search group is data set.
    * - The id of the generic object if the type of the search group is generic object.
    */
  var qIdentifier: String = js.native
  
  /**
    * List of matches in the search group item.
    * The group item matches are numbered
    * from
    * the value of SearchGroupItemOptions.qOffset
    * to
    * the value of SearchGroupItemOptions.qOffset + SearchGroupItemOptions.qCount.
    */
  var qItemMatches: js.Array[ISearchGroupItemMatch] = js.native
  
  /**
    * Type of the group item.
    */
  var qItemType: SearchObjectsItemType = js.native
  
  /**
    * Indexes of the search terms that are included in the group item.
    * These search terms are related to the list of terms defined in SearchResult.qSearchTerms.
    */
  var qSearchTermsMatched: js.Array[Double] = js.native
  
  /**
    * Total number of distinct matches in the search group item.
    */
  var qTotalNumberOfMatches: Double = js.native
}
object ISearchGroupItem {
  
  @scala.inline
  def apply(
    qIdentifier: String,
    qItemMatches: js.Array[ISearchGroupItemMatch],
    qItemType: SearchObjectsItemType,
    qSearchTermsMatched: js.Array[Double],
    qTotalNumberOfMatches: Double
  ): ISearchGroupItem = {
    val __obj = js.Dynamic.literal(qIdentifier = qIdentifier.asInstanceOf[js.Any], qItemMatches = qItemMatches.asInstanceOf[js.Any], qItemType = qItemType.asInstanceOf[js.Any], qSearchTermsMatched = qSearchTermsMatched.asInstanceOf[js.Any], qTotalNumberOfMatches = qTotalNumberOfMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupItem]
  }
  
  @scala.inline
  implicit class ISearchGroupItemMutableBuilder[Self <: ISearchGroupItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIdentifier(value: String): Self = StObject.set(x, "qIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQItemMatches(value: js.Array[ISearchGroupItemMatch]): Self = StObject.set(x, "qItemMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQItemMatchesVarargs(value: ISearchGroupItemMatch*): Self = StObject.set(x, "qItemMatches", js.Array(value :_*))
    
    @scala.inline
    def setQItemType(value: SearchObjectsItemType): Self = StObject.set(x, "qItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSearchTermsMatched(value: js.Array[Double]): Self = StObject.set(x, "qSearchTermsMatched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSearchTermsMatchedVarargs(value: Double*): Self = StObject.set(x, "qSearchTermsMatched", js.Array(value :_*))
    
    @scala.inline
    def setQTotalNumberOfMatches(value: Double): Self = StObject.set(x, "qTotalNumberOfMatches", value.asInstanceOf[js.Any])
  }
}
