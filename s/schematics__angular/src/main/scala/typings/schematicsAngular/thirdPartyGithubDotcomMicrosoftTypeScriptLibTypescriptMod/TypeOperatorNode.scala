package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.KeyOfKeyword
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.TypeOperator
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.UniqueKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOperatorNode
  extends StObject
     with TypeNode
     with HasType {
  
  @JSName("kind")
  val kind_TypeOperatorNode: TypeOperator = js.native
  
  val operator: KeyOfKeyword | UniqueKeyword | typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ReadonlyKeyword = js.native
  
  val `type`: TypeNode = js.native
}
