package typings.rdfJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.DefaultGraph
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Variable
  */
  type QuadGraph = typings.rdfJs.mod._QuadGraph | typings.rdfJs.mod.NamedNode[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.Literal
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Variable
  */
  type QuadObject = typings.rdfJs.mod._QuadObject | typings.rdfJs.mod.NamedNode[java.lang.String]
  type QuadPredicate = typings.rdfJs.mod.NamedNode[java.lang.String] | typings.rdfJs.mod.Variable
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Variable
  */
  type QuadSubject = typings.rdfJs.mod._QuadSubject | typings.rdfJs.mod.NamedNode[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typings.rdfJs.mod.NamedNode[java.lang.String]
    - typings.rdfJs.mod.BlankNode
    - typings.rdfJs.mod.Literal
    - typings.rdfJs.mod.Variable
    - typings.rdfJs.mod.DefaultGraph
  */
  type Term = typings.rdfJs.mod._Term | typings.rdfJs.mod.NamedNode[java.lang.String]
}
