package typings
package rdfDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdfDashJsMod {
  type Quad_Graph = DefaultGraph | NamedNode | BlankNode | Variable
  type Quad_Object = NamedNode | Literal | BlankNode | Variable
  type Quad_Predicate = NamedNode | Variable
  type Quad_Subject = NamedNode | BlankNode | Variable
  type Term = NamedNode | BlankNode | Literal | Variable | DefaultGraph
  type Triple = Quad
}
