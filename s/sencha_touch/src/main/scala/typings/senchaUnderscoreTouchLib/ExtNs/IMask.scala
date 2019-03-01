package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMask extends IComponent {
  /** [Method] Returns the value of transparent
  		* @returns Boolean
  		*/
  var getTransparent: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Sets the value of transparent
  		* @param transparent Boolean The new value.
  		*/
  var setTransparent: js.UndefOr[js.Function1[/* transparent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
}

object IMask {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    baseCls: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getTransparent: js.Function0[scala.Boolean] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTransparent: js.Function1[/* transparent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined
  ): IMask = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getTransparent != null) __obj.updateDynamic("getTransparent")(getTransparent)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setTransparent != null) __obj.updateDynamic("setTransparent")(setTransparent)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[IMask]
  }
}

