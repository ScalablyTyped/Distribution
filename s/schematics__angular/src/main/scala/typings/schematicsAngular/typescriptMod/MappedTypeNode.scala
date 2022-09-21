package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.SyntaxKind.MappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedTypeNode
  extends StObject
     with TypeNode
     with Declaration
     with HasType {
  
  @JSName("kind")
  val kind_MappedTypeNode: MappedType = js.native
  
  /** Used only to produce grammar errors */
  val members: js.UndefOr[NodeArray[TypeElement]] = js.native
  
  val nameType: js.UndefOr[TypeNode] = js.native
  
  val questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken] = js.native
  
  val readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameter: TypeParameterDeclaration = js.native
}
