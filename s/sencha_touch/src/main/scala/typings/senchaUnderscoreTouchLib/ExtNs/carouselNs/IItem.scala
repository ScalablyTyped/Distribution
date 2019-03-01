package typings
package senchaUnderscoreTouchLib.ExtNs.carouselNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItem
  extends senchaUnderscoreTouchLib.ExtNs.IDecorator {
  /** [Method] Returns the value of translatable
  		* @returns Boolean
  		*/
  var getTranslatable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Boolean The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    IDecorator: senchaUnderscoreTouchLib.ExtNs.IDecorator = null,
    baseCls: java.lang.String = null,
    component: js.Any = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getComponent: js.Function0[_] = null,
    getTranslatable: js.Function0[scala.Boolean] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setTranslatable: js.Function1[/* translatable */ js.UndefOr[scala.Boolean], scala.Unit] = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDecorator)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(getTranslatable)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(setTranslatable)
    __obj.asInstanceOf[IItem]
  }
}

