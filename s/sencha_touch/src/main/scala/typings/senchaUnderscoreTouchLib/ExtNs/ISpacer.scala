package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpacer extends IComponent {
  /** [Method] Sets the value of width
  		* @param width Number The new value.
  		*/
  @JSName("setWidth")
  var setWidth_ISpacer: js.UndefOr[js.Function1[/* width */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  @JSName("width")
  var width_ISpacer: js.UndefOr[scala.Double] = js.undefined
}

object ISpacer {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    flex: scala.Int | scala.Double = null,
    getFlex: js.Function0[scala.Double] = null,
    setFlex: js.Function1[/* flex */ js.UndefOr[scala.Double], scala.Unit] = null,
    setWidth: js.Function1[/* width */ js.UndefOr[scala.Double], scala.Unit] = null,
    width: scala.Int | scala.Double = null
  ): ISpacer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (getFlex != null) __obj.updateDynamic("getFlex")(getFlex)
    if (setFlex != null) __obj.updateDynamic("setFlex")(setFlex)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpacer]
  }
}

