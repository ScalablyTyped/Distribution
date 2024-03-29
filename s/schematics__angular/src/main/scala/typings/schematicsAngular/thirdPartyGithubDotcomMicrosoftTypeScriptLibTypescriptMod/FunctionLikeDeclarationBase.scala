package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Several node kinds share function-like features such as a signature,
  * a name, and a body. These nodes should extend FunctionLikeDeclarationBase.
  * Examples:
  * - FunctionDeclaration
  * - MethodDeclaration
  * - AccessorDeclaration
  */
@js.native
trait FunctionLikeDeclarationBase
  extends StObject
     with SignatureDeclarationBase {
  
  var _functionLikeDeclarationBrand: Any = js.native
  
  val asteriskToken: js.UndefOr[AsteriskToken] = js.native
  
  val body: js.UndefOr[Block | Expression] = js.native
  
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
