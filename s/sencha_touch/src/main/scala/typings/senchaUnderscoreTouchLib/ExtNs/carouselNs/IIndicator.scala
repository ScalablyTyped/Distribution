package typings
package senchaUnderscoreTouchLib.ExtNs.carouselNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndicator
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IIndicator {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    baseCls: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getDirection: js.Function0[java.lang.String] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): IIndicator = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDirection != null) __obj.updateDynamic("getDirection")(getDirection)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    __obj.asInstanceOf[IIndicator]
  }
}

