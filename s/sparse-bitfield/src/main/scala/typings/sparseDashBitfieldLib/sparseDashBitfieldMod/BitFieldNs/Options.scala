package typings
package sparseDashBitfieldLib.sparseDashBitfieldMod.BitFieldNs

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
  var pages: js.UndefOr[memoryDashPagerLib.memoryDashPagerMod.PagerNs.PagerInstance] = js.undefined
  /**
    * Track when pages are being updated in the pager.
    * @default false
    */
  var trackUpdates: js.UndefOr[scala.Boolean] = js.undefined
}

