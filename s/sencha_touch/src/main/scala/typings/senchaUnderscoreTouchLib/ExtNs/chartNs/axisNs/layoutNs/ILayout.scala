package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayout
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = js.undefined
  /** [Method] Calculates the position of tick marks for the axis
  		* @param context Object
  		* @returns *
  		*/
  var calculateLayout: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Calculates the position of major ticks for the axis
  		* @param context Object
  		*/
  var calculateMajorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Calculates the position of sub ticks for the axis
  		* @param context Object
  		*/
  var calculateMinorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis]] = js.undefined
  /** [Method] Processes the data of the series bound to the axis
  		* @param series Ext.chart.series.Series The bound series.
  		*/
  var processData: js.UndefOr[
    js.Function1[
      /* series */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.ISeries], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[
    js.Function1[
      /* axis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Number
  		* @param max Number
  		* @param estStepSize Number
  		*/
  var snapEnds: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[scala.Double], 
      /* max */ js.UndefOr[scala.Double], 
      /* estStepSize */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
  		* @param context Object
  		* @param out Object
  		* @param trimMin Number
  		* @param trimMax Number
  		*/
  var trimByRange: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[scala.Double], 
      /* trimMax */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

