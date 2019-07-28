package typings.senchaUnderscoreTouch.ExtNs.viewportNs

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
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IAndroid {
  @scala.inline
  def apply(
    IDefault: IDefault = null,
    getTranslatable: () => _ = null,
    getWindowHeight: () => Double = null,
    getWindowWidth: () => Double = null,
    setTranslatable: /* translatable */ js.UndefOr[js.Any] => Unit = null
  ): IAndroid = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDefault)
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(js.Any.fromFunction0(getTranslatable))
    if (getWindowHeight != null) __obj.updateDynamic("getWindowHeight")(js.Any.fromFunction0(getWindowHeight))
    if (getWindowWidth != null) __obj.updateDynamic("getWindowWidth")(js.Any.fromFunction0(getWindowWidth))
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(js.Any.fromFunction1(setTranslatable))
    __obj.asInstanceOf[IAndroid]
  }
}

