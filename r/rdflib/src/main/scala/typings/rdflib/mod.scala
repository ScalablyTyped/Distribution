package typings.rdflib

import org.scalablytyped.runtime.NumberDictionary
import typings.rdflib.anon.ATTRIBUTE
import typings.rdflib.anon.Flags
import typings.rdflib.anon.Pattern
import typings.rdflib.anon.RDF
import typings.rdflib.libBlankNodeMod.default
import typings.rdflib.libFetcherMod.Handler
import typings.rdflib.libFetcherMod.Options
import typings.rdflib.libFormulaMod.FormulaOpts
import typings.rdflib.libN3parserMod.SinkParser
import typings.rdflib.libParseMod.CallbackFunc
import typings.rdflib.libStoreMod.FeaturesType
import typings.rdflib.libTfTypesMod.DefaultGraph
import typings.rdflib.libTfTypesMod.RdfJsDataFactory
import typings.rdflib.libTfTypesMod.Term
import typings.rdflib.libTypesMod.ContentType
import typings.rdflib.libTypesMod.FromValueReturns
import typings.rdflib.libTypesMod.GraphType
import typings.rdflib.libTypesMod.IRDFlibDataFactory
import typings.rdflib.libTypesMod.ObjectType
import typings.rdflib.libTypesMod.PredicateType
import typings.rdflib.libTypesMod.SubjectType
import typings.rdflib.libTypesMod.ValueType
import typings.rdflib.rdflibBooleans.`false`
import typings.rdflib.rdflibStrings._Colon
import typings.std.Document
import typings.std.Number
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdflib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdflib", "BlankNode")
  @js.native
  /**
    * Initializes this node
    * @param [id] The identifier for the blank node
    */
  open class BlankNode () extends default {
    def this(id: String) = this()
    def this(id: Any) = this()
  }
  /* static members */
  object BlankNode {
    
    @JSImport("rdflib", "BlankNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib", "BlankNode.NTAnonymousNodePrefix")
    @js.native
    def NTAnonymousNodePrefix: _Colon = js.native
    inline def NTAnonymousNodePrefix_=(x: _Colon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NTAnonymousNodePrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("rdflib", "BlankNode.getId")
    @js.native
    def getId: Any = js.native
    inline def getId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getId")(x.asInstanceOf[js.Any])
    
    /**
      * The next unique identifier for blank nodes
      */
    @JSImport("rdflib", "BlankNode.nextId")
    @js.native
    def nextId: Double = js.native
    inline def nextId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rdflib", "Collection")
  @js.native
  open class Collection[T /* <: typings.rdflib.libNodeInternalMod.default */] ()
    extends typings.rdflib.libCollectionMod.default[T] {
    def this(initial: js.Array[ValueType]) = this()
  }
  /* static members */
  object Collection {
    
    @JSImport("rdflib", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib", "Collection.termType")
    @js.native
    def termType: typings.rdflib.rdflibStrings.Collection = js.native
    inline def termType_=(x: typings.rdflib.rdflibStrings.Collection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("termType")(x.asInstanceOf[js.Any])
    
    inline def toNT(collection: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNT")(collection.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("rdflib", "ConnectedStore")
  @js.native
  open class ConnectedStore protected ()
    extends typings.rdflib.libStoreMod.default {
    def this(features: Any) = this()
    
    @JSName("fetcher")
    var fetcher_ConnectedStore: typings.rdflib.libFetcherMod.default = js.native
  }
  
  /** Full RDFLib.js Data Factory */
  @JSImport("rdflib", "DataFactory")
  @js.native
  val DataFactory: IRDFlibDataFactory = js.native
  
  @JSImport("rdflib", "Empty")
  @js.native
  open class Empty ()
    extends typings.rdflib.libEmptyMod.default
  
  @JSImport("rdflib", "Fetcher")
  @js.native
  open class Fetcher_ protected ()
    extends typings.rdflib.libFetcherMod.default {
    def this(store: typings.rdflib.libStoreMod.default) = this()
    def this(store: typings.rdflib.libStoreMod.default, options: Options) = this()
  }
  /* static members */
  object Fetcher_ {
    
    @JSImport("rdflib", "Fetcher")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib", "Fetcher.CONTENT_TYPE_BY_EXT")
    @js.native
    def CONTENT_TYPE_BY_EXT: Record[String, String] = js.native
    inline def CONTENT_TYPE_BY_EXT_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_TYPE_BY_EXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rdflib", "Fetcher.HANDLERS")
    @js.native
    def HANDLERS: NumberDictionary[Handler] = js.native
    inline def HANDLERS_=(x: NumberDictionary[Handler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLERS")(x.asInstanceOf[js.Any])
    
    inline def crossSiteProxy(uri: String): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossSiteProxy")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
    
    @JSImport("rdflib", "Fetcher.crossSiteProxyTemplate")
    @js.native
    def crossSiteProxyTemplate: Any = js.native
    inline def crossSiteProxyTemplate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crossSiteProxyTemplate")(x.asInstanceOf[js.Any])
    
    inline def offlineOverride(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offlineOverride")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def proxyIfNecessary(uri: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyIfNecessary")(uri.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** Decide on credentials using old XXHR api or new fetch()  one
      * @param requestedURI
      * @param options
      */
    inline def setCredentials(requestedURI: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCredentials")(requestedURI.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCredentials(requestedURI: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCredentials")(requestedURI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Tests whether the uri's protocol is supported by the Fetcher.
      * @param uri
      */
    inline def unsupportedProtocol(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedProtocol")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("rdflib", "Formula")
  @js.native
  /**
    * Initializes this formula
    * @constructor
    * @param statements - Initial array of statements
    * @param constraints - initial array of constraints
    * @param initBindings - initial bindings used in Query
    * @param optional - optional
    * @param opts
    * @param opts.rdfFactory - The rdf factory that should be used by the store
    */
  open class Formula ()
    extends typings.rdflib.libFormulaMod.default {
    def this(statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ]) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any]
    ) = this()
    def this(statements: Unit, constraints: js.Array[Any]) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: js.Array[Any]
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: js.Array[Any]
    ) = this()
    def this(statements: Unit, constraints: js.Array[Any], initBindings: js.Array[Any]) = this()
    def this(statements: Unit, constraints: Unit, initBindings: js.Array[Any]) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: js.Array[Any],
      optional: js.Array[Any]
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: Unit,
      optional: js.Array[Any]
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: js.Array[Any],
      optional: js.Array[Any]
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: Unit,
      optional: js.Array[Any]
    ) = this()
    def this(statements: Unit, constraints: js.Array[Any], initBindings: js.Array[Any], optional: js.Array[Any]) = this()
    def this(statements: Unit, constraints: js.Array[Any], initBindings: Unit, optional: js.Array[Any]) = this()
    def this(statements: Unit, constraints: Unit, initBindings: js.Array[Any], optional: js.Array[Any]) = this()
    def this(statements: Unit, constraints: Unit, initBindings: Unit, optional: js.Array[Any]) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: js.Array[Any],
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: js.Array[Any],
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: Unit,
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: js.Array[Any],
      initBindings: Unit,
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: js.Array[Any],
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: js.Array[Any],
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: Unit,
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: js.Array[
            typings.rdflib.libStatementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
          ],
      constraints: Unit,
      initBindings: Unit,
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: js.Array[Any],
      initBindings: js.Array[Any],
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: js.Array[Any],
      initBindings: js.Array[Any],
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: js.Array[Any],
      initBindings: Unit,
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: js.Array[Any],
      initBindings: Unit,
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: Unit,
      initBindings: js.Array[Any],
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: Unit,
      initBindings: js.Array[Any],
      optional: Unit,
      opts: FormulaOpts
    ) = this()
    def this(
      statements: Unit,
      constraints: Unit,
      initBindings: Unit,
      optional: js.Array[Any],
      opts: FormulaOpts
    ) = this()
    def this(statements: Unit, constraints: Unit, initBindings: Unit, optional: Unit, opts: FormulaOpts) = this()
  }
  
  @JSImport("rdflib", "IndexedFormula")
  @js.native
  /**
    * Creates a new formula
    * @param features - What sort of automatic processing to do? Array of string
    * @param features.sameAs - Smush together A and B nodes whenever { A sameAs B }
    * @param opts
    * @param [opts.rdfFactory] - The data factory that should be used by the store
    * @param [opts.rdfArrayRemove] - Function which removes statements from the store
    * @param [opts.dataCallback] - Callback when a statement is added to the store, will not trigger when adding duplicates
    */
  open class IndexedFormula ()
    extends typings.rdflib.libStoreMod.default {
    def this(features: FeaturesType) = this()
    def this(features: Unit, opts: FormulaOpts) = this()
    def this(features: FeaturesType, opts: FormulaOpts) = this()
  }
  /* static members */
  object IndexedFormula {
    
    @JSImport("rdflib", "IndexedFormula")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib", "IndexedFormula.handleRDFType")
    @js.native
    def handleRDFType: js.Function = js.native
    inline def handleRDFType_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleRDFType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rdflib", "Literal")
  @js.native
  open class Literal protected ()
    extends typings.rdflib.libLiteralMod.default {
    /**
      * Initializes a literal
      * @param value - The literal's lexical value
      * @param language - The language for the literal. Defaults to ''.
      * @param datatype - The literal's datatype as a named node. Defaults to xsd:string.
      */
    def this(value: String) = this()
    def this(value: String, language: String) = this()
    def this(value: String, language: String, datatype: Any) = this()
    def this(value: String, language: Null, datatype: Any) = this()
    def this(value: String, language: Unit, datatype: Any) = this()
  }
  /* static members */
  object Literal {
    
    @JSImport("rdflib", "Literal")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Builds a literal node from a boolean value
      * @param value - The value
      */
    inline def fromBoolean(value: Boolean): typings.rdflib.libLiteralMod.Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libLiteralMod.Literal]
    
    /**
      * Builds a literal node from a date value
      * @param value The value
      */
    inline def fromDate(value: js.Date): typings.rdflib.libLiteralMod.Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libLiteralMod.Literal]
    
    /**
      * Builds a literal node from a number value
      * @param value - The value
      */
    inline def fromNumber(value: Double): typings.rdflib.libLiteralMod.Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libLiteralMod.Literal]
    
    /**
      * Builds a literal node from an input value
      * @param value - The input value
      */
    inline def fromValue[T /* <: FromValueReturns[Any] */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** Serializes a literal to an N-Triples string */
    inline def toNT(literal: typings.rdflib.libLiteralMod.Literal): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNT")(literal.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("rdflib", "LiveStore")
  @js.native
  open class LiveStore protected () extends ConnectedStore {
    def this(features: Any) = this()
    
    @JSName("updater")
    var updater_LiveStore: typings.rdflib.libUpdateManagerMod.default = js.native
  }
  
  inline def N3Parser(
    store: Any,
    openFormula: Any,
    thisDoc: Any,
    baseURI: Any,
    genPrefix: Any,
    metaURI: Any,
    flags: Any,
    why: Any
  ): SinkParser = (^.asInstanceOf[js.Dynamic].applyDynamic("N3Parser")(store.asInstanceOf[js.Any], openFormula.asInstanceOf[js.Any], thisDoc.asInstanceOf[js.Any], baseURI.asInstanceOf[js.Any], genPrefix.asInstanceOf[js.Any], metaURI.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], why.asInstanceOf[js.Any])).asInstanceOf[SinkParser]
  
  @JSImport("rdflib", "NamedNode")
  @js.native
  open class NamedNode protected ()
    extends typings.rdflib.libNamedNodeMod.default {
    /**
      * Create a named (IRI) RDF Node
      * @constructor
      * @param iri - The IRI for this node
      */
    def this(iri: String) = this()
  }
  /* static members */
  object NamedNode {
    
    @JSImport("rdflib", "NamedNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a named node from the specified input value
      * @param value - An input value
      */
    inline def fromValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  inline def Namespace(nsuri: String): js.Function1[/* ln */ String, typings.rdflib.libTfTypesMod.NamedNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("Namespace")(nsuri.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ln */ String, typings.rdflib.libTfTypesMod.NamedNode]]
  inline def Namespace(nsuri: String, factory: RdfJsDataFactory): js.Function1[/* ln */ String, typings.rdflib.libTfTypesMod.NamedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("Namespace")(nsuri.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ln */ String, typings.rdflib.libTfTypesMod.NamedNode]]
  
  @JSImport("rdflib", "NextId")
  @js.native
  val NextId: Double = js.native
  
  /* note: abstract class */ @JSImport("rdflib", "Node")
  @js.native
  open class Node protected ()
    extends typings.rdflib.libNodeMod.default {
    /* protected */ def this(value: String) = this()
  }
  /* static members */
  object Node {
    
    @JSImport("rdflib", "Node")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromValue[T /* <: FromValueReturns[Any] */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def toJS(term: Any): js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object]) = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(term.asInstanceOf[js.Any]).asInstanceOf[js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object])]
  }
  
  @JSImport("rdflib", "Query")
  @js.native
  open class Query protected ()
    extends typings.rdflib.libQueryMod.Query {
    def this(name: Any, id: Any) = this()
  }
  
  @JSImport("rdflib", "RDFParser")
  @js.native
  open class RDFParser protected ()
    extends typings.rdflib.libRdfxmlparserMod.default {
    def this(store: Any) = this()
  }
  /* static members */
  object RDFParser {
    
    @JSImport("rdflib", "RDFParser")
    @js.native
    val ^ : js.Any = js.native
    
    /** DOM Level 2 node type magic numbers @final
      *  @member RDFParser
      */
    @JSImport("rdflib", "RDFParser.nodeType")
    @js.native
    def nodeType: ATTRIBUTE = js.native
    inline def nodeType_=(x: ATTRIBUTE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(x.asInstanceOf[js.Any])
    
    /** Standard namespaces that we know how to handle @final
      *  @member RDFParser
      */
    @JSImport("rdflib", "RDFParser.ns")
    @js.native
    def ns: RDF = js.native
    inline def ns_=(x: RDF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ns")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rdflib", "RDFaProcessor")
  @js.native
  open class RDFaProcessor protected ()
    extends typings.rdflib.libRdfaparserMod.default {
    def this(kb: Any, options: Any) = this()
  }
  object RDFaProcessor {
    
    @JSImport("rdflib", "RDFaProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib", "RDFaProcessor.HTMLLiteralURI")
    @js.native
    val HTMLLiteralURI: String = js.native
    
    @JSImport("rdflib", "RDFaProcessor.NCNAME")
    @js.native
    val NCNAME: js.RegExp = js.native
    
    @JSImport("rdflib", "RDFaProcessor.PlainLiteralURI")
    @js.native
    val PlainLiteralURI: String = js.native
    
    @JSImport("rdflib", "RDFaProcessor.XMLLiteralURI")
    @js.native
    val XMLLiteralURI: String = js.native
    
    @JSImport("rdflib", "RDFaProcessor.dateTimeTypes")
    @js.native
    val dateTimeTypes: js.Array[Pattern] = js.native
    
    @JSImport("rdflib", "RDFaProcessor.nameChar")
    @js.native
    val nameChar: String = js.native
    
    @JSImport("rdflib", "RDFaProcessor.nameStartChar")
    @js.native
    val nameStartChar: String = js.native
    
    @JSImport("rdflib", "RDFaProcessor.objectURI")
    @js.native
    val objectURI: String = js.native
    
    /* static member */
    inline def parseRDFaDOM(dom: Any, kb: Any, base: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRDFaDOM")(dom.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def tokenize(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    inline def trim(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("rdflib", "RDFaProcessor.typeURI")
    @js.native
    val typeURI: String = js.native
  }
  
  inline def SPARQLToQuery(SPARQL: Any, testMode: Any, kb: Any): `false` | typings.rdflib.libQueryMod.Query = (^.asInstanceOf[js.Dynamic].applyDynamic("SPARQLToQuery")(SPARQL.asInstanceOf[js.Any], testMode.asInstanceOf[js.Any], kb.asInstanceOf[js.Any])).asInstanceOf[`false` | typings.rdflib.libQueryMod.Query]
  
  inline def Serializer(store: Any): typings.rdflib.libSerializerMod.Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("Serializer")(store.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libSerializerMod.Serializer]
  
  @JSImport("rdflib", "Statement")
  @js.native
  open class Statement[S /* <: SubjectType */, P /* <: PredicateType */, O /* <: ObjectType */, G /* <: GraphType */] protected ()
    extends typings.rdflib.libStatementMod.default[S, P, O, G] {
    /**
      * Construct a new statement
      *
      * @param subject - The subject of the triple.  What the fact is about
      * @param predicate - The relationship which is asserted between the subject and object
      * @param object - The thing or data value which is asserted to be related to the subject
      * @param {NamedNode} graph - The document where the triple is or was or will be stored on the web.
      *
      * The graph param is a named node of the document in which the triple when it is stored
      *  on the web. It exists because when you have read data from various places in the web,
      *  the “graph” tells you _why_ you have the triple. (At the moment, it is just the
      *  document, in future it could be an inference step)
      *
      * When you do UpdateManager.update() then the graph’s of all the statements must be the same,
      *  and give the document you are patching. In future, we may have a more
      *  powerful update() which can update more than one document.
      */
    def this(subject: S, predicate: P, `object`: O) = this()
    def this(subject: S, predicate: P, `object`: O, graph: G) = this()
    def this(subject: S, predicate: P, `object`: O, graph: DefaultGraph) = this()
  }
  
  @JSImport("rdflib", "Store")
  @js.native
  /**
    * Creates a new formula
    * @param features - What sort of automatic processing to do? Array of string
    * @param features.sameAs - Smush together A and B nodes whenever { A sameAs B }
    * @param opts
    * @param [opts.rdfFactory] - The data factory that should be used by the store
    * @param [opts.rdfArrayRemove] - Function which removes statements from the store
    * @param [opts.dataCallback] - Callback when a statement is added to the store, will not trigger when adding duplicates
    */
  open class Store ()
    extends typings.rdflib.libStoreMod.default {
    def this(features: FeaturesType) = this()
    def this(features: Unit, opts: FormulaOpts) = this()
    def this(features: FeaturesType, opts: FormulaOpts) = this()
  }
  /* static members */
  object Store {
    
    @JSImport("rdflib", "Store")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib", "Store.handleRDFType")
    @js.native
    def handleRDFType: js.Function = js.native
    inline def handleRDFType_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleRDFType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rdflib", "UpdateManager")
  @js.native
  /**
    * @param  store - The quadstore to store data and metadata. Created if not passed.
    */
  open class UpdateManager ()
    extends typings.rdflib.libUpdateManagerMod.default {
    def this(store: typings.rdflib.libStoreMod.default) = this()
  }
  
  @JSImport("rdflib", "UpdatesSocket")
  @js.native
  open class UpdatesSocket protected ()
    extends typings.rdflib.libUpdatesViaMod.UpdatesSocket {
    def this(parent: Any, via: Any) = this()
  }
  
  @JSImport("rdflib", "UpdatesVia")
  @js.native
  open class UpdatesVia protected ()
    extends typings.rdflib.libUpdatesViaMod.UpdatesVia {
    def this(fetcher: Any) = this()
  }
  
  object Util {
    
    @JSImport("rdflib", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def DOMParserFactory(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DOMParserFactory")().asInstanceOf[Any]
    
    inline def RDFArrayRemove(a: Any, x: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RDFArrayRemove")(a.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def callbackify(obj: Any, callbacks: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(obj.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def domToString(node: Any, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("domToString")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def dtstamp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dtstamp")().asInstanceOf[String]
    
    inline def dumpNode(node: Any, options: Any, selfClosing: Any, skipAttributes: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dumpNode")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any], skipAttributes.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def heavyCompare(x: Any, y: Any, g: Any, uriMap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("heavyCompare")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], g.asInstanceOf[js.Any], uriMap.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def heavyCompareSPO(x: Any, y: Any, g: Any, uriMap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("heavyCompareSPO")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], g.asInstanceOf[js.Any], uriMap.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def linkRelationProperty(relation: Any): typings.rdflib.libNamedNodeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRelationProperty")(relation.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libNamedNodeMod.default]
    
    object log {
      
      @JSImport("rdflib", "Util.log")
      @js.native
      val ^ : js.Any = js.native
      
      inline def debug(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def error(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def info(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def msg(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def success(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def warn(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    inline def mediaTypeClass(mediaType: Any): typings.rdflib.libNamedNodeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaTypeClass")(mediaType.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libNamedNodeMod.default]
    
    inline def output(o: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def parseXML(str: Any, options: Any): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
    
    inline def stackString(e: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stackString")(e.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringStartswith(str: Any, pref: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("string_startswith")(str.asInstanceOf[js.Any], pref.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    object uri {
      
      @JSImport("rdflib", "Util.uri")
      @js.native
      val ^ : js.Any = js.native
      
      inline def docpart(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("docpart")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def document(x: String): typings.rdflib.libNamedNodeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(x.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libNamedNodeMod.default]
      
      inline def hostpart(u: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostpart")(u.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def join(`given`: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(`given`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def protocol(uri: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("protocol")(uri.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      inline def refTo(base: String, uri: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("refTo")(base.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[String]
    }
  }
  
  @JSImport("rdflib", "Variable")
  @js.native
  /**
    * Initializes this variable
    * @param name The variable's name
    */
  open class Variable ()
    extends typings.rdflib.libVariableMod.default {
    def this(name: String) = this()
  }
  /* static members */
  object Variable {
    
    @JSImport("rdflib", "Variable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def toString(variable: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(variable.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(graph, lit, st, namedNode, variable, blankNode, defaultGraph, literal, quad, triple) */ inline def fetcher(store: typings.rdflib.libStoreMod.default, options: Any): typings.rdflib.libFetcherMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fetcher")(store.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rdflib.libFetcherMod.default]
  
  inline def fromNT(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNT")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isBlankNode(obj: Any): /* is rdflib.rdflib/lib/tf-types.BlankNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlankNode")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.BlankNode */ Boolean]
  
  inline def isCollection(obj: Any): /* is rdflib.rdflib/lib/collection.default<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/collection.default<any> */ Boolean]
  
  inline def isGraph(obj: Any): /* is rdflib.rdflib/lib/tf-types.Quad_Graph */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGraph")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Quad_Graph */ Boolean]
  
  inline def isLiteral(value: Any): /* is rdflib.rdflib/lib/tf-types.Literal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Literal */ Boolean]
  
  inline def isNamedNode(obj: Any): /* is rdflib.rdflib/lib/tf-types.NamedNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedNode")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.NamedNode */ Boolean]
  
  inline def isPredicate(obj: Any): /* is rdflib.rdflib/lib/tf-types.Quad_Predicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPredicate")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Quad_Predicate */ Boolean]
  
  inline def isQuad(obj: Any): /* is rdflib.rdflib/lib/tf-types.Quad<any, any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuad")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Quad<any, any, any, any> */ Boolean]
  
  inline def isRDFObject(obj: Any): /* is rdflib.rdflib/lib/tf-types.Quad_Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRDFObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Quad_Object */ Boolean]
  
  inline def isRDFlibObject(obj: Any): /* is rdflib.rdflib/lib/types.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRDFlibObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/types.ObjectType */ Boolean]
  
  inline def isRDFlibPredicate(obj: Any): /* is rdflib.rdflib/lib/tf-types.Quad_Predicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRDFlibPredicate")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Quad_Predicate */ Boolean]
  
  inline def isRDFlibSubject(obj: Any): /* is rdflib.rdflib/lib/types.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRDFlibSubject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/types.ObjectType */ Boolean]
  
  inline def isStatement(obj: Any): /* is rdflib.rdflib/lib/statement.default<rdflib.rdflib/lib/types.SubjectType, rdflib.rdflib/lib/types.PredicateType, rdflib.rdflib/lib/types.ObjectType, rdflib.rdflib/lib/types.GraphType> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/statement.default<rdflib.rdflib/lib/types.SubjectType, rdflib.rdflib/lib/types.PredicateType, rdflib.rdflib/lib/types.ObjectType, rdflib.rdflib/lib/types.GraphType> */ Boolean]
  
  inline def isStore(obj: Any): /* is rdflib.rdflib/lib/store.default */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStore")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/store.default */ Boolean]
  
  inline def isSubject(obj: Any): /* is rdflib.rdflib/lib/tf-types.Quad_Subject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Quad_Subject */ Boolean]
  
  inline def isTerm(obj: Any): /* is rdflib.rdflib/lib/tf-types.Term */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTerm")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Term */ Boolean]
  
  inline def isVariable(obj: Any): /* is rdflib.rdflib/lib/tf-types.Variable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/tf-types.Variable */ Boolean]
  
  object jsonParser {
    
    @JSImport("rdflib", "jsonParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseJSON(data: Any, source: Any, store: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(data.asInstanceOf[js.Any], source.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object log {
    
    @JSImport("rdflib", "log")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def msg(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def success(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def parse(str: String, kb: typings.rdflib.libFormulaMod.default, base: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(str: String, kb: typings.rdflib.libFormulaMod.default, base: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(
    str: String,
    kb: typings.rdflib.libFormulaMod.default,
    base: String,
    contentType: String,
    callback: CallbackFunc
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(
    str: String,
    kb: typings.rdflib.libFormulaMod.default,
    base: String,
    contentType: Unit,
    callback: CallbackFunc
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(str: String, kb: typings.rdflib.libFormulaMod.default, base: String, contentType: ContentType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(
    str: String,
    kb: typings.rdflib.libFormulaMod.default,
    base: String,
    contentType: ContentType,
    callback: CallbackFunc
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def queryToSPARQL(query: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("queryToSPARQL")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serialize(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.libFormulaMod.default | typings.rdflib.libTfTypesMod.NamedNode | typings.rdflib.libTfTypesMod.BlankNode | Null,
    /** The store */
  kb: typings.rdflib.libFormulaMod.default,
    base: js.UndefOr[Any],
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: js.UndefOr[String | ContentType],
    callback: js.UndefOr[
      js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String], Any]
    ],
    options: js.UndefOr[Flags]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(target.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def sparqlUpdateParser(str: Any, kb: Any, base: Any): typings.rdflib.anon.Query = (^.asInstanceOf[js.Dynamic].applyDynamic("sparqlUpdateParser")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.rdflib.anon.Query]
  
  inline def term[T /* <: FromValueReturns[Any] */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("term")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def termValue(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termValue")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def termValue(node: Term): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termValue")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object uri {
    
    @JSImport("rdflib", "uri")
    @js.native
    val ^ : js.Any = js.native
    
    inline def docpart(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("docpart")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def document(x: String): typings.rdflib.libNamedNodeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(x.asInstanceOf[js.Any]).asInstanceOf[typings.rdflib.libNamedNodeMod.default]
    
    inline def hostpart(u: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostpart")(u.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def join(`given`: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(`given`.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def protocol(uri: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("protocol")(uri.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def refTo(base: String, uri: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("refTo")(base.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
