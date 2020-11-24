package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerFilter")
@js.native
class CustomerFilter () extends js.Object {
  
  /**
    * A filter to select customers based on when they were created.
    */
  var created_at: js.UndefOr[TimeRange] = js.native
  
  /**
    * A filter to select customers based on their creation source.
    */
  var creation_source: js.UndefOr[CustomerCreationSourceFilter] = js.native
  
  /**
    * A filter to [select customers by email address](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#search-by-email-address) visible to the seller.
    * This filter is case insensitive. For [exact matching](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#exact-search-by-email-address),
    * this filter causes the search to return customer profiles whose `email_address` field value are identical to the email address provided in the query.
    * For [fuzzy matching](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#fuzzy-search-by-email-address),
    * this filter causes the search to return customer profiles  whose `email_address` field value has a token-wise partial
    * match against the filtering  expression in the query. For example, with `Steven gmail` provided in a search query,
    * the search returns customers whose email address can be `steven.johnson&#64;gmail.com`  or `mygmail&#64;stevensbakery.com`.
    * Email addresses are tokenized by replacing, by spaces,  punctuations including periods (`.`), underscores (`_`),
    * and the `&#64;` symbols. A match is found if a tokenized email address contains all the tokens in the search query,irrespective of the token order.
    */
  var email_address: js.UndefOr[CustomerTextFilter] = js.native
  
  /**
    * A filter to select customers based on their group membership.
    * The `group_ids` is a JSON object of the following general format:
    * ``` \"group_ids\": { \"any\":  [\"{group_a_id}\", \"{group_b_id}\", ...], \"all\":  [\"{group_1_id}\", \"{group_2_id}\", ...], 'none\": [\"{group_i_id}\", \"{group_ii_id}\", ...] } ```
    * You can use any combination of the above `group_ids` fields (also known as `FilterValue` properties)
    * to specify how customers are selected based on their group membership. With the `any` option, the search returns
    * customers in Groups `A` or `B` or ... of the list. With the `all` option, the search returns customers in Groups
    * `1` and `2` and ... of the list. With the `none` option, the search returns customers not in Groups `i` and not
    * in `ii` and not in ... of the list. If any of the search conditions are not met, including when an invalid or
    * non-existent group ID is provided, the result is an empty list. You can use the `group_ids` search filter with
    * other available filters. You cannot use the `group_ids` filter to select customers based on segment membership.
    */
  var group_ids: js.UndefOr[FilterValue] = js.native
  
  /**
    * A filter to [select customers by their phone numbers](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#search-by-phone-number) visible to the seller.
    * This filter is case insensitive. For [exact matching](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#exact-search-by-phone-number),
    * this filter causes the search to return customers whose phone number matches the specified query expression.
    * The number in the query must be of an E.164-compliant form. In particular, it must include the leading `+`
    * sign followed by a contry code and then a subscriber number. The standard E.614 form of a US phone number is
    * `+12061112222` of the domestic version or `+0012061112222` of the international version. The E.164-compliant variations
    * include `+1 (206) 111-2222` or `+001 (206) 111-2222`, respectively. To match the query expression, stored customers'
    * phone numbers are converted to the standard E.164 form of the national and internationalized versions.
    * For [fuzzy matching](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#fuzzy-search-by-phone-number),
    * this filter causes the search to return customers whose phone number matches partially the token or tokens
    * provided in the query expression. For example, if the search query contains `415-123-45`, the filter selects those
    * customers with phone numbers of `415-123-4567` or `234-151-2345`. The search does not return customers with the
    * phone number of `415-123-4678`. Similarly, if the search query contains `415` as part of the phone number, the
    * search returns those customers with phone numbers of `(415)-123-4567`, `(123) 415-1567`, and `1 (415) 123-4567`.
    */
  var phone_number: js.UndefOr[CustomerTextFilter] = js.native
  
  /**
    * A filter to [select customers by their reference IDs](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#search-by-reference-id).
    * This filter is case insensitive. [Exact matching](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#exact-search-by-reference-id)
    * of a customer's reference ID against a query's reference ID is evaluated as exact match between two strings,
    * character by character in the given order. [Fuzzy matching](https://developer.squareup.com/docs/docs/customers-api/cookbook/search-customers#fuzzy-search-by-reference-id)
    * of stored reference IDs against queried reference IDs works  exactly the same as fuzzy matching on email addresses.
    * Non-alphanumeric characters  are replaced by spaces to tokenize stored and queried reference IDs.
    * A match is found if a tokenized stored reference ID contains all tokens specified in any order in the query.
    * For example, a query of `NYC M` will match customer profiles with the `reference_id` value of `NYC_M_35_JOHNSON` and `NYC_27_MURRAY`.
    */
  var reference_id: js.UndefOr[CustomerTextFilter] = js.native
  
  /**
    * A filter to select customers based on when they were updated.
    */
  var updated_at: js.UndefOr[TimeRange] = js.native
}
