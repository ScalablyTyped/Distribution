package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfigFile {
  
  inline def apply(): js.Promise[Null | String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Null | String]]
  inline def apply(filePath: String): js.Promise[Null | String] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null | String]]
  
  @JSImport("prettier", "resolveConfigFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[Null | String]
  inline def sync(filePath: String): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Null | String]
}
