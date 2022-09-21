package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConstructor extends StObject {
  
  var cmpMeta: js.UndefOr[ComponentRuntimeMeta] = js.undefined
  
  var encapsulation: js.UndefOr[ComponentConstructorEncapsulation] = js.undefined
  
  var events: js.UndefOr[js.Array[ComponentConstructorEvent]] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var isProxied: js.UndefOr[Boolean] = js.undefined
  
  var isStyleRegistered: js.UndefOr[Boolean] = js.undefined
  
  var listeners: js.UndefOr[js.Array[ComponentConstructorListener]] = js.undefined
  
  var observedAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var properties: js.UndefOr[ComponentConstructorProperties] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var styleId: js.UndefOr[String] = js.undefined
  
  var watchers: js.UndefOr[ComponentConstructorWatchers] = js.undefined
}
object ComponentConstructor {
  
  inline def apply(): ComponentConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentConstructor]
  }
  
  extension [Self <: ComponentConstructor](x: Self) {
    
    inline def setCmpMeta(value: ComponentRuntimeMeta): Self = StObject.set(x, "cmpMeta", value.asInstanceOf[js.Any])
    
    inline def setCmpMetaUndefined: Self = StObject.set(x, "cmpMeta", js.undefined)
    
    inline def setEncapsulation(value: ComponentConstructorEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setEvents(value: js.Array[ComponentConstructorEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: ComponentConstructorEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsProxied(value: Boolean): Self = StObject.set(x, "isProxied", value.asInstanceOf[js.Any])
    
    inline def setIsProxiedUndefined: Self = StObject.set(x, "isProxied", js.undefined)
    
    inline def setIsStyleRegistered(value: Boolean): Self = StObject.set(x, "isStyleRegistered", value.asInstanceOf[js.Any])
    
    inline def setIsStyleRegisteredUndefined: Self = StObject.set(x, "isStyleRegistered", js.undefined)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setListeners(value: js.Array[ComponentConstructorListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: ComponentConstructorListener*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setObservedAttributes(value: js.Array[String]): Self = StObject.set(x, "observedAttributes", value.asInstanceOf[js.Any])
    
    inline def setObservedAttributesUndefined: Self = StObject.set(x, "observedAttributes", js.undefined)
    
    inline def setObservedAttributesVarargs(value: String*): Self = StObject.set(x, "observedAttributes", js.Array(value*))
    
    inline def setProperties(value: ComponentConstructorProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setStyleIdUndefined: Self = StObject.set(x, "styleId", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWatchers(value: ComponentConstructorWatchers): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchersUndefined: Self = StObject.set(x, "watchers", js.undefined)
  }
}
