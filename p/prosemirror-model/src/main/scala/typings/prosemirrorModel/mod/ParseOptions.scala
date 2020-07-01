package typings.prosemirrorModel.mod

import typings.prosemirrorModel.prosemirrorModelStrings.full
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
  var findPositions: js.UndefOr[js.Array[typings.prosemirrorModel.anon.Node] | Null] = js.undefined
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
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    context: js.UndefOr[Null | ResolvedPos[S]] = js.undefined,
    findPositions: js.UndefOr[Null | js.Array[typings.prosemirrorModel.anon.Node]] = js.undefined,
    from: js.UndefOr[Null | Double] = js.undefined,
    preserveWhitespace: js.UndefOr[Null | Boolean | full] = js.undefined,
    to: js.UndefOr[Null | Double] = js.undefined,
    topMatch: js.UndefOr[Null | ContentMatch[_]] = js.undefined,
    topNode: js.UndefOr[Null | ProsemirrorNode[S]] = js.undefined
  ): ParseOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(findPositions)) __obj.updateDynamic("findPositions")(findPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(topMatch)) __obj.updateDynamic("topMatch")(topMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(topNode)) __obj.updateDynamic("topNode")(topNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions[S]]
  }
}

