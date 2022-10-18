package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacGitMod {
  
  @JSImport("snyk/dist/lib/iac/git", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRepositoryRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryRoot")().asInstanceOf[String]
  inline def getRepositoryRoot(cwd: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryRoot")(cwd.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRepositoryRootForPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryRootForPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getWorkingDirectoryForPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkingDirectoryForPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
}
