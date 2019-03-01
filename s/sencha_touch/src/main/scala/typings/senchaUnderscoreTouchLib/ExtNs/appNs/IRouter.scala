package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Connects a url based route to a controller action pair plus additional params
  		* @param url String The url to recognize.
  		* @param params Object Additional parameters.
  		*/
  var connect: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[java.lang.String], /* params */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience method which just calls the supplied function with the Router instance
  		* @param fn Function The fn to call
  		*/
  var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of routes
  		* @returns Array
  		*/
  var getRoutes: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
  		* @param url String The url to recognize.
  		* @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Config Option] (Array) */
  var routes: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of routes
  		* @param routes Array The new value.
  		*/
  var setRoutes: js.UndefOr[
    js.Function1[/* routes */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

object IRouter {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    connect: js.Function2[/* url */ js.UndefOr[java.lang.String], /* params */ js.UndefOr[js.Any], scala.Unit] = null,
    defaults: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    draw: js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    getDefaults: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRoutes: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    recognize: js.Function1[/* url */ js.UndefOr[java.lang.String], _] = null,
    routes: senchaUnderscoreTouchLib.ExtNs.Array = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDefaults: js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit] = null,
    setRoutes: js.Function1[/* routes */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IRouter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (connect != null) __obj.updateDynamic("connect")(connect)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (draw != null) __obj.updateDynamic("draw")(draw)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(getDefaults)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRoutes != null) __obj.updateDynamic("getRoutes")(getRoutes)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (recognize != null) __obj.updateDynamic("recognize")(recognize)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(setDefaults)
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(setRoutes)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRouter]
  }
}

