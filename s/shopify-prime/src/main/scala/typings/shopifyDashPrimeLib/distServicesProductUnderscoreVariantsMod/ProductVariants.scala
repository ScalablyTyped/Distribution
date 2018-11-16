package typings
package shopifyDashPrimeLib.distServicesProductUnderscoreVariantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/product_variants", "ProductVariants")
@js.native
class ProductVariants protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Counts the variants on the given product.
       * @param productId Id of the product that the variants belong to.
       */
  def count(productId: scala.Double): stdLib.Promise[scala.Double] = js.native
  /**
       * Deletes the variant with the given variantId.
       * @param productId Id of the product that the varaint belongs to.
       * @param variantId Id of the variant to delete.
       */
  def delete(productId: scala.Double, variantId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Gets a variant with the given id.
       * @param id Id of the variant being retrieved.
       * @param options Options for filtering the result.
       */
  def get(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant] = js.native
  /**
       * Gets a variant with the given id.
       * @param id Id of the variant being retrieved.
       * @param options Options for filtering the result.
       */
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant] = js.native
  /**
       * Lists up to 250 variants for the given product.
       * @param productId Id of the product that the variants belong to.
       * @param options Options for filtering the results.
       */
  def list(productId: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant] = js.native
  /**
       * Lists up to 250 variants for the given product.
       * @param productId Id of the product that the variants belong to.
       * @param options Options for filtering the results.
       */
  def list(productId: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant] = js.native
  /**
       * Updates an variant with the given id.
       * @param id Id of the variant.
       * @param productVariant The updated variant.
       */
  def update(
    id: scala.Double,
    variant: shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreVariantMod.ProductVariant] = js.native
}

