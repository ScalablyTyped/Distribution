package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxViewPort...
  */
trait INxViewPort extends StObject {
  
  /**
    * Height of the canvas in pixels.
    */
  var qHeight: Double
  
  /**
    * Width of the canvas in pixels.
    */
  var qWidth: Double
  
  /*
    * Zoom level.
    */
  var qZoomLevel: Double
}
object INxViewPort {
  
  @scala.inline
  def apply(qHeight: Double, qWidth: Double, qZoomLevel: Double): INxViewPort = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any], qZoomLevel = qZoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxViewPort]
  }
  
  @scala.inline
  implicit class INxViewPortMutableBuilder[Self <: INxViewPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHeight(value: Double): Self = StObject.set(x, "qHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQWidth(value: Double): Self = StObject.set(x, "qWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQZoomLevel(value: Double): Self = StObject.set(x, "qZoomLevel", value.asInstanceOf[js.Any])
  }
}
