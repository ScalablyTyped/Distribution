package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkingIOSStatic extends js.Object {
  /**
    * Add a handler to LinkingIOS changes by listening to the url event type and providing the handler
    @deprecated
    */
  def addEventListener(
    `type`: java.lang.String,
    handler: js.Function1[/* event */ reactDashNativeLib.Anon_Url, scala.Unit]
  ): scala.Unit
  /**
    * Determine whether or not an installed app can handle a given URL. The callback function will be called with bool supported as the only argument
    NOTE: As of iOS 9, your app needs to provide the LSApplicationQueriesSchemes key inside Info.plist.
    @deprecated
    */
  def canOpenURL(url: java.lang.String, callback: js.Function1[/* supported */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Try to open the given url with any of the installed apps.
    @deprecated
    */
  def openURL(url: java.lang.String): scala.Unit
  /**
    * If the app launch was triggered by an app link, it will pop the link url, otherwise it will return null
    @deprecated
    */
  def popInitialURL(): java.lang.String
  /**
    * Remove a handler by passing the url event type and the handler
    @deprecated
    */
  def removeEventListener(
    `type`: java.lang.String,
    handler: js.Function1[/* event */ reactDashNativeLib.Anon_Url, scala.Unit]
  ): scala.Unit
}

object LinkingIOSStatic {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* event */ reactDashNativeLib.Anon_Url, scala.Unit]) => scala.Unit,
    canOpenURL: (java.lang.String, js.Function1[/* supported */ scala.Boolean, scala.Unit]) => scala.Unit,
    openURL: java.lang.String => scala.Unit,
    popInitialURL: () => java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* event */ reactDashNativeLib.Anon_Url, scala.Unit]) => scala.Unit
  ): LinkingIOSStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), canOpenURL = js.Any.fromFunction2(canOpenURL), openURL = js.Any.fromFunction1(openURL), popInitialURL = js.Any.fromFunction0(popInitialURL), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[LinkingIOSStatic]
  }
}

