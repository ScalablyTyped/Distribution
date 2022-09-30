package typings.reactDevtoolsInline.commonsMod

import typings.reactReconciler.mod.Fiber
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererInterface extends StObject {
  
  def cleanup(): Unit = js.native
  
  def clearErrorsAndWarnings(): Unit = js.native
  
  def clearErrorsForFiberID(id: Double): Unit = js.native
  
  def clearWarningsForFiberID(id: Double): Unit = js.native
  
  def copyElementPath(id: Double, path: js.Array[String | Double]): Unit = js.native
  
  def deletePath(`type`: Type, id: Double, hookID: Double, path: js.Array[String | Double]): Unit = js.native
  def deletePath(`type`: Type, id: Double, hookID: Null, path: js.Array[String | Double]): Unit = js.native
  def deletePath(`type`: Type, id: Double, hookID: Unit, path: js.Array[String | Double]): Unit = js.native
  
  var findNativeNodesForFiberID: FindNativeNodesForFiberID = js.native
  
  def flushInitialOperations(): Unit = js.native
  
  def getBestMatchForTrackedPath(): PathMatch | Null = js.native
  
  var getDisplayNameForFiberID: GetDisplayNameForFiberID = js.native
  
  def getFiberForNative(component: NativeType): Fiber | Null = js.native
  
  var getFiberIDForNative: GetFiberIDForNative = js.native
  
  def getInstanceAndStyle(id: Double): InstanceAndStyle = js.native
  
  def getOwnersList(id: Double): js.Array[SerializedElement] | Null = js.native
  
  def getPathForElement(id: Double): js.Array[PathFrame] | Null = js.native
  
  def getProfilingData(): ProfilingDataBackend = js.native
  
  def handleCommitFiberRoot(fiber: Record[String, Any]): Unit = js.native
  def handleCommitFiberRoot(fiber: Record[String, Any], commitPriority: Double): Unit = js.native
  
  def handleCommitFiberUnmount(fiber: Record[String, Any]): Unit = js.native
  
  def handlePostCommitFiberRoot(fiber: Record[String, Any]): Unit = js.native
  
  def inspectElement(requestID: Double, id: Double, inspectedPaths: Record[String, Any], forceFullData: Boolean): InspectedElementPayload = js.native
  
  def logElementToConsole(id: Double): Unit = js.native
  
  def overrideError(id: Double, forceError: Boolean): Unit = js.native
  
  def overrideSuspense(id: Double, forceFallback: Boolean): Unit = js.native
  
  def overrideValueAtPath(`type`: Type, id: Double, hook: Double, path: js.Array[String | Double], value: Any): Unit = js.native
  def overrideValueAtPath(`type`: Type, id: Double, hook: Null, path: js.Array[String | Double], value: Any): Unit = js.native
  def overrideValueAtPath(`type`: Type, id: Double, hook: Unit, path: js.Array[String | Double], value: Any): Unit = js.native
  
  def patchConsoleForStrictMode(): Unit = js.native
  
  def prepareViewAttributeSource(id: Double, path: js.Array[String | Double]): Unit = js.native
  
  def prepareViewElementSource(id: Double): Unit = js.native
  
  def renamePath(
    `type`: Type,
    id: Double,
    hookID: Double,
    oldPath: js.Array[String | Double],
    newPath: js.Array[String | Double]
  ): Unit = js.native
  def renamePath(
    `type`: Type,
    id: Double,
    hookID: Null,
    oldPath: js.Array[String | Double],
    newPath: js.Array[String | Double]
  ): Unit = js.native
  def renamePath(
    `type`: Type,
    id: Double,
    hookID: Unit,
    oldPath: js.Array[String | Double],
    newPath: js.Array[String | Double]
  ): Unit = js.native
  
  var renderer: ReactRenderer | Null = js.native
  
  def setTraceUpdatesEnabled(enabled: Boolean): Unit = js.native
  
  def setTrackedPath(): Unit = js.native
  def setTrackedPath(path: js.Array[PathFrame]): Unit = js.native
  
  def startProfiling(recordChangeDescriptions: Boolean): Unit = js.native
  
  def stopProfiling(): Unit = js.native
  
  def storeAsGlobal(id: Double, path: js.Array[String | Double], count: Double): Unit = js.native
  
  def unpatchConsoleForStrictMode(): Unit = js.native
  
  /** Timeline profiler interface */
  def updateComponentFilters(componentFilters: js.Array[ComponentFilter]): Unit = js.native
}
