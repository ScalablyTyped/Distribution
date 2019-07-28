package typings.rdflib.rdflibMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var NextId: Double = js.native
  def Namespace(nsuri: String): js.Function1[/* ln */ String, NamedNode] = js.native
  def blankNode(value: String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def fetcher(store: Formula, options: js.Any): Fetcher = js.native
  def fromNT(str: String): Node = js.native
  def graph(): IndexedFormula = js.native
  def lit(`val`: String, lang: String, dt: NamedNode): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: NamedNode): Literal = js.native
  def namedNode(value: String): NamedNode = js.native
  def parse(
    str: String,
    kb: Formula,
    base: String,
    contentType: String,
    callback: js.Function2[/* error */ js.Any, /* kb */ Formula, Unit]
  ): Unit = js.native
  def quad(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: String, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def st(subject: String, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: String, predicate: Node, `object`: Date, graph: Node): Statement = js.native
  def st(subject: Node, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def st(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: Node, predicate: Node, `object`: Date, graph: Node): Statement = js.native
  def st(subject: Date, predicate: Node, `object`: String, graph: Node): Statement = js.native
  def st(subject: Date, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: Date, predicate: Node, `object`: Date, graph: Node): Statement = js.native
  def sym(value: String): NamedNode = js.native
  def term(value: ValueType): Node | Collection | ValueType = js.native
  def triple(subject: Node, predicate: Node, `object`: Node): Statement = js.native
  def variable(name: String): Variable = js.native
}

