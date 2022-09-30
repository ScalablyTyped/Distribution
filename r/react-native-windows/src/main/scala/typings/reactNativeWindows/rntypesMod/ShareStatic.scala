package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareStatic extends StObject {
  
  var dismissedAction: typings.reactNativeWindows.reactNativeWindowsStrings.dismissedAction = js.native
  
  /**
    * Open a dialog to share text content.
    *
    * In iOS, Returns a Promise which will be invoked an object containing `action`, `activityType`.
    * If the user dismissed the dialog, the Promise will still be resolved with action being `Share.dismissedAction`
    * and all the other keys being undefined.
    *
    * In Android, Returns a Promise which always be resolved with action being `Share.sharedAction`.
    *
    * ### Content
    *
    *  - `message` - a message to share
    *  - `title` - title of the message
    *
    * #### iOS
    *
    *  - `url` - an URL to share
    *
    * At least one of URL and message is required.
    *
    * ### Options
    *
    * #### iOS
    *
    * - `excludedActivityTypes`
    * - `tintColor`
    *
    * #### Android
    *
    * - `dialogTitle`
    *
    */
  def share(content: ShareContent): js.Promise[ShareAction] = js.native
  def share(content: ShareContent, options: ShareOptions): js.Promise[ShareAction] = js.native
  
  var sharedAction: typings.reactNativeWindows.reactNativeWindowsStrings.sharedAction = js.native
}
