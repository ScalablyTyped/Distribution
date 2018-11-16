package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


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
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var database: js.UndefOr[java.lang.String] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of columns
  		* @returns String
  		*/
  var getColumns: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of database
  		* @returns String
  		*/
  var getDatabase: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaultDateFormat
  		* @returns String
  		*/
  var getDefaultDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Object The record that we are writing to the server.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of table
  		* @returns String
  		*/
  var getTable: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of tableExists
  		* @returns Boolean
  		*/
  var getTableExists: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of uniqueIdStrategy
  		* @returns Boolean
  		*/
  var getUniqueIdStrategy: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of columns
  		* @param columns String The new value.
  		*/
  var setColumns: js.UndefOr[js.Function1[/* columns */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of database
  		* @param database String The new value.
  		*/
  var setDatabase: js.UndefOr[js.Function1[/* database */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultDateFormat
  		* @param defaultDateFormat String The new value.
  		*/
  var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of table
  		* @param table String The new value.
  		*/
  var setTable: js.UndefOr[js.Function1[/* table */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tableExists
  		* @param tableExists Boolean The new value.
  		*/
  var setTableExists: js.UndefOr[js.Function1[/* tableExists */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of uniqueIdStrategy
  		* @param uniqueIdStrategy Boolean The new value.
  		*/
  var setUniqueIdStrategy: js.UndefOr[js.Function1[/* uniqueIdStrategy */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var table: js.UndefOr[java.lang.String] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
}

