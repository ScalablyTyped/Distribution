package typings.senchaTouch.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISql extends IClient {
  /** [Method] Performs the given create operation
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("create")
  var create_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var database: js.UndefOr[String] = js.native
  /** [Method] Performs the given destroy operation
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("destroy")
  var destroy_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of columns
    * @returns String
    */
  var getColumns: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of database
    * @returns String
    */
  var getDatabase: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaultDateFormat
    * @returns String
    */
  var getDefaultDateFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Formats the data for each record before sending it to the server
    * @param record Object The record that we are writing to the server.
    * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
    */
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of table
    * @returns String
    */
  var getTable: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of tableExists
    * @returns Boolean
    */
  var getTableExists: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of uniqueIdStrategy
    * @returns Boolean
    */
  var getUniqueIdStrategy: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Performs the given read operation
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("read")
  var read_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of columns
    * @param columns String The new value.
    */
  var setColumns: js.UndefOr[js.Function1[/* columns */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of database
    * @param database String The new value.
    */
  var setDatabase: js.UndefOr[js.Function1[/* database */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaultDateFormat
    * @param defaultDateFormat String The new value.
    */
  var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of table
    * @param table String The new value.
    */
  var setTable: js.UndefOr[js.Function1[/* table */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of tableExists
    * @param tableExists Boolean The new value.
    */
  var setTableExists: js.UndefOr[js.Function1[/* tableExists */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of uniqueIdStrategy
    * @param uniqueIdStrategy Boolean The new value.
    */
  var setUniqueIdStrategy: js.UndefOr[js.Function1[/* uniqueIdStrategy */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var table: js.UndefOr[String] = js.native
  /** [Method] Performs the given update operation
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("update")
  var update_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object ISql {
  @scala.inline
  def apply(): ISql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISql]
  }
  @scala.inline
  implicit class ISqlOps[Self <: ISql] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setDestroy(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("destroy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetColumns(value: () => String): Self = this.set("getColumns", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetColumns: Self = this.set("getColumns", js.undefined)
    @scala.inline
    def setGetDatabase(value: () => String): Self = this.set("getDatabase", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDatabase: Self = this.set("getDatabase", js.undefined)
    @scala.inline
    def setGetDefaultDateFormat(value: () => String): Self = this.set("getDefaultDateFormat", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultDateFormat: Self = this.set("getDefaultDateFormat", js.undefined)
    @scala.inline
    def setGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = this.set("getRecordData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRecordData: Self = this.set("getRecordData", js.undefined)
    @scala.inline
    def setGetTable(value: () => String): Self = this.set("getTable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTable: Self = this.set("getTable", js.undefined)
    @scala.inline
    def setGetTableExists(value: () => Boolean): Self = this.set("getTableExists", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTableExists: Self = this.set("getTableExists", js.undefined)
    @scala.inline
    def setGetUniqueIdStrategy(value: () => Boolean): Self = this.set("getUniqueIdStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUniqueIdStrategy: Self = this.set("getUniqueIdStrategy", js.undefined)
    @scala.inline
    def setRead(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setSetColumns(value: /* columns */ js.UndefOr[String] => Unit): Self = this.set("setColumns", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetColumns: Self = this.set("setColumns", js.undefined)
    @scala.inline
    def setSetDatabase(value: /* database */ js.UndefOr[String] => Unit): Self = this.set("setDatabase", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDatabase: Self = this.set("setDatabase", js.undefined)
    @scala.inline
    def setSetDefaultDateFormat(value: /* defaultDateFormat */ js.UndefOr[String] => Unit): Self = this.set("setDefaultDateFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaultDateFormat: Self = this.set("setDefaultDateFormat", js.undefined)
    @scala.inline
    def setSetTable(value: /* table */ js.UndefOr[String] => Unit): Self = this.set("setTable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTable: Self = this.set("setTable", js.undefined)
    @scala.inline
    def setSetTableExists(value: /* tableExists */ js.UndefOr[Boolean] => Unit): Self = this.set("setTableExists", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTableExists: Self = this.set("setTableExists", js.undefined)
    @scala.inline
    def setSetUniqueIdStrategy(value: /* uniqueIdStrategy */ js.UndefOr[Boolean] => Unit): Self = this.set("setUniqueIdStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUniqueIdStrategy: Self = this.set("setUniqueIdStrategy", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

