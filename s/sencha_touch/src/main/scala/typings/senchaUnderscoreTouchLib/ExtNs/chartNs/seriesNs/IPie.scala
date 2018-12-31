package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPie extends IPolar {
  /** [Config Option] (Number) */
  var Allows: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of donut
  		* @returns Boolean/Number
  		*/
  var getDonut: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the pie slice for a given angle
  		* @param angle Number The angle to search for the slice
  		* @returns Object An object containing the reocord, sprite, scope etc.
  		*/
  var getItemForAngle: js.UndefOr[js.Function1[/* angle */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Object
  		* @param y Object
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  @JSName("getItemForPoint")
  var getItemForPoint_IPie: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of labelField
  		* @returns String
  		*/
  @JSName("getLabelField")
  var getLabelField_IPie: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of totalAngle
  		* @returns Number
  		*/
  var getTotalAngle: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IPie: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  @JSName("labelField")
  var labelField_IPie: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Provide legend information to target array
  		* @param target Object
  		*/
  @JSName("provideLegendInfo")
  var provideLegendInfo_IPie: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of donut
  		* @param donut Boolean/Number The new value.
  		*/
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Array The new value.
  		*/
  @JSName("setHidden")
  var setHidden_IPie: js.UndefOr[
    js.Function1[/* hidden */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of labelField
  		* @param labelField String The new value.
  		*/
  @JSName("setLabelField")
  var setLabelField_IPie: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalAngle
  		* @param totalAngle Number The new value.
  		*/
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var totalAngle: js.UndefOr[scala.Double] = js.undefined
}

