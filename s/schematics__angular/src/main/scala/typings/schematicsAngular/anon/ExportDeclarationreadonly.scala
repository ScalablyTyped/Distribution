package typings.schematicsAngular.anon

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.AssertClause
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Expression
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Identifier
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModifierLike
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleBlock
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NamedExportBindings
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Node
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NodeArray
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NodeFlags
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NumericLiteral
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SourceFile
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SourceFileLike
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.StringLiteral
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ExportDeclaration
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypeOnlyExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.ExportDeclaration & { readonly isTypeOnly :true} */
@js.native
trait ExportDeclarationreadonly
  extends StObject
     with TypeOnlyExportDeclaration {
  
  var _declarationBrand: Any = js.native
  
  var _jsdocContainerBrand: Any = js.native
  
  var _statementBrand: Any = js.native
  
  val assertClause: js.UndefOr[AssertClause] = js.native
  
  val end: Double = js.native
  
  /** Will not be assigned in the case of `export * from "foo";` */
  val exportClause: js.UndefOr[NamedExportBindings] = js.native
  
  val flags: NodeFlags = js.native
  
  def forEachChild[T](cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  
  def getChildAt(index: Double): Node = js.native
  def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
  
  def getChildCount(): Double = js.native
  def getChildCount(sourceFile: SourceFile): Double = js.native
  
  def getChildren(): js.Array[Node] = js.native
  def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
  
  def getEnd(): Double = js.native
  
  def getFirstToken(): js.UndefOr[Node] = js.native
  def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getFullStart(): Double = js.native
  
  def getFullText(): String = js.native
  def getFullText(sourceFile: SourceFile): String = js.native
  
  def getFullWidth(): Double = js.native
  
  def getLastToken(): js.UndefOr[Node] = js.native
  def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getLeadingTriviaWidth(): Double = js.native
  def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
  
  def getSourceFile(): SourceFile = js.native
  
  def getStart(): Double = js.native
  def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
  
  def getText(): String = js.native
  def getText(sourceFile: SourceFile): String = js.native
  
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
  
  val isTypeOnly: Boolean = js.native
  
  val kind: ExportDeclaration = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: js.UndefOr[Expression] = js.native
  
  val name: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
  
  val parent: SourceFile | ModuleBlock = js.native
  
  val pos: Double = js.native
}
