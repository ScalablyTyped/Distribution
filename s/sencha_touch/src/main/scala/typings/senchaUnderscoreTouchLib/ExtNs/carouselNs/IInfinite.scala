package typings
package senchaUnderscoreTouchLib.ExtNs.carouselNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfinite extends ICarousel {
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
  var setIndicator_IInfinite: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of innerItemConfig
  		* @param innerItemConfig Object The new value.
  		*/
  var setInnerItemConfig: js.UndefOr[js.Function1[/* innerItemConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxItemIndex
  		* @param maxItemIndex Object The new value.
  		*/
  var setMaxItemIndex: js.UndefOr[js.Function1[/* maxItemIndex */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IInfinite {
  @scala.inline
  def apply(
    ICarousel: ICarousel = null,
    getIndicator: js.Function0[_] = null,
    getInnerItemConfig: js.Function0[_] = null,
    getMaxItemIndex: js.Function0[_] = null,
    indicator: js.UndefOr[scala.Boolean] = js.undefined,
    setIndicator: js.Function1[/* indicator */ js.UndefOr[js.Any], scala.Unit] = null,
    setInnerItemConfig: js.Function1[/* innerItemConfig */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxItemIndex: js.Function1[/* maxItemIndex */ js.UndefOr[js.Any], scala.Unit] = null
  ): IInfinite = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICarousel)
    if (getIndicator != null) __obj.updateDynamic("getIndicator")(getIndicator)
    if (getInnerItemConfig != null) __obj.updateDynamic("getInnerItemConfig")(getInnerItemConfig)
    if (getMaxItemIndex != null) __obj.updateDynamic("getMaxItemIndex")(getMaxItemIndex)
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(setIndicator)
    if (setInnerItemConfig != null) __obj.updateDynamic("setInnerItemConfig")(setInnerItemConfig)
    if (setMaxItemIndex != null) __obj.updateDynamic("setMaxItemIndex")(setMaxItemIndex)
    __obj.asInstanceOf[IInfinite]
  }
}

