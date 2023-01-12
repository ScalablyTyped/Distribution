package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.anon.IsSupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: std.Array<unknown>} */ trait BackendEvents extends StObject {
  
  var NativeStyleEditor_styleAndLayout: js.Array[StyleAndLayout]
  
  var backendVersion: js.Array[String]
  
  var bridgeProtocol: js.Array[BridgeProtocol]
  
  var extensionBackendInitialized: js.Array[Any]
  
  var fastRefreshScheduled: js.Array[Any]
  
  var getSavedPreferences: js.Array[Any]
  
  var inspectedElement: js.Array[InspectedElementPayload]
  
  var isBackendStorageAPISupported: js.Array[Boolean]
  
  var isNativeStyleEditorSupported: js.Array[IsSupported]
  
  var isSynchronousXHRSupported: js.Array[Boolean]
  
  var operations: js.Array[js.Array[Double]]
  
  var overrideComponentFilters: js.Array[js.Array[ComponentFilter]]
  
  var ownersList: js.Array[OwnersList]
  
  var profilingData: js.Array[ProfilingDataBackend]
  
  var profilingStatus: js.Array[Boolean]
  
  var reloadAppForProfiling: js.Array[Any]
  
  var selectFiber: js.Array[Double]
  
  var shutdown: js.Array[Any]
  
  var stopInspectingNative: js.Array[Boolean]
  
  var syncSelectionFromNativeElementsPanel: js.Array[Any]
  
  var syncSelectionToNativeElementsPanel: js.Array[Any]
  
  var unsupportedRendererVersion: js.Array[RendererID]
}
object BackendEvents {
  
  inline def apply(
    NativeStyleEditor_styleAndLayout: js.Array[StyleAndLayout],
    backendVersion: js.Array[String],
    bridgeProtocol: js.Array[BridgeProtocol],
    extensionBackendInitialized: js.Array[Any],
    fastRefreshScheduled: js.Array[Any],
    getSavedPreferences: js.Array[Any],
    inspectedElement: js.Array[InspectedElementPayload],
    isBackendStorageAPISupported: js.Array[Boolean],
    isNativeStyleEditorSupported: js.Array[IsSupported],
    isSynchronousXHRSupported: js.Array[Boolean],
    operations: js.Array[js.Array[Double]],
    overrideComponentFilters: js.Array[js.Array[ComponentFilter]],
    ownersList: js.Array[OwnersList],
    profilingData: js.Array[ProfilingDataBackend],
    profilingStatus: js.Array[Boolean],
    reloadAppForProfiling: js.Array[Any],
    selectFiber: js.Array[Double],
    shutdown: js.Array[Any],
    stopInspectingNative: js.Array[Boolean],
    syncSelectionFromNativeElementsPanel: js.Array[Any],
    syncSelectionToNativeElementsPanel: js.Array[Any],
    unsupportedRendererVersion: js.Array[RendererID]
  ): BackendEvents = {
    val __obj = js.Dynamic.literal(NativeStyleEditor_styleAndLayout = NativeStyleEditor_styleAndLayout.asInstanceOf[js.Any], backendVersion = backendVersion.asInstanceOf[js.Any], bridgeProtocol = bridgeProtocol.asInstanceOf[js.Any], extensionBackendInitialized = extensionBackendInitialized.asInstanceOf[js.Any], fastRefreshScheduled = fastRefreshScheduled.asInstanceOf[js.Any], getSavedPreferences = getSavedPreferences.asInstanceOf[js.Any], inspectedElement = inspectedElement.asInstanceOf[js.Any], isBackendStorageAPISupported = isBackendStorageAPISupported.asInstanceOf[js.Any], isNativeStyleEditorSupported = isNativeStyleEditorSupported.asInstanceOf[js.Any], isSynchronousXHRSupported = isSynchronousXHRSupported.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], overrideComponentFilters = overrideComponentFilters.asInstanceOf[js.Any], ownersList = ownersList.asInstanceOf[js.Any], profilingData = profilingData.asInstanceOf[js.Any], profilingStatus = profilingStatus.asInstanceOf[js.Any], reloadAppForProfiling = reloadAppForProfiling.asInstanceOf[js.Any], selectFiber = selectFiber.asInstanceOf[js.Any], shutdown = shutdown.asInstanceOf[js.Any], stopInspectingNative = stopInspectingNative.asInstanceOf[js.Any], syncSelectionFromNativeElementsPanel = syncSelectionFromNativeElementsPanel.asInstanceOf[js.Any], syncSelectionToNativeElementsPanel = syncSelectionToNativeElementsPanel.asInstanceOf[js.Any], unsupportedRendererVersion = unsupportedRendererVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendEvents] (val x: Self) extends AnyVal {
    
    inline def setBackendVersion(value: js.Array[String]): Self = StObject.set(x, "backendVersion", value.asInstanceOf[js.Any])
    
    inline def setBackendVersionVarargs(value: String*): Self = StObject.set(x, "backendVersion", js.Array(value*))
    
    inline def setBridgeProtocol(value: js.Array[BridgeProtocol]): Self = StObject.set(x, "bridgeProtocol", value.asInstanceOf[js.Any])
    
    inline def setBridgeProtocolVarargs(value: BridgeProtocol*): Self = StObject.set(x, "bridgeProtocol", js.Array(value*))
    
    inline def setExtensionBackendInitialized(value: js.Array[Any]): Self = StObject.set(x, "extensionBackendInitialized", value.asInstanceOf[js.Any])
    
    inline def setExtensionBackendInitializedVarargs(value: Any*): Self = StObject.set(x, "extensionBackendInitialized", js.Array(value*))
    
    inline def setFastRefreshScheduled(value: js.Array[Any]): Self = StObject.set(x, "fastRefreshScheduled", value.asInstanceOf[js.Any])
    
    inline def setFastRefreshScheduledVarargs(value: Any*): Self = StObject.set(x, "fastRefreshScheduled", js.Array(value*))
    
    inline def setGetSavedPreferences(value: js.Array[Any]): Self = StObject.set(x, "getSavedPreferences", value.asInstanceOf[js.Any])
    
    inline def setGetSavedPreferencesVarargs(value: Any*): Self = StObject.set(x, "getSavedPreferences", js.Array(value*))
    
    inline def setInspectedElement(value: js.Array[InspectedElementPayload]): Self = StObject.set(x, "inspectedElement", value.asInstanceOf[js.Any])
    
    inline def setInspectedElementVarargs(value: InspectedElementPayload*): Self = StObject.set(x, "inspectedElement", js.Array(value*))
    
    inline def setIsBackendStorageAPISupported(value: js.Array[Boolean]): Self = StObject.set(x, "isBackendStorageAPISupported", value.asInstanceOf[js.Any])
    
    inline def setIsBackendStorageAPISupportedVarargs(value: Boolean*): Self = StObject.set(x, "isBackendStorageAPISupported", js.Array(value*))
    
    inline def setIsNativeStyleEditorSupported(value: js.Array[IsSupported]): Self = StObject.set(x, "isNativeStyleEditorSupported", value.asInstanceOf[js.Any])
    
    inline def setIsNativeStyleEditorSupportedVarargs(value: IsSupported*): Self = StObject.set(x, "isNativeStyleEditorSupported", js.Array(value*))
    
    inline def setIsSynchronousXHRSupported(value: js.Array[Boolean]): Self = StObject.set(x, "isSynchronousXHRSupported", value.asInstanceOf[js.Any])
    
    inline def setIsSynchronousXHRSupportedVarargs(value: Boolean*): Self = StObject.set(x, "isSynchronousXHRSupported", js.Array(value*))
    
    inline def setNativeStyleEditor_styleAndLayout(value: js.Array[StyleAndLayout]): Self = StObject.set(x, "NativeStyleEditor_styleAndLayout", value.asInstanceOf[js.Any])
    
    inline def setNativeStyleEditor_styleAndLayoutVarargs(value: StyleAndLayout*): Self = StObject.set(x, "NativeStyleEditor_styleAndLayout", js.Array(value*))
    
    inline def setOperations(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setOverrideComponentFilters(value: js.Array[js.Array[ComponentFilter]]): Self = StObject.set(x, "overrideComponentFilters", value.asInstanceOf[js.Any])
    
    inline def setOverrideComponentFiltersVarargs(value: js.Array[ComponentFilter]*): Self = StObject.set(x, "overrideComponentFilters", js.Array(value*))
    
    inline def setOwnersList(value: js.Array[OwnersList]): Self = StObject.set(x, "ownersList", value.asInstanceOf[js.Any])
    
    inline def setOwnersListVarargs(value: OwnersList*): Self = StObject.set(x, "ownersList", js.Array(value*))
    
    inline def setProfilingData(value: js.Array[ProfilingDataBackend]): Self = StObject.set(x, "profilingData", value.asInstanceOf[js.Any])
    
    inline def setProfilingDataVarargs(value: ProfilingDataBackend*): Self = StObject.set(x, "profilingData", js.Array(value*))
    
    inline def setProfilingStatus(value: js.Array[Boolean]): Self = StObject.set(x, "profilingStatus", value.asInstanceOf[js.Any])
    
    inline def setProfilingStatusVarargs(value: Boolean*): Self = StObject.set(x, "profilingStatus", js.Array(value*))
    
    inline def setReloadAppForProfiling(value: js.Array[Any]): Self = StObject.set(x, "reloadAppForProfiling", value.asInstanceOf[js.Any])
    
    inline def setReloadAppForProfilingVarargs(value: Any*): Self = StObject.set(x, "reloadAppForProfiling", js.Array(value*))
    
    inline def setSelectFiber(value: js.Array[Double]): Self = StObject.set(x, "selectFiber", value.asInstanceOf[js.Any])
    
    inline def setSelectFiberVarargs(value: Double*): Self = StObject.set(x, "selectFiber", js.Array(value*))
    
    inline def setShutdown(value: js.Array[Any]): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setShutdownVarargs(value: Any*): Self = StObject.set(x, "shutdown", js.Array(value*))
    
    inline def setStopInspectingNative(value: js.Array[Boolean]): Self = StObject.set(x, "stopInspectingNative", value.asInstanceOf[js.Any])
    
    inline def setStopInspectingNativeVarargs(value: Boolean*): Self = StObject.set(x, "stopInspectingNative", js.Array(value*))
    
    inline def setSyncSelectionFromNativeElementsPanel(value: js.Array[Any]): Self = StObject.set(x, "syncSelectionFromNativeElementsPanel", value.asInstanceOf[js.Any])
    
    inline def setSyncSelectionFromNativeElementsPanelVarargs(value: Any*): Self = StObject.set(x, "syncSelectionFromNativeElementsPanel", js.Array(value*))
    
    inline def setSyncSelectionToNativeElementsPanel(value: js.Array[Any]): Self = StObject.set(x, "syncSelectionToNativeElementsPanel", value.asInstanceOf[js.Any])
    
    inline def setSyncSelectionToNativeElementsPanelVarargs(value: Any*): Self = StObject.set(x, "syncSelectionToNativeElementsPanel", js.Array(value*))
    
    inline def setUnsupportedRendererVersion(value: js.Array[RendererID]): Self = StObject.set(x, "unsupportedRendererVersion", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedRendererVersionVarargs(value: RendererID*): Self = StObject.set(x, "unsupportedRendererVersion", js.Array(value*))
  }
}
