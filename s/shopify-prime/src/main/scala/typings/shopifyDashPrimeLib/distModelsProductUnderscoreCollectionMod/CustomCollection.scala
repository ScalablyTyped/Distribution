package typings
package shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod

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
  var collects: js.Array[shopifyDashPrimeLib.Anon_Id]
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
  var metafield: js.UndefOr[java.lang.String] = js.undefined
  /**
    * States whether the custom collection is visible. Valid values are "true" for visible and "false" for hidden.
    */
  var published: js.UndefOr[scala.Boolean] = js.undefined
}

object CustomCollection {
  @scala.inline
  def apply(
    collects: js.Array[shopifyDashPrimeLib.Anon_Id],
    admin_graphql_api_id: java.lang.String = null,
    body_html: java.lang.String = null,
    handle: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    image: shopifyDashPrimeLib.Anon_Attachment = null,
    metafield: java.lang.String = null,
    published: js.UndefOr[scala.Boolean] = js.undefined,
    published_at: java.lang.String = null,
    published_scope: java.lang.String = null,
    sort_order: java.lang.String = null,
    template_suffix: java.lang.String = null,
    title: java.lang.String = null,
    updated_at: java.lang.String = null
  ): CustomCollection = {
    val __obj = js.Dynamic.literal(collects = collects)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (body_html != null) __obj.updateDynamic("body_html")(body_html)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (metafield != null) __obj.updateDynamic("metafield")(metafield)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    if (published_at != null) __obj.updateDynamic("published_at")(published_at)
    if (published_scope != null) __obj.updateDynamic("published_scope")(published_scope)
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order)
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[CustomCollection]
  }
}

