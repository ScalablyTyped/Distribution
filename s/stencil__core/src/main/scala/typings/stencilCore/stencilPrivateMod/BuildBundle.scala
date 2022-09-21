package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBundle extends StObject {
  
  var fileName: String
  
  var mode: js.UndefOr[String] = js.undefined
  
  var outputs: js.Array[String]
  
  var scopedStyles: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object BuildBundle {
  
  inline def apply(fileName: String, outputs: js.Array[String]): BuildBundle = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBundle]
  }
  
  extension [Self <: BuildBundle](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setScopedStyles(value: Boolean): Self = StObject.set(x, "scopedStyles", value.asInstanceOf[js.Any])
    
    inline def setScopedStylesUndefined: Self = StObject.set(x, "scopedStyles", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
