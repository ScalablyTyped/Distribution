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
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getPrefix: () => java.lang.String = null,
    getSeed: () => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    prefix: java.lang.String = null,
    seed: scala.Int | scala.Double = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setPrefix: /* prefix */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setSeed: /* seed */ js.UndefOr[scala.Double] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISequential = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getPrefix != null) __obj.updateDynamic("getPrefix")(js.Any.fromFunction0(getPrefix))
    if (getSeed != null) __obj.updateDynamic("getSeed")(js.Any.fromFunction0(getSeed))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (setPrefix != null) __obj.updateDynamic("setPrefix")(js.Any.fromFunction1(setPrefix))
    if (setSeed != null) __obj.updateDynamic("setSeed")(js.Any.fromFunction1(setSeed))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISequential]
  }
}

