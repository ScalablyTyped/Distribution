package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentAndroidStatic extends js.Object {
  /**
    * Determine whether or not an installed app can handle a given URL.
    You can use other URLs, like a location (e.g. "geo:37.484847,-122.148386"), a contact, or any other URL that can be opened with {@code Intent.ACTION_VIEW}.
    NOTE: For web URLs, the protocol ("http://", "https://") must be set accordingly!
    @param URL the URL to open
    @deprecated
    */
  def canOpenURL(url: java.lang.String, callback: js.Function1[/* supported */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * If the app launch was triggered by an app link with {@code Intent.ACTION_VIEW}, it will give the link url, otherwise it will give null
    Refer http://developer.android.com/training/app-indexing/deep-linking.html#handling-intents
    @deprecated
    */
  def getInitialURL(callback: js.Function1[/* url */ java.lang.String | scala.Null, scala.Unit]): scala.Unit
  /**
    * Starts a corresponding external activity for the given URL.
    For example, if the URL is "https://www.facebook.com", the system browser will be opened, or the "choose application" dialog will be shown.
    You can use other URLs, like a location (e.g. "geo:37.484847,-122.148386"), a contact, or any other URL that can be opened with {@code Intent.ACTION_VIEW}.
    NOTE: This method will fail if the system doesn't know how to open the specified URL. If you're passing in a non-http(s) URL, it's best to check {@code canOpenURL} first.
    NOTE: For web URLs, the protocol ("http://", "https://") must be set accordingly!
    @deprecated
    */
  def openURL(url: java.lang.String): scala.Unit
}

object IntentAndroidStatic {
  @scala.inline
  def apply(
    canOpenURL: js.Function2[
      java.lang.String, 
      js.Function1[/* supported */ scala.Boolean, scala.Unit], 
      scala.Unit
    ],
    getInitialURL: js.Function1[js.Function1[/* url */ java.lang.String | scala.Null, scala.Unit], scala.Unit],
    openURL: js.Function1[java.lang.String, scala.Unit]
  ): IntentAndroidStatic = {
    val __obj = js.Dynamic.literal(canOpenURL = canOpenURL, getInitialURL = getInitialURL, openURL = openURL)
  
    __obj.asInstanceOf[IntentAndroidStatic]
  }
}

