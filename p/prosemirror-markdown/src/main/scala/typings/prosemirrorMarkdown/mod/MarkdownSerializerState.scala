package typings.prosemirrorMarkdown.mod

import typings.prosemirrorMarkdown.AnonLeading
import typings.prosemirrorMarkdown.AnonTightLists
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-markdown", "MarkdownSerializerState")
@js.native
class MarkdownSerializerState[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The options passed to the serializer.
    */
  var options: AnonTightLists = js.native
  /**
    * Close the block for the given node.
    */
  def closeBlock(node: Node[S]): Unit = js.native
  /**
    * Ensure the current content ends with a newline.
    */
  def ensureNewLine(): Unit = js.native
  /**
    * Escape the given string so that it can safely appear in Markdown
    * content. If `startOfLine` is true, also escape characters that
    * has special meaning only at the start of the line.
    */
  def esc(str: String): String = js.native
  def esc(str: String, startOfLine: Boolean): String = js.native
  /**
    * Get leading and trailing whitespace from a string. Values of
    * leading or trailing property of the return object will be undefined
    * if there is no match.
    */
  def getEnclosingWhitespace(text: String): AnonLeading = js.native
  /**
    * Wraps the passed string in a string of its own
    */
  def quote(str: String): String = js.native
  /**
    * Render the given node as a block.
    */
  def render(node: Node[S]): Unit = js.native
  /**
    * Render the contents of `parent` as block nodes.
    */
  def renderContent(parent: Node[S]): Unit = js.native
  /**
    * Render the contents of `parent` as inline content.
    */
  def renderInline(parent: Node[S]): Unit = js.native
  /**
    * Render a node's content as a list. `delim` should be the extra
    * indentation added to all lines except the first in an item,
    * `firstDelim` is a function going from an item index to a
    * delimiter for the first line of the item.
    */
  def renderList(node: Node[S], delim: String, firstDelim: js.Function1[/* p */ Double, String]): Unit = js.native
  /**
    * Repeat the given string `n` times.
    */
  def repeat(str: String, n: Double): String = js.native
  /**
    * Add the given text to the document. When escape is not `false`,
    * it will be escaped.
    */
  def text(text: String): Unit = js.native
  def text(text: String, escape: Boolean): Unit = js.native
  def wrapBlock(delim: String, firstDelim: js.UndefOr[scala.Nothing], node: Node[S], f: js.Function0[Unit]): Unit = js.native
  /**
    * Render a block, prefixing each line with `delim`, and the first
    * line in `firstDelim`. `node` should be the node that is closed at
    * the end of the block, and `f` is a function that renders the
    * content of the block.
    */
  def wrapBlock(delim: String, firstDelim: String, node: Node[S], f: js.Function0[Unit]): Unit = js.native
  /**
    * Prepare the state for writing output (closing closed paragraphs,
    * adding delimiters, and so on), and then optionally add content
    * (unescaped) to the output.
    */
  def write(): Unit = js.native
  def write(content: String): Unit = js.native
}

