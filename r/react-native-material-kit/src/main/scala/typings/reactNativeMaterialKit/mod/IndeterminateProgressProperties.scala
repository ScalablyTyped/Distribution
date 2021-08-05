package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndeterminateProgressProperties
  extends StObject
     with ViewProps {
  
  var progressAniDuration: js.UndefOr[Double] = js.undefined
  
  var progressColor: js.UndefOr[String] = js.undefined
}
object IndeterminateProgressProperties {
  
  inline def apply(): IndeterminateProgressProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndeterminateProgressProperties]
  }
  
  extension [Self <: IndeterminateProgressProperties](x: Self) {
    
    inline def setProgressAniDuration(value: Double): Self = StObject.set(x, "progressAniDuration", value.asInstanceOf[js.Any])
    
    inline def setProgressAniDurationUndefined: Self = StObject.set(x, "progressAniDuration", js.undefined)
    
    inline def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
    
    inline def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
  }
}
