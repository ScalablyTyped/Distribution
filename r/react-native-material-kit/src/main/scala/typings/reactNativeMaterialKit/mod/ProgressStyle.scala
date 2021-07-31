package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressStyle extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var bufferColor: js.UndefOr[String] = js.undefined
  
  var progressColor: js.UndefOr[String] = js.undefined
}
object ProgressStyle {
  
  @scala.inline
  def apply(): ProgressStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressStyle]
  }
  
  @scala.inline
  implicit class ProgressStyleMutableBuilder[Self <: ProgressStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBufferColor(value: String): Self = StObject.set(x, "bufferColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferColorUndefined: Self = StObject.set(x, "bufferColor", js.undefined)
    
    @scala.inline
    def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
  }
}
