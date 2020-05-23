package typings.senchaTouch.Ext.navigation

import typings.senchaTouch.Ext.ITitleBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar extends ITitleBar {
  /** [Config Option] (Boolean) */
  var androidAnimation: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IBar: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of androidAnimation
    * @returns Boolean
    */
  var getAndroidAnimation: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of androidAnimation
    * @param androidAnimation Boolean The new value.
    */
  var setAndroidAnimation: js.UndefOr[js.Function1[/* androidAnimation */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IBar {
  @scala.inline
  def apply(
    ITitleBar: ITitleBar = null,
    androidAnimation: js.UndefOr[Boolean] = js.undefined,
    cls: String = null,
    getAndroidAnimation: () => Boolean = null,
    setAndroidAnimation: /* androidAnimation */ js.UndefOr[Boolean] => Unit = null
  ): IBar = {
    val __obj = js.Dynamic.literal()
    if (ITitleBar != null) js.Dynamic.global.Object.assign(__obj, ITitleBar)
    if (!js.isUndefined(androidAnimation)) __obj.updateDynamic("androidAnimation")(androidAnimation.get.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (getAndroidAnimation != null) __obj.updateDynamic("getAndroidAnimation")(js.Any.fromFunction0(getAndroidAnimation))
    if (setAndroidAnimation != null) __obj.updateDynamic("setAndroidAnimation")(js.Any.fromFunction1(setAndroidAnimation))
    __obj.asInstanceOf[IBar]
  }
}

