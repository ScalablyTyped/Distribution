package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Configuration the script runs with._
  * @see https://docs.scriptable.app/config
  */
@JSGlobal("config")
@js.native
object config extends js.Object {
  /**
    * Whether the script was run from the home screen. You can add a script to the home screen from the script settings.
    * @see https://docs.scriptable.app/config/#runsfromhomescreen
    */
  var runsFromHomeScreen: Boolean = js.native
  /**
    * Whether the script is running in the action extension.
    * @see https://docs.scriptable.app/config/#runsinactionextension
    */
  var runsInActionExtension: Boolean = js.native
  /**
    * Whether the script is running in the app.
    * @see https://docs.scriptable.app/config/#runsinapp
    */
  var runsInApp: Boolean = js.native
  /**
    * Whether the script is running in a notification.
    * @see https://docs.scriptable.app/config/#runsinnotification
    */
  var runsInNotification: Boolean = js.native
  /**
    * Whether the script is running with Siri.
    * @see https://docs.scriptable.app/config/#runswithsiri
    */
  var runsWithSiri: Boolean = js.native
}

