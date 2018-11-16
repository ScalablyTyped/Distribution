package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.writerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IWriter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of nameProperty
  		* @returns String
  		*/
  var getNameProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Object The record that we are writing to the server.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of writeAllFields
  		* @returns Boolean
  		*/
  var getWriteAllFields: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of nameProperty
  		* @param nameProperty String The new value.
  		*/
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of writeAllFields
  		* @param writeAllFields Boolean The new value.
  		*/
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object.
  		* @returns Ext.data.Request The modified request object.
  		*/
  var write: js.UndefOr[
    js.Function1[
      /* request */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRequest], 
      senchaUnderscoreTouchLib.ExtNs.dataNs.IRequest
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[scala.Boolean] = js.undefined
}

