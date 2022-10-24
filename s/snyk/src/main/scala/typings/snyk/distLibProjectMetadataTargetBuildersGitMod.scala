package typings.snyk

import typings.snyk.anon.Cwd
import typings.snyk.distLibProjectMetadataTypesMod.GitTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibProjectMetadataTargetBuildersGitMod {
  
  @JSImport("snyk/dist/lib/project-metadata/target-builders/git", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInfo(param0: Cwd): js.Promise[GitTarget | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GitTarget | Null]]
}
