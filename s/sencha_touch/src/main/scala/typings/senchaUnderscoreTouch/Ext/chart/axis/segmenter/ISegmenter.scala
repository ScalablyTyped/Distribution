package typings.senchaUnderscoreTouch.Ext.chart.axis.segmenter

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmenter extends IBase {
  /** [Method] Add step units to the value
  		* @param value * The value to be added.
  		* @param step Number The step of units. Negative value are allowed.
  		* @param unit * The unit.
  		*/
  var add: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[Double], 
      /* unit */ js.UndefOr[js.Any], 
      Unit
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
      /* step */ js.UndefOr[Double], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[IAxis] = js.undefined
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
      Double
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
  var getAxis: js.UndefOr[js.Function0[IAxis]] = js.undefined
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
    js.Function2[/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any], String]
  ] = js.undefined
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.undefined
}

object ISegmenter {
  @scala.inline
  def apply(
    add: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    align: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => _ = null,
    alternateClassName: js.Any = null,
    axis: IAxis = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    diff: (/* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Double = null,
    extend: String = null,
    from: /* value */ js.UndefOr[js.Any] => _ = null,
    getAxis: () => IAxis = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    preferredStep: (/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => _ = null,
    renderer: (/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any]) => String = null,
    self: IClass = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ISegmenter = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction3(add))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(js.Any.fromFunction3(align))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (diff != null) __obj.updateDynamic("diff")(js.Any.fromFunction3(diff))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(js.Any.fromFunction1(from))
    if (getAxis != null) __obj.updateDynamic("getAxis")(js.Any.fromFunction0(getAxis))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (preferredStep != null) __obj.updateDynamic("preferredStep")(js.Any.fromFunction2(preferredStep))
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction2(renderer))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1(setAxis))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISegmenter]
  }
}

