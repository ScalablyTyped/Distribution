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

trait FormulaOpts extends js.Object {
  var dataCallback: js.UndefOr[
    js.Function1[/* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], Unit]
  ] = js.undefined
  var rdfArrayRemove: js.UndefOr[
    js.Function2[
      /* arr */ js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]], 
      /* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], 
      Unit
    ]
  ] = js.undefined
  var rdfFactory: js.UndefOr[RdfJsDataFactory] = js.undefined
}

object FormulaOpts {
  @scala.inline
  def apply(
    dataCallback: /* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph] => Unit = null,
    rdfArrayRemove: (/* arr */ js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]], /* q */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]) => Unit = null,
    rdfFactory: RdfJsDataFactory = null
  ): FormulaOpts = {
    val __obj = js.Dynamic.literal()
    if (dataCallback != null) __obj.updateDynamic("dataCallback")(js.Any.fromFunction1(dataCallback))
    if (rdfArrayRemove != null) __obj.updateDynamic("rdfArrayRemove")(js.Any.fromFunction2(rdfArrayRemove))
    if (rdfFactory != null) __obj.updateDynamic("rdfFactory")(rdfFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaOpts]
  }
}

