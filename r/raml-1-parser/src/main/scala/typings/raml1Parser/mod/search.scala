package typings.raml1Parser.mod

import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.INodeDefinition
import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.searchInterfaceMod.FindUsagesResult
import typings.raml1Parser.searchInterfaceMod.IHighLevelSourceProvider
import typings.raml1Parser.searchInterfaceMod.LocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object search {
  
  @JSImport("raml-1-parser", "search")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "search.LocationKind")
  @js.native
  object LocationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.raml1Parser.searchInterfaceMod.LocationKind & Double] = js.native
    
    /* 5 */ val ANNOTATION_COMPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.ANNOTATION_COMPLETION & Double = js.native
    
    /* 3 */ val DIRECTIVE_COMPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.DIRECTIVE_COMPLETION & Double = js.native
    
    /* 7 */ val INCOMMENT: typings.raml1Parser.searchInterfaceMod.LocationKind.INCOMMENT & Double = js.native
    
    /* 1 */ val KEY_COMPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.KEY_COMPLETION & Double = js.native
    
    /* 2 */ val PATH_COMPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.PATH_COMPLETION & Double = js.native
    
    /* 6 */ val SEQUENCE_KEY_COPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.SEQUENCE_KEY_COPLETION & Double = js.native
    
    /* 0 */ val VALUE_COMPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.VALUE_COMPLETION & Double = js.native
    
    /* 4 */ val VERSION_COMPLETION: typings.raml1Parser.searchInterfaceMod.LocationKind.VERSION_COMPLETION & Double = js.native
  }
  
  inline def allChildren(node: typings.raml1Parser.highLevelASTMod.IHighLevelNode): js.Array[typings.raml1Parser.highLevelASTMod.IParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.raml1Parser.highLevelASTMod.IParseResult]]
  
  inline def declRoot(node: typings.raml1Parser.highLevelASTMod.IHighLevelNode): typings.raml1Parser.highLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("declRoot")(node.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.highLevelASTMod.IHighLevelNode]
  
  inline def deepFindNode(parent: typings.raml1Parser.highLevelASTMod.IParseResult, offset: Double, end: Double): typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.IParseResult]
  inline def deepFindNode(
    parent: typings.raml1Parser.highLevelASTMod.IParseResult,
    offset: Double,
    end: Double,
    goToOtherUnits: Boolean
  ): typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.IParseResult]
  inline def deepFindNode(
    parent: typings.raml1Parser.highLevelASTMod.IParseResult,
    offset: Double,
    end: Double,
    goToOtherUnits: Boolean,
    returnAttrs: Boolean
  ): typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.IParseResult]
  inline def deepFindNode(
    parent: typings.raml1Parser.highLevelASTMod.IParseResult,
    offset: Double,
    end: Double,
    goToOtherUnits: Unit,
    returnAttrs: Boolean
  ): typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.IParseResult]
  
  inline def determineCompletionKind(text: String, offset: Double): LocationKind = (^.asInstanceOf[js.Dynamic].applyDynamic("determineCompletionKind")(text.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LocationKind]
  
  inline def enumValues(
    property: typings.raml1Parser.highLevelASTMod.IProperty,
    node: typings.raml1Parser.highLevelASTMod.IHighLevelNode
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValues")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findAllSubTypes(
    property: typings.raml1Parser.highLevelASTMod.IProperty,
    node: typings.raml1Parser.highLevelASTMod.IHighLevelNode
  ): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllSubTypes")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
  
  inline def findDeclaration(unit: ICompilationUnit, offset: Double): ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult]
  inline def findDeclaration(unit: ICompilationUnit, offset: Double, nodePart: LocationKind): ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult]
  
  inline def findDeclarationByNode(node: typings.raml1Parser.highLevelASTMod.IParseResult): ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult]
  inline def findDeclarationByNode(node: typings.raml1Parser.highLevelASTMod.IParseResult, nodePart: LocationKind): ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | typings.raml1Parser.highLevelASTMod.IParseResult]
  
  inline def findExampleContentType(attribute: IAttribute): ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("findExampleContentType")(attribute.asInstanceOf[js.Any]).asInstanceOf[ITypeDefinition]
  
  inline def findUsages(unit: ICompilationUnit, offset: Double): FindUsagesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findUsages")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[FindUsagesResult]
  
  inline def getNominalTypeSource(nominalType: typings.ramlDefinitionSystem.ramlDefinitionSystemMod.ITypeDefinition): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getNominalTypeSource")(nominalType.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  inline def globalDeclarations(n: typings.raml1Parser.highLevelASTMod.IHighLevelNode): js.Array[typings.raml1Parser.highLevelASTMod.IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("globalDeclarations")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.raml1Parser.highLevelASTMod.IHighLevelNode]]
  
  inline def isExampleNode(node: typings.raml1Parser.highLevelASTMod.IHighLevelNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExampleNodeContent(attribute: IAttribute): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNodeContent")(attribute.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nodesDeclaringType(`type`: ITypeDefinition, context: typings.raml1Parser.highLevelASTMod.IHighLevelNode): js.Array[typings.raml1Parser.highLevelASTMod.IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodesDeclaringType")(`type`.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.raml1Parser.highLevelASTMod.IHighLevelNode]]
  
  inline def parseDocumentationContent(attribute: IAttribute, definition: ITypeDefinition): typings.raml1Parser.highLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocumentationContent")(attribute.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.IHighLevelNode]
  
  inline def parseStructuredExample(exampleNode: typings.raml1Parser.highLevelASTMod.IHighLevelNode, definition: INodeDefinition): typings.raml1Parser.highLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStructuredExample")(exampleNode.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.IHighLevelNode]
  
  inline def qName(
    node: typings.raml1Parser.highLevelASTMod.IHighLevelNode,
    context: typings.raml1Parser.highLevelASTMod.IHighLevelNode
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("qName")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def refFinder(
    root: typings.raml1Parser.highLevelASTMod.IHighLevelNode,
    node: typings.raml1Parser.highLevelASTMod.IHighLevelNode,
    result: js.Array[typings.raml1Parser.highLevelASTMod.IParseResult]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refFinder")(root.asInstanceOf[js.Any], node.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def referenceTargets(
    property: typings.raml1Parser.highLevelASTMod.IProperty,
    node: typings.raml1Parser.highLevelASTMod.IHighLevelNode
  ): js.Array[typings.raml1Parser.highLevelASTMod.IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceTargets")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.raml1Parser.highLevelASTMod.IHighLevelNode]]
  
  inline def subTypesWithLocals(`type`: ITypeDefinition, context: typings.raml1Parser.highLevelASTMod.IHighLevelNode): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("subTypesWithLocals")(`type`.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
}
