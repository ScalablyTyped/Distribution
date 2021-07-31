package typings.reactNative.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetIOSStatic extends StObject {
  
  /**
    * Display an iOS action sheet. The `options` object must contain one or more
    * of:
    * - `options` (array of strings) - a list of button titles (required)
    * - `cancelButtonIndex` (int) - index of cancel button in `options`
    * - `destructiveButtonIndex` (int) - index of destructive button in `options`
    * - `title` (string) - a title to show above the action sheet
    * - `message` (string) - a message to show below the title
    */
  def showActionSheetWithOptions(options: ActionSheetIOSOptions, callback: js.Function1[/* buttonIndex */ Double, Unit]): Unit
  
  /**
    * Display the iOS share sheet. The `options` object should contain
    * one or both of `message` and `url` and can additionally have
    * a `subject` or `excludedActivityTypes`:
    *
    * - `url` (string) - a URL to share
    * - `message` (string) - a message to share
    * - `subject` (string) - a subject for the message
    * - `excludedActivityTypes` (array) - the activities to exclude from the ActionSheet
    *
    * NOTE: if `url` points to a local file, or is a base64-encoded
    * uri, the file it points to will be loaded and shared directly.
    * In this way, you can share images, videos, PDF files, etc.
    */
  def showShareActionSheetWithOptions(
    options: ShareActionSheetIOSOptions,
    failureCallback: js.Function1[/* error */ Error, Unit],
    successCallback: js.Function2[/* success */ Boolean, /* method */ String, Unit]
  ): Unit
}
object ActionSheetIOSStatic {
  
  @scala.inline
  def apply(
    showActionSheetWithOptions: (ActionSheetIOSOptions, js.Function1[/* buttonIndex */ Double, Unit]) => Unit,
    showShareActionSheetWithOptions: (ShareActionSheetIOSOptions, js.Function1[/* error */ Error, Unit], js.Function2[/* success */ Boolean, /* method */ String, Unit]) => Unit
  ): ActionSheetIOSStatic = {
    val __obj = js.Dynamic.literal(showActionSheetWithOptions = js.Any.fromFunction2(showActionSheetWithOptions), showShareActionSheetWithOptions = js.Any.fromFunction3(showShareActionSheetWithOptions))
    __obj.asInstanceOf[ActionSheetIOSStatic]
  }
  
  @scala.inline
  implicit class ActionSheetIOSStaticMutableBuilder[Self <: ActionSheetIOSStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowActionSheetWithOptions(value: (ActionSheetIOSOptions, js.Function1[/* buttonIndex */ Double, Unit]) => Unit): Self = StObject.set(x, "showActionSheetWithOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowShareActionSheetWithOptions(
      value: (ShareActionSheetIOSOptions, js.Function1[/* error */ Error, Unit], js.Function2[/* success */ Boolean, /* method */ String, Unit]) => Unit
    ): Self = StObject.set(x, "showShareActionSheetWithOptions", js.Any.fromFunction3(value))
  }
}
