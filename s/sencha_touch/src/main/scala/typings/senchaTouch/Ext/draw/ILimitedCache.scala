package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
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
  var get: js.UndefOr[js.Function2[/* id */ String, /* repeated */ js.Any, _]] = js.undefined
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
    extend: String = null,
    feeder: js.Any = null,
    get: (/* id */ String, /* repeated */ js.Any) => _ = null,
    getFeeder: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLimit: () => Double = null,
    getScope: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    limit: js.UndefOr[Double] = js.undefined,
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
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (feeder != null) __obj.updateDynamic("feeder")(feeder.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2(get))
    if (getFeeder != null) __obj.updateDynamic("getFeeder")(js.Any.fromFunction0(getFeeder))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLimit != null) __obj.updateDynamic("getLimit")(js.Any.fromFunction0(getLimit))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFeeder != null) __obj.updateDynamic("setFeeder")(js.Any.fromFunction1(setFeeder))
    if (setLimit != null) __obj.updateDynamic("setLimit")(js.Any.fromFunction1(setLimit))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILimitedCache]
  }
}

