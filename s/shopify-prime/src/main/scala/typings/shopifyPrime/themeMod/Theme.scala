package typings.shopifyPrime.themeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.demo
import typings.shopifyPrime.shopifyPrimeStrings.main
import typings.shopifyPrime.shopifyPrimeStrings.unpublished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends ShopifyObject {
  /**
    * The date and time (ISO 8601 format) when the theme was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The name of the theme.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the theme can currently be previewed.
    */
  var previewable: js.UndefOr[Boolean] = js.native
  /**
    * Whether files are still being copied into place for this theme.
    */
  var processing: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the theme is being used within the shop. Valid values:
    * * main: The theme is published. Customers see it when they visit the online store.
    * * unpublished: The theme is unpublished. Customers can't see it.
    * * demo: The theme is installed on the store as a demo. The theme can't be published until the merchant buys the full version.
    */
  var role: js.UndefOr[main | unpublished | demo] = js.native
  /**
    * A unique identifier applied to Shopify-made themes that are installed from the Shopify Theme Store Theme Store. Not all themes available in the Theme Store are developed by Shopify. Returns null if the store's theme isn't made by Shopify, or if it wasn't installed from the Theme Store.
    */
  var theme_store_id: js.UndefOr[Double | Null] = js.native
  /**
    * The date and time ( ISO 8601 format) when the theme was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Theme {
  @scala.inline
  def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPreviewable(value: Boolean): Self = this.set("previewable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewable: Self = this.set("previewable", js.undefined)
    @scala.inline
    def setProcessing(value: Boolean): Self = this.set("processing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
    @scala.inline
    def setRole(value: main | unpublished | demo): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setTheme_store_id(value: Double): Self = this.set("theme_store_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_store_id: Self = this.set("theme_store_id", js.undefined)
    @scala.inline
    def setTheme_store_idNull: Self = this.set("theme_store_id", null)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

