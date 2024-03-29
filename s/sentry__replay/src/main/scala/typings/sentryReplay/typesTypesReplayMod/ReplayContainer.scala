package typings.sentryReplay.typesTypesReplayMod

import typings.sentryReplay.typesTypesPerformanceMod.AllPerformanceEntry
import typings.sentryTypes.typesReplayMod.ReplayRecordingMode
import typings.sentryTypes.typesTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplayContainer extends StObject {
  
  def addUpdate(cb: AddUpdateCallback): Unit = js.native
  
  def cancelFlush(): Unit = js.native
  
  def checkAndHandleExpiredSession(): Boolean | Unit = js.native
  
  var clickDetector: js.UndefOr[ReplayClickDetector] = js.native
  
  def conditionalFlush(): js.Promise[Unit] = js.native
  
  var eventBuffer: EventBuffer | Null = js.native
  
  def flushImmediate(): js.Promise[Unit] = js.native
  
  def getContext(): InternalEventContext = js.native
  
  def getCurrentRoute(): js.UndefOr[String] = js.native
  
  def getOptions(): ReplayPluginOptions = js.native
  
  def getSessionId(): js.UndefOr[String] = js.native
  
  def initializeSampling(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  var lastTransaction: js.UndefOr[Transaction] = js.native
  
  def pause(): Unit = js.native
  
  var performanceEvents: js.Array[AllPerformanceEntry] = js.native
  
  var recordingMode: ReplayRecordingMode = js.native
  
  def resume(): Unit = js.native
  
  def sendBufferedReplayOrFlush(): js.Promise[Unit] = js.native
  def sendBufferedReplayOrFlush(options: SendBufferedReplayOptions): js.Promise[Unit] = js.native
  
  var session: js.UndefOr[Session] = js.native
  
  def setInitialState(): Unit = js.native
  
  def start(): Unit = js.native
  
  def startRecording(): Unit = js.native
  
  def stop(): js.Promise[Unit] = js.native
  def stop(reason: String): js.Promise[Unit] = js.native
  
  def stopRecording(): Boolean = js.native
  
  def throttledAddEvent(event: RecordingEvent): (/* "__THROTTLED" */ String) | (js.Promise[AddEventResult | Null]) = js.native
  def throttledAddEvent(event: RecordingEvent, isCheckout: Boolean): (/* "__THROTTLED" */ String) | (js.Promise[AddEventResult | Null]) = js.native
  
  var timeouts: Timeouts = js.native
  
  def triggerUserActivity(): Unit = js.native
  
  def updateUserActivity(): Unit = js.native
}
