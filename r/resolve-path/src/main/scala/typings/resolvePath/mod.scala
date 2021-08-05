package typings.resolvePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(relativePath: String): String = ^.asInstanceOf[js.Dynamic].apply(relativePath.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Resolve a relative path against the provided root path and return an absolute path.
    * *This will throw* if the resulting resolution seems malicious. The following are malicious:
    *
    *  * The relative path is an absolute path
    *  * The relative path contains a NULL byte
    *  * The relative path resolves to a path outside of the root path
    *  * The relative path traverses above the root and back down
    */
  // tslint:disable-next-line unified-signatures
  inline def apply(rootPath: String, relativePath: String): String = (^.asInstanceOf[js.Dynamic].apply(rootPath.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("resolve-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
