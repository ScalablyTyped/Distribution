package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "NodeRange")
@js.native
class NodeRange[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Construct a node range. `$from` and `$to` should point into the
    * same node until at least the given `depth`, since a node range
    * denotes an adjacent set of nodes in a single parent node.
    */
  def this($from: ResolvedPos[S], $to: ResolvedPos[S], depth: scala.Double) = this()
  /**
    * A resolved position along the start of the
    * content. May have a `depth` greater than this object's `depth`
    * property, since these are the positions that were used to
    * compute the range, not re-resolved positions directly at its
    * boundaries.
    */
  @JSName("$from")
  var $from: ResolvedPos[S] = js.native
  /**
    * A position along the end of the content. See
    * caveat for [`$from`](#model.NodeRange.$from).
    */
  @JSName("$to")
  var $to: ResolvedPos[S] = js.native
  /**
    * The depth of the node that this range points into.
    */
  var depth: scala.Double = js.native
  /**
    * The position at the end of the range.
    */
  var end: scala.Double = js.native
  /**
    * The end index of the range in the parent node.
    */
  var endIndex: scala.Double = js.native
  /**
    * The parent node that the range points into.
    */
  var parent: ProsemirrorNode[S] = js.native
  /**
    * The position at the start of the range.
    */
  var start: scala.Double = js.native
  /**
    * The start index of the range in the parent node.
    */
  var startIndex: scala.Double = js.native
}

