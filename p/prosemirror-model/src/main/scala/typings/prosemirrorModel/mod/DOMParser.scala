package typings.prosemirrorModel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-model", "DOMParser")
@js.native
class DOMParser[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Create a parser that targets the given schema, using the given
    * parsing rules.
    */
  def this(schema: S, rules: js.Array[ParseRule]) = this()
  
  /**
    * Parse a document from the content of a DOM node.
    */
  def parse(dom: typings.std.Node): ProsemirrorNode[S] = js.native
  def parse(dom: typings.std.Node, options: ParseOptions[S]): ProsemirrorNode[S] = js.native
  
  /**
    * Parses the content of the given DOM node, like
    * [`parse`](#model.DOMParser.parse), and takes the same set of
    * options. But unlike that method, which produces a whole node,
    * this one returns a slice that is open at the sides, meaning that
    * the schema constraints aren't applied to the start of nodes to
    * the left of the input and the end of nodes at the end.
    */
  def parseSlice(dom: typings.std.Node): Slice[S] = js.native
  def parseSlice(dom: typings.std.Node, options: ParseOptions[S]): Slice[S] = js.native
  
  /**
    * The set of [parse rules](#model.ParseRule) that the parser
    * uses, in order of precedence.
    */
  var rules: js.Array[ParseRule] = js.native
  
  /**
    * The schema into which the parser parses.
    */
  var schema: S = js.native
}
/* static members */
@JSImport("prosemirror-model", "DOMParser")
@js.native
object DOMParser extends js.Object {
  
  /**
    * Construct a DOM parser using the parsing rules listed in a
    * schema's [node specs](#model.NodeSpec.parseDOM), reordered by
    * [priority](#model.ParseRule.priority).
    */
  def fromSchema[S /* <: Schema[_, _] */](schema: S): DOMParser[S] = js.native
}
