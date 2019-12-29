package typings.senchaUnderscoreTouch.Ext.carousel

import typings.senchaUnderscoreTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICarousel extends IContainer {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Method] Returns the index of the currently active card
  		* @returns Number The index of the currently active card.
  		*/
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bufferSize
  		* @returns Number
  		*/
  var getBufferSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of indicator
  		* @returns any
  		*/
  var getIndicator: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemLength
  		* @returns Object
  		*/
  var getItemLength: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true when direction is horizontal
  		* @returns Boolean
  		*/
  var isHorizontal: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true when direction is vertical
  		* @returns Boolean
  		*/
  var isVertical: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Switches to the next card
  		* @returns Ext.carousel.Carousel this
  		*/
  var next: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Switches to the previous card
  		* @returns Ext.carousel.Carousel this
  		*/
  var prev: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Switches to the previous card
  		* @returns Ext.carousel.Carousel this
  		*/
  var previous: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of animation
  		* @param animation Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of bufferSize
  		* @param bufferSize Number The new value.
  		*/
  var setBufferSize: js.UndefOr[js.Function1[/* bufferSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of indicator
  		* @param indicator Boolean The new value.
  		*/
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemLength
  		* @param itemLength Object The new value.
  		*/
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ICarousel {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    direction: String = null,
    getActiveIndex: () => Double = null,
    getAnimation: () => _ = null,
    getBufferSize: () => Double = null,
    getDirection: () => String = null,
    getDirectionLock: () => Boolean = null,
    getIndicator: () => _ = null,
    getItemConfig: () => _ = null,
    getItemLength: () => _ = null,
    indicator: js.UndefOr[Boolean] = js.undefined,
    isHorizontal: () => Boolean = null,
    isVertical: () => Boolean = null,
    next: () => ICarousel = null,
    prev: () => ICarousel = null,
    previous: () => ICarousel = null,
    setAnimation: /* animation */ js.UndefOr[js.Any] => Unit = null,
    setBufferSize: /* bufferSize */ js.UndefOr[Double] => Unit = null,
    setDirection: /* direction */ js.UndefOr[String] => Unit = null,
    setDirectionLock: /* directionLock */ js.UndefOr[Boolean] => Unit = null,
    setIndicator: /* indicator */ js.UndefOr[Boolean] => Unit = null,
    setItemConfig: /* itemConfig */ js.UndefOr[js.Any] => Unit = null,
    setItemLength: /* itemLength */ js.UndefOr[js.Any] => Unit = null
  ): ICarousel = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getActiveIndex != null) __obj.updateDynamic("getActiveIndex")(js.Any.fromFunction0(getActiveIndex))
    if (getAnimation != null) __obj.updateDynamic("getAnimation")(js.Any.fromFunction0(getAnimation))
    if (getBufferSize != null) __obj.updateDynamic("getBufferSize")(js.Any.fromFunction0(getBufferSize))
    if (getDirection != null) __obj.updateDynamic("getDirection")(js.Any.fromFunction0(getDirection))
    if (getDirectionLock != null) __obj.updateDynamic("getDirectionLock")(js.Any.fromFunction0(getDirectionLock))
    if (getIndicator != null) __obj.updateDynamic("getIndicator")(js.Any.fromFunction0(getIndicator))
    if (getItemConfig != null) __obj.updateDynamic("getItemConfig")(js.Any.fromFunction0(getItemConfig))
    if (getItemLength != null) __obj.updateDynamic("getItemLength")(js.Any.fromFunction0(getItemLength))
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (isHorizontal != null) __obj.updateDynamic("isHorizontal")(js.Any.fromFunction0(isHorizontal))
    if (isVertical != null) __obj.updateDynamic("isVertical")(js.Any.fromFunction0(isVertical))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction0(next))
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction0(prev))
    if (previous != null) __obj.updateDynamic("previous")(js.Any.fromFunction0(previous))
    if (setAnimation != null) __obj.updateDynamic("setAnimation")(js.Any.fromFunction1(setAnimation))
    if (setBufferSize != null) __obj.updateDynamic("setBufferSize")(js.Any.fromFunction1(setBufferSize))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (setDirectionLock != null) __obj.updateDynamic("setDirectionLock")(js.Any.fromFunction1(setDirectionLock))
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(js.Any.fromFunction1(setIndicator))
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(js.Any.fromFunction1(setItemConfig))
    if (setItemLength != null) __obj.updateDynamic("setItemLength")(js.Any.fromFunction1(setItemLength))
    __obj.asInstanceOf[ICarousel]
  }
}

