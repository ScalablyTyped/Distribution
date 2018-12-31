package typings
package prosemirrorDashMarkdownLib.prosemirrorDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-markdown", "MarkdownSerializerState")
@js.native
class MarkdownSerializerState[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] () extends js.Object {
  /**
    * The options passed to the serializer.
    */
  var options: prosemirrorDashMarkdownLib.Anon_TightLists = js.native
  /**
    * Close the block for the given node.
    */
  def closeBlock(node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): scala.Unit = js.native
  /**
    * Ensure the current content ends with a newline.
    */
  def ensureNewLine(): scala.Unit = js.native
  /**
    * Escape the given string so that it can safely appear in Markdown
    * content. If `startOfLine` is true, also escape characters that
    * has special meaning only at the start of the line.
    */
  def esc(str: java.lang.String): java.lang.String = js.native
  def esc(str: java.lang.String, startOfLine: scala.Boolean): java.lang.String = js.native
  /**
    * Get leading and trailing whitespace from a string. Values of
    * leading or trailing property of the return object will be undefined
    * if there is no match.
    */
  def getEnclosingWhitespace(text: java.lang.String): prosemirrorDashMarkdownLib.Anon_Trailing = js.native
  /**
    * Render the given node as a block.
    */
  def render(node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): scala.Unit = js.native
  /**
    * Render the contents of `parent` as block nodes.
    */
  def renderContent(parent: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): scala.Unit = js.native
  /**
    * Render the contents of `parent` as inline content.
    */
  def renderInline(parent: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): scala.Unit = js.native
  /**
    * Render a node's content as a list. `delim` should be the extra
    * indentation added to all lines except the first in an item,
    * `firstDelim` is a function going from an item index to a
    * delimiter for the first line of the item.
    */
  def renderList(
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    delim: java.lang.String,
    firstDelim: js.Function1[/* p */ scala.Double, java.lang.String]
  ): scala.Unit = js.native
  /**
    * Repeat the given string `n` times.
    */
  def repeat(str: java.lang.String, n: scala.Double): java.lang.String = js.native
  /**
    * Add the given text to the document. When escape is not `false`,
    * it will be escaped.
    */
  def text(text: java.lang.String): scala.Unit = js.native
  def text(text: java.lang.String, escape: scala.Boolean): scala.Unit = js.native
  /**
    * Render a block, prefixing each line with `delim`, and the first
    * line in `firstDelim`. `node` should be the node that is closed at
    * the end of the block, and `f` is a function that renders the
    * content of the block.
    */
  def wrapBlock(
    delim: java.lang.String,
    firstDelim: java.lang.String,
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    f: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def wrapBlock(
    delim: java.lang.String,
    firstDelim: js.UndefOr[scala.Nothing],
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    f: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Prepare the state for writing output (closing closed paragraphs,
    * adding delimiters, and so on), and then optionally add content
    * (unescaped) to the output.
    */
  def write(): scala.Unit = js.native
  def write(content: java.lang.String): scala.Unit = js.native
}

