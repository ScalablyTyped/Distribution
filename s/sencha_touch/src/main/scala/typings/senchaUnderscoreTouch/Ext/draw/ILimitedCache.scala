package typings.senchaUnderscoreTouch.Ext.draw

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILimitedCache extends IBase {
  /** [Method] Clear all the objects  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var feeder: js.UndefOr[js.Any] = js.undefined
  /** [Method] Get a cached object
  		* @param id String
  		* @param args Mixed... Arguments appended to feeder.
  		* @returns Object
  		*/
  var get: js.UndefOr[js.Function2[/* id */ java.lang.String, /* repeated */ js.Any, _]] = js.undefined
  /** [Method] Returns the value of feeder
  		* @returns Function
  		*/
  var getFeeder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of limit
  		* @returns Number
  		*/
  var getLimit: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of feeder
  		* @param feeder Function The new value.
  		* @returns Number
  		*/
  var setFeeder: js.UndefOr[js.Function1[/* feeder */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ILimitedCache {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    feeder: js.Any = null,
    get: (/* id */ java.lang.String, /* repeated */ js.Any) => _ = null,
    getFeeder: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLimit: () => Double = null,
    getScope: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    limit: Int | Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    scope: js.Any = null,
    self: IClass = null,
    setFeeder: /* feeder */ js.UndefOr[js.Any] => Double = null,
    setLimit: /* limit */ js.UndefOr[Double] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ILimitedCache = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (feeder != null) __obj.updateDynamic("feeder")(feeder)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2(get))
    if (getFeeder != null) __obj.updateDynamic("getFeeder")(js.Any.fromFunction0(getFeeder))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLimit != null) __obj.updateDynamic("getLimit")(js.Any.fromFunction0(getLimit))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFeeder != null) __obj.updateDynamic("setFeeder")(js.Any.fromFunction1(setFeeder))
    if (setLimit != null) __obj.updateDynamic("setLimit")(js.Any.fromFunction1(setLimit))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILimitedCache]
  }
}

