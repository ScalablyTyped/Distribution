package typings.prosemirrorDashModel.prosemirrorDashModelMod

import typings.prosemirrorDashModel.Anon_Node
import typings.prosemirrorDashModel.prosemirrorDashModelStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A set of additional nodes to count as
    * [context](#model.ParseRule.context) when parsing, above the
    * given [top node](#model.ParseOptions.topNode).
    */
  var context: js.UndefOr[ResolvedPos[S] | Null] = js.undefined
  /**
    * When given, the parser will, beside parsing the content,
    * record the document positions of the given DOM positions. It
    * will do so by writing to the objects, adding a `pos` property
    * that holds the document position. DOM positions that are not
    * in the parsed content will not be written to.
    */
  var findPositions: js.UndefOr[js.Array[Anon_Node] | Null] = js.undefined
  /**
    * The child node index to start parsing from.
    */
  var from: js.UndefOr[Double | Null] = js.undefined
  /**
    * By default, whitespace is collapsed as per HTML's rules. Pass
    * `true` to preserve whitespace, but normalize newlines to
    * spaces, and `"full"` to preserve whitespace entirely.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.undefined
  /**
    * The child node index to stop parsing at.
    */
  var to: js.UndefOr[Double | Null] = js.undefined
  /**
    * Provide the starting content match that content parsed into the
    * top node is matched against.
    */
  var topMatch: js.UndefOr[ContentMatch[_] | Null] = js.undefined
  /**
    * By default, the content is parsed into the schema's default
    * [top node type](#model.Schema.topNodeType). You can pass this
    * option to use the type and attributes from a different node
    * as the top container.
    */
  var topNode: js.UndefOr[ProsemirrorNode[S] | Null] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    context: ResolvedPos[S] = null,
    findPositions: js.Array[Anon_Node] = null,
    from: Int | Double = null,
    preserveWhitespace: Boolean | full = null,
    to: Int | Double = null,
    topMatch: ContentMatch[_] = null,
    topNode: ProsemirrorNode[S] = null
  ): ParseOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (findPositions != null) __obj.updateDynamic("findPositions")(findPositions)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (preserveWhitespace != null) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (topMatch != null) __obj.updateDynamic("topMatch")(topMatch)
    if (topNode != null) __obj.updateDynamic("topNode")(topNode)
    __obj.asInstanceOf[ParseOptions[S]]
  }
}

