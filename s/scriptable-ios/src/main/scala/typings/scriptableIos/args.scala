package typings.scriptableIos

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Arguments passed to the script._
  * @see https://docs.scriptable.app/args
  */
@JSGlobal("args")
@js.native
object args extends js.Object {
  /**
    * _File URLs supplied by a share sheet or a shortcut action._
    *
    * All file URLs passed to the script from a share sheet or a shortcut action.
    *
    * If you have enabled "File URLs" as a share sheet input from the script settings, the script can be run from any share sheet throughout the system that shares URLs pointing to a
    * file.
    *
    * When large files are passed from a share sheet or a shortcut action, the system may terminate the process due to memory constraints. In that case, you should enable "Run in App" in
    * the script settings or in the shortcut.
    * @see https://docs.scriptable.app/args/#fileurls
    */
  var fileURLs: js.Array[String] = js.native
  /**
    * _Images supplied by a share sheet or a shortcut action._
    *
    * All images passed to the script from a share sheet or a shortcut action.
    *
    * If you have enabled "Images" as a share sheet input from the script settings, the script can be run from any share sheet throughout the system that shares images.
    *
    * When large images are passed from a share sheet or a shortcut action, the system may terminate the process due to memory constraints. In that case, you should enable "Run in App"
    * in the script settings or in the shortcut.
    * @see https://docs.scriptable.app/args/#images
    */
  var images: js.Array[Image] = js.native
  /**
    * _Notification being handled by the script._
    *
    * The notification that a script is being run in or the application was opened from.
    *
    * The notification contains all information that was set when the notification was originally scheduled, including the `userInfo` property which can be used to contain custom data
    * that might be relevant when running the script.
    * @see https://docs.scriptable.app/args/#notification
    */
  var notification: Notification = js.native
  /**
    * _Plain texts supplied by a share sheet or a shortcut action._
    *
    * All plain texts passed to the script from a share sheet or a shortcut action.
    *
    * If you have enabled "Text" as a share sheet input from the script settings, the script can be run from any share sheet throughout the system that shares plain text.
    * @see https://docs.scriptable.app/args/#plaintexts
    */
  var plainTexts: js.Array[String] = js.native
  /**
    * _Query parameters from a URL scheme._
    *
    * Query parameters are supplied to a script when running it from a URL scheme. See the documentation on Scriptables URL schems for more information.
    * @see https://docs.scriptable.app/args/#queryparameters
    */
  var queryParameters: StringDictionary[String] = js.native
  /**
    * _Parameter passed to a Shortcut._
    *
    * When creating a shortcut using the Shortcuts app, you can pass an input parameter that is passed to your script and that can be read using `args.shortcutParameter`.
    *
    * This parameter can be any text, list, dictionary or file and will be exposed in your script using the appropriate type. When passing a file, the "Run Script" action will attempt to
    * read the file as JSON or a plain text. If the file cannot be read as JSON or a plain text, a path to the file will be passed as the input parameter.
    * @see https://docs.scriptable.app/args/#shortcutparameter
    */
  var shortcutParameter: js.Any = js.native
  /**
    * _URLs supplied by a share sheet or a shortcut action.._
    *
    * All URLs passed to the script from a share sheet or a shortcut action.
    *
    * If you have enabled "URLs" as a share sheet input from the script settings, the script can be run from any share sheet throughout the system that shares URLs.
    * @see https://docs.scriptable.app/args/#urls
    */
  var urls: js.Array[String] = js.native
}

