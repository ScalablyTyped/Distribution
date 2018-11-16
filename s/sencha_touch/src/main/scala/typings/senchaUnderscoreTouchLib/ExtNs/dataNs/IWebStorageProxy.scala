package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IWebStorageProxy
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs.IClient {
  /** [Property] (Object) */
  var cache: js.UndefOr[js.Any] = js.undefined
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("create")
  var create_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] inherit
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("destroy")
  var destroy_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of defaultDateFormat
  		* @returns String
  		*/
  var getDefaultDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of enablePagingParams
  		* @returns Boolean
  		*/
  var getEnablePagingParams: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of id
  		* @returns String
  		*/
  @JSName("getId")
  var getId_IWebStorageProxy: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("read")
  var read_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of defaultDateFormat
  		* @param defaultDateFormat String The new value.
  		*/
  var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of enablePagingParams
  		* @param enablePagingParams Boolean The new value.
  		*/
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id String The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Saves the given record in the Proxy
  		* @param record Ext.data.Model The model instance
  		* @param id String The id to save the record under (defaults to the value of the record's getId() function)
  		*/
  var setRecord: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("update")
  var update_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

