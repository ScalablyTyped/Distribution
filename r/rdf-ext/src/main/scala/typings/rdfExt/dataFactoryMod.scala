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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataFactoryMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  class ^ () extends DataFactory[QuadExt, Quad]
  @JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "blankNode")
  @js.native
  def blankNode(): BlankNodeExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "blankNode")
  @js.native
  def blankNode(value: String): BlankNodeExt = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "dataset")
  @js.native
  def dataset(): DatasetExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "dataset")
  @js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "dataset")
  @js.native
  def dataset_graph(quads: js.UndefOr[scala.Nothing], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "dataset")
  @js.native
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "defaultGraph")
  @js.native
  def defaultGraph(): DefaultGraphExt = js.native
  
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
  class factory () extends DataFactory[QuadExt, Quad]
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "factory")
  @js.native
  def factory: Instantiable0[DataFactoryExt] = js.native
  @scala.inline
  def factory_=(x: Instantiable0[DataFactoryExt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("factory")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "graph")
  @js.native
  def graph(): DatasetExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "graph")
  @js.native
  def graph(quads: js.Any): DatasetExt = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "literal")
  @js.native
  def literal(value: String): LiteralExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "literal")
  @js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "literal")
  @js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): LiteralExt = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "namedNode")
  @js.native
  def namedNode[Iri /* <: String */](value: Iri): NamedNodeExt[Iri] = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "prefixMap")
  @js.native
  def prefixMap(prefixes: Prefixes): typings.rdfExt.prefixMapMod.^ = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "quad")
  @js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  @JSImport("rdf-ext/lib/DataFactory", "quad")
  @js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "triple")
  @js.native
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  
  /* static member */
  @JSImport("rdf-ext/lib/DataFactory", "variable")
  @js.native
  def variable(value: String): VariableExt = js.native
  
  // tslint:disable-next-line no-unnecessary-class
  type DataFactoryExt = DataFactory[QuadExt, Quad]
  
  type Prefixes = typings.rdfExt.prefixMapMod.^ | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
