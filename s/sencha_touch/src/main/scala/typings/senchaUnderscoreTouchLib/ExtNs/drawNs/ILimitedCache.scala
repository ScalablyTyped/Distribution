package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILimitedCache
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Clear all the objects  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var getLimit: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of feeder
  		* @param feeder Function The new value.
  		* @returns Number
  		*/
  var setFeeder: js.UndefOr[js.Function1[/* feeder */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ILimitedCache {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    feeder: js.Any = null,
    get: js.Function2[/* id */ java.lang.String, /* repeated */ js.Any, _] = null,
    getFeeder: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLimit: js.Function0[scala.Double] = null,
    getScope: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    limit: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    scope: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setFeeder: js.Function1[/* feeder */ js.UndefOr[js.Any], scala.Double] = null,
    setLimit: js.Function1[/* limit */ js.UndefOr[scala.Double], scala.Unit] = null,
    setScope: js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ILimitedCache = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (feeder != null) __obj.updateDynamic("feeder")(feeder)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getFeeder != null) __obj.updateDynamic("getFeeder")(getFeeder)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLimit != null) __obj.updateDynamic("getLimit")(getLimit)
    if (getScope != null) __obj.updateDynamic("getScope")(getScope)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFeeder != null) __obj.updateDynamic("setFeeder")(setFeeder)
    if (setLimit != null) __obj.updateDynamic("setLimit")(setLimit)
    if (setScope != null) __obj.updateDynamic("setScope")(setScope)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILimitedCache]
  }
}

