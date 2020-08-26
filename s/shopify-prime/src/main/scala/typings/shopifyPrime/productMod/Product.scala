package typings.shopifyPrime.productMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.productImageMod.ProductImage
import typings.shopifyPrime.productOptionMod.ProductOption
import typings.shopifyPrime.productVariantMod.ProductVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends ShopifyObject {
  /**
    * The description of the product, complete with HTML formatting.
    */
  var body_html: js.UndefOr[String] = js.native
  /**
    * The date and time when the product was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for the Product automatically generated from its title.
    * They are used by the Liquid templating language to refer to objects.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * A list of image objects, each one representing an image associated with the product.
    */
  var images: js.UndefOr[js.Array[ProductImage]] = js.native
  /**
    * The description of the product, to be used for SEO purposes. This will generally be added to the <meta name='description'> tag.
    */
  var metafields_global_description_tag: js.UndefOr[String] = js.native
  /**
    * The name of the product, to be used for SEO purposes. This will generally be added to the <meta name='title'> tag.
    */
  var metafields_global_title_tag: js.UndefOr[String] = js.native
  /**
    * Custom product property names like "Size", "Color", and "Material".
    * Products are based on permutations of these options.
    * A product may have a maximum of 3 options. 255 characters limit each.
    */
  var options: js.UndefOr[js.Array[ProductOption]] = js.native
  /**
    * A categorization that a product can be tagged with, commonly used for filtering and searching.
    */
  var product_type: js.UndefOr[String] = js.native
  /**
    * The date and time when the product was published. The API returns this value in ISO 8601 format.
    * Set to NULL to unpublish a product
    */
  var published_at: js.UndefOr[String] = js.native
  /**
    * The sales channels in which the product is visible.
    */
  var published_scope: js.UndefOr[String] = js.native
  /**
    * A categorization that a product can be tagged with, commonly used for filtering and searching.
    * Each comma-separated tag has a character limit of 255.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * The suffix of the liquid template being used.
    * By default, the original template is called product.liquid, without any suffix.
    * Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The name of the product. In a shop's catalog, clicking on a product's title takes you to that product's page.
    * On a product's page, the product's title typically appears in a large font.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when the product was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * A list of variant objects, each one representing a slightly different version of the product.
    * For example, if a product comes in different sizes and colors, each size and color permutation (such as "small black", "medium black", "large blue"), would be a variant.
    * To reorder variants, update the product with the variants in the desired order.The position attribute on the variant will be ignored.
    */
  var variants: js.UndefOr[js.Array[ProductVariant]] = js.native
  /**
    * The name of the vendor of the product.
    */
  var vendor: js.UndefOr[String] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setBody_html(value: String): Self = this.set("body_html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_html: Self = this.set("body_html", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setImagesVarargs(value: ProductImage*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[ProductImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setMetafields_global_description_tag(value: String): Self = this.set("metafields_global_description_tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetafields_global_description_tag: Self = this.set("metafields_global_description_tag", js.undefined)
    @scala.inline
    def setMetafields_global_title_tag(value: String): Self = this.set("metafields_global_title_tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetafields_global_title_tag: Self = this.set("metafields_global_title_tag", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: ProductOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[ProductOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setProduct_type(value: String): Self = this.set("product_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_type: Self = this.set("product_type", js.undefined)
    @scala.inline
    def setPublished_at(value: String): Self = this.set("published_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at: Self = this.set("published_at", js.undefined)
    @scala.inline
    def setPublished_scope(value: String): Self = this.set("published_scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_scope: Self = this.set("published_scope", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplate_suffix(value: String): Self = this.set("template_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_suffix: Self = this.set("template_suffix", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setVariantsVarargs(value: ProductVariant*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[ProductVariant]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
  
}

