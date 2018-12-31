package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.cameraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimulator extends IAbstract {
  /** [Method] Allows you to capture a photo
  		* @param options Object
  		*/
  @JSName("capture")
  var capture_ISimulator: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of samples
  		* @returns Array
  		*/
  var getSamples: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Sets the value of samples
  		* @param samples Array The new value.
  		*/
  var setSamples: js.UndefOr[
    js.Function1[/* samples */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

