package typings.raml1Parser

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.INodeDefinition
import typings.raml1Parser.distParserHighLevelASTMod.IParseResult
import typings.raml1Parser.distParserHighLevelASTMod.IProperty
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchSearchInterfaceMod {
  
  @JSImport("raml-1-parser/dist/search/search-interface", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LocationKind extends StObject
  @JSImport("raml-1-parser/dist/search/search-interface", "LocationKind")
  @js.native
  object LocationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationKind & Double] = js.native
    
    /**
      * In annotation
      */
    @js.native
    sealed trait ANNOTATION_COMPLETION
      extends StObject
         with LocationKind
    /* 5 */ val ANNOTATION_COMPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.ANNOTATION_COMPLETION & Double = js.native
    
    /**
      * In directive
      */
    @js.native
    sealed trait DIRECTIVE_COMPLETION
      extends StObject
         with LocationKind
    /* 3 */ val DIRECTIVE_COMPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.DIRECTIVE_COMPLETION & Double = js.native
    
    /**
      * In comment
      */
    @js.native
    sealed trait INCOMMENT
      extends StObject
         with LocationKind
    /* 7 */ val INCOMMENT: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.INCOMMENT & Double = js.native
    
    /**
      * In key
      */
    @js.native
    sealed trait KEY_COMPLETION
      extends StObject
         with LocationKind
    /* 1 */ val KEY_COMPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.KEY_COMPLETION & Double = js.native
    
    /**
      * In path
      */
    @js.native
    sealed trait PATH_COMPLETION
      extends StObject
         with LocationKind
    /* 2 */ val PATH_COMPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.PATH_COMPLETION & Double = js.native
    
    /**
      * In key of the sequence
      */
    @js.native
    sealed trait SEQUENCE_KEY_COPLETION
      extends StObject
         with LocationKind
    /* 6 */ val SEQUENCE_KEY_COPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.SEQUENCE_KEY_COPLETION & Double = js.native
    
    /**
      * In value
      */
    @js.native
    sealed trait VALUE_COMPLETION
      extends StObject
         with LocationKind
    /* 0 */ val VALUE_COMPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.VALUE_COMPLETION & Double = js.native
    
    /**
      * In RAML version
      */
    @js.native
    sealed trait VERSION_COMPLETION
      extends StObject
         with LocationKind
    /* 4 */ val VERSION_COMPLETION: typings.raml1Parser.distSearchSearchInterfaceMod.LocationKind.VERSION_COMPLETION & Double = js.native
  }
  
  inline def allChildren(node: IHighLevelNode): js.Array[IParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[IParseResult]]
  
  inline def declRoot(node: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("declRoot")(node.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  
  inline def deepFindNode(parent: IParseResult, offset: Double, end: Double): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  inline def deepFindNode(parent: IParseResult, offset: Double, end: Double, goToOtherUnits: Boolean): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  inline def deepFindNode(parent: IParseResult, offset: Double, end: Double, goToOtherUnits: Boolean, returnAttrs: Boolean): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  inline def deepFindNode(parent: IParseResult, offset: Double, end: Double, goToOtherUnits: Unit, returnAttrs: Boolean): IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindNode")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], goToOtherUnits.asInstanceOf[js.Any], returnAttrs.asInstanceOf[js.Any])).asInstanceOf[IParseResult]
  
  inline def determineCompletionKind(text: String, offset: Double): LocationKind = (^.asInstanceOf[js.Dynamic].applyDynamic("determineCompletionKind")(text.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LocationKind]
  
  inline def enumValues(property: IProperty, node: IHighLevelNode): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValues")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findAllSubTypes(property: IProperty, node: IHighLevelNode): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllSubTypes")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
  
  inline def findDeclaration(unit: ICompilationUnit, offset: Double): ICompilationUnit | IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | IParseResult]
  inline def findDeclaration(unit: ICompilationUnit, offset: Double, nodePart: LocationKind): ICompilationUnit | IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | IParseResult]
  
  inline def findDeclarationByNode(node: IParseResult): ICompilationUnit | IParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit | IParseResult]
  inline def findDeclarationByNode(node: IParseResult, nodePart: LocationKind): ICompilationUnit | IParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclarationByNode")(node.asInstanceOf[js.Any], nodePart.asInstanceOf[js.Any])).asInstanceOf[ICompilationUnit | IParseResult]
  
  inline def findExampleContentType(attribute: IAttribute): ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("findExampleContentType")(attribute.asInstanceOf[js.Any]).asInstanceOf[ITypeDefinition]
  
  inline def findUsages(unit: ICompilationUnit, offset: Double): FindUsagesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findUsages")(unit.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[FindUsagesResult]
  
  inline def getNominalTypeSource(nominalType: typings.ramlDefinitionSystem.mod.ITypeDefinition): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getNominalTypeSource")(nominalType.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  inline def globalDeclarations(n: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("globalDeclarations")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def isExampleNode(node: IHighLevelNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExampleNodeContent(attribute: IAttribute): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExampleNodeContent")(attribute.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nodesDeclaringType(`type`: ITypeDefinition, context: IHighLevelNode): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodesDeclaringType")(`type`.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def parseDocumentationContent(attribute: IAttribute, definition: ITypeDefinition): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocumentationContent")(attribute.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def parseStructuredExample(exampleNode: IHighLevelNode, definition: INodeDefinition): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStructuredExample")(exampleNode.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def qName(node: IHighLevelNode, context: IHighLevelNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("qName")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def refFinder(root: IHighLevelNode, node: IHighLevelNode, result: js.Array[IParseResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refFinder")(root.asInstanceOf[js.Any], node.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def referenceTargets(property: IProperty, node: IHighLevelNode): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceTargets")(property.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def subTypesWithLocals(`type`: ITypeDefinition, context: IHighLevelNode): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("subTypesWithLocals")(`type`.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
  
  trait FindUsagesResult extends StObject {
    
    /**
      * High-level node at offset.
      */
    var node: IHighLevelNode
    
    /**
      * High-level nodes, which use the entity defined by the node at offset.
      */
    var results: js.Array[IParseResult]
  }
  object FindUsagesResult {
    
    inline def apply(node: IHighLevelNode, results: js.Array[IParseResult]): FindUsagesResult = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindUsagesResult]
    }
    
    extension [Self <: FindUsagesResult](x: Self) {
      
      inline def setNode(value: IHighLevelNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[IParseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: IParseResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait IHighLevelSourceProvider extends StObject {
    
    def getSource(): IParseResult
  }
  object IHighLevelSourceProvider {
    
    inline def apply(getSource: () => IParseResult): IHighLevelSourceProvider = {
      val __obj = js.Dynamic.literal(getSource = js.Any.fromFunction0(getSource))
      __obj.asInstanceOf[IHighLevelSourceProvider]
    }
    
    extension [Self <: IHighLevelSourceProvider](x: Self) {
      
      inline def setGetSource(value: () => IParseResult): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    }
  }
}
