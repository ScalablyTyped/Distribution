package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryBundle extends StObject {
  
  var fileName: String
  
  var isScopedStyles: Boolean
  
  var modeName: String
  
  var outputs: js.Array[String]
  
  var sourceTarget: String
  
  var text: String
}
object EntryBundle {
  
  inline def apply(
    fileName: String,
    isScopedStyles: Boolean,
    modeName: String,
    outputs: js.Array[String],
    sourceTarget: String,
    text: String
  ): EntryBundle = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isScopedStyles = isScopedStyles.asInstanceOf[js.Any], modeName = modeName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryBundle]
  }
  
  extension [Self <: EntryBundle](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setIsScopedStyles(value: Boolean): Self = StObject.set(x, "isScopedStyles", value.asInstanceOf[js.Any])
    
    inline def setModeName(value: String): Self = StObject.set(x, "modeName", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSourceTarget(value: String): Self = StObject.set(x, "sourceTarget", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
