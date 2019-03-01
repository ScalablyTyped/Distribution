package typings
package senchaUnderscoreTouchLib.ExtNs.carouselNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICarousel
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the index of the currently active card
  		* @returns Number The index of the currently active card.
  		*/
  var getActiveIndex: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bufferSize
  		* @returns Number
  		*/
  var getBufferSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var indicator: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true when direction is horizontal
  		* @returns Boolean
  		*/
  var isHorizontal: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true when direction is vertical
  		* @returns Boolean
  		*/
  var isVertical: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of bufferSize
  		* @param bufferSize Number The new value.
  		*/
  var setBufferSize: js.UndefOr[js.Function1[/* bufferSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of indicator
  		* @param indicator Boolean The new value.
  		*/
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemLength
  		* @param itemLength Object The new value.
  		*/
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ICarousel {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    baseCls: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    direction: java.lang.String = null,
    getActiveIndex: js.Function0[scala.Double] = null,
    getAnimation: js.Function0[_] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getBufferSize: js.Function0[scala.Double] = null,
    getDirection: js.Function0[java.lang.String] = null,
    getDirectionLock: js.Function0[scala.Boolean] = null,
    getIndicator: js.Function0[_] = null,
    getItemConfig: js.Function0[_] = null,
    getItemLength: js.Function0[_] = null,
    getUi: js.Function0[java.lang.String] = null,
    indicator: js.UndefOr[scala.Boolean] = js.undefined,
    isHorizontal: js.Function0[scala.Boolean] = null,
    isVertical: js.Function0[scala.Boolean] = null,
    next: js.Function0[ICarousel] = null,
    prev: js.Function0[ICarousel] = null,
    previous: js.Function0[ICarousel] = null,
    setAnimation: js.Function1[/* animation */ js.UndefOr[js.Any], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBufferSize: js.Function1[/* bufferSize */ js.UndefOr[scala.Double], scala.Unit] = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDirectionLock: js.Function1[/* directionLock */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setIndicator: js.Function1[/* indicator */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setItemConfig: js.Function1[/* itemConfig */ js.UndefOr[js.Any], scala.Unit] = null,
    setItemLength: js.Function1[/* itemLength */ js.UndefOr[js.Any], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    ui: java.lang.String = null
  ): ICarousel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (getActiveIndex != null) __obj.updateDynamic("getActiveIndex")(getActiveIndex)
    if (getAnimation != null) __obj.updateDynamic("getAnimation")(getAnimation)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getBufferSize != null) __obj.updateDynamic("getBufferSize")(getBufferSize)
    if (getDirection != null) __obj.updateDynamic("getDirection")(getDirection)
    if (getDirectionLock != null) __obj.updateDynamic("getDirectionLock")(getDirectionLock)
    if (getIndicator != null) __obj.updateDynamic("getIndicator")(getIndicator)
    if (getItemConfig != null) __obj.updateDynamic("getItemConfig")(getItemConfig)
    if (getItemLength != null) __obj.updateDynamic("getItemLength")(getItemLength)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (isHorizontal != null) __obj.updateDynamic("isHorizontal")(isHorizontal)
    if (isVertical != null) __obj.updateDynamic("isVertical")(isVertical)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (setAnimation != null) __obj.updateDynamic("setAnimation")(setAnimation)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setBufferSize != null) __obj.updateDynamic("setBufferSize")(setBufferSize)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (setDirectionLock != null) __obj.updateDynamic("setDirectionLock")(setDirectionLock)
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(setIndicator)
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(setItemConfig)
    if (setItemLength != null) __obj.updateDynamic("setItemLength")(setItemLength)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ICarousel]
  }
}

