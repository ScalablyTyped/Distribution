package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableFlowConnection
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.automatic
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.back
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowConnection
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableFlowConnection
  
  var animationType: AnimationType
  
  var destinationArtboardID: Uuid | back | automatic
  
  var maintainScrollPosition: js.UndefOr[Boolean] = js.undefined
}
object FlowConnection {
  
  inline def apply(animationType: AnimationType, destinationArtboardID: Uuid | back | automatic): FlowConnection = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableFlowConnection", animationType = animationType.asInstanceOf[js.Any], destinationArtboardID = destinationArtboardID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowConnection]
  }
  
  extension [Self <: FlowConnection](x: Self) {
    
    inline def setAnimationType(value: AnimationType): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationArtboardID(value: Uuid | back | automatic): Self = StObject.set(x, "destinationArtboardID", value.asInstanceOf[js.Any])
    
    inline def setMaintainScrollPosition(value: Boolean): Self = StObject.set(x, "maintainScrollPosition", value.asInstanceOf[js.Any])
    
    inline def setMaintainScrollPositionUndefined: Self = StObject.set(x, "maintainScrollPosition", js.undefined)
    
    inline def set_class(value: MSImmutableFlowConnection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
