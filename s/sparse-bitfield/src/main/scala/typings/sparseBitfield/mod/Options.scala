package typings.sparseBitfield.mod

import typings.memoryPager.mod.PagerInstance
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * An existing bitfield.
    */
  var buffer: js.UndefOr[Buffer] = js.undefined
  /**
    * @default 0
    */
  var pageOffset: js.UndefOr[Double] = js.undefined
  /**
    * How big should the partial buffers be.
    * @default 1024
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * A pre-configured Pager instance.
    */
  var pages: js.UndefOr[PagerInstance] = js.undefined
  /**
    * Track when pages are being updated in the pager.
    * @default false
    */
  var trackUpdates: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: Buffer = null,
    pageOffset: Int | Double = null,
    pageSize: Int | Double = null,
    pages: PagerInstance = null,
    trackUpdates: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (pageOffset != null) __obj.updateDynamic("pageOffset")(pageOffset.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (!js.isUndefined(trackUpdates)) __obj.updateDynamic("trackUpdates")(trackUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

