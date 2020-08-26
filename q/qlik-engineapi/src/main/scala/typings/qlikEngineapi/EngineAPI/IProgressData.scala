package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProgressData...
  */
@js.native
trait IProgressData extends js.Object {
  /**
    * This property is not used.
    */
  var qCompleted: Double = js.native
  /**
    * Information about the error messages that occur during the script execution.
    */
  var qErrorData: js.Array[IErrorData] = js.native
  /**
    * This property is set to true if the request is finished.
    */
  var qFinished: Boolean = js.native
  /**
    * This property is not used.
    */
  var qKB: Double = js.native
  /**
    * Request duration in milliseconds.
    */
  var qMillisecs: Double = js.native
  /**
    * A progress message is persistent when it informs about the start or end of a statement.
    * For example, it can inform about the total number of lines fetched from a data source, tells that the app was saved.
    *
    * All persistent progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qPersistentProgressMessages, the content of the localized message string is displayed
    * (not its message code).
    */
  var qPersistentProgress: String = js.native
  /**
    * List of persistent progress messages.
    */
  var qPersistentProgressMessages: js.Array[IProgressMessage] = js.native
  /**
    * This property is set to true if the request is started.
    */
  var qStarted: Boolean = js.native
  /**
    * This property is not used.
    */
  var qTotal: Double = js.native
  /**
    * A progress message is transient when it informs about the progress of an ongoing statement.
    * For example, it can tell how many lines are currently fetched from a data source.
    *
    * All transient progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qTransientProgressMessage, the content of the localized message string is displayed
    * (not its message code).
    */
  var qTransientProgress: String = js.native
  /**
    * Transient progress message.
    */
  var qTransientProgressMessage: IProgressMessage = js.native
  /**
    * This property is set to true when the engine pauses the script execution and waits for a user interaction.
    */
  var qUserInteractionWanted: Boolean = js.native
}

object IProgressData {
  @scala.inline
  def apply(
    qCompleted: Double,
    qErrorData: js.Array[IErrorData],
    qFinished: Boolean,
    qKB: Double,
    qMillisecs: Double,
    qPersistentProgress: String,
    qPersistentProgressMessages: js.Array[IProgressMessage],
    qStarted: Boolean,
    qTotal: Double,
    qTransientProgress: String,
    qTransientProgressMessage: IProgressMessage,
    qUserInteractionWanted: Boolean
  ): IProgressData = {
    val __obj = js.Dynamic.literal(qCompleted = qCompleted.asInstanceOf[js.Any], qErrorData = qErrorData.asInstanceOf[js.Any], qFinished = qFinished.asInstanceOf[js.Any], qKB = qKB.asInstanceOf[js.Any], qMillisecs = qMillisecs.asInstanceOf[js.Any], qPersistentProgress = qPersistentProgress.asInstanceOf[js.Any], qPersistentProgressMessages = qPersistentProgressMessages.asInstanceOf[js.Any], qStarted = qStarted.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any], qTransientProgress = qTransientProgress.asInstanceOf[js.Any], qTransientProgressMessage = qTransientProgressMessage.asInstanceOf[js.Any], qUserInteractionWanted = qUserInteractionWanted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressData]
  }
  @scala.inline
  implicit class IProgressDataOps[Self <: IProgressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQCompleted(value: Double): Self = this.set("qCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setQErrorDataVarargs(value: IErrorData*): Self = this.set("qErrorData", js.Array(value :_*))
    @scala.inline
    def setQErrorData(value: js.Array[IErrorData]): Self = this.set("qErrorData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFinished(value: Boolean): Self = this.set("qFinished", value.asInstanceOf[js.Any])
    @scala.inline
    def setQKB(value: Double): Self = this.set("qKB", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMillisecs(value: Double): Self = this.set("qMillisecs", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPersistentProgress(value: String): Self = this.set("qPersistentProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPersistentProgressMessagesVarargs(value: IProgressMessage*): Self = this.set("qPersistentProgressMessages", js.Array(value :_*))
    @scala.inline
    def setQPersistentProgressMessages(value: js.Array[IProgressMessage]): Self = this.set("qPersistentProgressMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStarted(value: Boolean): Self = this.set("qStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTotal(value: Double): Self = this.set("qTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTransientProgress(value: String): Self = this.set("qTransientProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTransientProgressMessage(value: IProgressMessage): Self = this.set("qTransientProgressMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUserInteractionWanted(value: Boolean): Self = this.set("qUserInteractionWanted", value.asInstanceOf[js.Any])
  }
  
}

