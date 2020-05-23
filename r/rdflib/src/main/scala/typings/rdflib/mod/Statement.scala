package typings.rdflib.mod

import typings.rdflib.statementMod.default
import typings.rdflib.tfTypesMod.DefaultGraph
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Statement")
@js.native
class Statement[S /* <: SubjectType */, P /* <: PredicateType */, O /* <: ObjectType */, G /* <: GraphType */] protected () extends default[S, P, O, G] {
  /**
    * Construct a new statement
    *
    * @param subject - The subject of the triple.  What the fact is about
    * @param predicate - The relationship which is asserted between the subject and object
    * @param object - The thing or data value which is asserted to be related to the subject
    * @param {NamedNode} graph - The document where the triple is or was or will be stored on the web.
    *
    * The graph param is a named node of the document in which the triple when it is stored
    *  on the web. It exists because when you have read data from various places in the web,
    *  the “graph” tells you _why_ you have the triple. (At the moment, it is just the
    *  document, in future it could be an inference step)
    *
    * When you do UpdateManager.update() then the graph’s of all the statements must be the same,
    *  and give the document you are patching. In future, we may have a more
    *  powerful update() which can update more than one document.
    */
  def this(subject: S, predicate: P, `object`: O) = this()
  def this(subject: S, predicate: P, `object`: O, graph: G) = this()
  def this(subject: S, predicate: P, `object`: O, graph: DefaultGraph) = this()
}

