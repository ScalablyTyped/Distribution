package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var NextId: scala.Double = js.native
  def Namespace(nsuri: java.lang.String): js.Function1[/* ln */ java.lang.String, NamedNode] = js.native
  def blankNode(value: java.lang.String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def fetcher(store: Formula, options: js.Any): Fetcher = js.native
  def fromNT(str: java.lang.String): Node = js.native
  def graph(): IndexedFormula = js.native
  def lit(`val`: java.lang.String, lang: java.lang.String, dt: NamedNode): Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: java.lang.String): Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: NamedNode): Literal = js.native
  def namedNode(value: java.lang.String): NamedNode = js.native
  def parse(
    str: java.lang.String,
    kb: Formula,
    base: java.lang.String,
    contentType: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* kb */ Formula, scala.Unit]
  ): scala.Unit = js.native
  def quad(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: java.lang.String, predicate: Node, `object`: java.lang.String, graph: Node): Statement = js.native
  def st(subject: java.lang.String, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: java.lang.String, predicate: Node, `object`: stdLib.Date, graph: Node): Statement = js.native
  def st(subject: Node, predicate: Node, `object`: java.lang.String, graph: Node): Statement = js.native
  def st(subject: Node, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: Node, predicate: Node, `object`: stdLib.Date, graph: Node): Statement = js.native
  def st(subject: stdLib.Date, predicate: Node, `object`: java.lang.String, graph: Node): Statement = js.native
  def st(subject: stdLib.Date, predicate: Node, `object`: Node, graph: Node): Statement = js.native
  def st(subject: stdLib.Date, predicate: Node, `object`: stdLib.Date, graph: Node): Statement = js.native
  def sym(value: java.lang.String): NamedNode = js.native
  def term(value: ValueType): Node | Collection | ValueType = js.native
  def triple(subject: Node, predicate: Node, `object`: Node): Statement = js.native
  def variable(name: java.lang.String): Variable = js.native
}

