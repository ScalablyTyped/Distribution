package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiscrete extends ILayout {
  /** [Method] Processes the data of the series bound to the axis  */
  @JSName("processData")
  var processData_IDiscrete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
  		* @param context Object
  		* @param min Object
  		* @param max Object
  		* @param estStepSize Object
  		*/
  @JSName("snapEnds")
  var snapEnds_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
  		* @param context Object
  		* @param out Object
  		* @param trimMin Object
  		* @param trimMax Object
  		*/
  @JSName("trimByRange")
  var trimByRange_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[js.Any], 
      /* trimMax */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object IDiscrete {
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
    processData: js.Function0[scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
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
      /* trimMin */ js.UndefOr[js.Any], 
      /* trimMax */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IDiscrete = {
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
    __obj.asInstanceOf[IDiscrete]
  }
}

