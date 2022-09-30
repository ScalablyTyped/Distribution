package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.anon.IsProcessingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerStore extends EventEmitter[IsProcessingData] {
  
  def clear(): Unit = js.native
  
  /** Profiling data has been recorded for at least one root. */
  def didRecordCommits: Boolean = js.native
  
  def getCommitData(rootID: Double, commitIndex: Double): CommitDataFrontend = js.native
  
  def getDataForRoot(rootID: Double): ProfilingDataForRootFrontend = js.native
  
  def isProcessingData: Boolean = js.native
  
  def isProfiling: Boolean = js.native
  
  def onBridgeOperations(operations: js.Array[Double]): Unit = js.native
  
  def onBridgeProfilingData(dataBackend: ProfilingDataBackend): Unit = js.native
  
  def onBridgeShutdown(): Unit = js.native
  
  def onProfilingStatus(isProfiling: Boolean): Unit = js.native
  
  def profilingCache: ProfilingCache = js.native
  
  def profilingData: ProfilingDataFrontend | Null = js.native
  def profilingData_=(value: ProfilingDataFrontend | Null): Unit = js.native
  
  def startProfiling(): Unit = js.native
  
  def stopProfiling(): Unit = js.native
}
