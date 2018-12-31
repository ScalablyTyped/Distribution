package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContinuous extends ILayout {
  /** [Method] Returns the value of adjustMaximumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of adjustMinimumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Sets the value of adjustMaximumByMajorUnit
  		* @param adjustMaximumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMaximumByMajorUnit: js.UndefOr[
    js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of adjustMinimumByMajorUnit
  		* @param adjustMinimumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMinimumByMajorUnit: js.UndefOr[
    js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Object
  		* @param max Object
  		* @param estStepSize Object
  		*/
  @JSName("snapEnds")
  var snapEnds_IContinuous: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

