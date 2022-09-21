package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyTask extends StObject {
  
  var dest: js.UndefOr[String] = js.undefined
  
  var keepDirStructure: js.UndefOr[Boolean] = js.undefined
  
  var src: String
  
  var warn: js.UndefOr[Boolean] = js.undefined
}
object CopyTask {
  
  inline def apply(src: String): CopyTask = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyTask]
  }
  
  extension [Self <: CopyTask](x: Self) {
    
    inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
    
    inline def setKeepDirStructure(value: Boolean): Self = StObject.set(x, "keepDirStructure", value.asInstanceOf[js.Any])
    
    inline def setKeepDirStructureUndefined: Self = StObject.set(x, "keepDirStructure", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
