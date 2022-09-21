package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemRemoveDirectoryOptions extends StObject {
  
  /**
    * Indicates whether child files and subdirectories should be removed.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object CompilerSystemRemoveDirectoryOptions {
  
  inline def apply(): CompilerSystemRemoveDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerSystemRemoveDirectoryOptions]
  }
  
  extension [Self <: CompilerSystemRemoveDirectoryOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
