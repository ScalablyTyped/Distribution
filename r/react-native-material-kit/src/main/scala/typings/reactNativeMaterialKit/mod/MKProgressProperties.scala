package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKProgressProperties
  extends StObject
     with ViewProps {
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var bufferAniDuration: js.UndefOr[Double] = js.undefined
  
  var bufferColor: js.UndefOr[String] = js.undefined
  
  var progress: js.UndefOr[Double] = js.undefined
  
  var progressAniDuration: js.UndefOr[Double] = js.undefined
  
  var progressColor: js.UndefOr[String] = js.undefined
}
object MKProgressProperties {
  
  @scala.inline
  def apply(): MKProgressProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKProgressProperties]
  }
  
  @scala.inline
  implicit class MKProgressPropertiesMutableBuilder[Self <: MKProgressProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferAniDuration(value: Double): Self = StObject.set(x, "bufferAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferAniDurationUndefined: Self = StObject.set(x, "bufferAniDuration", js.undefined)
    
    @scala.inline
    def setBufferColor(value: String): Self = StObject.set(x, "bufferColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferColorUndefined: Self = StObject.set(x, "bufferColor", js.undefined)
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressAniDuration(value: Double): Self = StObject.set(x, "progressAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressAniDurationUndefined: Self = StObject.set(x, "progressAniDuration", js.undefined)
    
    @scala.inline
    def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
