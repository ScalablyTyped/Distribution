package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.identifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUuid extends ISimple {
  /** [Method] Returns the value of id
  		* @returns Object
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of version
  		* @returns Number
  		*/
  var getVersion: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Object) */
  var id: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reconfigures this generator given new config properties
  		* @param config Object
  		*/
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of id
  		* @param id Object The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of version
  		* @param version Number The new value.
  		*/
  var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object IUuid {
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
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getPrefix: js.Function0[java.lang.String] = null,
    getVersion: js.Function0[scala.Double] = null,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    reconfigure: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    salt: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setId: js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit] = null,
    setPrefix: js.Function1[/* prefix */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setVersion: js.Function1[/* version */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    timestamp: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    version: scala.Int | scala.Double = null
  ): IUuid = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getPrefix != null) __obj.updateDynamic("getPrefix")(getPrefix)
    if (getVersion != null) __obj.updateDynamic("getVersion")(getVersion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(reconfigure)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setPrefix != null) __obj.updateDynamic("setPrefix")(setPrefix)
    if (setVersion != null) __obj.updateDynamic("setVersion")(setVersion)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUuid]
  }
}

