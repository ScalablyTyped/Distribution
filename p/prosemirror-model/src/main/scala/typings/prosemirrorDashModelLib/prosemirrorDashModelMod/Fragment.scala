package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "Fragment")
@js.native
class Fragment[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The number of child nodes in this fragment.
    */
  var childCount: scala.Double = js.native
  /**
    * The first child of the fragment, or `null` if it is empty.
    */
  var firstChild: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * The last child of the fragment, or `null` if it is empty.
    */
  var lastChild: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * The size of the fragment, which is the total of the size of its
    * content nodes.
    */
  var size: scala.Double = js.native
  /**
    * Create a new fragment containing the combined content of this
    * fragment and the other.
    */
  def append(other: Fragment[S]): Fragment[S] = js.native
  /**
    * Get the child node at the given index. Raise an error when the
    * index is out of range.
    */
  def child(index: scala.Double): ProsemirrorNode[S] = js.native
  /**
    * Cut out the sub-fragment between the two given positions.
    */
  def cut(from: scala.Double): Fragment[S] = js.native
  def cut(from: scala.Double, to: scala.Double): Fragment[S] = js.native
  /**
    * Call the given callback for every descendant node. The callback
    * may return `false` to prevent traversal of a given node's children.
    */
  def descendants(
    f: js.Function3[
      /* node */ ProsemirrorNode[S], 
      /* pos */ scala.Double, 
      /* parent */ ProsemirrorNode[S], 
      js.UndefOr[scala.Boolean | scala.Null | scala.Unit]
    ]
  ): scala.Unit = js.native
  /**
    * Compare this fragment to another one.
    */
  def eq(other: Fragment[S]): scala.Boolean = js.native
  /**
    * Find the first position, searching from the end, at which this
    * fragment and the given fragment differ, or `null` if they are the
    * same. Since this position will not be the same in both nodes, an
    * object with two separate positions is returned.
    */
  def findDiffEnd(other: ProsemirrorNode[S]): js.UndefOr[prosemirrorDashModelLib.Anon_A | scala.Null] = js.native
  /**
    * Find the first position at which this fragment and another
    * fragment differ, or `null` if they are the same.
    */
  def findDiffStart(other: Fragment[S]): js.UndefOr[scala.Double | scala.Null] = js.native
  /**
    * Call `f` for every child node, passing the node, its offset
    * into this parent node, and its index.
    */
  def forEach(
    f: js.Function3[
      /* node */ ProsemirrorNode[S], 
      /* offset */ scala.Double, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get the child node at the given index, if it exists.
    */
  def maybeChild(index: scala.Double): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * Invoke a callback for all descendant nodes between the given two
    * positions (relative to start of this fragment). Doesn't descend
    * into a node when the callback returns `false`.
    */
  def nodesBetween(
    from: scala.Double,
    to: scala.Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* start */ scala.Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ scala.Double, 
      js.UndefOr[scala.Boolean | scala.Null | scala.Unit]
    ]
  ): scala.Unit = js.native
  def nodesBetween(
    from: scala.Double,
    to: scala.Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* start */ scala.Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ scala.Double, 
      js.UndefOr[scala.Boolean | scala.Null | scala.Unit]
    ],
    startPos: scala.Double
  ): scala.Unit = js.native
  /**
    * Create a new fragment in which the node at the given index is
    * replaced by the given node.
    */
  def replaceChild(index: scala.Double, node: ProsemirrorNode[S]): Fragment[S] = js.native
  /**
    * Create a JSON-serializeable representation of this fragment.
    */
  def toJSON(): js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.native
}

/* static members */
@JSImport("prosemirror-model", "Fragment")
@js.native
object Fragment extends js.Object {
  /**
    * An empty fragment. Intended to be reused whenever a node doesn't
    * contain anything (rather than allocating a new empty fragment for
    * each leaf node).
    */
  var empty: prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[_] = js.native
  /**
    * Create a fragment from something that can be interpreted as a set
    * of nodes. For `null`, it returns the empty fragment. For a
    * fragment, the fragment itself. For a node or array of nodes, a
    * fragment containing those nodes.
    */
  def from[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
  def from[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](nodes: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.ProsemirrorNode[S]]): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
  def from[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](nodes: prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S]): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
  def from[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](nodes: prosemirrorDashModelLib.prosemirrorDashModelMod.ProsemirrorNode[S]): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
  /**
    * Build a fragment from an array of nodes. Ensures that adjacent
    * text nodes with the same marks are joined together.
    */
  def fromArray[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](array: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.ProsemirrorNode[S]]): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
  /**
    * Deserialize a fragment from its JSON representation.
    */
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S, value: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S] = js.native
}

