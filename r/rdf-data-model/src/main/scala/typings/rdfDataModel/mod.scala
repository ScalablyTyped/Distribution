package typings.rdfDataModel

import typings.rdfjsTypes.dataModelMod.BlankNode
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-data-model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blankNode(): BlankNode = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[BlankNode]
  inline def blankNode(value: String): BlankNode = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[BlankNode]
  
  inline def defaultGraph(): DefaultGraph = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[DefaultGraph]
  
  @JSImport("rdf-data-model", "defaultGraphInstance")
  @js.native
  val defaultGraphInstance: DefaultGraph = js.native
  
  inline def literal(value: String): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
  inline def literal(value: String, languageOrDatatype: String): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  inline def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  
  inline def namedNode(value: String): NamedNode[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[NamedNode[String]]
  
  inline def quad(subject: Term, predicate: Term, `object`: Term): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Quad]
  inline def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[Quad]
  
  inline def triple(subject: Term, predicate: Term, `object`: Term): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Quad]
  
  inline def variable(value: String): Variable = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[Variable]
}
