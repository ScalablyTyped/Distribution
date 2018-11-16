package typings
package senchaUnderscoreTouchLib.ExtNs.scrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IScroller
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Config Option] (Number) */
  var acceleration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var directionLock: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var friction: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of initialOffset
  		* @returns Object/Number
  		*/
  var getInitialOffset: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of momentumEasing
  		* @returns Object
  		*/
  var getMomentumEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slotSnapEasing
  		* @returns Object
  		*/
  var getSlotSnapEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slotSnapSize
  		* @returns Number/Object
  		*/
  var getSlotSnapSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object/Number) */
  var initialOffset: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if a specified axis is enabled
  		* @param axis String The axis to check (x or y).
  		* @returns Boolean true if the axis is enabled.
  		*/
  var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Config Option] (Object) */
  var momentumEasing: js.UndefOr[js.Any] = js.undefined
  /** [Method] Change the scroll offset by the given amount
  		* @param x Number The offset to scroll by on the x axis.
  		* @param y Number The offset to scroll by on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls to the given location
  		* @param x Number The scroll position on the x axis.
  		* @param y Number The scroll position on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollTo: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls to the end of the scrollable view
  		* @param animation Object
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of initialOffset
  		* @param initialOffset Object/Number The new value.
  		*/
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of momentumEasing
  		* @param momentumEasing Object The new value.
  		*/
  var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the offset of this scroller
  		* @param offset Object The offset to move to.
  		* @returns Ext.scroll.Scroller this
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of slotSnapEasing
  		* @param slotSnapEasing Object The new value.
  		*/
  var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of slotSnapSize
  		* @param slotSnapSize Number/Object The new value.
  		*/
  var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number/Object) */
  var slotSnapSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the boundary information for this scroller
  		* @returns Ext.scroll.Scroller this
  		*/
  var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.undefined
}

