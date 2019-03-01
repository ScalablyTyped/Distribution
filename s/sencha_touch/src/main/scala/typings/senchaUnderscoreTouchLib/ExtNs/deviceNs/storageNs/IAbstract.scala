package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of databaseDisplayName
  		* @returns String
  		*/
  var getDatabaseDisplayName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of databaseName
  		* @returns String
  		*/
  var getDatabaseName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of databaseSize
  		* @returns Object
  		*/
  var getDatabaseSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of databaseVersion
  		* @returns String
  		*/
  var getDatabaseVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of databaseDisplayName
  		* @param databaseDisplayName String The new value.
  		*/
  var setDatabaseDisplayName: js.UndefOr[js.Function1[/* databaseDisplayName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of databaseName
  		* @param databaseName String The new value.
  		*/
  var setDatabaseName: js.UndefOr[js.Function1[/* databaseName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of databaseSize
  		* @param databaseSize Object The new value.
  		*/
  var setDatabaseSize: js.UndefOr[js.Function1[/* databaseSize */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of databaseVersion
  		* @param databaseVersion String The new value.
  		*/
  var setDatabaseVersion: js.UndefOr[js.Function1[/* databaseVersion */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IAbstract {
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
    getDatabaseDisplayName: js.Function0[java.lang.String] = null,
    getDatabaseName: js.Function0[java.lang.String] = null,
    getDatabaseSize: js.Function0[_] = null,
    getDatabaseVersion: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDatabaseDisplayName: js.Function1[/* databaseDisplayName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDatabaseName: js.Function1[/* databaseName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDatabaseSize: js.Function1[/* databaseSize */ js.UndefOr[js.Any], scala.Unit] = null,
    setDatabaseVersion: js.Function1[/* databaseVersion */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDatabaseDisplayName != null) __obj.updateDynamic("getDatabaseDisplayName")(getDatabaseDisplayName)
    if (getDatabaseName != null) __obj.updateDynamic("getDatabaseName")(getDatabaseName)
    if (getDatabaseSize != null) __obj.updateDynamic("getDatabaseSize")(getDatabaseSize)
    if (getDatabaseVersion != null) __obj.updateDynamic("getDatabaseVersion")(getDatabaseVersion)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDatabaseDisplayName != null) __obj.updateDynamic("setDatabaseDisplayName")(setDatabaseDisplayName)
    if (setDatabaseName != null) __obj.updateDynamic("setDatabaseName")(setDatabaseName)
    if (setDatabaseSize != null) __obj.updateDynamic("setDatabaseSize")(setDatabaseSize)
    if (setDatabaseVersion != null) __obj.updateDynamic("setDatabaseVersion")(setDatabaseVersion)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

