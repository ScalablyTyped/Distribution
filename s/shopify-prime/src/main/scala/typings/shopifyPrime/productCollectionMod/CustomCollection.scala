package typings.shopifyPrime.productCollectionMod

import typings.shopifyPrime.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomCollection extends ProductCollection {
  /**
    * Array of products in the collection
    *
    * position - Product position in array
    * product_id - Required when adding a new item
    * id - Required when shifting the position of a product that was previously added to the collection
    */
  var collects: js.Array[Id] = js.native
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
  var metafield: js.UndefOr[String] = js.native
  /**
    * States whether the custom collection is visible. Valid values are "true" for visible and "false" for hidden.
    */
  var published: js.UndefOr[Boolean] = js.native
}

object CustomCollection {
  @scala.inline
  def apply(collects: js.Array[Id]): CustomCollection = {
    val __obj = js.Dynamic.literal(collects = collects.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCollection]
  }
  @scala.inline
  implicit class CustomCollectionOps[Self <: CustomCollection] (val x: Self) extends AnyVal {
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
    def setCollectsVarargs(value: Id*): Self = this.set("collects", js.Array(value :_*))
    @scala.inline
    def setCollects(value: js.Array[Id]): Self = this.set("collects", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetafield(value: String): Self = this.set("metafield", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetafield: Self = this.set("metafield", js.undefined)
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
  }
  
}

