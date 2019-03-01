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

object IContinuous {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    axis: senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    calculateLayout: js.Function1[/* context */ js.UndefOr[js.Any], _] = null,
    calculateMajorTicks: js.Function1[/* context */ js.UndefOr[js.Any], scala.Unit] = null,
    calculateMinorTicks: js.Function1[/* context */ js.UndefOr[js.Any], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getAdjustMaximumByMajorUnit: js.Function0[scala.Boolean] = null,
    getAdjustMinimumByMajorUnit: js.Function0[scala.Boolean] = null,
    getAxis: js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    processData: js.Function1[
      /* series */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.ISeries], 
      scala.Unit
    ] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAdjustMaximumByMajorUnit: js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAdjustMinimumByMajorUnit: js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAxis: js.Function1[
      /* axis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    snapEnds: js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    statics: js.Any = null,
    trimByRange: js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[scala.Double], 
      /* trimMax */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IContinuous = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (calculateLayout != null) __obj.updateDynamic("calculateLayout")(calculateLayout)
    if (calculateMajorTicks != null) __obj.updateDynamic("calculateMajorTicks")(calculateMajorTicks)
    if (calculateMinorTicks != null) __obj.updateDynamic("calculateMinorTicks")(calculateMinorTicks)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAdjustMaximumByMajorUnit != null) __obj.updateDynamic("getAdjustMaximumByMajorUnit")(getAdjustMaximumByMajorUnit)
    if (getAdjustMinimumByMajorUnit != null) __obj.updateDynamic("getAdjustMinimumByMajorUnit")(getAdjustMinimumByMajorUnit)
    if (getAxis != null) __obj.updateDynamic("getAxis")(getAxis)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processData != null) __obj.updateDynamic("processData")(processData)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAdjustMaximumByMajorUnit != null) __obj.updateDynamic("setAdjustMaximumByMajorUnit")(setAdjustMaximumByMajorUnit)
    if (setAdjustMinimumByMajorUnit != null) __obj.updateDynamic("setAdjustMinimumByMajorUnit")(setAdjustMinimumByMajorUnit)
    if (setAxis != null) __obj.updateDynamic("setAxis")(setAxis)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (snapEnds != null) __obj.updateDynamic("snapEnds")(snapEnds)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (trimByRange != null) __obj.updateDynamic("trimByRange")(trimByRange)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IContinuous]
  }
}

