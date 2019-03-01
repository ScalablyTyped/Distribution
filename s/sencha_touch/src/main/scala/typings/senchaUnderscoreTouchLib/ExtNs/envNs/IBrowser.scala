package typings
package senchaUnderscoreTouchLib.ExtNs.envNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowser
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Property] (String) */
  var engineName: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Version) */
  var engineVersion: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IVersion] = js.undefined
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
  		* @param value String The OS name to check.
  		* @returns Boolean
  		*/
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isStrict: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IVersion] = js.undefined
}

object IBrowser {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    engineName: java.lang.String = null,
    engineVersion: senchaUnderscoreTouchLib.ExtNs.IVersion = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    is: js.Function1[/* value */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    isStrict: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    name: java.lang.String = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    userAgent: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    version: senchaUnderscoreTouchLib.ExtNs.IVersion = null
  ): IBrowser = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (engineName != null) __obj.updateDynamic("engineName")(engineName)
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (is != null) __obj.updateDynamic("is")(is)
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

