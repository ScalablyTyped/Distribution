package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRouter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Connects a url based route to a controller action pair plus additional params
  		* @param url String The url to recognize.
  		* @param params Object Additional parameters.
  		*/
  var connect: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[java.lang.String], /* params */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience method which just calls the supplied function with the Router instance
  		* @param fn Function The fn to call
  		*/
  var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of routes
  		* @returns Array
  		*/
  var getRoutes: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
  		* @param url String The url to recognize.
  		* @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Config Option] (Array) */
  var routes: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of routes
  		* @param routes Array The new value.
  		*/
  var setRoutes: js.UndefOr[
    js.Function1[/* routes */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

