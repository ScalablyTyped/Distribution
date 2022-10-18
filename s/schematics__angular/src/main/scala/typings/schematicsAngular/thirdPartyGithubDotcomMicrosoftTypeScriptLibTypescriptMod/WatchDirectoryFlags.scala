package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryFlags extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryFlags & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with WatchDirectoryFlags
  /* 0 */ val None: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchDirectoryFlags.None & Double = js.native
  
  @js.native
  sealed trait Recursive
    extends StObject
       with WatchDirectoryFlags
  /* 1 */ val Recursive: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchDirectoryFlags.Recursive & Double = js.native
}
