package typings.shopifyPrime.productCollectionMod

import typings.shopifyPrime.anon.Attachment
import typings.shopifyPrime.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartCollection extends ProductCollection {
  /**
    * If false, products must match all of the rules to be included in the collection. If true, products can only match one of the rules.
    */
  var disjunctive: js.UndefOr[Boolean] = js.undefined
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
  var rules: js.UndefOr[js.Array[Column]] = js.undefined
}

object SmartCollection {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    body_html: String = null,
    disjunctive: js.UndefOr[Boolean] = js.undefined,
    handle: String = null,
    id: js.UndefOr[Double] = js.undefined,
    image: Attachment = null,
    published_at: String = null,
    published_scope: String = null,
    rules: js.Array[Column] = null,
    sort_order: String = null,
    template_suffix: String = null,
    title: String = null,
    updated_at: String = null
  ): SmartCollection = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (body_html != null) __obj.updateDynamic("body_html")(body_html.asInstanceOf[js.Any])
    if (!js.isUndefined(disjunctive)) __obj.updateDynamic("disjunctive")(disjunctive.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (published_at != null) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (published_scope != null) __obj.updateDynamic("published_scope")(published_scope.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCollection]
  }
}

