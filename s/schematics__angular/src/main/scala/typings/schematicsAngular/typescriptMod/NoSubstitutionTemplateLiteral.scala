package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.typescriptMod.ReadonlyTextRange because Already inherited
- typings.schematicsAngular.typescriptMod.Node because Already inherited
- typings.schematicsAngular.typescriptMod.LiteralLikeNode because Already inherited
- typings.schematicsAngular.typescriptMod.TemplateLiteralLikeNode because var conflicts: hasExtendedUnicodeEscape, isUnterminated, text. Inlined rawText */ @js.native
trait NoSubstitutionTemplateLiteral
  extends StObject
     with LiteralExpression
     with Declaration
     with LiteralToken
     with StringLiteralLike
     with TemplateLiteral
     with TemplateLiteralToken {
  
  @JSName("kind")
  val kind_NoSubstitutionTemplateLiteral: typings.schematicsAngular.typescriptMod.SyntaxKind.NoSubstitutionTemplateLiteral = js.native
  
  var rawText: js.UndefOr[java.lang.String] = js.native
}
