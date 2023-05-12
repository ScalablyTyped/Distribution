package typings.sentryReplay.typesTypesMod

import typings.sentryTypes.typesReplayMod.ReplayRecordingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplayContainer extends StObject {
  
  def addUpdate(cb: AddUpdateCallback): Unit = js.native
  
  def checkAndHandleExpiredSession(): Boolean | Unit = js.native
  
  var eventBuffer: EventBuffer | Null = js.native
  
  def flushImmediate(): js.Promise[Unit] = js.native
  
  def getContext(): InternalEventContext = js.native
  
  def getOptions(): ReplayPluginOptions = js.native
  
  def getSessionId(): js.UndefOr[String] = js.native
  
  def initializeSampling(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
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
  
  var timeouts: Timeouts = js.native
  
  def triggerUserActivity(): Unit = js.native
}
