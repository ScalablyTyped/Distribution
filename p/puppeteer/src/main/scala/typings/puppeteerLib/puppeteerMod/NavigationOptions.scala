package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationOptions extends Timeoutable {
  /**
     * When to consider navigation succeeded.
     * @default load Navigation is consider when the `load` event is fired.
     */
  var waitUntil: js.UndefOr[LoadEvent | js.Array[LoadEvent]] = js.undefined
}

