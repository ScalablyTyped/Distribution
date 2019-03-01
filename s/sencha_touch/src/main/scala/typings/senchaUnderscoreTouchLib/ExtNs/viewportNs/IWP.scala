package typings
package senchaUnderscoreTouchLib.ExtNs.viewportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWP extends IDefault {
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IWP {
  @scala.inline
  def apply(
    IDefault: IDefault = null,
    getTranslatable: js.Function0[_] = null,
    initialize: js.Function0[scala.Unit] = null,
    setTranslatable: js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit] = null
  ): IWP = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDefault)
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(getTranslatable)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(setTranslatable)
    __obj.asInstanceOf[IWP]
  }
}

