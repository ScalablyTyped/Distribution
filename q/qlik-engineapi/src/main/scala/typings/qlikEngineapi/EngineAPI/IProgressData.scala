package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProgressData...
  */
trait IProgressData extends StObject {
  
  /**
    * This property is not used.
    */
  var qCompleted: Double
  
  /**
    * Information about the error messages that occur during the script execution.
    */
  var qErrorData: js.Array[IErrorData]
  
  /**
    * This property is set to true if the request is finished.
    */
  var qFinished: Boolean
  
  /**
    * This property is not used.
    */
  var qKB: Double
  
  /**
    * Request duration in milliseconds.
    */
  var qMillisecs: Double
  
  /**
    * A progress message is persistent when it informs about the start or end of a statement.
    * For example, it can inform about the total number of lines fetched from a data source, tells that the app was saved.
    *
    * All persistent progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qPersistentProgressMessages, the content of the localized message string is displayed
    * (not its message code).
    */
  var qPersistentProgress: String
  
  /**
    * List of persistent progress messages.
    */
  var qPersistentProgressMessages: js.Array[IProgressMessage]
  
  /**
    * This property is set to true if the request is started.
    */
  var qStarted: Boolean
  
  /**
    * This property is not used.
    */
  var qTotal: Double
  
  /**
    * A progress message is transient when it informs about the progress of an ongoing statement.
    * For example, it can tell how many lines are currently fetched from a data source.
    *
    * All transient progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qTransientProgressMessage, the content of the localized message string is displayed
    * (not its message code).
    */
  var qTransientProgress: String
  
  /**
    * Transient progress message.
    */
  var qTransientProgressMessage: IProgressMessage
  
  /**
    * This property is set to true when the engine pauses the script execution and waits for a user interaction.
    */
  var qUserInteractionWanted: Boolean
}
object IProgressData {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IProgressData] (val x: Self) extends AnyVal {
    
    inline def setQCompleted(value: Double): Self = StObject.set(x, "qCompleted", value.asInstanceOf[js.Any])
    
    inline def setQErrorData(value: js.Array[IErrorData]): Self = StObject.set(x, "qErrorData", value.asInstanceOf[js.Any])
    
    inline def setQErrorDataVarargs(value: IErrorData*): Self = StObject.set(x, "qErrorData", js.Array(value*))
    
    inline def setQFinished(value: Boolean): Self = StObject.set(x, "qFinished", value.asInstanceOf[js.Any])
    
    inline def setQKB(value: Double): Self = StObject.set(x, "qKB", value.asInstanceOf[js.Any])
    
    inline def setQMillisecs(value: Double): Self = StObject.set(x, "qMillisecs", value.asInstanceOf[js.Any])
    
    inline def setQPersistentProgress(value: String): Self = StObject.set(x, "qPersistentProgress", value.asInstanceOf[js.Any])
    
    inline def setQPersistentProgressMessages(value: js.Array[IProgressMessage]): Self = StObject.set(x, "qPersistentProgressMessages", value.asInstanceOf[js.Any])
    
    inline def setQPersistentProgressMessagesVarargs(value: IProgressMessage*): Self = StObject.set(x, "qPersistentProgressMessages", js.Array(value*))
    
    inline def setQStarted(value: Boolean): Self = StObject.set(x, "qStarted", value.asInstanceOf[js.Any])
    
    inline def setQTotal(value: Double): Self = StObject.set(x, "qTotal", value.asInstanceOf[js.Any])
    
    inline def setQTransientProgress(value: String): Self = StObject.set(x, "qTransientProgress", value.asInstanceOf[js.Any])
    
    inline def setQTransientProgressMessage(value: IProgressMessage): Self = StObject.set(x, "qTransientProgressMessage", value.asInstanceOf[js.Any])
    
    inline def setQUserInteractionWanted(value: Boolean): Self = StObject.set(x, "qUserInteractionWanted", value.asInstanceOf[js.Any])
  }
}
