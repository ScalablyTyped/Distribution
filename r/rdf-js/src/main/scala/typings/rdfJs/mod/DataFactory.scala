package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends js.Object {
  /**
    * This method is optional.
    * @param value The variable name
    * @return A new instance of Variable.
    * @see Variable
    */
  var variable: js.UndefOr[js.Function1[/* value */ String, Variable]] = js.native
  /**
    * @param value The optional blank node identifier.
    * @return A new instance of BlankNode.
    *                         If the `value` parameter is undefined a new identifier
    *                         for the blank node is generated for each call.
    * @see BlankNode
    */
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  /**
    * @return An instance of DefaultGraph.
    */
  def defaultGraph(): DefaultGraph = js.native
  /**
    * @param                 value              The literal value.
    * @param languageOrDatatype The optional language or datatype.
    *                                                    If `languageOrDatatype` is a NamedNode,
    *                                                    then it is used for the value of `NamedNode.datatype`.
    *                                                    Otherwise `languageOrDatatype` is used for the value
    *                                                    of `NamedNode.language`.
    * @return A new instance of Literal.
    * @see Literal
    */
  def literal(value: String): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = js.native
  /**
    * @param value The IRI for the named node.
    * @return A new instance of NamedNode.
    * @see NamedNode
    */
  // TODO: This could be changed into a Generic method that returns a NamedNode constained to the
  //       given `value` - but note that that would be a breaking change. See commit
  //       16d29e86cd6fe34e6ac6f53bba6ba1a1988d7401.
  def namedNode(value: String): NamedNode[String] = js.native
  /**
    * @param subject   The quad subject term.
    * @param predicate The quad predicate term.
    * @param object    The quad object term.
    * @param graph     The quad graph term.
    * @return A new instance of Quad.
    * @see Quad
    */
  def quad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['object'] */ js.Any
  ): OutQuad = js.native
  def quad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: InQuad['graph'] */ js.Any
  ): OutQuad = js.native
}

