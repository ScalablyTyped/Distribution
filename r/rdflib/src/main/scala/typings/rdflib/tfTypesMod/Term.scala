package typings.rdflib.tfTypesMod

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term
  extends QuadObject
     with _Comparable
     with _FromValueReturns[js.Any]
     with _TFIDFactoryTypes
     with _ValueType {
  var termType: String
  var value: String
  /**
    * Compare this term with {other} for structural equality
    *
    * Note that the task force spec only allows comparison with other terms
    */
  def equals(other: Term): Boolean
}

object Term {
  @scala.inline
  def apply(equals: Term => Boolean, termType: String, value: String): Term = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
}

