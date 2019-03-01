package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.identifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISequential extends ISimple {
  /** [Method] Returns the value of seed
  		* @returns Number
  		*/
  var getSeed: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (String) */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var seed: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of seed
  		* @param seed Number The new value.
  		*/
  var setSeed: js.UndefOr[js.Function1[/* seed */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ISequential {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getPrefix: js.Function0[java.lang.String] = null,
    getSeed: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    prefix: java.lang.String = null,
    seed: scala.Int | scala.Double = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setPrefix: js.Function1[/* prefix */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSeed: js.Function1[/* seed */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISequential = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getPrefix != null) __obj.updateDynamic("getPrefix")(getPrefix)
    if (getSeed != null) __obj.updateDynamic("getSeed")(getSeed)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (setPrefix != null) __obj.updateDynamic("setPrefix")(setPrefix)
    if (setSeed != null) __obj.updateDynamic("setSeed")(setSeed)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISequential]
  }
}

