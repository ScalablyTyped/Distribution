package typings.rdfjsDataset

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DefaultGraph
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadObject
import typings.rdfJs.mod.QuadPredicate
import typings.rdfJs.mod.QuadSubject
import typings.rdfJs.mod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {dataset <InQuad extends rdf-js.rdf-js.BaseQuad = rdf-js.rdf-js.Quad>(quads : std.Array<InQuad> | undefined): @rdfjs/dataset.@rdfjs/dataset/DatasetCore.^<InQuad>,   defaultGraphInstance :rdf-js.rdf-js.DefaultGraph} & std.Required<rdf-js.rdf-js.DataFactory<rdf-js.rdf-js.Quad, rdf-js.rdf-js.Quad>> */
object mod {
  
  @JSImport("@rdfjs/dataset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rdfjs/dataset", "blankNode")
  @js.native
  def blankNode(): BlankNode = js.native
  @JSImport("@rdfjs/dataset", "blankNode")
  @js.native
  def blankNode_Fmod: js.Function0[BlankNode] = js.native
  
  @scala.inline
  def blankNode_Fmod_=(x: js.Function0[BlankNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blankNode")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/dataset", "dataset")
  @js.native
  def dataset[InQuad /* <: BaseQuad */](): typings.rdfjsDataset.datasetCoreMod.^[InQuad] = js.native
  @JSImport("@rdfjs/dataset", "dataset")
  @js.native
  def dataset[InQuad /* <: BaseQuad */](quads: js.Array[InQuad]): typings.rdfjsDataset.datasetCoreMod.^[InQuad] = js.native
  
  @JSImport("@rdfjs/dataset", "defaultGraph")
  @js.native
  def defaultGraph(): DefaultGraph = js.native
  
  @JSImport("@rdfjs/dataset", "defaultGraphInstance")
  @js.native
  def defaultGraphInstance: DefaultGraph = js.native
  @scala.inline
  def defaultGraphInstance_=(x: DefaultGraph): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultGraphInstance")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/dataset", "defaultGraph")
  @js.native
  def defaultGraph_Fmod: js.Function0[DefaultGraph] = js.native
  
  @scala.inline
  def defaultGraph_Fmod_=(x: js.Function0[DefaultGraph]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultGraph")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/dataset", "literal")
  @js.native
  def literal: js.Function1[/* value */ String, Literal] = js.native
  @JSImport("@rdfjs/dataset", "literal")
  @js.native
  def literal(value: String): Literal = js.native
  @scala.inline
  def literal_=(x: js.Function1[/* value */ String, Literal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/dataset", "namedNode")
  @js.native
  def namedNode: js.Function1[/* value */ String, NamedNode[String]] = js.native
  @JSImport("@rdfjs/dataset", "namedNode")
  @js.native
  def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
  @scala.inline
  def namedNode_=(x: js.Function1[/* value */ String, NamedNode[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namedNode")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/dataset", "quad")
  @js.native
  def quad: js.Function3[
    /* subject */ QuadSubject, 
    /* predicate */ QuadPredicate, 
    /* object */ QuadObject, 
    Quad
  ] = js.native
  @JSImport("@rdfjs/dataset", "quad")
  @js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): Quad = js.native
  @scala.inline
  def quad_=(
    x: js.Function3[
      /* subject */ QuadSubject, 
      /* predicate */ QuadPredicate, 
      /* object */ QuadObject, 
      Quad
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quad")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/dataset", "variable")
  @js.native
  def variable: js.Function1[/* value */ String, Variable] = js.native
  @JSImport("@rdfjs/dataset", "variable")
  @js.native
  def variable(value: String): Variable = js.native
  @scala.inline
  def variable_=(x: js.Function1[/* value */ String, Variable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("variable")(x.asInstanceOf[js.Any])
}
