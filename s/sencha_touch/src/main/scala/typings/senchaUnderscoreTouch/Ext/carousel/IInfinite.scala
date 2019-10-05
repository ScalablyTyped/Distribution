package typings.senchaUnderscoreTouch.Ext.carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfinite
  extends typings.senchaUnderscoreTouch.Ext.carousel.ICarousel {
  /** [Method] Returns the value of innerItemConfig
  		* @returns Object
  		*/
  var getInnerItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxItemIndex
  		* @returns Object
  		*/
  var getMaxItemIndex: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of indicator
  		* @param indicator Object The new value.
  		*/
  @JSName("setIndicator")
  var setIndicator_IInfinite: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of innerItemConfig
  		* @param innerItemConfig Object The new value.
  		*/
  var setInnerItemConfig: js.UndefOr[js.Function1[/* innerItemConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxItemIndex
  		* @param maxItemIndex Object The new value.
  		*/
  var setMaxItemIndex: js.UndefOr[js.Function1[/* maxItemIndex */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IInfinite {
  @scala.inline
  def apply(
    ICarousel: typings.senchaUnderscoreTouch.Ext.carousel.ICarousel = null,
    getIndicator: () => _ = null,
    getInnerItemConfig: () => _ = null,
    getMaxItemIndex: () => _ = null,
    indicator: js.UndefOr[Boolean] = js.undefined,
    setIndicator: /* indicator */ js.UndefOr[js.Any] => Unit = null,
    setInnerItemConfig: /* innerItemConfig */ js.UndefOr[js.Any] => Unit = null,
    setMaxItemIndex: /* maxItemIndex */ js.UndefOr[js.Any] => Unit = null
  ): IInfinite = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICarousel)
    if (getIndicator != null) __obj.updateDynamic("getIndicator")(js.Any.fromFunction0(getIndicator))
    if (getInnerItemConfig != null) __obj.updateDynamic("getInnerItemConfig")(js.Any.fromFunction0(getInnerItemConfig))
    if (getMaxItemIndex != null) __obj.updateDynamic("getMaxItemIndex")(js.Any.fromFunction0(getMaxItemIndex))
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(js.Any.fromFunction1(setIndicator))
    if (setInnerItemConfig != null) __obj.updateDynamic("setInnerItemConfig")(js.Any.fromFunction1(setInnerItemConfig))
    if (setMaxItemIndex != null) __obj.updateDynamic("setMaxItemIndex")(js.Any.fromFunction1(setMaxItemIndex))
    __obj.asInstanceOf[IInfinite]
  }
}

