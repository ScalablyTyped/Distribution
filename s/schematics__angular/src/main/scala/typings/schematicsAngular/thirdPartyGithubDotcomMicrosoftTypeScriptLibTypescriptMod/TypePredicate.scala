package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.AssertsIdentifier
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.AssertsThis
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.This
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ThisTypePredicate
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.IdentifierTypePredicate
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertsThisTypePredicate
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends StObject
object TypePredicate {
  
  inline def AssertsIdentifierTypePredicate(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertsIdentifierTypePredicate]
  }
  
  inline def AssertsThisTypePredicate(kind: AssertsThis, parameterIndex: Unit, parameterName: Unit): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertsThisTypePredicate]
  }
  
  inline def IdentifierTypePredicate(
    kind: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.IdentifierTypePredicate]
  }
  
  inline def ThisTypePredicate(kind: This, parameterIndex: Unit, parameterName: Unit, `type`: Type): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ThisTypePredicate]
  }
}
