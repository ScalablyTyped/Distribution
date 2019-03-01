package typings
package senchaUnderscoreTouchLib.ExtNs.viewportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAndroid extends IDefault {
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IAndroid {
  @scala.inline
  def apply(
    IDefault: IDefault = null,
    getTranslatable: js.Function0[_] = null,
    getWindowHeight: js.Function0[scala.Double] = null,
    getWindowWidth: js.Function0[scala.Double] = null,
    setTranslatable: js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit] = null
  ): IAndroid = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDefault)
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(getTranslatable)
    if (getWindowHeight != null) __obj.updateDynamic("getWindowHeight")(getWindowHeight)
    if (getWindowWidth != null) __obj.updateDynamic("getWindowWidth")(getWindowWidth)
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(setTranslatable)
    __obj.asInstanceOf[IAndroid]
  }
}

