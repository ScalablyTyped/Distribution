package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypePredicateKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind & Double] = js.native
  
  @js.native
  sealed trait AssertsIdentifier
    extends StObject
       with TypePredicateKind
  /* 3 */ val AssertsIdentifier: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.AssertsIdentifier & Double = js.native
  
  @js.native
  sealed trait AssertsThis
    extends StObject
       with TypePredicateKind
  /* 2 */ val AssertsThis: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.AssertsThis & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TypePredicateKind
  /* 1 */ val Identifier: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.Identifier & Double = js.native
  
  @js.native
  sealed trait This
    extends StObject
       with TypePredicateKind
  /* 0 */ val This: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.This & Double = js.native
}
