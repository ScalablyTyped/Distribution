package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClickOptions extends js.Object {
  /** @default MouseButtons.Left */
  var button: js.UndefOr[MouseButtons] = js.undefined
  /** @default 1 */
  var clickCount: js.UndefOr[scala.Double] = js.undefined
  /**
     * Time to wait between mousedown and mouseup in milliseconds.
     * @default 0
     */
  var delay: js.UndefOr[scala.Double] = js.undefined
}

