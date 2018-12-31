package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A set of additional nodes to count as
    * [context](#model.ParseRule.context) when parsing, above the
    * given [top node](#model.ParseOptions.topNode).
    */
  var context: js.UndefOr[ResolvedPos[S] | scala.Null] = js.undefined
  /**
    * When given, the parser will, beside parsing the content,
    * record the document positions of the given DOM positions. It
    * will do so by writing to the objects, adding a `pos` property
    * that holds the document position. DOM positions that are not
    * in the parsed content will not be written to.
    */
  var findPositions: js.UndefOr[js.Array[prosemirrorDashModelLib.Anon_Node] | scala.Null] = js.undefined
  /**
    * The child node index to start parsing from.
    */
  var from: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * By default, whitespace is collapsed as per HTML's rules. Pass
    * `true` to preserve whitespace, but normalize newlines to
    * spaces, and `"full"` to preserve whitespace entirely.
    */
  var preserveWhitespace: js.UndefOr[
    scala.Boolean | prosemirrorDashModelLib.prosemirrorDashModelLibStrings.full | scala.Null
  ] = js.undefined
  /**
    * The child node index to stop parsing at.
    */
  var to: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Provide the starting content match that content parsed into the
    * top node is matched against.
    */
  var topMatch: js.UndefOr[ContentMatch[_] | scala.Null] = js.undefined
  /**
    * By default, the content is parsed into the schema's default
    * [top node type](#model.Schema.topNodeType). You can pass this
    * option to use the type and attributes from a different node
    * as the top container.
    */
  var topNode: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.undefined
}

