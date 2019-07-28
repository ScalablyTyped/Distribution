package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharpOptions extends js.Object {
  /** Describes a new image to be created. */
  var create: js.UndefOr[Create] = js.undefined
  /** Number representing the DPI for vector images. (optional, default 72) */
  var density: js.UndefOr[Double] = js.undefined
  /**
    * By default halt processing and raise an error when loading invalid images.
    * Set this flag to false if you'd rather apply a "best effort" to decode images,
    * even if the data is corrupt or invalid. (optional, default true)
    * (optional, default true)
    */
  var failOnError: js.UndefOr[Boolean] = js.undefined
  /** Page number to start extracting from for multi-page input (GIF, TIFF, PDF), zero based. (optional, default 0) */
  var page: js.UndefOr[Double] = js.undefined
  /** Number of pages to extract for multi-page input (GIF, TIFF, PDF), use -1 for all pages */
  var pages: js.UndefOr[Double] = js.undefined
  /** Describes raw pixel input image data. See raw() for pixel ordering. */
  var raw: js.UndefOr[Raw] = js.undefined
}

object SharpOptions {
  @scala.inline
  def apply(
    create: Create = null,
    density: Int | Double = null,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    pages: Int | Double = null,
    raw: Raw = null
  ): SharpOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[SharpOptions]
  }
}

