package typings.sharp.mod

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
  /**
    * Do not process input images where the number of pixels (width x height) exceeds this limit.
    * Assumes image dimensions contained in the input metadata can be trusted.
    * An integral Number of pixels, zero or false to remove limit, true to use default limit of 268402689 (0x3FFF x 0x3FFF). (optional, default 268402689)
    */
  var limitInputPixels: js.UndefOr[Double | Boolean] = js.undefined
  /** Page number to start extracting from for multi-page input (GIF, TIFF, PDF), zero based. (optional, default 0) */
  var page: js.UndefOr[Double] = js.undefined
  /** Number of pages to extract for multi-page input (GIF, TIFF, PDF), use -1 for all pages */
  var pages: js.UndefOr[Double] = js.undefined
  /** Describes raw pixel input image data. See raw() for pixel ordering. */
  var raw: js.UndefOr[Raw] = js.undefined
  /** Set this to true to use sequential rather than random access where possible. This can reduce memory usage and might improve performance on some systems. (optional, default false) */
  var sequentialRead: js.UndefOr[Boolean] = js.undefined
}

object SharpOptions {
  @scala.inline
  def apply(
    create: Create = null,
    density: js.UndefOr[Double] = js.undefined,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    limitInputPixels: Double | Boolean = null,
    page: js.UndefOr[Double] = js.undefined,
    pages: js.UndefOr[Double] = js.undefined,
    raw: Raw = null,
    sequentialRead: js.UndefOr[Boolean] = js.undefined
  ): SharpOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (!js.isUndefined(density)) __obj.updateDynamic("density")(density.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError.get.asInstanceOf[js.Any])
    if (limitInputPixels != null) __obj.updateDynamic("limitInputPixels")(limitInputPixels.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pages)) __obj.updateDynamic("pages")(pages.get.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(sequentialRead)) __obj.updateDynamic("sequentialRead")(sequentialRead.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharpOptions]
  }
}

