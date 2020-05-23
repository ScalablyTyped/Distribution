package typings.shopifyPrime.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asset extends js.Object {
  /**
    * A base64-encoded image.
    */
  var attachment: js.UndefOr[String] = js.undefined
  /**
    * The MIME representation of the content, consisting of the type and subtype of the asset.
    */
  var content_type: js.UndefOr[String] = js.undefined
  /**
    * The date and time (ISO 8601 format) when the asset was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * he path to the asset within a theme. It consists of the file's directory and filename. For example, the asset assets/bg-body-green.gif is in the assets directory, so its key is assets/bg-body-green.gif.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The public-facing URL of the asset.
    */
  var public_url: js.UndefOr[String] = js.undefined
  /**
    * The asset size in bytes.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * The ID for the theme that an asset belongs to.
    */
  var theme_id: js.UndefOr[Double] = js.undefined
  /**
    * The date and time (ISO 8601 format) when an asset was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * The text content of the asset, such as the HTML and Liquid markup of a template file.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Asset {
  @scala.inline
  def apply(
    attachment: String = null,
    content_type: String = null,
    created_at: String = null,
    key: String = null,
    public_url: String = null,
    size: js.UndefOr[Double] = js.undefined,
    theme_id: js.UndefOr[Double] = js.undefined,
    updated_at: String = null,
    value: String = null
  ): Asset = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (public_url != null) __obj.updateDynamic("public_url")(public_url.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(theme_id)) __obj.updateDynamic("theme_id")(theme_id.get.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
}

