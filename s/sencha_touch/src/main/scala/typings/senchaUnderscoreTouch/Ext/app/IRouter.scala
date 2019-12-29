package typings.senchaUnderscoreTouch.Ext.app

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouter extends IBase {
  /** [Method] Connects a url based route to a controller action pair plus additional params
  		* @param url String The url to recognize.
  		* @param params Object Additional parameters.
  		*/
  var connect: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience method which just calls the supplied function with the Router instance
  		* @param fn Function The fn to call
  		*/
  var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of routes
  		* @returns Array
  		*/
  var getRoutes: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
  		* @param url String The url to recognize.
  		* @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], _]] = js.undefined
  /** [Config Option] (Array) */
  var routes: js.UndefOr[Array] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of routes
  		* @param routes Array The new value.
  		*/
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[Array], Unit]] = js.undefined
}

object IRouter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    connect: (/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any]) => Unit = null,
    defaults: js.Any = null,
    destroy: () => Unit = null,
    draw: /* fn */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    getDefaults: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getRoutes: () => Array = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    recognize: /* url */ js.UndefOr[String] => _ = null,
    routes: Array = null,
    self: IClass = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => Unit = null,
    setRoutes: /* routes */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRouter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2(connect))
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction1(draw))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(js.Any.fromFunction0(getDefaults))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getRoutes != null) __obj.updateDynamic("getRoutes")(js.Any.fromFunction0(getRoutes))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (recognize != null) __obj.updateDynamic("recognize")(js.Any.fromFunction1(recognize))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1(setDefaults))
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(js.Any.fromFunction1(setRoutes))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouter]
  }
}

