package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProgressData...
  */
trait IProgressData extends js.Object {
  /**
    * This property is not used.
    */
  var qCompleted: scala.Double
  /**
    * Information about the error messages that occur during the script execution.
    */
  var qErrorData: js.Array[IErrorData]
  /**
    * This property is set to true if the request is finished.
    */
  var qFinished: scala.Boolean
  /**
    * This property is not used.
    */
  var qKB: scala.Double
  /**
    * Request duration in milliseconds.
    */
  var qMillisecs: scala.Double
  /**
    * A progress message is persistent when it informs about the start or end of a statement.
    * For example, it can inform about the total number of lines fetched from a data source, tells that the app was saved.
    *
    * All persistent progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qPersistentProgressMessages, the content of the localized message string is displayed
    * (not its message code).
    */
  var qPersistentProgress: java.lang.String
  /**
    * List of persistent progress messages.
    */
  var qPersistentProgressMessages: js.Array[IProgressMessage]
  /**
    * This property is set to true if the request is started.
    */
  var qStarted: scala.Boolean
  /**
    * This property is not used.
    */
  var qTotal: scala.Double
  /**
    * A progress message is transient when it informs about the progress of an ongoing statement.
    * For example, it can tell how many lines are currently fetched from a data source.
    *
    * All transient progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qTransientProgressMessage, the content of the localized message string is displayed
    * (not its message code).
    */
  var qTransientProgress: java.lang.String
  /**
    * Transient progress message.
    */
  var qTransientProgressMessage: IProgressMessage
  /**
    * This property is set to true when the engine pauses the script execution and waits for a user interaction.
    */
  var qUserInteractionWanted: scala.Boolean
}

