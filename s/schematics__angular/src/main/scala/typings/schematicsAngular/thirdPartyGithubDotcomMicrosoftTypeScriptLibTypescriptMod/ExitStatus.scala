package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExitStatus extends StObject
/** Return code used by getEmitOutput function to indicate status of the function */
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ExitStatus")
@js.native
object ExitStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus & Double] = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated
    extends StObject
       with ExitStatus
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.DiagnosticsPresent_OutputsGenerated & Double = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.DiagnosticsPresent_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 3 */ val InvalidProject_OutputsSkipped: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.InvalidProject_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped
    extends StObject
       with ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkipped: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.ProjectReferenceCycle_OutputsSkipped & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with ExitStatus
  /* 0 */ val Success: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ExitStatus.Success & Double = js.native
}
