package typings.rdflib.formulaMod

import typings.rdflib.tfTypesMod.Quad
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.tfTypesMod.RdfJsDataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormulaOpts extends js.Object {
  var dataCallback: js.UndefOr[
    js.Function1[/* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], Unit]
  ] = js.native
  var rdfArrayRemove: js.UndefOr[
    js.Function2[
      /* arr */ js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]], 
      /* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], 
      Unit
    ]
  ] = js.native
  var rdfFactory: js.UndefOr[RdfJsDataFactory] = js.native
}

object FormulaOpts {
  @scala.inline
  def apply(): FormulaOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormulaOpts]
  }
  @scala.inline
  implicit class FormulaOptsOps[Self <: FormulaOpts] (val x: Self) extends AnyVal {
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
    def setDataCallback(value: /* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph] => Unit): Self = this.set("dataCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataCallback: Self = this.set("dataCallback", js.undefined)
    @scala.inline
    def setRdfArrayRemove(
      value: (/* arr */ js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]], /* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]) => Unit
    ): Self = this.set("rdfArrayRemove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRdfArrayRemove: Self = this.set("rdfArrayRemove", js.undefined)
    @scala.inline
    def setRdfFactory(value: RdfJsDataFactory): Self = this.set("rdfFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRdfFactory: Self = this.set("rdfFactory", js.undefined)
  }
  
}

