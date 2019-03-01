package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttributeDefinition
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of aliases
  		* @returns Object
  		*/
  var getAliases: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of animationProcessors
  		* @returns Object
  		*/
  var getAnimationProcessors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of processors
  		* @returns Object
  		*/
  var getProcessors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of updaters
  		* @returns Object
  		*/
  var getUpdaters: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
  		* @param changes Object The changes given.
  		* @returns Object The normalized values.
  		*/
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Object) */
  var processors: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of aliases
  		* @param aliases Object The new value.
  		*/
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of animationProcessors
  		* @param animationProcessors Object The new value.
  		*/
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of processors
  		* @param processors Object The new value.
  		*/
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of updaters
  		* @param updaters Object The new value.
  		*/
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[js.Any] = js.undefined
}

object IAttributeDefinition {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    aliases: js.Any = null,
    alternateClassName: js.Any = null,
    animationProcessors: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    defaults: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    dirty: js.Any = null,
    extend: java.lang.String = null,
    getAliases: js.Function0[_] = null,
    getAnimationProcessors: js.Function0[_] = null,
    getDefaults: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProcessors: js.Function0[_] = null,
    getUpdaters: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    normalize: js.Function1[/* changes */ js.UndefOr[js.Any], _] = null,
    platformConfig: js.Any = null,
    processors: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAliases: js.Function1[/* aliases */ js.UndefOr[js.Any], scala.Unit] = null,
    setAnimationProcessors: js.Function1[/* animationProcessors */ js.UndefOr[js.Any], scala.Unit] = null,
    setDefaults: js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit] = null,
    setProcessors: js.Function1[/* processors */ js.UndefOr[js.Any], scala.Unit] = null,
    setUpdaters: js.Function1[/* updaters */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    updaters: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animationProcessors != null) __obj.updateDynamic("animationProcessors")(animationProcessors)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (dirty != null) __obj.updateDynamic("dirty")(dirty)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAliases != null) __obj.updateDynamic("getAliases")(getAliases)
    if (getAnimationProcessors != null) __obj.updateDynamic("getAnimationProcessors")(getAnimationProcessors)
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(getDefaults)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProcessors != null) __obj.updateDynamic("getProcessors")(getProcessors)
    if (getUpdaters != null) __obj.updateDynamic("getUpdaters")(getUpdaters)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (normalize != null) __obj.updateDynamic("normalize")(normalize)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processors != null) __obj.updateDynamic("processors")(processors)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAliases != null) __obj.updateDynamic("setAliases")(setAliases)
    if (setAnimationProcessors != null) __obj.updateDynamic("setAnimationProcessors")(setAnimationProcessors)
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(setDefaults)
    if (setProcessors != null) __obj.updateDynamic("setProcessors")(setProcessors)
    if (setUpdaters != null) __obj.updateDynamic("setUpdaters")(setUpdaters)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (updaters != null) __obj.updateDynamic("updaters")(updaters)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAttributeDefinition]
  }
}

