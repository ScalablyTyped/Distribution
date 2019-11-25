package typings.shopifyDashPrime.distModelsProductUnderscoreCollectionMod

import typings.shopifyDashPrime.Anon_Attachment
import typings.shopifyDashPrime.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomCollection extends ProductCollection {
  /**
    * Array of products in the collection
    *
    * position - Product position in array
    * product_id - Required when adding a new item
    * id - Required when shifting the position of a product that was previously added to the collection
    */
  var collects: js.Array[Anon_Id]
  /**
    * "key": "new"
    * "value": "newvalue"
    * "value_type": "string"
    * "namespace": "global"
    *
    * Attaches additional metadata to a shop's resources:
    *
    * - key (required): Identifier for the metafield (maximum of 30 characters).
    * - namespace (required): Container for a set of metadata. Namespaces help distinguish between metadata you created and metadata created by another individual with a similar namespace (maximum of 20 characters).
    * - value (required): Information to be stored as metadata.
    * - value_type (required): States whether the information in the value is stored as a 'string' or 'integer.'
    * - description (optional): Additional information about the metafield.
    */
  var metafield: js.UndefOr[String] = js.undefined
  /**
    * States whether the custom collection is visible. Valid values are "true" for visible and "false" for hidden.
    */
  var published: js.UndefOr[Boolean] = js.undefined
}

object CustomCollection {
  @scala.inline
  def apply(
    collects: js.Array[Anon_Id],
    admin_graphql_api_id: String = null,
    body_html: String = null,
    handle: String = null,
    id: Int | Double = null,
    image: Anon_Attachment = null,
    metafield: String = null,
    published: js.UndefOr[Boolean] = js.undefined,
    published_at: String = null,
    published_scope: String = null,
    sort_order: String = null,
    template_suffix: String = null,
    title: String = null,
    updated_at: String = null
  ): CustomCollection = {
    val __obj = js.Dynamic.literal(collects = collects.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (body_html != null) __obj.updateDynamic("body_html")(body_html.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (metafield != null) __obj.updateDynamic("metafield")(metafield.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (published_at != null) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (published_scope != null) __obj.updateDynamic("published_scope")(published_scope.asInstanceOf[js.Any])
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCollection]
  }
}

