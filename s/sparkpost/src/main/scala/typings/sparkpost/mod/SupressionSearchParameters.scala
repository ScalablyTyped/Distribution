package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupressionSearchParameters extends js.Object {
  /**
    * The results cursor location to return, to start paging with cursor, use the value of ‘initial’.
    * When cursor is provided the page parameter is ignored. (Note: SparkPost only)
    *
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Description of the entries to include in the search, i.e descriptions that include the text submitted.
    * ( Note: SparkPost only)
    *
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Domain of entries to include in the search. ( Note: SparkPost only)
    *
    */
  var domain: js.UndefOr[String] = js.native
  /** Datetime the entries were last updated, in the format YYYY-MM-DDTHH:mm:ssZ */
  var from: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return per page. Must be between 1 and 10,000.
    * @deprecated use per_page instead
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The results page number to return. Used with per_page for paging through results.
    * The page parameter works up to 10,000 results.
    * You must use the cursor parameter and start with cursor=initial to page result sets larger than 10,000
    * ( Note: SparkPost only)
    *
    */
  var page: js.UndefOr[String | Double] = js.native
  /**
    * Maximum number of results to return per page. Must be between 1 and 10,000.
    * ( Note: SparkPost only)
    * @default 1000
    */
  var per_page: js.UndefOr[String | Double] = js.native
  /** Sources of the entries to include in the search, i.e. entries that were added by this source */
  var sources: js.UndefOr[String] = js.native
  /** Datetime the entries were last updated, in the format of YYYY-MM-DDTHH:mm:ssZ */
  var to: js.UndefOr[String] = js.native
  /** Types of entries to include in the search, i.e. entries with “transactional” and/or “non_transactional” keys set to true */
  var types: js.UndefOr[String] = js.native
}

object SupressionSearchParameters {
  @scala.inline
  def apply(): SupressionSearchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupressionSearchParameters]
  }
  @scala.inline
  implicit class SupressionSearchParametersOps[Self <: SupressionSearchParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPage(value: String | Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: String | Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    @scala.inline
    def setSources(value: String): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

