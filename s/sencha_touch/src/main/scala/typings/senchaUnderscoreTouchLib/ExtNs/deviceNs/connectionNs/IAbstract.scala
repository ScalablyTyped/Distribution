package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.connectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Property] (String) */
  var CELL_2G: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var CELL_3G: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var CELL_4G: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var ETHERNET: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var NONE: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var UNKNOWN: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var WIFI: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of online
  		* @returns Boolean
  		*/
  var getOnline: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the current connection type
  		* @returns String type
  		*/
  var getType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] True if the device is currently online
  		* @returns Boolean online
  		*/
  var isOnline: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Sets the value of online
  		* @param online Boolean The new value.
  		*/
  var setOnline: js.UndefOr[js.Function1[/* online */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of type
  		* @param type Object The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

