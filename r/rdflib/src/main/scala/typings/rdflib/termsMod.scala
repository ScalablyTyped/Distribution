package typings.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/utils/terms", JSImport.Namespace)
@js.native
object termsMod extends js.Object {
  def isBlankNode(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.BlankNode */ Boolean = js.native
  def isCollection(obj: js.Any): /* is rdflib.rdflib/lib/collection.default<any> */ Boolean = js.native
  def isGraph(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Quad_Graph */ Boolean = js.native
  def isLiteral(value: js.Any): /* is rdflib.rdflib/lib/tf-types.Literal */ Boolean = js.native
  def isNamedNode(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.NamedNode */ Boolean = js.native
  def isPredicate(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Quad_Predicate */ Boolean = js.native
  def isQuad(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Quad<any, any, any, any> */ Boolean = js.native
  def isRDFObject(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Quad_Object */ Boolean = js.native
  def isRDFlibObject(obj: js.Any): /* is rdflib.rdflib/lib/types.ObjectType */ Boolean = js.native
  def isStatement(obj: js.Any): /* is rdflib.rdflib/lib/statement.default<rdflib.rdflib/lib/types.SubjectType, rdflib.rdflib/lib/types.PredicateType, rdflib.rdflib/lib/types.ObjectType, rdflib.rdflib/lib/types.GraphType> */ Boolean = js.native
  def isStore(obj: js.Any): /* is rdflib.rdflib/lib/store.default */ Boolean = js.native
  def isSubject(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Quad_Subject */ Boolean = js.native
  def isTerm(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Term */ Boolean = js.native
  def isVariable(obj: js.Any): /* is rdflib.rdflib/lib/tf-types.Variable */ Boolean = js.native
}

