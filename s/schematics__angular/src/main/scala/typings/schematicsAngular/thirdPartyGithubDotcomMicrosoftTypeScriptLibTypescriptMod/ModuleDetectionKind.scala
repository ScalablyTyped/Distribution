package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleDetectionKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ModuleDetectionKind")
@js.native
object ModuleDetectionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleDetectionKind & Double] = js.native
  
  /**
    * Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+
    */
  @js.native
  sealed trait Auto
    extends StObject
       with ModuleDetectionKind
  /* 2 */ val Auto: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleDetectionKind.Auto & Double = js.native
  
  /**
    * Consider all non-declaration files modules, regardless of present syntax
    */
  @js.native
  sealed trait Force
    extends StObject
       with ModuleDetectionKind
  /* 3 */ val Force: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleDetectionKind.Force & Double = js.native
  
  /**
    * Files with imports, exports and/or import.meta are considered modules
    */
  @js.native
  sealed trait Legacy
    extends StObject
       with ModuleDetectionKind
  /* 1 */ val Legacy: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleDetectionKind.Legacy & Double = js.native
}
