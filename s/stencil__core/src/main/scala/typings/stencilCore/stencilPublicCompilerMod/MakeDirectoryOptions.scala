package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeDirectoryOptions extends StObject {
  
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777.
    */
  var mode: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether parent folders should be created.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object MakeDirectoryOptions {
  
  inline def apply(): MakeDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeDirectoryOptions]
  }
  
  extension [Self <: MakeDirectoryOptions](x: Self) {
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
