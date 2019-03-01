package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.sqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatabase
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Verifies and changes the version of the database at the same time as doing a schema update with a Ext device sqlite S
  		* @param config Object The object which contains the following config options:
  		*/
  var changeVersion: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the current version of the database
  		* @returns String The database current version.
  		*/
  var getVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Works the same way as transaction but performs a Ext device sqlite SQLTransaction instance in a read only mode
  		* @param config Object
  		*/
  var readTransaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Performs a Ext device sqlite SQLTransaction instance in a read write mode
  		* @param config Object The object which contains the following config options:
  		*/
  var transaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IDatabase {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    changeVersion: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getVersion: js.Function0[java.lang.String] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    readTransaction: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    transaction: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IDatabase = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (changeVersion != null) __obj.updateDynamic("changeVersion")(changeVersion)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getVersion != null) __obj.updateDynamic("getVersion")(getVersion)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (readTransaction != null) __obj.updateDynamic("readTransaction")(readTransaction)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDatabase]
  }
}

