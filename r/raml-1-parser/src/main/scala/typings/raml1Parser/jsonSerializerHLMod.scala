package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.defaultCalculatorMod.AttributeDefaultsCalculator
import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.IParseResult
import typings.raml1Parser.highLevelASTMod.IProperty
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.raml1Parser.parserCoreMod.NodeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonSerializerHLMod {
  
  @JSImport("raml-1-parser/dist/util/jsonSerializerHL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util/jsonSerializerHL", "JsonSerializer")
  @js.native
  open class JsonSerializer () extends StObject {
    def this(options: SerializeOptions) = this()
    
    /* private */ var _astRoot: Any = js.native
    
    /* private */ var applyHelpers: Any = js.native
    
    def astRoot(): IParseResult = js.native
    
    /* private */ var canBeFragment: Any = js.native
    
    /* private */ var defaultsCalculator: Any = js.native
    
    /* private */ var dispose: Any = js.native
    
    def dump(node: IParseResult): Any = js.native
    
    /* private */ var dumpErrorBasic: Any = js.native
    
    /* private */ var dumpErrors: Any = js.native
    
    def dumpInternal(_node: IParseResult, nodeProperty: IProperty, rp: String): Any = js.native
    def dumpInternal(_node: IParseResult, nodeProperty: IProperty, rp: String, meta: Unit, isRoot: Boolean): Any = js.native
    def dumpInternal(_node: IParseResult, nodeProperty: IProperty, rp: String, meta: NodeMetadata): Any = js.native
    def dumpInternal(_node: IParseResult, nodeProperty: IProperty, rp: String, meta: NodeMetadata, isRoot: Boolean): Any = js.native
    
    def getDefaultsCalculator(): AttributeDefaultsCalculator = js.native
    
    /* private */ var helpersMap: Any = js.native
    
    /* private */ var init: Any = js.native
    
    var nodePropertyTransformers: js.Array[Transformation] = js.native
    
    var nodePropertyTransformersMap: TransformersMap = js.native
    
    var nodeTransformers: js.Array[Transformation] = js.native
    
    var nodeTransformersMap: TransformersMap = js.native
    
    /* private */ var options: Any = js.native
    
    def serializeMeta(obj: Any, node: IHighLevelNode, _meta: NodeMetadata): Unit = js.native
  }
  
  inline def appendSourcePath(eNode: IParseResult, result: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendSourcePath")(eNode.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyTransformersMap(node: IParseResult, prop: IProperty, value: Any, map: TransformersMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformersMap")(node.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def dump(node: IAttribute, options: SerializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def dump(node: IHighLevelNode, options: SerializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSchemaPath(eNode: IHighLevelNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaPath")(eNode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeRegInfos(arr: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRegInfos")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def patchDisplayName(value: Any, llNode: ILowLevelASTNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchDisplayName")(value.asInstanceOf[js.Any], llNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toOptionsArray(
    union: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeExpressions.Union */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeExpressions.BaseNode */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toOptionsArray")(union.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeExpressions.BaseNode */ Any
  ]]
  
  trait SerializeOptions extends StObject {
    
    var allParameters: js.UndefOr[Boolean] = js.undefined
    
    var attributeDefaults: js.UndefOr[Boolean] = js.undefined
    
    var dumpSchemaContents: js.UndefOr[Boolean] = js.undefined
    
    var dumpXMLRepresentationOfExamples: js.UndefOr[Boolean] = js.undefined
    
    var expandExpressions: js.UndefOr[Boolean] = js.undefined
    
    var expandSecurity: js.UndefOr[Boolean] = js.undefined
    
    var expandTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For root nodes additional details can be included into output. If the option is set to `true`,
      * node content is returned as value of the **specification** root property. Other root properties are:
      *
      * * **ramlVersion** version of RAML used by the specification represented by the node
      * * **type** type of the node: Api, Overlay, Extension, Library, or any other RAML type in fragments case
      * * **errors** errors of the specification represented by the node
      * @default false
      */
    var rootNodeDetails: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to serialize metadata
      * @default false
      */
    var serializeMetadata: js.UndefOr[Boolean] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var typeExpansionRecursionDepth: js.UndefOr[Double] = js.undefined
    
    var typeReferences: js.UndefOr[Boolean] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    extension [Self <: SerializeOptions](x: Self) {
      
      inline def setAllParameters(value: Boolean): Self = StObject.set(x, "allParameters", value.asInstanceOf[js.Any])
      
      inline def setAllParametersUndefined: Self = StObject.set(x, "allParameters", js.undefined)
      
      inline def setAttributeDefaults(value: Boolean): Self = StObject.set(x, "attributeDefaults", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefaultsUndefined: Self = StObject.set(x, "attributeDefaults", js.undefined)
      
      inline def setDumpSchemaContents(value: Boolean): Self = StObject.set(x, "dumpSchemaContents", value.asInstanceOf[js.Any])
      
      inline def setDumpSchemaContentsUndefined: Self = StObject.set(x, "dumpSchemaContents", js.undefined)
      
      inline def setDumpXMLRepresentationOfExamples(value: Boolean): Self = StObject.set(x, "dumpXMLRepresentationOfExamples", value.asInstanceOf[js.Any])
      
      inline def setDumpXMLRepresentationOfExamplesUndefined: Self = StObject.set(x, "dumpXMLRepresentationOfExamples", js.undefined)
      
      inline def setExpandExpressions(value: Boolean): Self = StObject.set(x, "expandExpressions", value.asInstanceOf[js.Any])
      
      inline def setExpandExpressionsUndefined: Self = StObject.set(x, "expandExpressions", js.undefined)
      
      inline def setExpandSecurity(value: Boolean): Self = StObject.set(x, "expandSecurity", value.asInstanceOf[js.Any])
      
      inline def setExpandSecurityUndefined: Self = StObject.set(x, "expandSecurity", js.undefined)
      
      inline def setExpandTypes(value: Boolean): Self = StObject.set(x, "expandTypes", value.asInstanceOf[js.Any])
      
      inline def setExpandTypesUndefined: Self = StObject.set(x, "expandTypes", js.undefined)
      
      inline def setRootNodeDetails(value: Boolean): Self = StObject.set(x, "rootNodeDetails", value.asInstanceOf[js.Any])
      
      inline def setRootNodeDetailsUndefined: Self = StObject.set(x, "rootNodeDetails", js.undefined)
      
      inline def setSerializeMetadata(value: Boolean): Self = StObject.set(x, "serializeMetadata", value.asInstanceOf[js.Any])
      
      inline def setSerializeMetadataUndefined: Self = StObject.set(x, "serializeMetadata", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTypeExpansionRecursionDepth(value: Double): Self = StObject.set(x, "typeExpansionRecursionDepth", value.asInstanceOf[js.Any])
      
      inline def setTypeExpansionRecursionDepthUndefined: Self = StObject.set(x, "typeExpansionRecursionDepth", js.undefined)
      
      inline def setTypeReferences(value: Boolean): Self = StObject.set(x, "typeReferences", value.asInstanceOf[js.Any])
      
      inline def setTypeReferencesUndefined: Self = StObject.set(x, "typeReferences", js.undefined)
    }
  }
  
  @js.native
  trait Transformation extends StObject {
    
    def `match`(
      node: IParseResult,
      prop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nominals.IProperty */ Any
    ): Boolean = js.native
    
    def registrationInfo(): js.Object = js.native
    
    def transform(value: Any, node: IParseResult): Any = js.native
    def transform(value: Any, node: IParseResult, valueProp: IProperty): Any = js.native
  }
  
  type TransformersMap = StringDictionary[StringDictionary[StringDictionary[js.Array[Transformation]]]]
}
