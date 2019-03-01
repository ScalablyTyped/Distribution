package typings
package senchaUnderscoreTouchLib.ExtNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortableList
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Method] Returns the value of handleSelector
  		* @returns String
  		*/
  var getHandleSelector: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of list
  		* @returns Object
  		*/
  var getList: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of handleSelector
  		* @param handleSelector String The new value.
  		*/
  var setHandleSelector: js.UndefOr[js.Function1[/* handleSelector */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of list
  		* @param list Object The new value.
  		*/
  var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ISortableList {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    getHandleSelector: js.Function0[java.lang.String] = null,
    getList: js.Function0[_] = null,
    setHandleSelector: js.Function1[/* handleSelector */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setList: js.Function1[/* list */ js.UndefOr[js.Any], scala.Unit] = null
  ): ISortableList = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (getHandleSelector != null) __obj.updateDynamic("getHandleSelector")(getHandleSelector)
    if (getList != null) __obj.updateDynamic("getList")(getList)
    if (setHandleSelector != null) __obj.updateDynamic("setHandleSelector")(setHandleSelector)
    if (setList != null) __obj.updateDynamic("setList")(setList)
    __obj.asInstanceOf[ISortableList]
  }
}

