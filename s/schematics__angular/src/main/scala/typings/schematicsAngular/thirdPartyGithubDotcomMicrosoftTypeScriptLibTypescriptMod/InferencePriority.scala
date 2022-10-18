package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferencePriority extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "InferencePriority")
@js.native
object InferencePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority & Double] = js.native
  
  @js.native
  sealed trait AlwaysStrict
    extends StObject
       with InferencePriority
  /* 1024 */ val AlwaysStrict: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.AlwaysStrict & Double = js.native
  
  @js.native
  sealed trait Circularity
    extends StObject
       with InferencePriority
  /* -1 */ val Circularity: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.Circularity & Double = js.native
  
  @js.native
  sealed trait ContravariantConditional
    extends StObject
       with InferencePriority
  /* 64 */ val ContravariantConditional: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.ContravariantConditional & Double = js.native
  
  @js.native
  sealed trait HomomorphicMappedType
    extends StObject
       with InferencePriority
  /* 8 */ val HomomorphicMappedType: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.HomomorphicMappedType & Double = js.native
  
  @js.native
  sealed trait LiteralKeyof
    extends StObject
       with InferencePriority
  /* 256 */ val LiteralKeyof: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.LiteralKeyof & Double = js.native
  
  @js.native
  sealed trait MappedTypeConstraint
    extends StObject
       with InferencePriority
  /* 32 */ val MappedTypeConstraint: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.MappedTypeConstraint & Double = js.native
  
  @js.native
  sealed trait MaxValue
    extends StObject
       with InferencePriority
  /* 2048 */ val MaxValue: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.MaxValue & Double = js.native
  
  @js.native
  sealed trait NakedTypeVariable
    extends StObject
       with InferencePriority
  /* 1 */ val NakedTypeVariable: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.NakedTypeVariable & Double = js.native
  
  @js.native
  sealed trait NoConstraints
    extends StObject
       with InferencePriority
  /* 512 */ val NoConstraints: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.NoConstraints & Double = js.native
  
  @js.native
  sealed trait PartialHomomorphicMappedType
    extends StObject
       with InferencePriority
  /* 16 */ val PartialHomomorphicMappedType: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.PartialHomomorphicMappedType & Double = js.native
  
  @js.native
  sealed trait PriorityImpliesCombination
    extends StObject
       with InferencePriority
  /* 416 */ val PriorityImpliesCombination: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.PriorityImpliesCombination & Double = js.native
  
  @js.native
  sealed trait ReturnType
    extends StObject
       with InferencePriority
  /* 128 */ val ReturnType: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.ReturnType & Double = js.native
  
  @js.native
  sealed trait SpeculativeTuple
    extends StObject
       with InferencePriority
  /* 2 */ val SpeculativeTuple: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.SpeculativeTuple & Double = js.native
  
  @js.native
  sealed trait SubstituteSource
    extends StObject
       with InferencePriority
  /* 4 */ val SubstituteSource: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InferencePriority.SubstituteSource & Double = js.native
}
