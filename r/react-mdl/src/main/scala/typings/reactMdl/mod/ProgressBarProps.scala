package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarProps
  extends StObject
     with HTMLProps[js.Any] {
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var progress: js.UndefOr[Double] = js.undefined
}
object ProgressBarProps {
  
  inline def apply(): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarProps]
  }
  
  extension [Self <: ProgressBarProps](x: Self) {
    
    inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
