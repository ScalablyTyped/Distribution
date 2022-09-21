package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.hasNamedSlots
import typings.stencilCore.stencilCoreStrings.hasSlots
import typings.stencilCore.stencilCoreStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentData extends StObject {
  
  var assetPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var componentClass: js.UndefOr[String] = js.undefined
  
  var componentPath: js.UndefOr[String] = js.undefined
  
  var connect: js.UndefOr[js.Array[ConnectData]] = js.undefined
  
  var context: js.UndefOr[js.Array[ContextData]] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var events: js.UndefOr[js.Array[EventData]] = js.undefined
  
  var host: js.UndefOr[Any] = js.undefined
  
  var hostElement: js.UndefOr[HostElementData] = js.undefined
  
  var listeners: js.UndefOr[js.Array[ListenerData]] = js.undefined
  
  var methods: js.UndefOr[js.Array[MethodData]] = js.undefined
  
  var priority: js.UndefOr[low] = js.undefined
  
  var props: js.UndefOr[js.Array[PropData]] = js.undefined
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var slot: js.UndefOr[hasSlots | hasNamedSlots] = js.undefined
  
  var states: js.UndefOr[js.Array[StateData]] = js.undefined
  
  var styles: js.UndefOr[StylesData] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object ComponentData {
  
  inline def apply(): ComponentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentData]
  }
  
  extension [Self <: ComponentData](x: Self) {
    
    inline def setAssetPaths(value: js.Array[String]): Self = StObject.set(x, "assetPaths", value.asInstanceOf[js.Any])
    
    inline def setAssetPathsUndefined: Self = StObject.set(x, "assetPaths", js.undefined)
    
    inline def setAssetPathsVarargs(value: String*): Self = StObject.set(x, "assetPaths", js.Array(value*))
    
    inline def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
    
    inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    
    inline def setComponentPath(value: String): Self = StObject.set(x, "componentPath", value.asInstanceOf[js.Any])
    
    inline def setComponentPathUndefined: Self = StObject.set(x, "componentPath", js.undefined)
    
    inline def setConnect(value: js.Array[ConnectData]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnectVarargs(value: ConnectData*): Self = StObject.set(x, "connect", js.Array(value*))
    
    inline def setContext(value: js.Array[ContextData]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: ContextData*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setEvents(value: js.Array[EventData]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: EventData*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setHost(value: Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostElement(value: HostElementData): Self = StObject.set(x, "hostElement", value.asInstanceOf[js.Any])
    
    inline def setHostElementUndefined: Self = StObject.set(x, "hostElement", js.undefined)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setListeners(value: js.Array[ListenerData]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: ListenerData*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setMethods(value: js.Array[MethodData]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: MethodData*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setPriority(value: low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProps(value: js.Array[PropData]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setPropsVarargs(value: PropData*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSlot(value: hasSlots | hasNamedSlots): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setStates(value: js.Array[StateData]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: StateData*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setStyles(value: StylesData): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
