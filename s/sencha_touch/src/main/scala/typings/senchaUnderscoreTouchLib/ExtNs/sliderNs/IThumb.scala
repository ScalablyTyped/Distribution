package typings
package senchaUnderscoreTouchLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumb
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Object) */
  var draggable: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of draggable
  		* @returns Object
  		*/
  var getDraggable: js.UndefOr[js.Function0[_]] = js.undefined
}

object IThumb {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    baseCls: java.lang.String = null,
    draggable: js.Any = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getDraggable: js.Function0[_] = null,
    initialize: js.Function0[scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDraggable: js.Function1[/* draggable */ js.UndefOr[js.Any], scala.Unit] = null
  ): IThumb = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDraggable != null) __obj.updateDynamic("getDraggable")(getDraggable)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDraggable != null) __obj.updateDynamic("setDraggable")(setDraggable)
    __obj.asInstanceOf[IThumb]
  }
}

