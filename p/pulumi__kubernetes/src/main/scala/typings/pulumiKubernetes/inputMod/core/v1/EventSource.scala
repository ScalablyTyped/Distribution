package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSource contains information for an event.
  */
trait EventSource extends StObject {
  
  /**
    * Component from which the event is generated.
    */
  var component: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Node name on which the event is generated.
    */
  var host: js.UndefOr[Input[String]] = js.undefined
}
object EventSource {
  
  inline def apply(): EventSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSource]
  }
  
  extension [Self <: EventSource](x: Self) {
    
    inline def setComponent(value: Input[String]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
  }
}
