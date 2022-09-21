package typings.schematicsAngular

import typings.schematicsAngular.changeMod.Change
import typings.schematicsAngular.typescriptMod.Expression
import typings.schematicsAngular.typescriptMod.Node
import typings.schematicsAngular.typescriptMod.ObjectLiteralElement
import typings.schematicsAngular.typescriptMod.ObjectLiteralExpression
import typings.schematicsAngular.typescriptMod.SourceFile
import typings.schematicsAngular.typescriptMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astUtilsMod {
  
  @JSImport("@schematics/angular/utility/ast-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBootstrapToModule(source: SourceFile, modulePath: String, classifiedName: String, importPath: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addBootstrapToModule")(source.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], classifiedName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  inline def addDeclarationToModule(source: SourceFile, modulePath: String, classifiedName: String, importPath: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDeclarationToModule")(source.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], classifiedName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  inline def addExportToModule(source: SourceFile, modulePath: String, classifiedName: String, importPath: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addExportToModule")(source.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], classifiedName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  inline def addImportToModule(source: SourceFile, modulePath: String, classifiedName: String, importPath: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addImportToModule")(source.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], classifiedName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  inline def addProviderToModule(source: SourceFile, modulePath: String, classifiedName: String, importPath: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addProviderToModule")(source.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], classifiedName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  inline def addRouteDeclarationToModule(source: SourceFile, fileToAdd: String, routeLiteral: String): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("addRouteDeclarationToModule")(source.asInstanceOf[js.Any], fileToAdd.asInstanceOf[js.Any], routeLiteral.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def addSymbolToNgModuleMetadata(source: SourceFile, ngModulePath: String, metadataField: String, symbolName: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addSymbolToNgModuleMetadata")(source.asInstanceOf[js.Any], ngModulePath.asInstanceOf[js.Any], metadataField.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  inline def addSymbolToNgModuleMetadata(
    source: SourceFile,
    ngModulePath: String,
    metadataField: String,
    symbolName: String,
    importPath: String
  ): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("addSymbolToNgModuleMetadata")(source.asInstanceOf[js.Any], ngModulePath.asInstanceOf[js.Any], metadataField.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  inline def findNode(node: Node, kind: SyntaxKind, text: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def findNodes(node: Node, kind: SyntaxKind): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def findNodes(node: Node, kind: SyntaxKind, max: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def findNodes(node: Node, kind: SyntaxKind, max: Double, recursive: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], max.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def findNodes(node: Node, kind: SyntaxKind, max: Unit, recursive: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], max.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def findNodes[T /* <: Node */](node: Node, guard: js.Function1[/* node */ Node, /* is T */ Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], guard.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def findNodes[T /* <: Node */](node: Node, guard: js.Function1[/* node */ Node, /* is T */ Boolean], max: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def findNodes[T /* <: Node */](
    node: Node,
    guard: js.Function1[/* node */ Node, /* is T */ Boolean],
    max: Double,
    recursive: Boolean
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], max.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def findNodes[T /* <: Node */](
    node: Node,
    guard: js.Function1[/* node */ Node, /* is T */ Boolean],
    max: Unit,
    recursive: Boolean
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(node.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], max.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getDecoratorMetadata(source: SourceFile, identifier: String, module: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDecoratorMetadata")(source.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def getEnvironmentExportName(source: SourceFile): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentExportName")(source.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getMetadataField(node: ObjectLiteralExpression, metadataField: String): js.Array[ObjectLiteralElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataField")(node.asInstanceOf[js.Any], metadataField.asInstanceOf[js.Any])).asInstanceOf[js.Array[ObjectLiteralElement]]
  
  inline def getRouterModuleDeclaration(source: SourceFile): js.UndefOr[Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouterModuleDeclaration")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Expression]]
  
  inline def getSourceNodes(sourceFile: SourceFile): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceNodes")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  
  inline def insertAfterLastOccurrence(nodes: js.Array[Node], toInsert: String, file: String, fallbackPos: Double): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfterLastOccurrence")(nodes.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any], file.asInstanceOf[js.Any], fallbackPos.asInstanceOf[js.Any])).asInstanceOf[Change]
  inline def insertAfterLastOccurrence(nodes: js.Array[Node], toInsert: String, file: String, fallbackPos: Double, syntaxKind: SyntaxKind): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfterLastOccurrence")(nodes.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any], file.asInstanceOf[js.Any], fallbackPos.asInstanceOf[js.Any], syntaxKind.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def insertImport(source: SourceFile, fileToEdit: String, symbolName: String, fileName: String): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("insertImport")(source.asInstanceOf[js.Any], fileToEdit.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Change]
  inline def insertImport(source: SourceFile, fileToEdit: String, symbolName: String, fileName: String, isDefault: Boolean): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("insertImport")(source.asInstanceOf[js.Any], fileToEdit.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], isDefault.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def isImported(source: SourceFile, classifiedName: String, importPath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImported")(source.asInstanceOf[js.Any], classifiedName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
