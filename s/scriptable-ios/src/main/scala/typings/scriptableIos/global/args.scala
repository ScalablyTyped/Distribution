package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Arguments passed to the script._
  * @see https://docs.scriptable.app/args
  */
object args {
  
  @JSGlobal("args")
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSGlobal("args.fileURLs")
  @js.native
  def fileURLs: js.Array[String] = js.native
  @scala.inline
  def fileURLs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileURLs")(x.asInstanceOf[js.Any])
  
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
  @JSGlobal("args.images")
  @js.native
  def images: js.Array[typings.scriptableIos.Image] = js.native
  @scala.inline
  def images_=(x: js.Array[typings.scriptableIos.Image]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
  
  /**
    * _Notification being handled by the script._
    *
    * The notification that a script is being run in or the application was opened from.
    *
    * The notification contains all information that was set when the notification was originally scheduled, including the `userInfo` property which can be used to contain custom data
    * that might be relevant when running the script.
    * @see https://docs.scriptable.app/args/#notification
    */
  @JSGlobal("args.notification")
  @js.native
  def notification: typings.scriptableIos.Notification = js.native
  @scala.inline
  def notification_=(x: typings.scriptableIos.Notification): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notification")(x.asInstanceOf[js.Any])
  
  /**
    * _Plain texts supplied by a share sheet or a shortcut action._
    *
    * All plain texts passed to the script from a share sheet or a shortcut action.
    *
    * If you have enabled "Text" as a share sheet input from the script settings, the script can be run from any share sheet throughout the system that shares plain text.
    * @see https://docs.scriptable.app/args/#plaintexts
    */
  @JSGlobal("args.plainTexts")
  @js.native
  def plainTexts: js.Array[String] = js.native
  @scala.inline
  def plainTexts_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plainTexts")(x.asInstanceOf[js.Any])
  
  /**
    * _Parameter passed to a Shortcut._
    *
    * When creating a shortcut using the Shortcuts app, you can pass an input parameter that can be read in your script using `args.shortcutParameter`.
    *
    * This parameter can be any text, list, dictionary or file and will be exposed in your script using the appropriate type. When passing a file, the "Run Script" action will attempt to
    * read the file as JSON or a plain text. If the file cannot be read as JSON or a plain text, a path to the file will be passed as the input parameter.
    * @see https://docs.scriptable.app/args/#shortcutparameter
    */
  @JSGlobal("args.shortcutParameter")
  @js.native
  def shortcutParameter: js.Any = js.native
  @scala.inline
  def shortcutParameter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortcutParameter")(x.asInstanceOf[js.Any])
  
  /**
    * _URLs supplied by a share sheet or a shortcut action._
    *
    * All URLs passed to the script from a share sheet or a shortcut action.
    *
    * If you have enabled "URLs" as a share sheet input from the script settings, the script can be run from any share sheet throughout the system that shares URLs.
    * @see https://docs.scriptable.app/args/#urls
    */
  @JSGlobal("args.urls")
  @js.native
  def urls: js.Array[String] = js.native
  @scala.inline
  def urls_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
  
  /**
    * _Parameter passed to a widget._
    *
    * When creating a widget on the Home screen, you can define a parameter that can be read in your script using `args.widgetParameter`.
    *
    * The parameter can be used to differentiate the behavior of multiple widgets.
    * @see https://docs.scriptable.app/args/#widgetparameter
    */
  @JSGlobal("args.widgetParameter")
  @js.native
  def widgetParameter: js.Any = js.native
  @scala.inline
  def widgetParameter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("widgetParameter")(x.asInstanceOf[js.Any])
  
  /**
    * _Query parameters from a URL scheme._
    *
    * Query parameters are supplied to a script when running it from a URL scheme. See the documentation on Scriptables URL schemes for more information.
    * @see https://docs.scriptable.app/args/#queryparameters
    */
  object queryParameters
}
