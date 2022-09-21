package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerFsStats extends StObject {
  
  /**
    * Error if there was one, otherwise `null`. `stat` and `statSync` do not throw errors but always returns this interface.
    */
  var error: Any
  
  /**
    * If it's a directory. `false` if there was an error.
    */
  var isDirectory: Boolean
  
  /**
    * If it's a file. `false` if there was an error.
    */
  var isFile: Boolean
  
  /**
    * If it's a symlink. `false` if there was an error.
    */
  var isSymbolicLink: Boolean
  
  /**
    * The timestamp indicating the last time this file was modified expressed in milliseconds since the POSIX Epoch.
    */
  var mtimeMs: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the file in bytes. `0` for directories or if there was an error.
    */
  var size: Double
}
object CompilerFsStats {
  
  inline def apply(error: Any, isDirectory: Boolean, isFile: Boolean, isSymbolicLink: Boolean, size: Double): CompilerFsStats = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isSymbolicLink = isSymbolicLink.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerFsStats]
  }
  
  extension [Self <: CompilerFsStats](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setIsSymbolicLink(value: Boolean): Self = StObject.set(x, "isSymbolicLink", value.asInstanceOf[js.Any])
    
    inline def setMtimeMs(value: Double): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
    
    inline def setMtimeMsUndefined: Self = StObject.set(x, "mtimeMs", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
