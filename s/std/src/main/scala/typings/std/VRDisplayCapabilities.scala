package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface describes the capabilities of a VRDisplay — its features can be used to perform VR device capability tests, for example can it return position information. */
@js.native
trait VRDisplayCapabilities extends js.Object {
  
  val canPresent: scala.Boolean = js.native
  
  val hasExternalDisplay: scala.Boolean = js.native
  
  val hasOrientation: scala.Boolean = js.native
  
  val hasPosition: scala.Boolean = js.native
  
  val maxLayers: Double = js.native
}
object VRDisplayCapabilities {
  
  @scala.inline
  def apply(
    canPresent: scala.Boolean,
    hasExternalDisplay: scala.Boolean,
    hasOrientation: scala.Boolean,
    hasPosition: scala.Boolean,
    maxLayers: Double
  ): VRDisplayCapabilities = {
    val __obj = js.Dynamic.literal(canPresent = canPresent.asInstanceOf[js.Any], hasExternalDisplay = hasExternalDisplay.asInstanceOf[js.Any], hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any], maxLayers = maxLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayCapabilities]
  }
  
  @scala.inline
  implicit class VRDisplayCapabilitiesOps[Self <: VRDisplayCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanPresent(value: scala.Boolean): Self = this.set("canPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExternalDisplay(value: scala.Boolean): Self = this.set("hasExternalDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOrientation(value: scala.Boolean): Self = this.set("hasOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPosition(value: scala.Boolean): Self = this.set("hasPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLayers(value: Double): Self = this.set("maxLayers", value.asInstanceOf[js.Any])
  }
}
