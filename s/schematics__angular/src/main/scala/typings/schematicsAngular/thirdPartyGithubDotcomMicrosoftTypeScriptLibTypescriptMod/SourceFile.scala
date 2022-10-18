package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.CommonJS
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFile
  extends StObject
     with Declaration
     with BlockLike {
  
  var amdDependencies: js.Array[AmdDependency] = js.native
  
  val endOfFileToken: Token[
    typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.EndOfFileToken
  ] = js.native
  
  var fileName: java.lang.String = js.native
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
  
  def getLineEndOfPosition(pos: Double): Double = js.native
  
  def getLineStarts(): js.Array[Double] = js.native
  
  def getPositionOfLineAndCharacter(line: Double, character: Double): Double = js.native
  
  /**
    * lib.d.ts should have a reference comment like
    *
    *  /// <reference no-default-lib="true"/>
    *
    * If any other file has this comment, it signals not to include lib.d.ts
    * because this containing file is intended to act as a default library.
    */
  var hasNoDefaultLib: Boolean = js.native
  
  /**
    * When `module` is `Node16` or `NodeNext`, this field controls whether the
    * source file in question is an ESNext-output-format file, or a CommonJS-output-format
    * module. This is derived by the module resolver as it looks up the file, since
    * it is derived from either the file extension of the module, or the containing
    * `package.json` context, and affects both checking and emit.
    *
    * It is _public_ so that (pre)transformers can set this field,
    * since it switches the builtin `node` module transform. Generally speaking, if unset,
    * the field is treated as though it is `ModuleKind.CommonJS`.
    *
    * Note that this field is only set by the module resolution process when
    * `moduleResolution` is `Node16` or `NodeNext`, which is implied by the `module` setting
    * of `Node16` or `NodeNext`, respectively, but may be overriden (eg, by a `moduleResolution`
    * of `node`). If so, this field will be unset and source files will be considered to be
    * CommonJS-output-format by the node module transformer and type checker, regardless of extension or context.
    */
  var impliedNodeFormat: js.UndefOr[ESNext | CommonJS] = js.native
  
  var isDeclarationFile: Boolean = js.native
  
  @JSName("kind")
  val kind_SourceFile: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.SourceFile = js.native
  
  var languageVariant: LanguageVariant = js.native
  
  var languageVersion: ScriptTarget = js.native
  
  var libReferenceDirectives: js.Array[FileReference] = js.native
  
  var moduleName: js.UndefOr[java.lang.String] = js.native
  
  var referencedFiles: js.Array[FileReference] = js.native
  
  val statements: NodeArray[Statement] = js.native
  
  var text: java.lang.String = js.native
  
  var typeReferenceDirectives: js.Array[FileReference] = js.native
  
  def update(newText: java.lang.String, textChangeRange: TextChangeRange): SourceFile = js.native
}
