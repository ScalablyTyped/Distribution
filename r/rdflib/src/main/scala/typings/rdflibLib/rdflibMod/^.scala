package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var NextId: scala.Double = js.native
  def Namespace(nsuri: java.lang.String): js.Function1[/* ln */ java.lang.String, rdflibLib.rdflibMod.NamedNode] = js.native
  def blankNode(value: java.lang.String): rdflibLib.rdflibMod.BlankNode = js.native
  def defaultGraph(): rdflibLib.rdflibMod.DefaultGraph = js.native
  def fetcher(store: rdflibLib.rdflibMod.Formula, options: js.Any): rdflibLib.rdflibMod.Fetcher = js.native
  def fromNT(str: java.lang.String): rdflibLib.rdflibMod.Node = js.native
  def graph(): rdflibLib.rdflibMod.IndexedFormula = js.native
  def lit(`val`: java.lang.String, lang: java.lang.String, dt: rdflibLib.rdflibMod.NamedNode): rdflibLib.rdflibMod.Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: java.lang.String): rdflibLib.rdflibMod.Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: rdflibLib.rdflibMod.NamedNode): rdflibLib.rdflibMod.Literal = js.native
  def namedNode(value: java.lang.String): rdflibLib.rdflibMod.NamedNode = js.native
  def parse(
    str: java.lang.String,
    kb: rdflibLib.rdflibMod.Formula,
    base: java.lang.String,
    contentType: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* kb */ rdflibLib.rdflibMod.Formula, scala.Unit]
  ): scala.Unit = js.native
  def quad(
    subject: rdflibLib.rdflibMod.Node,
    predicate: rdflibLib.rdflibMod.Node,
    `object`: rdflibLib.rdflibMod.Node,
    graph: rdflibLib.rdflibMod.Node
  ): rdflibLib.rdflibMod.Statement = js.native
  def st(
    subject: rdflibLib.rdflibMod.Node,
    predicate: rdflibLib.rdflibMod.Node,
    `object`: rdflibLib.rdflibMod.Node,
    graph: rdflibLib.rdflibMod.Node
  ): rdflibLib.rdflibMod.Statement = js.native
  def sym(value: java.lang.String): rdflibLib.rdflibMod.NamedNode = js.native
  def term(value: rdflibLib.rdflibMod.ValueType): rdflibLib.rdflibMod.Node | rdflibLib.rdflibMod.Collection | rdflibLib.rdflibMod.ValueType = js.native
  def triple(
    subject: rdflibLib.rdflibMod.Node,
    predicate: rdflibLib.rdflibMod.Node,
    `object`: rdflibLib.rdflibMod.Node
  ): rdflibLib.rdflibMod.Statement = js.native
  def variable(name: java.lang.String): rdflibLib.rdflibMod.Variable = js.native
}

