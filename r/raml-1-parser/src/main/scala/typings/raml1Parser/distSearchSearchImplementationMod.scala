package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.INodeDefinition
import typings.raml1Parser.distParserHighLevelASTMod.IParseResult
import typings.raml1Parser.distParserHighLevelASTMod.IProperty
import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import typings.ramlDefinitionSystem.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchSearchImplementationMod {
  
  @JSImport("raml-1-parser/dist/search/search-implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LocationKind extends StObject
  @JSImport("raml-1-parser/dist/search/search-implementation", "LocationKind")
  @js.native
  object LocationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationKind & Double] = js.native
    
    @js.native
    sealed trait ANNOTATION_COMPLETION
      extends StObject
         with LocationKind
    /* 5 */ val ANNOTATION_COMPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.ANNOTATION_COMPLETION & Double = js.native
    
    @js.native
    sealed trait DIRECTIVE_COMPLETION
      extends StObject
         with LocationKind
    /* 3 */ val DIRECTIVE_COMPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.DIRECTIVE_COMPLETION & Double = js.native
    
    @js.native
    sealed trait INCOMMENT
      extends StObject
         with LocationKind
    /* 7 */ val INCOMMENT: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.INCOMMENT & Double = js.native
    
    @js.native
    sealed trait KEY_COMPLETION
      extends StObject
         with LocationKind
    /* 1 */ val KEY_COMPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.KEY_COMPLETION & Double = js.native
    
    @js.native
    sealed trait PATH_COMPLETION
      extends StObject
         with LocationKind
    /* 2 */ val PATH_COMPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.PATH_COMPLETION & Double = js.native
    
    @js.native
    sealed trait SEQUENCE_KEY_COPLETION
      extends StObject
         with LocationKind
    /* 6 */ val SEQUENCE_KEY_COPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.SEQUENCE_KEY_COPLETION & Double = js.native
    
    @js.native
    sealed trait VALUE_COMPLETION
      extends StObject
         with LocationKind
    /* 0 */ val VALUE_COMPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.VALUE_COMPLETION & Double = js.native
    
    @js.native
    sealed trait VERSION_COMPLETION
      extends StObject
         with LocationKind
    /* 4 */ val VERSION_COMPLETION: typings.raml1Parser.distSearchSearchImplementationMod.LocationKind.VERSION_COMPLETION & Double = js.native
  }
  
  inline def allChildren(node: IHighLevelNode): js.Array[IParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[IParseResult]]
  
  @JSImport("raml-1-parser/dist/search/search-implementation", "declRoot")
  @js.native
  def declRoot: js.Function1[/* h */ IHighLevelNode, IHighLevelNode] = js.native
  inline def declRoot_=(x: js.Function1[/* h */ IHighLevelNode, IHighLevelNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declRoot")(x.asInstanceOf[js.Any])
  
  inline def deepFindNode(n: IParseResult, offset: Double, end: Double): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(n.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  inline def deepFindNode(n: IParseResult, offset: Double, end: Double, goToOtherUnits: Boolean): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(n.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  inline def deepFindNode(n: IParseResult, offset: Double, end: Double, goToOtherUnits: Boolean, returnAttrs: Boolean): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(n.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  inline def deepFindNode(n: IParseResult, offset: Double, end: Double, goToOtherUnits: Unit, returnAttrs: Boolean): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(n.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  
  inline def determineCompletionKind(text: String, offset: Double): LocationKind = (^.asInstanceOf[js.Dynamic].applyDynamic("determineCompletionKind")(text.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LocationKind]
  
  inline def enumValues(p: Property, c: IHighLevelNode): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValues")(p.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def extractName(cleaned: String, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractName")(cleaned.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findAllSubTypes(p: IProperty, n: IHighLevelNode): js.Array[typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllSubTypes")(p.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition]]
  
  inline def findDeclaration(unit: ICompilationUnit, offset: Double): ICompilationUnit | IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | IParseResult]
  inline def findDeclaration(unit: ICompilationUnit, offset: Double, nodePart: LocationKind): ICompilationUnit | IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | IParseResult]
  
  inline def findDeclarationByNode(node: IParseResult): ICompilationUnit | IParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit | IParseResult]
  inline def findDeclarationByNode(node: IParseResult, nodePart: LocationKind): ICompilationUnit | IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | IParseResult]
  
  inline def findDeclarations(h: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarations")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  inline def findDeclarations(h: IHighLevelNode, visitedUnits: StringDictionary[Boolean]): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarations")(h.asInstanceOf[js.Any], visitedUnits.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  inline def findDeclarations(h: IHighLevelNode, visitedUnits: StringDictionary[Boolean], rs: js.Array[IHighLevelNode]): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarations")(h.asInstanceOf[js.Any], visitedUnits.asInstanceOf[js.Any], rs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  inline def findDeclarations(h: IHighLevelNode, visitedUnits: Unit, rs: js.Array[IHighLevelNode]): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarations")(h.asInstanceOf[js.Any], visitedUnits.asInstanceOf[js.Any], rs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def findExampleContentType(node: IParseResult): INodeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("findExampleContentType")(node.asInstanceOf[js.Any]).asInstanceOf[INodeDefinition]
  
  inline def findUsages(unit: ICompilationUnit, offset: Double): FindUsagesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findUsages")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[FindUsagesResult]
  
  inline def globalDeclarations(h: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("globalDeclarations")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def isExampleNode(node: IHighLevelNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExampleNodeContent(node: IAttribute): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNodeContent")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nodesDeclaringType(range: typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition, n: IHighLevelNode): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodesDeclaringType")(range.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def parseDocumentationContent(attribute: IAttribute, `type`: INodeDefinition): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocumentationContent")(attribute.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def parseStructuredExample(exampleNode: IHighLevelNode, `type`: INodeDefinition): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStructuredExample")(exampleNode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def refFinder(root: IHighLevelNode, node: IHighLevelNode, result: js.Array[IParseResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refFinder")(root.asInstanceOf[js.Any], node.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def referenceTargets(p0: IProperty, c: IHighLevelNode): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceTargets")(p0.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def resolveReference(point: ILowLevelASTNode, path: String): ILowLevelASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveReference")(point.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ILowLevelASTNode]
  
  inline def schemasWithName(
    tname: String,
    parentNode: IHighLevelNode,
    backup: StringDictionary[typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition]
  ): typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("schemasWithName")(tname.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], backup.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition]
  
  inline def subTypesWithLocals(range: typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition, parentNode: IHighLevelNode): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("subTypesWithLocals")(range.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
  
  inline def subTypesWithName(
    tname: String,
    parentNode: IHighLevelNode,
    backup: StringDictionary[typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition]
  ): typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("subTypesWithName")(tname.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], backup.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition]
  
  trait FindUsagesResult extends StObject {
    
    var node: IHighLevelNode
    
    var results: js.Array[IParseResult]
  }
  object FindUsagesResult {
    
    inline def apply(node: IHighLevelNode, results: js.Array[IParseResult]): FindUsagesResult = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindUsagesResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindUsagesResult] (val x: Self) extends AnyVal {
      
      inline def setNode(value: IHighLevelNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[IParseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: IParseResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  type ITypeDefinition = typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
}
