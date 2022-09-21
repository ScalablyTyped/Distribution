package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersLLMod {
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/helpersLL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def absoluteUri(res: IHighLevelNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def allResourceTypes(hlNode: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("allResourceTypes")(hlNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  inline def allResourceTypes(hlNode: IHighLevelNode, serializeMetadata: Boolean): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("allResourceTypes")(hlNode.asInstanceOf[js.Any], serializeMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def allTraits(hlNode: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTraits")(hlNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  inline def allTraits(hlNode: IHighLevelNode, serializeMetadata: Boolean): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("allTraits")(hlNode.asInstanceOf[js.Any], serializeMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def baseUriParameters(api: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUriParameters")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  inline def baseUriParameters(api: IHighLevelNode, serializeMetadata: Boolean): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("baseUriParameters")(api.asInstanceOf[js.Any], serializeMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
  
  inline def completeRelativeUri(res: IHighLevelNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("completeRelativeUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dumpExpandableExample(ex: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpExpandableExample")(ex.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def dumpExpandableExample(ex: Any, dumpXMLRepresentationOfExamples: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dumpExpandableExample")(ex.asInstanceOf[js.Any], dumpXMLRepresentationOfExamples.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getTemplateParametrizedProperties(node: IHighLevelNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def schemaContent08(bodyDeclaration: IHighLevelNode): IAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaContent08")(bodyDeclaration.asInstanceOf[js.Any]).asInstanceOf[IAttribute]
  
  inline def schemaContent08Internal(bodyDeclaration: IHighLevelNode): IAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaContent08Internal")(bodyDeclaration.asInstanceOf[js.Any]).asInstanceOf[IAttribute]
  inline def schemaContent08Internal(bodyDeclaration: IHighLevelNode, cache: StringDictionary[IHighLevelNode]): IAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaContent08Internal")(bodyDeclaration.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[IAttribute]
  
  inline def typeExample(node: IHighLevelNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("typeExample")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def typeExample(node: IHighLevelNode, dumpXMLRepresentationOfExamples: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("typeExample")(node.asInstanceOf[js.Any], dumpXMLRepresentationOfExamples.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def typeExamples(node: IHighLevelNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("typeExamples")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def typeExamples(node: IHighLevelNode, dumpXMLRepresentationOfExamples: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("typeExamples")(node.asInstanceOf[js.Any], dumpXMLRepresentationOfExamples.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def typeFixedFacets(td: IHighLevelNode): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeFixedFacets")(td.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def uriParameters(resource: IHighLevelNode): js.Array[IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriParameters")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[IHighLevelNode]]
  inline def uriParameters(resource: IHighLevelNode, serializeMetadata: Boolean): js.Array[IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriParameters")(resource.asInstanceOf[js.Any], serializeMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[IHighLevelNode]]
}
