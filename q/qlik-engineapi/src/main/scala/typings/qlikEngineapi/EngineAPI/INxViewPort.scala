package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxViewPort...
  */
@js.native
trait INxViewPort extends js.Object {
  
  /**
    * Height of the canvas in pixels.
    */
  var qHeight: Double = js.native
  
  /**
    * Width of the canvas in pixels.
    */
  var qWidth: Double = js.native
  
  /*
    * Zoom level.
    */
  var qZoomLevel: Double = js.native
}
object INxViewPort {
  
  @scala.inline
  def apply(qHeight: Double, qWidth: Double, qZoomLevel: Double): INxViewPort = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any], qZoomLevel = qZoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxViewPort]
  }
  
  @scala.inline
  implicit class INxViewPortOps[Self <: INxViewPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQHeight(value: Double): Self = this.set("qHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQWidth(value: Double): Self = this.set("qWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQZoomLevel(value: Double): Self = this.set("qZoomLevel", value.asInstanceOf[js.Any])
  }
}
