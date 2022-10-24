package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.anon.BackendVersion
import typings.reactDevtoolsInline.anon.ErrorCount
import typings.reactDevtoolsInline.anon.Index
import typings.reactDevtoolsInline.anon.IsSupported
import typings.reactDevtoolsInline.frontendMod.Config
import typings.std.Element
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-devtools-inline/commons", "Store")
@js.native
open class Store protected () extends EventEmitter[BackendVersion] {
  def this(bridge: FrontendBridge) = this()
  def this(bridge: FrontendBridge, config: Config) = this()
  
  /** This is only used in tests to avoid memory leaks. */
  def assertExpectedRootMapSizes(): Unit = js.native
  
  /**  This is only used in tests to avoid memory leaks. */
  def assertMapSizeMatchesRootCount(map: Map[Any, Any], mapName: String): Unit = js.native
  
  def backendVersion: String | Null = js.native
  
  def bridgeProtocol: BridgeProtocol | Null = js.native
  
  def collapseNodesByDefault: Boolean = js.native
  def collapseNodesByDefault_=(value: Boolean): Unit = js.native
  
  def componentFilters: js.Array[ComponentFilter] = js.native
  def componentFilters_=(value: js.Array[ComponentFilter]): Unit = js.native
  
  def containsElement(id: Double): Boolean = js.native
  
  def errorCount: Double = js.native
  
  def getElementAtIndex(index: Double): Element | Null = js.native
  
  def getElementByID(id: Double): Element | Null = js.native
  
  def getElementIDAtIndex(index: Double): Double | Null = js.native
  
  def getElementsWithErrorsAndWarnings(): js.Array[Index] = js.native
  
  def getErrorAndWarningCountForElementID(id: Double): ErrorCount = js.native
  
  def getIndexOfElementID(id: Double): Double | Null = js.native
  
  def getOwnersListForElement(ownerID: Double): js.Array[Element] = js.native
  
  def getRendererIDForElement(id: Double): Double | Null = js.native
  
  def getRootIDForElement(id: Double): Double | Null = js.native
  
  def hasOwnerMetadata: Boolean = js.native
  
  def isInsideCollapsedSubTree(id: Double): Boolean = js.native
  
  def nativeStyleEditorValidAttributes: js.Array[String] | Null = js.native
  
  def numElements: Double = js.native
  
  def onBackendStorageAPISupported(isBackendStorageAPISupported: Boolean): Unit = js.native
  
  def onBridgeBackendVersion(backendVersion: String): Unit = js.native
  
  def onBridgeNativeStyleEditorSupported(param0: IsSupported): Unit = js.native
  
  def onBridgeOperations(operations: js.Array[Double]): Unit = js.native
  
  /**
    * Certain backends save filters on a per-domain basis.
    * In order to prevent filter preferences and applied filters from being out of sync,
    * this message enables the backend to override the frontend's current ("saved") filters.
    * This action should also override the saved filters too,
    * else reloading the frontend without reloading the backend would leave things out of sync.
    */
  def onBridgeOverrideComponentFilters(componentFilters: js.Array[ComponentFilter]): Unit = js.native
  
  def onBridgeProtocol(bridgeProtocol: BridgeProtocol): Unit = js.native
  
  def onBridgeProtocolTimeout(): Unit = js.native
  
  def onBridgeShutdown(): Unit = js.native
  
  def onBridgeSynchronousXHRSupported(isSynchronousXHRSupported: Boolean): Unit = js.native
  
  def onBridgeUnsupportedRendererVersion(): Unit = js.native
  
  def profilerStore: ProfilerStore = js.native
  
  def recordChangeDescriptions: Boolean = js.native
  def recordChangeDescriptions_=(value: Boolean): Unit = js.native
  
  def revision: Double = js.native
  
  def rootIDToRendererID: Map[Double, Double] = js.native
  
  /**
    * At least one of the currently mounted roots support the Legacy profiler.
    */
  def rootSupportsBasicProfiling: Boolean = js.native
  
  /** At least one of the currently mounted roots support the Timeline profiler. */
  def rootSupportsTimelineProfiling: Boolean = js.native
  
  def roots: js.Array[Double] = js.native
  
  def supportsNativeInspection: Boolean = js.native
  
  def supportsNativeStyleEditor: Boolean = js.native
  
  /**
    * This build of DevTools supports the legacy profiler.
    * This is a static flag, controlled by the Store config.
    */
  def supportsProfiling: Boolean = js.native
  
  def supportsReloadAndProfile: Boolean = js.native
  
  /**
    * This build of DevTools supports the Timeline profiler.
    * This is a static flag, controled by the Store config.
    */
  def supportsTimeline: Boolean = js.native
  
  def supportsTraceUpdates: Boolean = js.native
  
  def toggleIsCollapsed(id: Double, isCollapsed: Boolean): Unit = js.native
  
  def unsupportedBridgeProtocolDetected: Boolean = js.native
  
  def unsupportedRendererVersionDetected: Boolean = js.native
  
  def warningCount: Double = js.native
}
