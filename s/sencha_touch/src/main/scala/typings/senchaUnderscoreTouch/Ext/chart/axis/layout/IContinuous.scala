package typings.senchaUnderscoreTouch.Ext.chart.axis.layout

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.chart.axis.IAxis
import typings.senchaUnderscoreTouch.Ext.chart.series.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContinuous extends ILayout {
  /** [Method] Returns the value of adjustMaximumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of adjustMinimumByMajorUnit
  		* @returns Boolean
  		*/
  var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of adjustMaximumByMajorUnit
  		* @param adjustMaximumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMaximumByMajorUnit: js.UndefOr[js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of adjustMinimumByMajorUnit
  		* @param adjustMinimumByMajorUnit Boolean The new value.
  		*/
  var setAdjustMinimumByMajorUnit: js.UndefOr[js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.undefined
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
      Unit
    ]
  ] = js.undefined
}

object IContinuous {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    axis: IAxis = null,
    calculateLayout: /* context */ js.UndefOr[js.Any] => _ = null,
    calculateMajorTicks: /* context */ js.UndefOr[js.Any] => Unit = null,
    calculateMinorTicks: /* context */ js.UndefOr[js.Any] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getAdjustMaximumByMajorUnit: () => Boolean = null,
    getAdjustMinimumByMajorUnit: () => Boolean = null,
    getAxis: () => IAxis = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    processData: /* series */ js.UndefOr[ISeries] => Unit = null,
    self: IClass = null,
    setAdjustMaximumByMajorUnit: /* adjustMaximumByMajorUnit */ js.UndefOr[Boolean] => Unit = null,
    setAdjustMinimumByMajorUnit: /* adjustMinimumByMajorUnit */ js.UndefOr[Boolean] => Unit = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapEnds: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Unit = null,
    statics: js.Any = null,
    trimByRange: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Unit = null,
    uses: Array = null
  ): IContinuous = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (calculateLayout != null) __obj.updateDynamic("calculateLayout")(js.Any.fromFunction1(calculateLayout))
    if (calculateMajorTicks != null) __obj.updateDynamic("calculateMajorTicks")(js.Any.fromFunction1(calculateMajorTicks))
    if (calculateMinorTicks != null) __obj.updateDynamic("calculateMinorTicks")(js.Any.fromFunction1(calculateMinorTicks))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAdjustMaximumByMajorUnit != null) __obj.updateDynamic("getAdjustMaximumByMajorUnit")(js.Any.fromFunction0(getAdjustMaximumByMajorUnit))
    if (getAdjustMinimumByMajorUnit != null) __obj.updateDynamic("getAdjustMinimumByMajorUnit")(js.Any.fromFunction0(getAdjustMinimumByMajorUnit))
    if (getAxis != null) __obj.updateDynamic("getAxis")(js.Any.fromFunction0(getAxis))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processData != null) __obj.updateDynamic("processData")(js.Any.fromFunction1(processData))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAdjustMaximumByMajorUnit != null) __obj.updateDynamic("setAdjustMaximumByMajorUnit")(js.Any.fromFunction1(setAdjustMaximumByMajorUnit))
    if (setAdjustMinimumByMajorUnit != null) __obj.updateDynamic("setAdjustMinimumByMajorUnit")(js.Any.fromFunction1(setAdjustMinimumByMajorUnit))
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1(setAxis))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (snapEnds != null) __obj.updateDynamic("snapEnds")(js.Any.fromFunction4(snapEnds))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (trimByRange != null) __obj.updateDynamic("trimByRange")(js.Any.fromFunction4(trimByRange))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IContinuous]
  }
}

