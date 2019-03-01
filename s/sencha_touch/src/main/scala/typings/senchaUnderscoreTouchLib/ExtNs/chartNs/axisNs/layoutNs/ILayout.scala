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

object ILayout {
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
    setAxis: js.Function1[
      /* axis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    snapEnds: js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[scala.Double], 
      /* max */ js.UndefOr[scala.Double], 
      /* estStepSize */ js.UndefOr[scala.Double], 
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
  ): ILayout = {
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
    if (getAxis != null) __obj.updateDynamic("getAxis")(getAxis)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processData != null) __obj.updateDynamic("processData")(processData)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAxis != null) __obj.updateDynamic("setAxis")(setAxis)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (snapEnds != null) __obj.updateDynamic("snapEnds")(snapEnds)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (trimByRange != null) __obj.updateDynamic("trimByRange")(trimByRange)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILayout]
  }
}

