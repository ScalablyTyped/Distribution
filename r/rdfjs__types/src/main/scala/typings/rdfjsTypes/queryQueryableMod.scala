package typings.rdfjsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.rdfjsTypes.queryCommonMod.Query
import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryQueryableMod {
  
  @js.native
  trait AlgebraQueryable[AlgebraType, SupportedMetadataType, QueryAlgebraContextType /* <: QueryAlgebraContext */] extends StObject {
    
    /**
      * Initiate a given query provided as an Algebra object.
      *
      * This will produce a future to a query result, which has to be executed to obtain the query results.
      *
      * This can reject given an unsupported or invalid query.
      *
      * @see Query
      */
    def query(query: AlgebraType): js.Promise[Query[SupportedMetadataType]] = js.native
    def query(query: AlgebraType, context: QueryAlgebraContextType): js.Promise[Query[SupportedMetadataType]] = js.native
  }
  
  type AlgebraSparqlQueryable[AlgebraType, SupportedResultType, QueryAlgebraContextType /* <: QueryAlgebraContext */] = Any & (/* import warning: importer.ImportType#apply Failed type conversion: SupportedResultType extends @rdfjs/types.@rdfjs/types/query/queryable.BindingsResultSupport ? {queryBindings (query : AlgebraType): std.Promise<@rdfjs/types.@rdfjs/types/query/common.ResultStream<@rdfjs/types.@rdfjs/types/query/common.Bindings>>, queryBindings (query : AlgebraType, context : QueryAlgebraContextType): std.Promise<@rdfjs/types.@rdfjs/types/query/common.ResultStream<@rdfjs/types.@rdfjs/types/query/common.Bindings>>} : unknown */ js.Any)
  
  trait BindingsResultSupport extends StObject {
    
    var bindings: `true`
  }
  object BindingsResultSupport {
    
    inline def apply(): BindingsResultSupport = {
      val __obj = js.Dynamic.literal(bindings = true)
      __obj.asInstanceOf[BindingsResultSupport]
    }
    
    extension [Self <: BindingsResultSupport](x: Self) {
      
      inline def setBindings(value: `true`): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    }
  }
  
  trait BooleanResultSupport extends StObject {
    
    var boolean: `true`
  }
  object BooleanResultSupport {
    
    inline def apply(): BooleanResultSupport = {
      val __obj = js.Dynamic.literal(boolean = true)
      __obj.asInstanceOf[BooleanResultSupport]
    }
    
    extension [Self <: BooleanResultSupport](x: Self) {
      
      inline def setBoolean(value: `true`): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuadsResultSupport extends StObject {
    
    var quads: `true`
  }
  object QuadsResultSupport {
    
    inline def apply(): QuadsResultSupport = {
      val __obj = js.Dynamic.literal(quads = true)
      __obj.asInstanceOf[QuadsResultSupport]
    }
    
    extension [Self <: QuadsResultSupport](x: Self) {
      
      inline def setQuads(value: `true`): Self = StObject.set(x, "quads", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryAlgebraContext = QueryContext
  
  trait QueryContext
    extends StObject
       with /**
    * Custom properties
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * The date that should be used by SPARQL operations such as NOW().
      */
    var queryTimestamp: js.UndefOr[js.Date] = js.undefined
  }
  object QueryContext {
    
    inline def apply(): QueryContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryContext]
    }
    
    extension [Self <: QueryContext](x: Self) {
      
      inline def setQueryTimestamp(value: js.Date): Self = StObject.set(x, "queryTimestamp", value.asInstanceOf[js.Any])
      
      inline def setQueryTimestampUndefined: Self = StObject.set(x, "queryTimestamp", js.undefined)
    }
  }
  
  trait QueryFormat extends StObject {
    
    /**
      * An optional array of extensions on the query language.
      * The representation of these extensions is undefined.
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The query language, e.g. 'sparql'.
      */
    var language: String
    
    /**
      * The version of the query language, e.g. '1.1'.
      */
    var version: String
  }
  object QueryFormat {
    
    inline def apply(language: String, version: String): QueryFormat = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryFormat]
    }
    
    extension [Self <: QueryFormat](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuerySourceContext[SourceType] extends StObject {
    
    /**
      * An array of data sources the query engine must use.
      */
    var sources: Array[SourceType]
  }
  object QuerySourceContext {
    
    inline def apply[SourceType](sources: Array[SourceType]): QuerySourceContext[SourceType] = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuerySourceContext[SourceType]]
    }
    
    extension [Self <: QuerySourceContext[?], SourceType](x: Self & QuerySourceContext[SourceType]) {
      
      inline def setSources(value: Array[SourceType]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryStringContext
    extends StObject
       with QueryContext {
    
    /**
      * The baseIRI for parsing the query.
      */
    var baseIRI: js.UndefOr[String] = js.undefined
    
    /**
      * The format in which the query string is defined.
      * Defaults to { language: 'sparql', version: '1.1' }
      */
    var queryFormat: js.UndefOr[QueryFormat] = js.undefined
  }
  object QueryStringContext {
    
    inline def apply(): QueryStringContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryStringContext]
    }
    
    extension [Self <: QueryStringContext](x: Self) {
      
      inline def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
      
      inline def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
      
      inline def setQueryFormat(value: QueryFormat): Self = StObject.set(x, "queryFormat", value.asInstanceOf[js.Any])
      
      inline def setQueryFormatUndefined: Self = StObject.set(x, "queryFormat", js.undefined)
    }
  }
  
  trait SparqlResultSupport
    extends StObject
       with BindingsResultSupport
       with VoidResultSupport
       with QuadsResultSupport
       with BooleanResultSupport
  object SparqlResultSupport {
    
    inline def apply(): SparqlResultSupport = {
      val __obj = js.Dynamic.literal(bindings = true, boolean = true, quads = true, void = true)
      __obj.asInstanceOf[SparqlResultSupport]
    }
  }
  
  @js.native
  trait StringQueryable[SupportedMetadataType, QueryStringContextType /* <: QueryStringContext */] extends StObject {
    
    /**
      * Initiate a given query provided as a string.
      *
      * This will produce a future to a query result, which has to be executed to obtain the query results.
      *
      * This can reject given an unsupported or invalid query.
      *
      * @see Query
      */
    def query(query: String): js.Promise[Query[SupportedMetadataType]] = js.native
    def query(query: String, context: QueryStringContextType): js.Promise[Query[SupportedMetadataType]] = js.native
  }
  
  type StringSparqlQueryable[SupportedResultType, QueryStringContextType /* <: QueryStringContext */] = Any & (/* import warning: importer.ImportType#apply Failed type conversion: SupportedResultType extends @rdfjs/types.@rdfjs/types/query/queryable.BindingsResultSupport ? {queryBindings (query : string): std.Promise<@rdfjs/types.@rdfjs/types/query/common.ResultStream<@rdfjs/types.@rdfjs/types/query/common.Bindings>>, queryBindings (query : string, context : QueryStringContextType): std.Promise<@rdfjs/types.@rdfjs/types/query/common.ResultStream<@rdfjs/types.@rdfjs/types/query/common.Bindings>>} : unknown */ js.Any)
  
  trait VoidResultSupport extends StObject {
    
    var void: `true`
  }
  object VoidResultSupport {
    
    inline def apply(): VoidResultSupport = {
      val __obj = js.Dynamic.literal(void = true)
      __obj.asInstanceOf[VoidResultSupport]
    }
    
    extension [Self <: VoidResultSupport](x: Self) {
      
      inline def setVoid(value: `true`): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
    }
  }
}
