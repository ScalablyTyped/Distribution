package typings.rdflib.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "st")
@js.native
object st extends js.Object {
  def apply(subject: String, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def apply(subject: String, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def apply(subject: String, predicate: Node, `object`: Date, graph: Node): Statement = js.native
  def apply(subject: Node, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def apply(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def apply(subject: Node, predicate: Node, `object`: Date, graph: Node): Statement = js.native
  def apply(subject: Date, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def apply(subject: Date, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def apply(subject: Date, predicate: Node, `object`: Date, graph: Node): Statement = js.native
}

