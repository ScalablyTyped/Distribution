package typings.raml1Parser

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserJsyamlResolversApiMod.FSResolver
import typings.raml1Parser.distParserJsyamlResolversApiMod.HTTPResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserWrappedAstParserCoreApiMod {
  
  type AbstractWrapperNode = typings.raml1Parser.distParserHighLevelASTMod.AbstractWrapperNode
  
  trait AttributeNode
    extends StObject
       with typings.raml1Parser.distParserHighLevelASTMod.AbstractWrapperNode {
    
    /**
      * @return Underlying High Level attribute node
      **/
    def highLevel(): IAttribute
    
    def meta(): ValueMetadata
    
    /**
      * @return Whether the element is an optional sibling of trait or resource type
      **/
    def optional(): Boolean
    
    def parent(): BasicNode
    
    /**
      * JSON representation of the attribute value
      **/
    def toJSON(): Any
  }
  object AttributeNode {
    
    inline def apply(
      RAMLVersion: () => String,
      highLevel: () => IAttribute,
      kind: () => String,
      meta: () => ValueMetadata,
      optional: () => Boolean,
      parent: () => BasicNode,
      toJSON: () => Any,
      wrapperClassName: () => String
    ): AttributeNode = {
      val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), toJSON = js.Any.fromFunction0(toJSON), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
      __obj.asInstanceOf[AttributeNode]
    }
    
    extension [Self <: AttributeNode](x: Self) {
      
      inline def setHighLevel(value: () => IAttribute): Self = StObject.set(x, "highLevel", js.Any.fromFunction0(value))
      
      inline def setMeta(value: () => ValueMetadata): Self = StObject.set(x, "meta", js.Any.fromFunction0(value))
      
      inline def setOptional(value: () => Boolean): Self = StObject.set(x, "optional", js.Any.fromFunction0(value))
      
      inline def setParent(value: () => BasicNode): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  type BasicNode = typings.raml1Parser.distParserHighLevelASTMod.BasicNode
  
  trait LoadOptions extends StObject {
    
    /**
      * Whether to unfold types
      */
    var expandExpressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to expand libraries
      */
    var expandLibraries: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to expand types
      */
    var expandTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Absolute path of the RAML file. May be used for paths resolving when root
      * file content is provided directly.
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * Module used for operations with file system
      **/
    var fsResolver: js.UndefOr[FSResolver] = js.undefined
    
    /**
      * Module used for operations with web
      **/
    var httpResolver: js.UndefOr[HTTPResolver] = js.undefined
    
    /**
      * Whether to serialize metadata
      * @default false
      */
    var serializeMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to serialize source maps
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Types may have recursion points in their definition graphs, i.e.
      *
      *  MyType:
      *  properties:
      *    p1?: MyType
      *    p2: MyType[]
      *
      * If the option is undefined or equals zero, the type expansion process does not expand recursion points.
      * In other case it expands them with 'typeExpansionRecursionDepth' option decremented by one.
      */
    var typeExpansionRecursionDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to replace type names by references
      */
    var typeReferences: js.UndefOr[Boolean] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setExpandExpressions(value: Boolean): Self = StObject.set(x, "expandExpressions", value.asInstanceOf[js.Any])
      
      inline def setExpandExpressionsUndefined: Self = StObject.set(x, "expandExpressions", js.undefined)
      
      inline def setExpandLibraries(value: Boolean): Self = StObject.set(x, "expandLibraries", value.asInstanceOf[js.Any])
      
      inline def setExpandLibrariesUndefined: Self = StObject.set(x, "expandLibraries", js.undefined)
      
      inline def setExpandTypes(value: Boolean): Self = StObject.set(x, "expandTypes", value.asInstanceOf[js.Any])
      
      inline def setExpandTypesUndefined: Self = StObject.set(x, "expandTypes", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFsResolver(value: FSResolver): Self = StObject.set(x, "fsResolver", value.asInstanceOf[js.Any])
      
      inline def setFsResolverUndefined: Self = StObject.set(x, "fsResolver", js.undefined)
      
      inline def setHttpResolver(value: HTTPResolver): Self = StObject.set(x, "httpResolver", value.asInstanceOf[js.Any])
      
      inline def setHttpResolverUndefined: Self = StObject.set(x, "httpResolver", js.undefined)
      
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
  
  trait Options extends StObject {
    
    /**
      * If true, attribute defaults will be returned if no actual vale is specified in RAML code.
      * Affects only attributes.
      */
    var attributeDefaults: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Absolute path of the RAML file. May be used when content is provided directly on
      * RAML parser method call instead of specifying file path and making the parser to
      * load the file.
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * Module used for operations with file system
      **/
    var fsResolver: js.UndefOr[FSResolver] = js.undefined
    
    /**
      * Module used for operations with web
      **/
    var httpResolver: js.UndefOr[HTTPResolver] = js.undefined
    
    /**
      * Whether to return Api which contains errors.
      **/
    var rejectOnErrors: js.UndefOr[Boolean] = js.undefined
    
    var reusedNode: js.UndefOr[IHighLevelNode] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributeDefaults(value: Boolean): Self = StObject.set(x, "attributeDefaults", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefaultsUndefined: Self = StObject.set(x, "attributeDefaults", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFsResolver(value: FSResolver): Self = StObject.set(x, "fsResolver", value.asInstanceOf[js.Any])
      
      inline def setFsResolverUndefined: Self = StObject.set(x, "fsResolver", js.undefined)
      
      inline def setHttpResolver(value: HTTPResolver): Self = StObject.set(x, "httpResolver", value.asInstanceOf[js.Any])
      
      inline def setHttpResolverUndefined: Self = StObject.set(x, "httpResolver", js.undefined)
      
      inline def setRejectOnErrors(value: Boolean): Self = StObject.set(x, "rejectOnErrors", value.asInstanceOf[js.Any])
      
      inline def setRejectOnErrorsUndefined: Self = StObject.set(x, "rejectOnErrors", js.undefined)
      
      inline def setReusedNode(value: IHighLevelNode): Self = StObject.set(x, "reusedNode", value.asInstanceOf[js.Any])
      
      inline def setReusedNodeUndefined: Self = StObject.set(x, "reusedNode", js.undefined)
    }
  }
  
  type ValueMetadata = typings.raml1Parser.distParserHighLevelASTMod.ValueMetadata
}
