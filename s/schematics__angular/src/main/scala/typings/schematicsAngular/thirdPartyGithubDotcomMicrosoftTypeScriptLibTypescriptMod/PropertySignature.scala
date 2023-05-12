package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySignature
  extends StObject
     with TypeElement
     with JSDocContainer
     with HasJSDoc
     with HasModifiers
     with HasType
     with VariableLikeDeclaration {
  
  @JSName("kind")
  val kind_PropertySignature: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.PropertySignature = js.native
  
  val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_PropertySignature: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertySignature: TypeLiteralNode | InterfaceDeclaration = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
