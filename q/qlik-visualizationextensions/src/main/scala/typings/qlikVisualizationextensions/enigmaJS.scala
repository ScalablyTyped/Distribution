package typings.qlikVisualizationextensions

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.changed
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.closed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This section is added because the Qlik Sense Client after > 3.2 contains a engineapi
  * an this makes the handling more fluent for users of that files.
  */
object enigmaJS {
  
  @js.native
  trait IGeneratedAPI extends StObject {
    
    /**
      * manual emit an events
      * @param event - event that occures
      */
    @JSName("emit")
    def emit_changed(event: changed): Unit = js.native
    @JSName("emit")
    def emit_closed(event: closed): Unit = js.native
    
    /**
      * Despite the name, this property corresponds to the qInfo.qType property on your generic object's properties object.
      */
    var genericType: String = js.native
    
    /**
      * This property contains the handle QIX Engine assigned to the API.
      * Used internally in enigma.js for caches and JSON-RPC
      */
    var handle: Double = js.native
    
    /**
      * This property contains the unique identifier for this API.
      */
    var id: String = js.native
    
    /**
      * register a function for events
      * @param event - function called if this event occures
      * @param func - function that is called
      */
    @JSName("on")
    def on_changed(event: changed, func: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_closed(event: closed, func: js.Function0[Unit]): Unit = js.native
    
    /**
      * This property contains the schema class name for this API.
      */
    var `type`: String = js.native
  }
}
