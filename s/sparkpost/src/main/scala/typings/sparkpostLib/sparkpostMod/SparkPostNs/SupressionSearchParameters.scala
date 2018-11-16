package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SupressionSearchParameters extends js.Object {
  /**
           * The results cursor location to return, to start paging with cursor, use the value of ‘initial’.
           * When cursor is provided the page parameter is ignored. (Note: SparkPost only)
           *
           */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Description of the entries to include in the search, i.e descriptions that include the text submitted.
           * ( Note: SparkPost only)
           *
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Domain of entries to include in the search. ( Note: SparkPost only)
           *
           */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** Datetime the entries were last updated, in the format YYYY-MM-DDTHH:mm:ssZ */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Maximum number of results to return per page. Must be between 1 and 10,000.
           * @deprecated use per_page instead
           */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
           * The results page number to return. Used with per_page for paging through results.
           * The page parameter works up to 10,000 results.
           * You must use the cursor parameter and start with cursor=initial to page result sets larger than 10,000
           * ( Note: SparkPost only)
           *
           */
  var page: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
           * Maximum number of results to return per page. Must be between 1 and 10,000.
           * ( Note: SparkPost only)
           * @default 1000
           */
  var per_page: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sources of the entries to include in the search, i.e. entries that were added by this source */
  var sources: js.UndefOr[java.lang.String] = js.undefined
  /** Datetime the entries were last updated, in the format of YYYY-MM-DDTHH:mm:ssZ */
  var to: js.UndefOr[java.lang.String] = js.undefined
  /** Types of entries to include in the search, i.e. entries with “transactional” and/or “non_transactional” keys set to true */
  var types: js.UndefOr[java.lang.String] = js.undefined
}

