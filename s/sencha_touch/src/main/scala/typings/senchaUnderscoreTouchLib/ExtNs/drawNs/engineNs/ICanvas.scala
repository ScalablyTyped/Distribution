package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICanvas
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface {
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of highPrecision
  		* @returns Boolean
  		*/
  var getHighPrecision: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Initialize the canvas element  */
  var initElement: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of highPrecision
  		* @param highPrecision Boolean The new value.
  		*/
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

