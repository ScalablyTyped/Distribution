package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IJsonP extends IServer {
  /** [Method] Aborts the current server request if one is currently running  */
  var abort: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Performs the read request to the remote domain
  		* @param operation Ext.data.Operation The Operation object to execute.
  		* @param callback Function A callback function to execute when the Operation has been completed.
  		* @param scope Object The scope to execute the callback in.
  		* @returns Object
  		*/
  @JSName("doRequest")
  var doRequest_IJsonP: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of autoAppendParams
  		* @returns Boolean
  		*/
  var getAutoAppendParams: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of callbackKey
  		* @returns String
  		*/
  var getCallbackKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaultWriterType
  		* @returns String
  		*/
  var getDefaultWriterType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of recordParam
  		* @returns String
  		*/
  var getRecordParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of autoAppendParams
  		* @param autoAppendParams Boolean The new value.
  		*/
  var setAutoAppendParams: js.UndefOr[js.Function1[/* autoAppendParams */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of callbackKey
  		* @param callbackKey String The new value.
  		*/
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultWriterType
  		* @param defaultWriterType String The new value.
  		*/
  var setDefaultWriterType: js.UndefOr[js.Function1[/* defaultWriterType */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of recordParam
  		* @param recordParam String The new value.
  		*/
  var setRecordParam: js.UndefOr[js.Function1[/* recordParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

