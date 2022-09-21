package typings.remoteGitTags

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remote-git-tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(repoUrl: String): js.Promise[Map[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(repoUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, String]]]
}
