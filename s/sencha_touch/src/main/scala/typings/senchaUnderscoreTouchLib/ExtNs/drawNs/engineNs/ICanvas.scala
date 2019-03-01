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

object ICanvas {
  @scala.inline
  def apply(
    ISurface: senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface = null,
    clear: js.Function0[scala.Unit] = null,
    clearTransform: js.Function0[scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    getHighPrecision: js.Function0[scala.Boolean] = null,
    highPrecision: js.UndefOr[scala.Boolean] = js.undefined,
    initElement: js.Function0[scala.Unit] = null,
    setHighPrecision: js.Function1[/* highPrecision */ js.UndefOr[scala.Boolean], scala.Unit] = null
  ): ICanvas = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISurface)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clearTransform != null) __obj.updateDynamic("clearTransform")(clearTransform)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getHighPrecision != null) __obj.updateDynamic("getHighPrecision")(getHighPrecision)
    if (!js.isUndefined(highPrecision)) __obj.updateDynamic("highPrecision")(highPrecision)
    if (initElement != null) __obj.updateDynamic("initElement")(initElement)
    if (setHighPrecision != null) __obj.updateDynamic("setHighPrecision")(setHighPrecision)
    __obj.asInstanceOf[ICanvas]
  }
}

