package typings.resolvePackagePath

import typings.resolvePackagePath.anon.MODULEENTRY
import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheGroupMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("resolve-package-path/lib/cache-group", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MODULEENTRY {
    
    /* CompleteClass */
    var MODULE_ENTRY: Cache = js.native
    
    /* CompleteClass */
    var PATH: Cache = js.native
    
    /* CompleteClass */
    var REAL_DIRECTORY_PATH: Cache = js.native
    
    /* CompleteClass */
    var REAL_FILE_PATH: Cache = js.native
  }
}
