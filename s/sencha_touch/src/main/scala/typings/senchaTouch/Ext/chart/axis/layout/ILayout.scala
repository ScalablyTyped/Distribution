package typings.senchaTouch.Ext.chart.axis.layout

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.chart.axis.IAxis
import typings.senchaTouch.Ext.chart.series.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayout extends IBase {
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[IAxis] = js.undefined
  /** [Method] Calculates the position of tick marks for the axis
    * @param context Object
    * @returns *
    */
  var calculateLayout: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Calculates the position of major ticks for the axis
    * @param context Object
    */
  var calculateMajorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Calculates the position of sub ticks for the axis
    * @param context Object
    */
  var calculateMinorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of axis
    * @returns Ext.chart.axis.Axis
    */
  var getAxis: js.UndefOr[js.Function0[IAxis]] = js.undefined
  /** [Method] Processes the data of the series bound to the axis
    * @param series Ext.chart.series.Series The bound series.
    */
  var processData: js.UndefOr[js.Function1[/* series */ js.UndefOr[ISeries], Unit]] = js.undefined
  /** [Method] Sets the value of axis
    * @param axis Ext.chart.axis.Axis The new value.
    */
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.undefined
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
    * @param context Object
    * @param min Number
    * @param max Number
    * @param estStepSize Number
    */
  var snapEnds: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStepSize */ js.UndefOr[Double], 
      Unit
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
      /* trimMin */ js.UndefOr[Double], 
      /* trimMax */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
}

object ILayout {
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
    extend: String = null,
    getAxis: () => IAxis = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    processData: /* series */ js.UndefOr[ISeries] => Unit = null,
    self: IClass = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapEnds: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStepSize */ js.UndefOr[Double]) => Unit = null,
    statics: js.Any = null,
    trimByRange: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Unit = null,
    uses: Array = null
  ): ILayout = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (calculateLayout != null) __obj.updateDynamic("calculateLayout")(js.Any.fromFunction1(calculateLayout))
    if (calculateMajorTicks != null) __obj.updateDynamic("calculateMajorTicks")(js.Any.fromFunction1(calculateMajorTicks))
    if (calculateMinorTicks != null) __obj.updateDynamic("calculateMinorTicks")(js.Any.fromFunction1(calculateMinorTicks))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAxis != null) __obj.updateDynamic("getAxis")(js.Any.fromFunction0(getAxis))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (processData != null) __obj.updateDynamic("processData")(js.Any.fromFunction1(processData))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1(setAxis))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (snapEnds != null) __obj.updateDynamic("snapEnds")(js.Any.fromFunction4(snapEnds))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (trimByRange != null) __obj.updateDynamic("trimByRange")(js.Any.fromFunction4(trimByRange))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayout]
  }
}

