package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.ISlider {
  /** [Config Option] (String) */
  var activeLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IToggle: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of activeLabel
  		* @returns String
  		*/
  var getActiveLabel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of inactiveLabel
  		* @returns String
  		*/
  var getInactiveLabel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var inactiveLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of activeLabel
  		* @param activeLabel String The new value.
  		*/
  var setActiveLabel: js.UndefOr[js.Function1[/* activeLabel */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of inactiveLabel
  		* @param inactiveLabel String The new value.
  		*/
  var setInactiveLabel: js.UndefOr[js.Function1[/* inactiveLabel */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of the toggle
  		* @param newValue Number 1 for toggled, 0 for untoggled.
  		* @returns Object this
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Toggles the value of this toggle field
  		* @returns Object this
  		*/
  var toggle: js.UndefOr[js.Function0[_]] = js.undefined
}

