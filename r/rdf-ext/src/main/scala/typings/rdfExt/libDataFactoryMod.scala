package typings.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.rdfExt.libPropTypeMod.PropType
import typings.rdfExt.rdfExtStrings.graph
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.QuadObject
import typings.rdfjsTypes.dataModelMod.QuadPredicate
import typings.rdfjsTypes.dataModelMod.QuadSubject
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataFactoryMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataFactoryExt
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def blankNode(): typings.rdfExt.libBlankNodeMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[typings.rdfExt.libBlankNodeMod.^]
  inline def blankNode(value: String): typings.rdfExt.libBlankNodeMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libBlankNodeMod.^]
  
  /* static member */
  inline def dataset(): typings.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")().asInstanceOf[typings.rdfExt.libDatasetMod.^]
  inline def dataset(quads: js.Array[Quad]): typings.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libDatasetMod.^]
  
  inline def dataset_graph(quads: js.Array[Quad], graph: PropType[typings.rdfExt.libQuadMod.^, graph]): typings.rdfExt.libDatasetMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libDatasetMod.^]
  inline def dataset_graph(quads: Unit, graph: PropType[typings.rdfExt.libQuadMod.^, graph]): typings.rdfExt.libDatasetMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libDatasetMod.^]
  
  /* static member */
  inline def defaultGraph(): typings.rdfExt.libDefaultGraphMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[typings.rdfExt.libDefaultGraphMod.^]
  
  /* static member */
  /* static member */
  object defaults {
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.BlankNode")
    @js.native
    def BlankNode: typings.rdfExt.libBlankNodeMod.^ = js.native
    inline def BlankNode_=(x: typings.rdfExt.libBlankNodeMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlankNode")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Dataset")
    @js.native
    def Dataset: typings.rdfExt.libDatasetMod.^ = js.native
    inline def Dataset_=(x: typings.rdfExt.libDatasetMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dataset")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Literal")
    @js.native
    def Literal: typings.rdfExt.libLiteralMod.^ = js.native
    inline def Literal_=(x: typings.rdfExt.libLiteralMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.NamedNode")
    @js.native
    def NamedNode: typings.rdfExt.libNamedNodeMod.^[String] = js.native
    inline def NamedNode_=(x: typings.rdfExt.libNamedNodeMod.^[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedNode")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    open class PrefixMap protected ()
      extends typings.rdfExt.libPrefixMapMod.^ {
      def this(factory: DataFactory[Quad, Quad], prefixes: typings.rdfExt.libPrefixMapMod.Prefixes) = this()
    }
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    def PrefixMap: Instantiable2[
        /* factory */ DataFactory[Quad, Quad], 
        /* prefixes */ typings.rdfExt.libPrefixMapMod.Prefixes, 
        typings.rdfExt.libPrefixMapMod.^
      ] = js.native
    inline def PrefixMap_=(
      x: Instantiable2[
          /* factory */ DataFactory[Quad, Quad], 
          /* prefixes */ typings.rdfExt.libPrefixMapMod.Prefixes, 
          typings.rdfExt.libPrefixMapMod.^
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrefixMap")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Quad")
    @js.native
    def Quad: typings.rdfExt.libQuadMod.^ = js.native
    inline def Quad_=(x: typings.rdfExt.libQuadMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quad")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Variable")
    @js.native
    def Variable: typings.rdfExt.libVariableMod.^ = js.native
    inline def Variable_=(x: typings.rdfExt.libVariableMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variable")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.defaultGraph")
    @js.native
    def defaultGraph: typings.rdfExt.libDefaultGraphMod.^ = js.native
    inline def defaultGraph_=(x: typings.rdfExt.libDefaultGraphMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultGraph")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  open class factory ()
    extends StObject
       with DataFactoryExt
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  def factory: Instantiable0[DataFactoryExt] = js.native
  inline def factory_=(x: Instantiable0[DataFactoryExt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("factory")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def graph(): typings.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")().asInstanceOf[typings.rdfExt.libDatasetMod.^]
  inline def graph(quads: Any): typings.rdfExt.libDatasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(quads.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libDatasetMod.^]
  
  /* static member */
  inline def literal(value: String): typings.rdfExt.libLiteralMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libLiteralMod.^]
  inline def literal(value: String, languageOrDatatype: String): typings.rdfExt.libLiteralMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libLiteralMod.^]
  inline def literal(value: String, languageOrDatatype: NamedNode[String]): typings.rdfExt.libLiteralMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libLiteralMod.^]
  
  /* static member */
  inline def namedNode[Iri /* <: String */](value: Iri): typings.rdfExt.libNamedNodeMod.^[Iri] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libNamedNodeMod.^[Iri]]
  
  /* static member */
  inline def prefixMap(prefixes: Prefixes): typings.rdfExt.libPrefixMapMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixMap")(prefixes.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libPrefixMapMod.^]
  
  /* static member */
  inline def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdfExt.libQuadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libQuadMod.^]
  inline def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typings.rdfExt.libQuadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libQuadMod.^]
  
  /* static member */
  inline def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdfExt.libQuadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.libQuadMod.^]
  
  /* static member */
  inline def variable(value: String): typings.rdfExt.libVariableMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.libVariableMod.^]
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait DataFactoryExt
    extends StObject
       with DataFactory[typings.rdfExt.libQuadMod.^, Quad]
       with DatasetCoreFactory[typings.rdfExt.libQuadMod.^, Quad, typings.rdfExt.libDatasetMod.^] {
    
    @JSName("dataset")
    def dataset_graph(quads: js.Array[Quad], graph: PropType[typings.rdfExt.libQuadMod.^, graph]): typings.rdfExt.libDatasetMod.^ = js.native
    @JSName("dataset")
    def dataset_graph(quads: Unit, graph: PropType[typings.rdfExt.libQuadMod.^, graph]): typings.rdfExt.libDatasetMod.^ = js.native
    
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdfExt.libQuadMod.^ = js.native
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typings.rdfExt.libQuadMod.^ = js.native
    
    @JSName("variable")
    def variable_MDataFactoryExt(value: String): typings.rdfExt.libVariableMod.^ = js.native
  }
  
  type Prefixes = typings.rdfExt.libPrefixMapMod.^ | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
