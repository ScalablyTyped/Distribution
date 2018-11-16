package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAction
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Array) */
  var args: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Array) */
  var beforeFilters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.app.Controller) */
  var controller: js.UndefOr[IController] = js.undefined
  /** [Method] Starts execution of this Action by calling each of the beforeFilters in turn if any are specified  before calling t  */
  var execute: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Array
  		*/
  var getArgs: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of beforeFilters
  		* @returns Array
  		*/
  var getBeforeFilters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of controller
  		* @returns Ext.app.Controller
  		*/
  var getController: js.UndefOr[js.Function0[IController]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
  var resume: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Array The new value.
  		*/
  var setArgs: js.UndefOr[
    js.Function1[/* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of beforeFilters
  		* @param beforeFilters Array The new value.
  		*/
  var setBeforeFilters: js.UndefOr[
    js.Function1[/* beforeFilters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller Ext.app.Controller The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[IController], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

