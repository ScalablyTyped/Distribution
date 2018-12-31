package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.segmenterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmenter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Add step units to the value
  		* @param value * The value to be added.
  		* @param step Number The step of units. Negative value are allowed.
  		* @param unit * The unit.
  		*/
  var add: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[scala.Double], 
      /* unit */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Align value with step of units
  		* @param value * The value to be aligned.
  		* @param step Number The step of units.
  		* @param unit * The unit.
  		* @returns * Aligned value.
  		*/
  var align: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[scala.Double], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = js.undefined
  /** [Method] Returns the difference between the min and max value based on the given unit scale
  		* @param min * The smaller value.
  		* @param max * The larger value.
  		* @param unit * The unit scale. Unit can be any type.
  		* @returns Number The number of units between min and max. It is the minimum n that min + n * unit >= max.
  		*/
  var diff: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Convert from any data into the target type
  		* @param value * The value to convert from
  		* @returns * The converted value.
  		*/
  var from: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis]] = js.undefined
  /** [Method] Given a start point and estimated step size of a range determine the preferred step size
  		* @param start * The start point of range.
  		* @param estStepSize * The estimated step size.
  		* @returns Object Return the step size by an object of step x unit.
  		*/
  var preferredStep: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] This method formats the value
  		* @param value * The value to format.
  		* @param context Object Axis layout context.
  		* @returns String
  		*/
  var renderer: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any], java.lang.String]
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
}

