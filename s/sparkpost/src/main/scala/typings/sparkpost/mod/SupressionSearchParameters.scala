package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupressionSearchParameters extends StObject {
  
  /**
    * The results cursor location to return, to start paging with cursor, use the value of ‘initial’.
    * When cursor is provided the page parameter is ignored. (Note: SparkPost only)
    *
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the entries to include in the search, i.e descriptions that include the text submitted.
    * ( Note: SparkPost only)
    *
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Domain of entries to include in the search. ( Note: SparkPost only)
    *
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Datetime the entries were last updated, in the format YYYY-MM-DDTHH:mm:ssZ */
  var from: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return per page. Must be between 1 and 10,000.
    * @deprecated use per_page instead
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * The results page number to return. Used with per_page for paging through results.
    * The page parameter works up to 10,000 results.
    * You must use the cursor parameter and start with cursor=initial to page result sets larger than 10,000
    * ( Note: SparkPost only)
    *
    */
  var page: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Maximum number of results to return per page. Must be between 1 and 10,000.
    * ( Note: SparkPost only)
    * @default 1000
    */
  var per_page: js.UndefOr[String | Double] = js.undefined
  
  /** Sources of the entries to include in the search, i.e. entries that were added by this source */
  var sources: js.UndefOr[String] = js.undefined
  
  /** Datetime the entries were last updated, in the format of YYYY-MM-DDTHH:mm:ssZ */
  var to: js.UndefOr[String] = js.undefined
  
  /** Types of entries to include in the search, i.e. entries with “transactional” and/or “non_transactional” keys set to true */
  var types: js.UndefOr[String] = js.undefined
}
object SupressionSearchParameters {
  
  @scala.inline
  def apply(): SupressionSearchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupressionSearchParameters]
  }
  
  @scala.inline
  implicit class SupressionSearchParametersMutableBuilder[Self <: SupressionSearchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPage(value: String | Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: String | Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setSources(value: String): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
