package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.sqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQLResultSet
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the row ID of the last row that the SQL statement inserted into the database if the statement inserted any r
  		* @returns Number The inserted row ID.
  		*/
  var getInsertId: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns a Ext device sqlite SQLResultSetRowList instance representing rows returned by the SQL statement
  		* @returns Ext.device.sqlite.SQLResultSetRowList The rows.
  		*/
  var getRows: js.UndefOr[js.Function0[ISQLResultSetRowList]] = js.undefined
  /** [Method] Returns the number of rows that were changed by the SQL statement
  		* @returns Number The number of rows affected.
  		*/
  var getRowsAffected: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

object ISQLResultSet {
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
    getInsertId: () => scala.Double = null,
    getRows: () => ISQLResultSetRowList = null,
    getRowsAffected: () => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISQLResultSet = {
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
    if (getInsertId != null) __obj.updateDynamic("getInsertId")(js.Any.fromFunction0(getInsertId))
    if (getRows != null) __obj.updateDynamic("getRows")(js.Any.fromFunction0(getRows))
    if (getRowsAffected != null) __obj.updateDynamic("getRowsAffected")(js.Any.fromFunction0(getRowsAffected))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISQLResultSet]
  }
}

