package typings.qlikVisualizationextensions

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.changed
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.closed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This section is added because the Qlik Sense Client after > 3.2 contains a engineapi
  * an this makes the handling more fluent for users of that files.
  */
object enigmaJS {
  
  trait IGeneratedAPI extends StObject {
    
    /**
      * manual emit an events
      * @param event - event that occures
      */
    def emit(event: changed | closed): Unit
    
    /**
      * Despite the name, this property corresponds to the qInfo.qType property on your generic object's properties object.
      */
    var genericType: String
    
    /**
      * This property contains the handle QIX Engine assigned to the API.
      * Used internally in enigma.js for caches and JSON-RPC
      */
    var handle: Double
    
    /**
      * This property contains the unique identifier for this API.
      */
    var id: String
    
    /**
      * register a function for events
      * @param event - function called if this event occures
      * @param func - function that is called
      */
    def on(event: changed | closed, func: js.Function0[Unit]): Unit
    
    /**
      * This property contains the schema class name for this API.
      */
    var `type`: String
  }
  object IGeneratedAPI {
    
    inline def apply(
      emit: changed | closed => Unit,
      genericType: String,
      handle: Double,
      id: String,
      on: (changed | closed, js.Function0[Unit]) => Unit,
      `type`: String
    ): IGeneratedAPI = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), genericType = genericType.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeneratedAPI]
    }
    
    extension [Self <: IGeneratedAPI](x: Self) {
      
      inline def setEmit(value: changed | closed => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setGenericType(value: String): Self = StObject.set(x, "genericType", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (changed | closed, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
