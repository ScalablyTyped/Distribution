package typings
package senchaUnderscoreTouchLib.ExtNs.eventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDom extends js.Object {
  /** [Property] (Number) */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Gets the x coordinate of the event
  		* @returns Number
  		*/
  var getPageX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the y coordinate of the event
  		* @returns Number
  		*/
  var getPageY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the target for the event
  		* @param selector String A simple selector to filter the target or look for an ancestor of the target
  		* @param maxDepth Number/Mixed The max depth to search as a number or element (defaults to 10 || document.body)
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement
  		*/
  var getTarget: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[java.lang.String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[scala.Boolean], 
      stdLib.HTMLElement
    ]
  ] = js.undefined
  /** [Method] Returns the time of the event
  		* @returns Date
  		*/
  var getTime: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the X and Y coordinates of the event
  		* @returns Array
  		*/
  var getXY: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Property] (Number) */
  var pageX: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var pageY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Prevents the browsers default handling of the event  */
  var preventDefault: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (HTMLElement) */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object IDom {
  @scala.inline
  def apply(
    distance: scala.Int | scala.Double = null,
    getPageX: () => scala.Double = null,
    getPageY: () => scala.Double = null,
    getTarget: (/* selector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[scala.Boolean]) => stdLib.HTMLElement = null,
    getTime: () => _ = null,
    getXY: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    preventDefault: () => scala.Unit = null,
    target: stdLib.HTMLElement = null
  ): IDom = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (getPageX != null) __obj.updateDynamic("getPageX")(js.Any.fromFunction0(getPageX))
    if (getPageY != null) __obj.updateDynamic("getPageY")(js.Any.fromFunction0(getPageY))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction3(getTarget))
    if (getTime != null) __obj.updateDynamic("getTime")(js.Any.fromFunction0(getTime))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IDom]
  }
}

