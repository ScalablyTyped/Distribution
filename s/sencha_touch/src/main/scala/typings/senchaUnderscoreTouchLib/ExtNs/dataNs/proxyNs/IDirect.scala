package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirect extends IServer {
  /** [Method] Generates a url based on a given Ext data Request object
  		* @returns String The url
  		*/
  @JSName("buildUrl")
  var buildUrl_IDirect: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("doRequest")
  var doRequest_IDirect: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of directFn
  		* @returns Function/String
  		*/
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of paramOrder
  		* @returns String/String[]
  		*/
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of paramsAsHash
  		* @returns Boolean
  		*/
  var getParamsAsHash: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of directFn
  		* @param directFn Function/String The new value.
  		*/
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of paramOrder
  		* @param paramOrder String/String[] The new value.
  		*/
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of paramsAsHash
  		* @param paramsAsHash Boolean The new value.
  		*/
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

