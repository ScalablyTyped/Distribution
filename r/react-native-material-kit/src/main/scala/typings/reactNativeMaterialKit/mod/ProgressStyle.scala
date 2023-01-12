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
  
  inline def apply(): ProgressStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBufferColor(value: String): Self = StObject.set(x, "bufferColor", value.asInstanceOf[js.Any])
    
    inline def setBufferColorUndefined: Self = StObject.set(x, "bufferColor", js.undefined)
    
    inline def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
    
    inline def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
  }
}
