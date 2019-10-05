package typings.senchaUnderscoreTouch.Ext.draw

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmentTree extends IBase {
  /** [Method] Returns the minimum range of data that fits the given range and step size
  		* @param min Number
  		* @param max Number
  		* @param estStep Number
  		* @returns Object The aggregation information.
  		*/
  var getAggregation: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStep */ js.UndefOr[Double], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of strategy
  		* @returns String
  		*/
  var getStrategy: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the data of the segment tree
  		* @param dataX Number
  		* @param dataOpen Number
  		* @param dataHigh Number
  		* @param dataLow Number
  		* @param dataClose Number
  		*/
  var setData: js.UndefOr[
    js.Function5[
      /* dataX */ js.UndefOr[Double], 
      /* dataOpen */ js.UndefOr[Double], 
      /* dataHigh */ js.UndefOr[Double], 
      /* dataLow */ js.UndefOr[Double], 
      /* dataClose */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of strategy
  		* @param strategy String The new value.
  		*/
  var setStrategy: js.UndefOr[js.Function1[/* strategy */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}

object ISegmentTree {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getAggregation: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStep */ js.UndefOr[Double]) => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getStrategy: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setData: (/* dataX */ js.UndefOr[Double], /* dataOpen */ js.UndefOr[Double], /* dataHigh */ js.UndefOr[Double], /* dataLow */ js.UndefOr[Double], /* dataClose */ js.UndefOr[Double]) => Unit = null,
    setStrategy: /* strategy */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ISegmentTree = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAggregation != null) __obj.updateDynamic("getAggregation")(js.Any.fromFunction3(getAggregation))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getStrategy != null) __obj.updateDynamic("getStrategy")(js.Any.fromFunction0(getStrategy))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction5(setData))
    if (setStrategy != null) __obj.updateDynamic("setStrategy")(js.Any.fromFunction1(setStrategy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISegmentTree]
  }
}

