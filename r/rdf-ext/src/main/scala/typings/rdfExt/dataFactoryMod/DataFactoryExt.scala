package typings.rdfExt.dataFactoryMod

import typings.rdfExt.quadMod.QuadExt
import typings.rdfExt.variableMod.VariableExt
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.QuadObject
import typings.rdfJs.mod.QuadPredicate
import typings.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFactoryExt extends DataFactory[QuadExt] {
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  @JSName("variable")
  def variable_MDataFactoryExt(value: String): VariableExt = js.native
}

