package typings.sketchapp

import typings.sketchapp.sketchappStrings.back
import typings.sketchapp.sketchappStrings.immutableFlowConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSFlowConnection extends StObject {
  
  var _class: immutableFlowConnection
  
  var animationType: Double
  
  var destinationArtboardID: js.UndefOr[String | back] = js.undefined
}
object SketchMSFlowConnection {
  
  inline def apply(animationType: Double): SketchMSFlowConnection = {
    val __obj = js.Dynamic.literal(_class = "immutableFlowConnection", animationType = animationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFlowConnection]
  }
  
  extension [Self <: SketchMSFlowConnection](x: Self) {
    
    inline def setAnimationType(value: Double): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationArtboardID(value: String | back): Self = StObject.set(x, "destinationArtboardID", value.asInstanceOf[js.Any])
    
    inline def setDestinationArtboardIDUndefined: Self = StObject.set(x, "destinationArtboardID", js.undefined)
    
    inline def set_class(value: immutableFlowConnection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
