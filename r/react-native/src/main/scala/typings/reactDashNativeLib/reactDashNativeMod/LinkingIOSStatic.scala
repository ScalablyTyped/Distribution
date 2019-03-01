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
    addEventListener: js.Function2[
      java.lang.String, 
      js.Function1[/* event */ reactDashNativeLib.Anon_Url, scala.Unit], 
      scala.Unit
    ],
    canOpenURL: js.Function2[
      java.lang.String, 
      js.Function1[/* supported */ scala.Boolean, scala.Unit], 
      scala.Unit
    ],
    openURL: js.Function1[java.lang.String, scala.Unit],
    popInitialURL: js.Function0[java.lang.String],
    removeEventListener: js.Function2[
      java.lang.String, 
      js.Function1[/* event */ reactDashNativeLib.Anon_Url, scala.Unit], 
      scala.Unit
    ]
  ): LinkingIOSStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("canOpenURL")(canOpenURL)
    __obj.updateDynamic("openURL")(openURL)
    __obj.updateDynamic("popInitialURL")(popInitialURL)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[LinkingIOSStatic]
  }
}

