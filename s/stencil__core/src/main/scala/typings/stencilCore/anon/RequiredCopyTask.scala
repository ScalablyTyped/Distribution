package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@stencil/core.@stencil/core/internal/stencil-public-compiler.CopyTask> */
trait RequiredCopyTask extends StObject {
  
  var dest: String
  
  var keepDirStructure: Boolean
  
  var src: String
  
  var warn: Boolean
}
object RequiredCopyTask {
  
  inline def apply(dest: String, keepDirStructure: Boolean, src: String, warn: Boolean): RequiredCopyTask = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], keepDirStructure = keepDirStructure.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCopyTask]
  }
  
  extension [Self <: RequiredCopyTask](x: Self) {
    
    inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setKeepDirStructure(value: Boolean): Self = StObject.set(x, "keepDirStructure", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
