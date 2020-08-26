package typings.rdflib.tfTypesMod

import typings.rdflib.rdflibStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultGraph
  extends Term
     with QuadGraph {
  @JSName("termType")
  var termType_DefaultGraph: typings.rdflib.rdflibStrings.DefaultGraph = js.native
  /** should return and empty string'' */
  @JSName("value")
  var value_DefaultGraph: _empty = js.native
}

object DefaultGraph {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.DefaultGraph, value: _empty): DefaultGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultGraph]
  }
  @scala.inline
  implicit class DefaultGraphOps[Self <: DefaultGraph] (val x: Self) extends AnyVal {
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
    def setTermType(value: typings.rdflib.rdflibStrings.DefaultGraph): Self = this.set("termType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: _empty): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

