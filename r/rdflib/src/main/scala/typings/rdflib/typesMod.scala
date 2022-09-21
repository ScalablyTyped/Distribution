package typings.rdflib

import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.factoryTypesMod.DataFactory
import typings.rdflib.factoryTypesMod.Indexable
import typings.rdflib.nodeInternalMod.default
import typings.rdflib.rdflibStrings.BlankNode
import typings.rdflib.rdflibStrings.Collection
import typings.rdflib.rdflibStrings.DefaultGraph
import typings.rdflib.rdflibStrings.Empty
import typings.rdflib.rdflibStrings.Graph
import typings.rdflib.rdflibStrings.Literal
import typings.rdflib.rdflibStrings.NamedNode
import typings.rdflib.rdflibStrings.Variable
import typings.rdflib.rdflibStrings.`applicationSlashn-quads`
import typings.rdflib.rdflibStrings.`applicationSlashn-triples`
import typings.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match`
import typings.rdflib.rdflibStrings.`applicationSlashsparql-update`
import typings.rdflib.rdflibStrings.`applicationSlashx-turtle`
import typings.rdflib.rdflibStrings.applicationSlashldPlussignjson
import typings.rdflib.rdflibStrings.applicationSlashn3
import typings.rdflib.rdflibStrings.applicationSlashnquads
import typings.rdflib.rdflibStrings.applicationSlashrdfPlussignxml
import typings.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml
import typings.rdflib.rdflibStrings.textSlashhtml
import typings.rdflib.rdflibStrings.textSlashn3
import typings.rdflib.rdflibStrings.textSlashturtle
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.tfTypesMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("rdflib/lib/types", "BlankNodeTermType")
  @js.native
  val BlankNodeTermType: BlankNode = js.native
  
  @JSImport("rdflib/lib/types", "CollectionTermType")
  @js.native
  val CollectionTermType: Collection = js.native
  
  @JSImport("rdflib/lib/types", "DefaultGraphTermType")
  @js.native
  val DefaultGraphTermType: DefaultGraph = js.native
  
  @JSImport("rdflib/lib/types", "EmptyTermType")
  @js.native
  val EmptyTermType: Empty = js.native
  
  @JSImport("rdflib/lib/types", "GraphTermType")
  @js.native
  val GraphTermType: Graph = js.native
  
  @JSImport("rdflib/lib/types", "HTMLContentType")
  @js.native
  val HTMLContentType: textSlashhtml = js.native
  
  @JSImport("rdflib/lib/types", "JSONLDContentType")
  @js.native
  val JSONLDContentType: applicationSlashldPlussignjson = js.native
  
  @JSImport("rdflib/lib/types", "LiteralTermType")
  @js.native
  val LiteralTermType: Literal = js.native
  
  @JSImport("rdflib/lib/types", "N3ContentType")
  @js.native
  val N3ContentType: textSlashn3 = js.native
  
  @JSImport("rdflib/lib/types", "N3LegacyContentType")
  @js.native
  val N3LegacyContentType: applicationSlashn3 = js.native
  
  @JSImport("rdflib/lib/types", "NQuadsAltContentType")
  @js.native
  val NQuadsAltContentType: applicationSlashnquads = js.native
  
  @JSImport("rdflib/lib/types", "NQuadsContentType")
  @js.native
  val NQuadsContentType: `applicationSlashn-quads` = js.native
  
  @JSImport("rdflib/lib/types", "NTriplesContentType")
  @js.native
  val NTriplesContentType: `applicationSlashn-triples` = js.native
  
  @JSImport("rdflib/lib/types", "NamedNodeTermType")
  @js.native
  val NamedNodeTermType: NamedNode = js.native
  
  @JSImport("rdflib/lib/types", "RDFXMLContentType")
  @js.native
  val RDFXMLContentType: applicationSlashrdfPlussignxml = js.native
  
  @JSImport("rdflib/lib/types", "SPARQLUpdateContentType")
  @js.native
  val SPARQLUpdateContentType: `applicationSlashsparql-update` = js.native
  
  @JSImport("rdflib/lib/types", "SPARQLUpdateSingleMatchContentType")
  @js.native
  val SPARQLUpdateSingleMatchContentType: `applicationSlashsparql-update-single-match` = js.native
  
  @JSImport("rdflib/lib/types", "TurtleContentType")
  @js.native
  val TurtleContentType: textSlashturtle = js.native
  
  @JSImport("rdflib/lib/types", "TurtleLegacyContentType")
  @js.native
  val TurtleLegacyContentType: `applicationSlashx-turtle` = js.native
  
  @JSImport("rdflib/lib/types", "VariableTermType")
  @js.native
  val VariableTermType: Variable = js.native
  
  @JSImport("rdflib/lib/types", "XHTMLContentType")
  @js.native
  val XHTMLContentType: applicationSlashxhtmlPlussignxml = js.native
  
  type Bindings = StringDictionary[Term]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.rdflibStrings.applicationSlashrdfPlussignxml
    - typings.rdflib.rdflibStrings.textSlashhtml
    - typings.rdflib.rdflibStrings.applicationSlashldPlussignjson
    - typings.rdflib.rdflibStrings.textSlashn3
    - typings.rdflib.rdflibStrings.applicationSlashn3
    - typings.rdflib.rdflibStrings.applicationSlashnquads
    - typings.rdflib.rdflibStrings.`applicationSlashn-quads`
    - typings.rdflib.rdflibStrings.`applicationSlashsparql-update`
    - typings.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match`
    - typings.rdflib.rdflibStrings.textSlashturtle
    - typings.rdflib.rdflibStrings.`applicationSlashx-turtle`
    - typings.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml
  */
  trait ContentType extends StObject
  object ContentType {
    
    inline def applicationSlashldPlussignjson: typings.rdflib.rdflibStrings.applicationSlashldPlussignjson = "application/ld+json".asInstanceOf[typings.rdflib.rdflibStrings.applicationSlashldPlussignjson]
    
    inline def `applicationSlashn-quads`: typings.rdflib.rdflibStrings.`applicationSlashn-quads` = "application/n-quads".asInstanceOf[typings.rdflib.rdflibStrings.`applicationSlashn-quads`]
    
    inline def applicationSlashn3: typings.rdflib.rdflibStrings.applicationSlashn3 = "application/n3".asInstanceOf[typings.rdflib.rdflibStrings.applicationSlashn3]
    
    inline def applicationSlashnquads: typings.rdflib.rdflibStrings.applicationSlashnquads = "application/nquads".asInstanceOf[typings.rdflib.rdflibStrings.applicationSlashnquads]
    
    inline def applicationSlashrdfPlussignxml: typings.rdflib.rdflibStrings.applicationSlashrdfPlussignxml = "application/rdf+xml".asInstanceOf[typings.rdflib.rdflibStrings.applicationSlashrdfPlussignxml]
    
    inline def `applicationSlashsparql-update`: typings.rdflib.rdflibStrings.`applicationSlashsparql-update` = "application/sparql-update".asInstanceOf[typings.rdflib.rdflibStrings.`applicationSlashsparql-update`]
    
    inline def `applicationSlashsparql-update-single-match`: typings.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match` = "application/sparql-update-single-match".asInstanceOf[typings.rdflib.rdflibStrings.`applicationSlashsparql-update-single-match`]
    
    inline def `applicationSlashx-turtle`: typings.rdflib.rdflibStrings.`applicationSlashx-turtle` = "application/x-turtle".asInstanceOf[typings.rdflib.rdflibStrings.`applicationSlashx-turtle`]
    
    inline def applicationSlashxhtmlPlussignxml: typings.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml = "application/xhtml+xml".asInstanceOf[typings.rdflib.rdflibStrings.applicationSlashxhtmlPlussignxml]
    
    inline def textSlashhtml: typings.rdflib.rdflibStrings.textSlashhtml = "text/html".asInstanceOf[typings.rdflib.rdflibStrings.textSlashhtml]
    
    inline def textSlashn3: typings.rdflib.rdflibStrings.textSlashn3 = "text/n3".asInstanceOf[typings.rdflib.rdflibStrings.textSlashn3]
    
    inline def textSlashturtle: typings.rdflib.rdflibStrings.textSlashturtle = "text/turtle".asInstanceOf[typings.rdflib.rdflibStrings.textSlashturtle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.tfTypesMod.Term
    - scala.Unit
    - scala.Null
    - typings.rdflib.collectionMod.default[C]
  */
  type FromValueReturns[C /* <: default */] = js.UndefOr[_FromValueReturns[C] | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.defaultGraphMod.default
    - typings.rdflib.namedNodeMod.default
    - typings.rdflib.variableMod.default
  */
  trait GraphType extends StObject
  
  @js.native
  trait IRDFlibDataFactory
    extends StObject
       with DataFactory[
          typings.rdflib.namedNodeMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.literalMod.default | (typings.rdflib.collectionMod.default[
            default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
          ]) | (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]), 
          Indexable
        ] {
    
    def fetcher(store: typings.rdflib.storeMod.default, options: Any): typings.rdflib.fetcherMod.default = js.native
    
    def graph(): typings.rdflib.storeMod.default = js.native
    def graph(features: Any): typings.rdflib.storeMod.default = js.native
    def graph(features: Any, opts: Any): typings.rdflib.storeMod.default = js.native
    def graph(features: Unit, opts: Any): typings.rdflib.storeMod.default = js.native
    
    def lit(`val`: String): typings.rdflib.literalMod.default = js.native
    def lit(`val`: String, lang: String): typings.rdflib.literalMod.default = js.native
    def lit(`val`: String, lang: String, dt: typings.rdflib.tfTypesMod.NamedNode): typings.rdflib.literalMod.default = js.native
    def lit(`val`: String, lang: Unit, dt: typings.rdflib.tfTypesMod.NamedNode): typings.rdflib.literalMod.default = js.native
    
    def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
    def st(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.namedNodeMod.default
    - typings.rdflib.literalMod.default
    - typings.rdflib.collectionMod.default[
  typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[scala.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default]
    - typings.rdflib.blankNodeMod.default
    - typings.rdflib.variableMod.default
    - typings.rdflib.emptyMod.default
  */
  type ObjectType = _ObjectType | (typings.rdflib.collectionMod.default[
    default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.namedNodeMod.default
    - typings.rdflib.variableMod.default
  */
  trait PredicateType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.blankNodeMod.default
    - typings.rdflib.namedNodeMod.default
    - typings.rdflib.variableMod.default
  */
  trait SubjectType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.rdflibStrings.NamedNode
    - typings.rdflib.rdflibStrings.BlankNode
    - typings.rdflib.rdflibStrings.Literal
    - typings.rdflib.rdflibStrings.Variable
    - typings.rdflib.rdflibStrings.DefaultGraph
    - typings.rdflib.rdflibStrings.Collection
    - typings.rdflib.rdflibStrings.Empty
    - typings.rdflib.rdflibStrings.Graph
  */
  trait TermType extends StObject
  object TermType {
    
    inline def BlankNode: typings.rdflib.rdflibStrings.BlankNode = "BlankNode".asInstanceOf[typings.rdflib.rdflibStrings.BlankNode]
    
    inline def Collection: typings.rdflib.rdflibStrings.Collection = "Collection".asInstanceOf[typings.rdflib.rdflibStrings.Collection]
    
    inline def DefaultGraph: typings.rdflib.rdflibStrings.DefaultGraph = "DefaultGraph".asInstanceOf[typings.rdflib.rdflibStrings.DefaultGraph]
    
    inline def Empty: typings.rdflib.rdflibStrings.Empty = "Empty".asInstanceOf[typings.rdflib.rdflibStrings.Empty]
    
    inline def Graph: typings.rdflib.rdflibStrings.Graph = "Graph".asInstanceOf[typings.rdflib.rdflibStrings.Graph]
    
    inline def Literal: typings.rdflib.rdflibStrings.Literal = "Literal".asInstanceOf[typings.rdflib.rdflibStrings.Literal]
    
    inline def NamedNode: typings.rdflib.rdflibStrings.NamedNode = "NamedNode".asInstanceOf[typings.rdflib.rdflibStrings.NamedNode]
    
    inline def Variable: typings.rdflib.rdflibStrings.Variable = "Variable".asInstanceOf[typings.rdflib.rdflibStrings.Variable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.tfTypesMod.Term
    - typings.rdflib.nodeInternalMod.default
    - js.Date
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Unit
    - scala.Null
    - typings.rdflib.collectionMod.default[
  typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[scala.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default]
  */
  type ValueType = js.UndefOr[
    _ValueType | (typings.rdflib.collectionMod.default[
      default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
    ]) | js.Date | String | Double | Boolean | Null
  ]
  
  trait _FromValueReturns[C /* <: default */] extends StObject
  
  trait _ObjectType extends StObject
  
  trait _ValueType extends StObject
}
