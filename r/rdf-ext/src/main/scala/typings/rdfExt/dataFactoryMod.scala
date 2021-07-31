package typings.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.rdfExt.blankNodeMod.BlankNodeExt
import typings.rdfExt.datasetMod.DatasetExt
import typings.rdfExt.defaultGraphMod.DefaultGraphExt
import typings.rdfExt.literalMod.LiteralExt
import typings.rdfExt.namedNodeMod.NamedNodeExt
import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.quadMod.QuadExt
import typings.rdfExt.rdfExtStrings.graph
import typings.rdfExt.variableMod.VariableExt
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.QuadObject
import typings.rdfJs.mod.QuadPredicate
import typings.rdfJs.mod.QuadSubject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataFactoryMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with DataFactory[QuadExt, Quad]
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def blankNode(): BlankNodeExt = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[BlankNodeExt]
  @scala.inline
  def blankNode(value: String): BlankNodeExt = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[BlankNodeExt]
  
  /* static member */
  @scala.inline
  def dataset(): DatasetExt = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")().asInstanceOf[DatasetExt]
  @scala.inline
  def dataset(quads: js.Array[Quad]): DatasetExt = ^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any]).asInstanceOf[DatasetExt]
  
  @scala.inline
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[DatasetExt]
  @scala.inline
  def dataset_graph(quads: Unit, graph: PropType[QuadExt, graph]): DatasetExt = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(quads.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[DatasetExt]
  
  /* static member */
  @scala.inline
  def defaultGraph(): DefaultGraphExt = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[DefaultGraphExt]
  
  /* static member */
  /* static member */
  object defaults {
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.BlankNode")
    @js.native
    def BlankNode: BlankNodeExt = js.native
    @scala.inline
    def BlankNode_=(x: BlankNodeExt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlankNode")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Dataset")
    @js.native
    def Dataset: DatasetExt = js.native
    @scala.inline
    def Dataset_=(x: DatasetExt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dataset")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Literal")
    @js.native
    def Literal: LiteralExt = js.native
    @scala.inline
    def Literal_=(x: LiteralExt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.NamedNode")
    @js.native
    def NamedNode: NamedNodeExt[String] = js.native
    @scala.inline
    def NamedNode_=(x: NamedNodeExt[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedNode")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rdf-ext/lib/DataFactory", "defaults.PrefixMap")
    @js.native
    class PrefixMap protected ()
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
    @scala.inline
    def PrefixMap_=(
      x: Instantiable2[
          /* factory */ DataFactory[Quad, Quad], 
          /* prefixes */ typings.rdfExt.prefixMapMod.Prefixes, 
          typings.rdfExt.prefixMapMod.^
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrefixMap")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Quad")
    @js.native
    def Quad: QuadExt = js.native
    @scala.inline
    def Quad_=(x: QuadExt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quad")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.Variable")
    @js.native
    def Variable: VariableExt = js.native
    @scala.inline
    def Variable_=(x: VariableExt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variable")(x.asInstanceOf[js.Any])
    
    @JSImport("rdf-ext/lib/DataFactory", "defaults.defaultGraph")
    @js.native
    def defaultGraph: DefaultGraphExt = js.native
    @scala.inline
    def defaultGraph_=(x: DefaultGraphExt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultGraph")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  class factory ()
    extends StObject
       with DataFactory[QuadExt, Quad]
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  def factory: Instantiable0[DataFactoryExt] = js.native
  @scala.inline
  def factory_=(x: Instantiable0[DataFactoryExt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("factory")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def graph(): DatasetExt = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")().asInstanceOf[DatasetExt]
  @scala.inline
  def graph(quads: js.Any): DatasetExt = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(quads.asInstanceOf[js.Any]).asInstanceOf[DatasetExt]
  
  /* static member */
  @scala.inline
  def literal(value: String): LiteralExt = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralExt]
  @scala.inline
  def literal(value: String, languageOrDatatype: String): LiteralExt = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[LiteralExt]
  @scala.inline
  def literal(value: String, languageOrDatatype: NamedNode[String]): LiteralExt = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[LiteralExt]
  
  /* static member */
  @scala.inline
  def namedNode[Iri /* <: String */](value: Iri): NamedNodeExt[Iri] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[NamedNodeExt[Iri]]
  
  /* static member */
  @scala.inline
  def prefixMap(prefixes: Prefixes): typings.rdfExt.prefixMapMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixMap")(prefixes.asInstanceOf[js.Any]).asInstanceOf[typings.rdfExt.prefixMapMod.^]
  
  /* static member */
  @scala.inline
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[QuadExt]
  @scala.inline
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[QuadExt]
  
  /* static member */
  @scala.inline
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[QuadExt]
  
  /* static member */
  @scala.inline
  def variable(value: String): VariableExt = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[VariableExt]
  
  // tslint:disable-next-line no-unnecessary-class
  type DataFactoryExt = DataFactory[QuadExt, Quad]
  
  type Prefixes = typings.rdfExt.prefixMapMod.^ | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
