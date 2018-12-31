package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.app.Profile) */
  var currentProfile: js.UndefOr[IProfile] = js.undefined
  /** [Method] Dispatches a given Ext app Action to the relevant Controller instance
  		* @param action Ext.app.Action The action to dispatch.
  		* @param addToHistory Boolean Sets the browser's url to the action's url.
  		*/
  var dispatch: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[IAction], 
      /* addToHistory */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of appFolder
  		* @returns String
  		*/
  var getAppFolder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the Controller instance for the given controller name
  		* @param name String The name of the Controller.
  		* @param profileName String Optional profile name. If passed, this is the same as calling getController('profileName.controllerName').
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  @JSName("getController")
  var getController_IApplication: js.UndefOr[
    js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* profileName */ js.UndefOr[java.lang.String], 
      IController
    ]
  ] = js.undefined
  /** [Method] Returns the value of controllers
  		* @returns Array
  		*/
  var getControllers: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of currentProfile
  		* @returns Ext.app.Profile
  		*/
  var getCurrentProfile: js.UndefOr[js.Function0[IProfile]] = js.undefined
  /** [Method] Returns the value of history
  		* @returns Ext.app.History
  		*/
  var getHistory: js.UndefOr[js.Function0[IHistory]] = js.undefined
  /** [Method] Returns the value of launch
  		* @returns Function
  		*/
  var getLaunch: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of profiles
  		* @returns Array
  		*/
  var getProfiles: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of requires
  		* @returns String[]
  		*/
  var getRequires: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of router
  		* @returns Ext.app.Router
  		*/
  var getRouter: js.UndefOr[js.Function0[IRouter]] = js.undefined
  /** [Method] Returns the value of themeVariation
  		* @returns String/Function
  		*/
  var getThemeVariation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of themeVariationPrefix
  		* @returns String
  		*/
  var getThemeVariationPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of themeVariationTransitionCls
  		* @returns String
  		*/
  var getThemeVariationTransitionCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var glossOnIcon: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.app.History) */
  var history: js.UndefOr[IHistory] = js.undefined
  /** [Config Option] (String/Object) */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var isIconPrecomposed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var phoneIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var phoneStartupScreen: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Array) */
  var profiles: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Redirects the browser to the given url
  		* @param url String/Ext.data.Model The String url to redirect to.
  		*/
  @JSName("redirectTo")
  var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.app.Router) */
  var router: js.UndefOr[IRouter] = js.undefined
  /** [Method] Sets the value of appFolder
  		* @param appFolder String The new value.
  		*/
  var setAppFolder: js.UndefOr[js.Function1[/* appFolder */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of controllers
  		* @param controllers Array The new value.
  		*/
  var setControllers: js.UndefOr[
    js.Function1[/* controllers */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of currentProfile
  		* @param currentProfile Ext.app.Profile The new value.
  		*/
  var setCurrentProfile: js.UndefOr[js.Function1[/* currentProfile */ js.UndefOr[IProfile], scala.Unit]] = js.undefined
  /** [Method] Sets the value of history
  		* @param history Ext.app.History The new value.
  		*/
  var setHistory: js.UndefOr[js.Function1[/* history */ js.UndefOr[IHistory], scala.Unit]] = js.undefined
  /** [Method] Sets the value of launch
  		* @param launch Function The new value.
  		*/
  var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of profiles
  		* @param profiles Array The new value.
  		*/
  var setProfiles: js.UndefOr[
    js.Function1[/* profiles */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of requires
  		* @param requires String[] The new value.
  		*/
  var setRequires: js.UndefOr[
    js.Function1[/* requires */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of router
  		* @param router Ext.app.Router The new value.
  		*/
  var setRouter: js.UndefOr[js.Function1[/* router */ js.UndefOr[IRouter], scala.Unit]] = js.undefined
  /** [Method] Sets the value of themeVariation
  		* @param themeVariation String/Function The new value.
  		*/
  var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of themeVariationPrefix
  		* @param themeVariationPrefix String The new value.
  		*/
  var setThemeVariationPrefix: js.UndefOr[
    js.Function1[/* themeVariationPrefix */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of themeVariationTransitionCls
  		* @param themeVariationTransitionCls String The new value.
  		*/
  var setThemeVariationTransitionCls: js.UndefOr[
    js.Function1[/* themeVariationTransitionCls */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var startupImage: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var statusBarStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var tabletIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var tabletStartupScreen: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Function) */
  var themeVariation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var themeVariationPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var themeVariationTransitionCls: js.UndefOr[java.lang.String] = js.undefined
}

