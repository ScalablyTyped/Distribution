package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchFileKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchFileKind
  /* 2 */ val DynamicPriorityPolling: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchFileKind.DynamicPriorityPolling & Double = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchFileKind
  /* 3 */ val FixedChunkSizePolling: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchFileKind.FixedChunkSizePolling & Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchFileKind
  /* 0 */ val FixedPollingInterval: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchFileKind.FixedPollingInterval & Double = js.native
  
  @js.native
  sealed trait PriorityPollingInterval
    extends StObject
       with WatchFileKind
  /* 1 */ val PriorityPollingInterval: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchFileKind.PriorityPollingInterval & Double = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchFileKind
  /* 4 */ val UseFsEvents: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchFileKind.UseFsEvents & Double = js.native
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory
    extends StObject
       with WatchFileKind
  /* 5 */ val UseFsEventsOnParentDirectory: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchFileKind.UseFsEventsOnParentDirectory & Double = js.native
}
