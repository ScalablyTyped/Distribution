package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "ContentMatch")
@js.native
class ContentMatch[S /* <: Schema[_, _] */] () extends js.Object {
  /**
     * Get the first matching node type at this match position that can
     * be generated.
     */
  var defaultType: js.UndefOr[NodeType[_]] = js.native
  /**
     * The number of outgoing edges this node has in the finite automaton
     * that describes the content expression.
     */
  var edgeCount: scala.Double = js.native
  /**
     * True when this match state represents a valid end of the node.
     */
  var validEnd: scala.Boolean = js.native
  /**
     * Get the _n_th outgoing edge from this node in the finite automaton
     * that describes the content expression.
     */
  def edge(n: scala.Double): prosemirrorDashModelLib.Anon_Next = js.native
  /**
     * Try to match the given fragment, and if that fails, see if it can
     * be made to match by inserting nodes in front of it. When
     * successful, return a fragment of inserted nodes (which may be
     * empty if nothing had to be inserted). When `toEnd` is true, only
     * return a fragment if the resulting match goes to the end of the
     * content expression.
     */
  def fillBefore(after: Fragment[S]): js.UndefOr[Fragment[S] | scala.Null] = js.native
  /**
     * Try to match the given fragment, and if that fails, see if it can
     * be made to match by inserting nodes in front of it. When
     * successful, return a fragment of inserted nodes (which may be
     * empty if nothing had to be inserted). When `toEnd` is true, only
     * return a fragment if the resulting match goes to the end of the
     * content expression.
     */
  def fillBefore(after: Fragment[S], toEnd: scala.Boolean): js.UndefOr[Fragment[S] | scala.Null] = js.native
  /**
     * Try to match the given fragment, and if that fails, see if it can
     * be made to match by inserting nodes in front of it. When
     * successful, return a fragment of inserted nodes (which may be
     * empty if nothing had to be inserted). When `toEnd` is true, only
     * return a fragment if the resulting match goes to the end of the
     * content expression.
     */
  def fillBefore(after: Fragment[S], toEnd: scala.Boolean, startIndex: scala.Double): js.UndefOr[Fragment[S] | scala.Null] = js.native
  /**
     * Find a set of wrapping node types that would allow a node of the
     * given type to appear at this position. The result may be empty
     * (when it fits directly) and will be null when no such wrapping
     * exists.
     */
  def findWrapping(target: NodeType[S]): js.UndefOr[js.Array[NodeType[S]] | scala.Null] = js.native
  /**
     * Try to match a fragment. Returns the resulting match when
     * successful.
     */
  def matchFragment(frag: Fragment[S]): js.UndefOr[ContentMatch[S] | scala.Null] = js.native
  /**
     * Try to match a fragment. Returns the resulting match when
     * successful.
     */
  def matchFragment(frag: Fragment[S], start: scala.Double): js.UndefOr[ContentMatch[S] | scala.Null] = js.native
  /**
     * Try to match a fragment. Returns the resulting match when
     * successful.
     */
  def matchFragment(frag: Fragment[S], start: scala.Double, end: scala.Double): js.UndefOr[ContentMatch[S] | scala.Null] = js.native
  /**
     * Match a node type and marks, returning a match after that node
     * if successful.
     */
  def matchType(`type`: NodeType[S]): js.UndefOr[ContentMatch[S] | scala.Null] = js.native
}

