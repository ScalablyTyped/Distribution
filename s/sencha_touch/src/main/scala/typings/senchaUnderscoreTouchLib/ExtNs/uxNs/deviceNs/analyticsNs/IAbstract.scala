package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of accountID
  		* @returns Object
  		*/
  var getAccountID: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Registers yur Google Analytics account
  		* @param accountID String Your Google Analytics account ID
  		*/
  var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of accountID
  		* @param accountID Object The new value.
  		*/
  var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Track an event in your application
  		* @param config Object
  		*/
  var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Track an pageview in your application
  		* @param config String The page you want to track (must start with a slash).
  		*/
  var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

