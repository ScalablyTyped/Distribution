package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distParserHighLevelASTMod.IProperty
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.AttributeNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreMod.TypeInstanceImpl
import typings.raml1Parser.distParserWrappedAstParserCoreMod.TypeInstancePropertyImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilJsonSerializerMod {
  
  @JSImport("raml-1-parser/dist/util/jsonSerializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util/jsonSerializer", "JsonSerializer")
  @js.native
  open class JsonSerializer () extends StObject {
    def this(options: SerializeOptions) = this()
    
    /* private */ var canBeFragment: Any = js.native
    
    def dump(node: Any): Any = js.native
    
    /* private */ var dumpErrorBasic: Any = js.native
    
    /* private */ var dumpErrors: Any = js.native
    
    def dumpInternal(node: Any): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Boolean): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Boolean, isRoot: Boolean): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Boolean, isRoot: Boolean, nodeProperty: IProperty): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Boolean, isRoot: Unit, nodeProperty: IProperty): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Unit, isRoot: Boolean): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Unit, isRoot: Boolean, nodeProperty: IProperty): Any = js.native
    def dumpInternal(node: Any, rootNodeDetails: Unit, isRoot: Unit, nodeProperty: IProperty): Any = js.native
    
    /* private */ var dumpProperties: Any = js.native
    
    /* private */ var ignore: Any = js.native
    
    def isDefined(node: Any, name: Any): Boolean = js.native
    
    /* private */ var missingProperties: Any = js.native
    
    /* private */ var nodePropertyTransformers: Any = js.native
    
    /* private */ var nodeTransformers: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def printMissingProperties(): String = js.native
    
    def serializeMeta(obj: Any, node: AttributeNode): Unit = js.native
    def serializeMeta(obj: Any, node: BasicNode): Unit = js.native
    
    def serializeScalarsAnnotations(
      obj: Any,
      node: AttributeNode,
      props: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nominals.IProperty */ Any
        ]
    ): Unit = js.native
    def serializeScalarsAnnotations(
      obj: Any,
      node: BasicNode,
      props: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nominals.IProperty */ Any
        ]
    ): Unit = js.native
    
    def serializeTypeInstance(inst: TypeInstanceImpl): Any = js.native
    
    def serializeTypeInstanceProperty(prop: TypeInstancePropertyImpl): Any = js.native
    
    /* private */ var stringLooksLikeJSON: Any = js.native
    
    /* private */ var stringLooksLikeXML: Any = js.native
  }
  
  inline def dump(node: AttributeNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def dump(node: AttributeNode, serializeMeta: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(node.asInstanceOf[js.Any], serializeMeta.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def dump(node: BasicNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def dump(node: BasicNode, serializeMeta: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(node.asInstanceOf[js.Any], serializeMeta.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isEmpty(
    nc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nominals.ITypeDefinition */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(nc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait SerializeOptions extends StObject {
    
    var dumpSchemaContents: js.UndefOr[Boolean] = js.undefined
    
    var dumpXMLRepresentationOfExamples: js.UndefOr[Boolean] = js.undefined
    
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
      * @default true
      */
    var serializeMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to serialize source maps
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    extension [Self <: SerializeOptions](x: Self) {
      
      inline def setDumpSchemaContents(value: Boolean): Self = StObject.set(x, "dumpSchemaContents", value.asInstanceOf[js.Any])
      
      inline def setDumpSchemaContentsUndefined: Self = StObject.set(x, "dumpSchemaContents", js.undefined)
      
      inline def setDumpXMLRepresentationOfExamples(value: Boolean): Self = StObject.set(x, "dumpXMLRepresentationOfExamples", value.asInstanceOf[js.Any])
      
      inline def setDumpXMLRepresentationOfExamplesUndefined: Self = StObject.set(x, "dumpXMLRepresentationOfExamples", js.undefined)
      
      inline def setRootNodeDetails(value: Boolean): Self = StObject.set(x, "rootNodeDetails", value.asInstanceOf[js.Any])
      
      inline def setRootNodeDetailsUndefined: Self = StObject.set(x, "rootNodeDetails", js.undefined)
      
      inline def setSerializeMetadata(value: Boolean): Self = StObject.set(x, "serializeMetadata", value.asInstanceOf[js.Any])
      
      inline def setSerializeMetadataUndefined: Self = StObject.set(x, "serializeMetadata", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
