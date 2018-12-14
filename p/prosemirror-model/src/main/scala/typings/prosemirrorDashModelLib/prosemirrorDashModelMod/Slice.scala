package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "Slice")
@js.native
class Slice[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
     * Create a slice. When specifying a non-zero open depth, you must
     * make sure that there are nodes of at least that depth at the
     * appropriate side of the fragment—i.e. if the fragment is an empty
     * paragraph node, `openStart` and `openEnd` can't be greater than
     * 1.
     *
     * It is not necessary for the content of open nodes to conform to
     * the schema's content constraints, though it should be a valid
     * start/end/middle for such a node, depending on which sides are
     * open.
     */
  def this(content: Fragment[S], openStart: scala.Double, openEnd: scala.Double) = this()
  /**
     * The slice's content.
     */
  var content: Fragment[S] = js.native
  /**
     * The open depth at the end.
     */
  var openEnd: scala.Double = js.native
  /**
     * The open depth at the start.
     */
  var openStart: scala.Double = js.native
  /**
     * The size this slice would add when inserted into a document.
     */
  var size: scala.Double = js.native
  /**
     * Tests whether this slice is equal to another slice.
     */
  def eq(other: Slice[S]): scala.Boolean = js.native
  /**
     * Convert a slice to a JSON-serializable representation.
     */
  def toJSON(): js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.native
}

@JSImport("prosemirror-model", "Slice")
@js.native
object Slice extends js.Object {
  /**
     * The empty slice.
     */
  var empty: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[_] = js.native
  /**
     * Deserialize a slice from its JSON representation.
     */
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S): prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = js.native
  /**
     * Deserialize a slice from its JSON representation.
     */
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S, json: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = js.native
  /**
     * Create a slice from a fragment by taking the maximum possible
     * open value on both side of the fragment.
     */
  def maxOpen[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](fragment: prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S]): prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = js.native
  /**
     * Create a slice from a fragment by taking the maximum possible
     * open value on both side of the fragment.
     */
  def maxOpen[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    fragment: prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S],
    openIsolating: scala.Boolean
  ): prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = js.native
}

