package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupressionSearchParameters extends js.Object {
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
  def apply(
    cursor: String = null,
    description: String = null,
    domain: String = null,
    from: String = null,
    limit: Int | Double = null,
    page: String | Double = null,
    per_page: String | Double = null,
    sources: String = null,
    to: String = null,
    types: String = null
  ): SupressionSearchParameters = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupressionSearchParameters]
  }
}

