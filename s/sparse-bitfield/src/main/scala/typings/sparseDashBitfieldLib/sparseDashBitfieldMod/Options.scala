package typings
package sparseDashBitfieldLib.sparseDashBitfieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * An existing bitfield.
    */
  var buffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  /**
    * @default 0
    */
  var pageOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * How big should the partial buffers be.
    * @default 1024
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A pre-configured Pager instance.
    */
  var pages: js.UndefOr[memoryDashPagerLib.memoryDashPagerMod.PagerInstance] = js.undefined
  /**
    * Track when pages are being updated in the pager.
    * @default false
    */
  var trackUpdates: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: nodeLib.Buffer = null,
    pageOffset: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    pages: memoryDashPagerLib.memoryDashPagerMod.PagerInstance = null,
    trackUpdates: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (pageOffset != null) __obj.updateDynamic("pageOffset")(pageOffset.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (!js.isUndefined(trackUpdates)) __obj.updateDynamic("trackUpdates")(trackUpdates)
    __obj.asInstanceOf[Options]
  }
}

