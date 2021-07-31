package typings.rdfDataModel

import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DefaultGraph
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.rdfJs.mod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-data-model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def blankNode(): BlankNode = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[BlankNode]
  @scala.inline
  def blankNode(value: String): BlankNode = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[BlankNode]
  
  @scala.inline
  def defaultGraph(): DefaultGraph = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[DefaultGraph]
  
  @JSImport("rdf-data-model", "defaultGraphInstance")
  @js.native
  val defaultGraphInstance: DefaultGraph = js.native
  
  @scala.inline
  def literal(value: String): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
  @scala.inline
  def literal(value: String, languageOrDatatype: String): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  @scala.inline
  def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  
  @scala.inline
  def namedNode(value: String): NamedNode[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[NamedNode[String]]
  
  @scala.inline
  def quad(subject: Term, predicate: Term, `object`: Term): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Quad]
  @scala.inline
  def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[Quad]
  
  @scala.inline
  def triple(subject: Term, predicate: Term, `object`: Term): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Quad]
  
  @scala.inline
  def variable(value: String): Variable = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[Variable]
}
