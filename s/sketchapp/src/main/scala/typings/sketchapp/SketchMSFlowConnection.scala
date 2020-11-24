package typings.sketchapp

import typings.sketchapp.sketchappStrings.back
import typings.sketchapp.sketchappStrings.immutableFlowConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSFlowConnection extends js.Object {
  
  var _class: immutableFlowConnection = js.native
  
  var animationType: Double = js.native
  
  var destinationArtboardID: js.UndefOr[String | back] = js.native
}
object SketchMSFlowConnection {
  
  @scala.inline
  def apply(_class: immutableFlowConnection, animationType: Double): SketchMSFlowConnection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFlowConnection]
  }
  
  @scala.inline
  implicit class SketchMSFlowConnectionOps[Self <: SketchMSFlowConnection] (val x: Self) extends AnyVal {
    
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
    def set_class(value: immutableFlowConnection): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationType(value: Double): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationArtboardID(value: String | back): Self = this.set("destinationArtboardID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationArtboardID: Self = this.set("destinationArtboardID", js.undefined)
  }
}
