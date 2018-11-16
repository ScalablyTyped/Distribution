package typings
package senchaUnderscoreTouchLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IToggle extends ISlider {
  /** [Method] Sets the increment configuration
  		* @returns Number
  		*/
  @JSName("applyIncrement")
  var applyIncrement_IToggle: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

