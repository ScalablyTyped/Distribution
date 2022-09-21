package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleCompiler extends StObject {
  
  var externalStyles: js.Array[ExternalStyleCompiler]
  
  var modeName: String
  
  var styleId: String
  
  var styleIdentifier: String
  
  var styleStr: String
}
object StyleCompiler {
  
  inline def apply(
    externalStyles: js.Array[ExternalStyleCompiler],
    modeName: String,
    styleId: String,
    styleIdentifier: String,
    styleStr: String
  ): StyleCompiler = {
    val __obj = js.Dynamic.literal(externalStyles = externalStyles.asInstanceOf[js.Any], modeName = modeName.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], styleIdentifier = styleIdentifier.asInstanceOf[js.Any], styleStr = styleStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCompiler]
  }
  
  extension [Self <: StyleCompiler](x: Self) {
    
    inline def setExternalStyles(value: js.Array[ExternalStyleCompiler]): Self = StObject.set(x, "externalStyles", value.asInstanceOf[js.Any])
    
    inline def setExternalStylesVarargs(value: ExternalStyleCompiler*): Self = StObject.set(x, "externalStyles", js.Array(value*))
    
    inline def setModeName(value: String): Self = StObject.set(x, "modeName", value.asInstanceOf[js.Any])
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setStyleIdentifier(value: String): Self = StObject.set(x, "styleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStyleStr(value: String): Self = StObject.set(x, "styleStr", value.asInstanceOf[js.Any])
  }
}
