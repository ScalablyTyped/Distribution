package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxExpression
  extends StObject
     with Expression
     with JsxAttributeValue
     with JsxChild {
  
  val dotDotDotToken: js.UndefOr[
    Token[
      typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.DotDotDotToken
    ]
  ] = js.native
  
  val expression: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_JsxExpression: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.JsxExpression = js.native
  
  @JSName("parent")
  val parent_JsxExpression: JsxElement | JsxFragment | JsxAttributeLike = js.native
}
