package typings
package shopifyDashPrimeLib.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Product
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The description of the product, complete with HTML formatting.
       */
  var body_html: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the product was created. The API returns this value in ISO 8601 format.
       */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A human-friendly unique string for the Product automatically generated from its title.
       * They are used by the Liquid templating language to refer to objects.
       */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A list of image objects, each one representing an image associated with the product.
       */
  var images: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsProductUnderscoreImageMod.ProductImage]] = js.undefined
  /**
       * The description of the product, to be used for SEO purposes. This will generally be added to the <meta name='description'> tag.
       */
  var metafields_global_description_tag: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the product, to be used for SEO purposes. This will generally be added to the <meta name='title'> tag.
       */
  var metafields_global_title_tag: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Custom product property names like "Size", "Color", and "Material".
       * Products are based on permutations of these options.
       * A product may have a maximum of 3 options. 255 characters limit each.
       */
  var options: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsProductUnderscoreOptionMod.ProductOption]] = js.undefined
  /**
       * A categorization that a product can be tagged with, commonly used for filtering and searching.
       */
  var product_type: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the product was published. The API returns this value in ISO 8601 format.
       * Set to NULL to unpublish a product
       */
  var published_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The sales channels in which the product is visible.
       */
  var published_scope: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A categorization that a product can be tagged with, commonly used for filtering and searching.
       * Each comma-separated tag has a character limit of 255.
       */
  var tags: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The suffix of the liquid template being used.
       * By default, the original template is called product.liquid, without any suffix.
       * Any additional templates will be: product.suffix.liquid.
       */
  var template_suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the product. In a shop's catalog, clicking on a product's title takes you to that product's page.
       * On a product's page, the product's title typically appears in a large font.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the product was last modified. The API returns this value in ISO 8601 format.
       */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A list of variant objects, each one representing a slightly different version of the product.
       * For example, if a product comes in different sizes and colors, each size and color permutation (such as "small black", "medium black", "large blue"), would be a variant.
       * To reorder variants, update the product with the variants in the desired order.The position attribute on the variant will be ignored.
       */
  var variants: js.UndefOr[
    js.Array[shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant]
  ] = js.undefined
  /**
       * The name of the vendor of the product.
       */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

