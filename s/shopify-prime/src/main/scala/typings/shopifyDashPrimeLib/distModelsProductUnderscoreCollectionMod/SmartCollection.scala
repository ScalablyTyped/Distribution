package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartCollection extends ProductCollection {
  /**
    * If false, products must match all of the rules to be included in the collection. If true, products can only match one of the rules.
    */
  var disjunctive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The list of rules that define what products go into the smart collection. Each rule has the following properties:
    *
    * relation:
    * The relationship between the column choice, and the condition.
    * Number relations:
    *
    * greater_than: column value is greater than the condition.
    * less_than: column value is less than the condition.
    * equals: column value is equal to the condition.
    * not_equals: column value is not equal to the condition.
    * Text relations:
    *
    * equals: column value is equal to the condition.
    * not_equals: column value is not equal to the condition.
    * starts_with: column value starts with the condition.
    * ends_with: column value ends with the condition.
    * contains: column value contains the condition.
    * not_contains: column value does not contain the condition.
    * condition:
    * Select products for a collection using a condition. Conditions are either strings or numbers, depending on the relation.
    * column:
    * The properties of a product that can be used to populate a collection.
    *
    * The following columns are restricted to text relations:
    *
    * title: product title.
    * type: product type.
    * vendor: product vendor.
    * variant_title: variant's title.
    * The following columns are restricted to number relations:
    *
    * variant_compare_at_price: compare at price.
    * variant_weight: weight.
    * variant_inventory: inventory stock. Exception: not_equals does not work on variant_inventory.
    * variant_price: product price.
    * The following column is restricted to the equals relation:
    *
    * tag: product tag.
    */
  var rules: js.UndefOr[js.Array[shopifyDashPrimeLib.Anon_Column]] = js.undefined
}

object SmartCollection {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    body_html: java.lang.String = null,
    disjunctive: js.UndefOr[scala.Boolean] = js.undefined,
    handle: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    image: shopifyDashPrimeLib.Anon_Attachment = null,
    published_at: java.lang.String = null,
    published_scope: java.lang.String = null,
    rules: js.Array[shopifyDashPrimeLib.Anon_Column] = null,
    sort_order: java.lang.String = null,
    template_suffix: java.lang.String = null,
    title: java.lang.String = null,
    updated_at: java.lang.String = null
  ): SmartCollection = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (body_html != null) __obj.updateDynamic("body_html")(body_html)
    if (!js.isUndefined(disjunctive)) __obj.updateDynamic("disjunctive")(disjunctive)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (published_at != null) __obj.updateDynamic("published_at")(published_at)
    if (published_scope != null) __obj.updateDynamic("published_scope")(published_scope)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order)
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[SmartCollection]
  }
}

