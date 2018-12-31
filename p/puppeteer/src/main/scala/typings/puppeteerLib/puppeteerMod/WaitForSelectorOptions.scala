package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptions extends Timeoutable {
  /**
    * Wait for element to not be found in the DOM or to be hidden,
    * i.e. have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Wait for element to be present in DOM and to be visible,
    * i.e. to not have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

