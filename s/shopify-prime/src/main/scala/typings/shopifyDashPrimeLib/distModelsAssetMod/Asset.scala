package typings
package shopifyDashPrimeLib.distModelsAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asset extends js.Object {
  /**
    * A base64-encoded image.
    */
  var attachment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The MIME representation of the content, consisting of the type and subtype of the asset.
    */
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time (ISO 8601 format) when the asset was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * he path to the asset within a theme. It consists of the file's directory and filename. For example, the asset assets/bg-body-green.gif is in the assets directory, so its key is assets/bg-body-green.gif.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The public-facing URL of the asset.
    */
  var public_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The asset size in bytes.
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The ID for the theme that an asset belongs to.
    */
  var theme_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The date and time (ISO 8601 format) when an asset was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text content of the asset, such as the HTML and Liquid markup of a template file.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

