package typings.prosemirrorModel.mod

import typings.prosemirrorModel.prosemirrorModelStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A set of additional nodes to count as
    * [context](#model.ParseRule.context) when parsing, above the
    * given [top node](#model.ParseOptions.topNode).
    */
  var context: js.UndefOr[ResolvedPos[S] | Null] = js.native
  /**
    * When given, the parser will, beside parsing the content,
    * record the document positions of the given DOM positions. It
    * will do so by writing to the objects, adding a `pos` property
    * that holds the document position. DOM positions that are not
    * in the parsed content will not be written to.
    */
  var findPositions: js.UndefOr[js.Array[typings.prosemirrorModel.anon.Node] | Null] = js.native
  /**
    * The child node index to start parsing from.
    */
  var from: js.UndefOr[Double | Null] = js.native
  /**
    * By default, whitespace is collapsed as per HTML's rules. Pass
    * `true` to preserve whitespace, but normalize newlines to
    * spaces, and `"full"` to preserve whitespace entirely.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.native
  /**
    * The child node index to stop parsing at.
    */
  var to: js.UndefOr[Double | Null] = js.native
  /**
    * Provide the starting content match that content parsed into the
    * top node is matched against.
    */
  var topMatch: js.UndefOr[ContentMatch[_] | Null] = js.native
  /**
    * By default, the content is parsed into the schema's default
    * [top node type](#model.Schema.topNodeType). You can pass this
    * option to use the type and attributes from a different node
    * as the top container.
    */
  var topNode: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
}

object ParseOptions {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](): ParseOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions[S]]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions[_], /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S] (val x: Self with ParseOptions[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: ResolvedPos[S]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    @scala.inline
    def setFindPositionsVarargs(value: typings.prosemirrorModel.anon.Node*): Self = this.set("findPositions", js.Array(value :_*))
    @scala.inline
    def setFindPositions(value: js.Array[typings.prosemirrorModel.anon.Node]): Self = this.set("findPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindPositions: Self = this.set("findPositions", js.undefined)
    @scala.inline
    def setFindPositionsNull: Self = this.set("findPositions", null)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    @scala.inline
    def setPreserveWhitespace(value: Boolean | full): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    @scala.inline
    def setPreserveWhitespaceNull: Self = this.set("preserveWhitespace", null)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setToNull: Self = this.set("to", null)
    @scala.inline
    def setTopMatch(value: ContentMatch[_]): Self = this.set("topMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMatch: Self = this.set("topMatch", js.undefined)
    @scala.inline
    def setTopMatchNull: Self = this.set("topMatch", null)
    @scala.inline
    def setTopNode(value: ProsemirrorNode[S]): Self = this.set("topNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopNode: Self = this.set("topNode", js.undefined)
    @scala.inline
    def setTopNodeNull: Self = this.set("topNode", null)
  }
  
}

