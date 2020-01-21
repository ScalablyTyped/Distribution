package typings.rdfExt.dataFactoryMod

import typings.rdfExt.variableMod.VariableExt
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.QuadObject
import typings.rdfJs.mod.QuadPredicate
import typings.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFactoryExt extends DataFactory {
  // tslint:disable:no-unnecessary-generics
  def quad[Q /* <: BaseQuad */](subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): Q = js.native
  def quad[Q /* <: BaseQuad */](subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): Q = js.native
  def triple[Q /* <: BaseQuad */](subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): Q = js.native
  // tslint:enable:no-unnecessary-generics
  @JSName("variable")
  def variable_MDataFactoryExt(value: String): VariableExt = js.native
}

