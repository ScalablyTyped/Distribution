package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.segmenterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends ISegmenter {
  /** [Method] Add step units to the value
  		* @param value Object
  		* @param step Object
  		* @param unit Object
  		*/
  @JSName("add")
  var add_ITime: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Align value with step of units
  		* @param date Object
  		* @param step Object
  		* @param unit Object
  		* @returns * Aligned value.
  		*/
  @JSName("align")
  var align_ITime: js.UndefOr[
    js.Function3[
      /* date */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of step
  		* @returns Object
  		*/
  var getStep: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of step
  		* @param step Object The new value.
  		*/
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var step: js.UndefOr[js.Any] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    add: js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    align: js.Function3[
      /* date */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ] = null,
    alternateClassName: js.Any = null,
    axis: senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    diff: js.Function3[
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      scala.Double
    ] = null,
    extend: java.lang.String = null,
    from: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    getAxis: js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getStep: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    preferredStep: js.Function2[/* min */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _] = null,
    renderer: js.Function2[/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any], java.lang.String] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAxis: js.Function1[
      /* axis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis], 
      scala.Unit
    ] = null,
    setStep: js.Function1[/* step */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    step: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (align != null) __obj.updateDynamic("align")(align)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (diff != null) __obj.updateDynamic("diff")(diff)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (from != null) __obj.updateDynamic("from")(from)
    if (getAxis != null) __obj.updateDynamic("getAxis")(getAxis)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getStep != null) __obj.updateDynamic("getStep")(getStep)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (preferredStep != null) __obj.updateDynamic("preferredStep")(preferredStep)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAxis != null) __obj.updateDynamic("setAxis")(setAxis)
    if (setStep != null) __obj.updateDynamic("setStep")(setStep)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (step != null) __obj.updateDynamic("step")(step)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITime]
  }
}

