package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICarousel extends IContainer {
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

