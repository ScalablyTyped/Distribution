package typings.rdflib.tfTypesMod

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Term
  extends QuadObject
     with _Comparable
     with _FromValueReturns[js.Any]
     with _TFIDFactoryTypes
     with _ValueType {
  var termType: String = js.native
  var value: String = js.native
  /**
    * Compare this term with {other} for structural equality
    *
    * Note that the task force spec only allows comparison with other terms
    */
  def equals(other: Term): Boolean = js.native
}

object Term {
  @scala.inline
  def apply(equals: Term => Boolean, termType: String, value: String): Term = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  implicit class TermOps[Self <: Term] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEquals(value: Term => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setTermType(value: String): Self = this.set("termType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

