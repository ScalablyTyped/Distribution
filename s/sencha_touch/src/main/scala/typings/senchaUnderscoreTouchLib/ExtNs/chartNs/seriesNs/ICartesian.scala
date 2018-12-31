package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICartesian extends ISeries {
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Object
  		* @param y Object
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  @JSName("getItemForPoint")
  var getItemForPoint_ICartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of xAxis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getXAxis: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis]] = js.undefined
  /** [Method] Returns the value of xField
  		* @returns String
  		*/
  var getXField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of yAxis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getYAxis: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis]] = js.undefined
  /** [Method] Returns the value of yField
  		* @returns String
  		*/
  var getYField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Provide legend information to target array
  		* @param target Object
  		*/
  @JSName("provideLegendInfo")
  var provideLegendInfo_ICartesian: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of xAxis
  		* @param xAxis Ext.chart.axis.Axis The new value.
  		*/
  var setXAxis: js.UndefOr[
    js.Function1[
      /* xAxis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of xField
  		* @param xField String The new value.
  		*/
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of yAxis
  		* @param yAxis Ext.chart.axis.Axis The new value.
  		*/
  var setYAxis: js.UndefOr[
    js.Function1[
      /* yAxis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of yField
  		* @param yField String The new value.
  		*/
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var xAxis: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = js.undefined
  /** [Config Option] (String) */
  var xField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var yAxis: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = js.undefined
  /** [Config Option] (String) */
  var yField: js.UndefOr[java.lang.String] = js.undefined
}

