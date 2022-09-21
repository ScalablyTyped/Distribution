package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemCreateDirectoryOptions extends StObject {
  
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777.
    */
  var mode: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether parent directories should be created.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object CompilerSystemCreateDirectoryOptions {
  
  inline def apply(): CompilerSystemCreateDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerSystemCreateDirectoryOptions]
  }
  
  extension [Self <: CompilerSystemCreateDirectoryOptions](x: Self) {
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
