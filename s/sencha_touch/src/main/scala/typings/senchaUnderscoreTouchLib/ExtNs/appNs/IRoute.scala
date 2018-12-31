package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var conditions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var controller: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of conditions
  		* @returns Object
  		*/
  var getConditions: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of controller
  		* @returns String
  		*/
  var getController: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Property] (Object) */
  var paramsInMatchString: js.UndefOr[js.Any] = js.undefined
  /** [Method] Attempts to recognize a given url string and return controller action pair for it
  		* @param url String The url to recognize.
  		* @returns Object/Boolean The matched data, or false if no match.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of conditions
  		* @param conditions Object The new value.
  		*/
  var setConditions: js.UndefOr[js.Function1[/* conditions */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller String The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

