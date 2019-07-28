package typings.senchaUnderscoreTouch.ExtNs.envNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowser extends IBase {
  /** [Property] (String) */
  var engineName: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Version) */
  var engineVersion: js.UndefOr[IVersion] = js.undefined
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
  		* @param value String The OS name to check.
  		* @returns Boolean
  		*/
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isSecure: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isStrict: js.UndefOr[Boolean] = js.undefined
  /** [Property] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[IVersion] = js.undefined
}

object IBrowser {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    engineName: java.lang.String = null,
    engineVersion: IVersion = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    is: /* value */ js.UndefOr[java.lang.String] => Boolean = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    isStrict: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    name: java.lang.String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    userAgent: java.lang.String = null,
    uses: Array = null,
    version: IVersion = null
  ): IBrowser = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (engineName != null) __obj.updateDynamic("engineName")(engineName)
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1(is))
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (!js.isUndefined(isStrict)) __obj.updateDynamic("isStrict")(isStrict)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IBrowser]
  }
}

