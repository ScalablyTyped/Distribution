package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typings.rdflib.factoryTypesMod._Comparable because Already inherited
- typings.rdflib.tfTypesMod.QuadObject because Already inherited */ @js.native
trait BlankNode
  extends Term
     with QuadGraph
     with QuadSubject {
  @JSName("termType")
  var termType_BlankNode: typings.rdflib.rdflibStrings.BlankNode = js.native
}

object BlankNode {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.BlankNode, value: String): BlankNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankNode]
  }
  @scala.inline
  implicit class BlankNodeOps[Self <: BlankNode] (val x: Self) extends AnyVal {
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
    def setTermType(value: typings.rdflib.rdflibStrings.BlankNode): Self = this.set("termType", value.asInstanceOf[js.Any])
  }
  
}

