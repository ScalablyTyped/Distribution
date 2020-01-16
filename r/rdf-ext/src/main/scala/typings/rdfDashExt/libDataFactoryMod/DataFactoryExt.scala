package typings.rdfDashExt.libDataFactoryMod

import typings.rdfDashExt.libVariableMod.VariableExt
import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.DataFactory
import typings.rdfDashJs.rdfDashJsMod.Quad_Graph
import typings.rdfDashJs.rdfDashJsMod.Quad_Object
import typings.rdfDashJs.rdfDashJsMod.Quad_Predicate
import typings.rdfDashJs.rdfDashJsMod.Quad_Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFactoryExt extends DataFactory {
  // tslint:disable:no-unnecessary-generics
  def quad[Q /* <: BaseQuad */](subject: Quad_Subject, predicate: Quad_Predicate, `object`: Quad_Object): Q = js.native
  def quad[Q /* <: BaseQuad */](subject: Quad_Subject, predicate: Quad_Predicate, `object`: Quad_Object, graph: Quad_Graph): Q = js.native
  def triple[Q /* <: BaseQuad */](subject: Quad_Subject, predicate: Quad_Predicate, `object`: Quad_Object): Q = js.native
  // tslint:enable:no-unnecessary-generics
  @JSName("variable")
  def variable_MDataFactoryExt(value: String): VariableExt = js.native
}

