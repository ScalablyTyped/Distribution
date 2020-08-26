package typings.shopifyPrime.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asset extends js.Object {
  /**
    * A base64-encoded image.
    */
  var attachment: js.UndefOr[String] = js.native
  /**
    * The MIME representation of the content, consisting of the type and subtype of the asset.
    */
  var content_type: js.UndefOr[String] = js.native
  /**
    * The date and time (ISO 8601 format) when the asset was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * he path to the asset within a theme. It consists of the file's directory and filename. For example, the asset assets/bg-body-green.gif is in the assets directory, so its key is assets/bg-body-green.gif.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The public-facing URL of the asset.
    */
  var public_url: js.UndefOr[String] = js.native
  /**
    * The asset size in bytes.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * The ID for the theme that an asset belongs to.
    */
  var theme_id: js.UndefOr[Double] = js.native
  /**
    * The date and time (ISO 8601 format) when an asset was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * The text content of the asset, such as the HTML and Liquid markup of a template file.
    */
  var value: js.UndefOr[String] = js.native
}

object Asset {
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
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
    def setAttachment(value: String): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPublic_url(value: String): Self = this.set("public_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic_url: Self = this.set("public_url", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTheme_id(value: Double): Self = this.set("theme_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_id: Self = this.set("theme_id", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

