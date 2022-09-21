package typings.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.rdfExt.propTypeMod.PropType
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

object dataFactoryMod {
  
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
  inline def blankNode(): typings.rdfExt.blankNodeMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[typings.rdfExt.blankNodeMod.^]
  inline def blankNode(value: String): typings.rdfExt.blankNodeMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.blankNodeMod.^]
  
  /* static member */
  inline def dataset(): typings.rdfExt.datasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")().asInstanceOf[typings.rdfExt.datasetMod.^]
  inline def dataset(quads: js.Array[Quad]): typings.rdfExt.datasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.datasetMod.^]
  
  inline def dataset_graph(quads: js.Array[Quad], graph: PropType[typings.rdfExt.quadMod.^, graph]): typings.rdfExt.datasetMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.datasetMod.^]
  inline def dataset_graph(quads: Unit, graph: PropType[typings.rdfExt.quadMod.^, graph]): typings.rdfExt.datasetMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.datasetMod.^]
  
  /* static member */
  inline def defaultGraph(): typings.rdfExt.defaultGraphMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[typings.rdfExt.defaultGraphMod.^]
  
  /* static member */
  /* static member */
  object defaults {
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.BlankNode")
    @js.native
    def BlankNode: typings.rdfExt.blankNodeMod.^ = js.native
    inline def BlankNode_=(x: typings.rdfExt.blankNodeMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlankNode")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Dataset")
    @js.native
    def Dataset: typings.rdfExt.datasetMod.^ = js.native
    inline def Dataset_=(x: typings.rdfExt.datasetMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dataset")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Literal")
    @js.native
    def Literal: typings.rdfExt.literalMod.^ = js.native
    inline def Literal_=(x: typings.rdfExt.literalMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.NamedNode")
    @js.native
    def NamedNode: typings.rdfExt.namedNodeMod.^[String] = js.native
    inline def NamedNode_=(x: typings.rdfExt.namedNodeMod.^[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedNode")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    open class PrefixMap protected ()
      extends typings.rdfExt.prefixMapMod.^ {
      def this(factory: DataFactory[Quad, Quad], prefixes: typings.rdfExt.prefixMapMod.Prefixes) = this()
    }
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    def PrefixMap: Instantiable2[
        /* factory */ DataFactory[Quad, Quad], 
        /* prefixes */ typings.rdfExt.prefixMapMod.Prefixes, 
        typings.rdfExt.prefixMapMod.^
      ] = js.native
    inline def PrefixMap_=(
      x: Instantiable2[
          /* factory */ DataFactory[Quad, Quad], 
          /* prefixes */ typings.rdfExt.prefixMapMod.Prefixes, 
          typings.rdfExt.prefixMapMod.^
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrefixMap")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Quad")
    @js.native
    def Quad: typings.rdfExt.quadMod.^ = js.native
    inline def Quad_=(x: typings.rdfExt.quadMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quad")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Variable")
    @js.native
    def Variable: typings.rdfExt.variableMod.^ = js.native
    inline def Variable_=(x: typings.rdfExt.variableMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variable")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.defaultGraph")
    @js.native
    def defaultGraph: typings.rdfExt.defaultGraphMod.^ = js.native
    inline def defaultGraph_=(x: typings.rdfExt.defaultGraphMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultGraph")(x.asInstanceOf[js.Any])
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
  inline def graph(): typings.rdfExt.datasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")().asInstanceOf[typings.rdfExt.datasetMod.^]
  inline def graph(quads: Any): typings.rdfExt.datasetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(quads.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.datasetMod.^]
  
  /* static member */
  inline def literal(value: String): typings.rdfExt.literalMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.literalMod.^]
  inline def literal(value: String, languageOrDatatype: String): typings.rdfExt.literalMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.literalMod.^]
  inline def literal(value: String, languageOrDatatype: NamedNode[String]): typings.rdfExt.literalMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.literalMod.^]
  
  /* static member */
  inline def namedNode[Iri /* <: String */](value: Iri): typings.rdfExt.namedNodeMod.^[Iri] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.namedNodeMod.^[Iri]]
  
  /* static member */
  inline def prefixMap(prefixes: Prefixes): typings.rdfExt.prefixMapMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixMap")(prefixes.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.prefixMapMod.^]
  
  /* static member */
  inline def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdfExt.quadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.quadMod.^]
  inline def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typings.rdfExt.quadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.quadMod.^]
  
  /* static member */
  inline def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdfExt.quadMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.rdfExt.quadMod.^]
  
  /* static member */
  inline def variable(value: String): typings.rdfExt.variableMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.variableMod.^]
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait DataFactoryExt
    extends StObject
       with DataFactory[typings.rdfExt.quadMod.^, Quad]
       with DatasetCoreFactory[typings.rdfExt.quadMod.^, Quad, typings.rdfExt.datasetMod.^] {
    
    @JSName("dataset")
    def dataset_graph(quads: js.Array[Quad], graph: PropType[typings.rdfExt.quadMod.^, graph]): typings.rdfExt.datasetMod.^ = js.native
    @JSName("dataset")
    def dataset_graph(quads: Unit, graph: PropType[typings.rdfExt.quadMod.^, graph]): typings.rdfExt.datasetMod.^ = js.native
    
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): typings.rdfExt.quadMod.^ = js.native
    def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): typings.rdfExt.quadMod.^ = js.native
    
    @JSName("variable")
    def variable_MDataFactoryExt(value: String): typings.rdfExt.variableMod.^ = js.native
  }
  
  type Prefixes = typings.rdfExt.prefixMapMod.^ | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
