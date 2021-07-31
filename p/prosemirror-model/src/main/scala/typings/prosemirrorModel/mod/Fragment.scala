package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-model", "Fragment")
@js.native
class Fragment[S /* <: Schema[js.Any, js.Any] */] () extends StObject {
  
  /**
    * Create a new fragment containing the combined content of this
    * fragment and the other.
    */
  def append(other: Fragment[S]): Fragment[S] = js.native
  
  /**
    * Get the child node at the given index. Raise an error when the
    * index is out of range.
    */
  def child(index: Double): ProsemirrorNode[S] = js.native
  
  /**
    * The number of child nodes in this fragment.
    */
  var childCount: Double = js.native
  
  /**
    * Cut out the sub-fragment between the two given positions.
    */
  def cut(from: Double): Fragment[S] = js.native
  def cut(from: Double, to: Double): Fragment[S] = js.native
  
  /**
    * Call the given callback for every descendant node. The callback
    * may return `false` to prevent traversal of a given node's children.
    */
  def descendants(
    f: js.Function3[
      /* node */ ProsemirrorNode[S], 
      /* pos */ Double, 
      /* parent */ ProsemirrorNode[S], 
      js.UndefOr[Boolean | Null | Unit]
    ]
  ): Unit = js.native
  
  /**
    * Compare this fragment to another one.
    */
  def eq(other: Fragment[S]): Boolean = js.native
  
  /**
    * Find the first position, searching from the end, at which this
    * fragment and the given fragment differ, or `null` if they are the
    * same. Since this position will not be the same in both nodes, an
    * object with two separate positions is returned.
    */
  def findDiffEnd(other: ProsemirrorNode[S]): js.UndefOr[A | Null] = js.native
  
  /**
    * Find the first position at which this fragment and another
    * fragment differ, or `null` if they are the same.
    */
  def findDiffStart(other: Fragment[S]): js.UndefOr[Double | Null] = js.native
  
  /**
    * The first child of the fragment, or `null` if it is empty.
    */
  var firstChild: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * Call `f` for every child node, passing the node, its offset
    * into this parent node, and its index.
    */
  def forEach(f: js.Function3[/* node */ ProsemirrorNode[S], /* offset */ Double, /* index */ Double, Unit]): Unit = js.native
  
  /**
    * The last child of the fragment, or `null` if it is empty.
    */
  var lastChild: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * Get the child node at the given index, if it exists.
    */
  def maybeChild(index: Double): js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * Invoke a callback for all descendant nodes between the given two
    * positions (relative to start of this fragment). Doesn't descend
    * into a node when the callback returns `false`.
    */
  def nodesBetween(
    from: Double,
    to: Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* start */ Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ Double, 
      js.UndefOr[Boolean | Null | Unit]
    ]
  ): Unit = js.native
  def nodesBetween(
    from: Double,
    to: Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* start */ Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ Double, 
      js.UndefOr[Boolean | Null | Unit]
    ],
    startPos: Double
  ): Unit = js.native
  
  /**
    * Create a new fragment in which the node at the given index is
    * replaced by the given node.
    */
  def replaceChild(index: Double, node: ProsemirrorNode[S]): Fragment[S] = js.native
  
  /**
    * The size of the fragment, which is the total of the size of its
    * content nodes.
    */
  var size: Double = js.native
  
  /**
    * Create a JSON-serializeable representation of this fragment.
    */
  def toJSON(): js.UndefOr[StringDictionary[js.Any] | Null] = js.native
}
/* static members */
object Fragment {
  
  @JSImport("prosemirror-model", "Fragment")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An empty fragment. Intended to be reused whenever a node doesn't
    * contain anything (rather than allocating a new empty fragment for
    * each leaf node).
    */
  @JSImport("prosemirror-model", "Fragment.empty")
  @js.native
  def empty: Fragment[js.Any] = js.native
  @scala.inline
  def empty_=(x: Fragment[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  
  /**
    * Create a fragment from something that can be interpreted as a set
    * of nodes. For `null`, it returns the empty fragment. For a
    * fragment, the fragment itself. For a node or array of nodes, a
    * fragment containing those nodes.
    */
  @scala.inline
  def from[S /* <: Schema[js.Any, js.Any] */](): Fragment[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Fragment[S]]
  @scala.inline
  def from[S /* <: Schema[js.Any, js.Any] */](nodes: js.Array[ProsemirrorNode[S]]): Fragment[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(nodes.asInstanceOf[js.Any]).asInstanceOf[Fragment[S]]
  @scala.inline
  def from[S /* <: Schema[js.Any, js.Any] */](nodes: Fragment[S]): Fragment[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(nodes.asInstanceOf[js.Any]).asInstanceOf[Fragment[S]]
  @scala.inline
  def from[S /* <: Schema[js.Any, js.Any] */](nodes: ProsemirrorNode[S]): Fragment[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(nodes.asInstanceOf[js.Any]).asInstanceOf[Fragment[S]]
  
  /**
    * Build a fragment from an array of nodes. Ensures that adjacent
    * text nodes with the same marks are joined together.
    */
  @scala.inline
  def fromArray[S /* <: Schema[js.Any, js.Any] */](array: js.Array[ProsemirrorNode[S]]): Fragment[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Fragment[S]]
  
  /**
    * Deserialize a fragment from its JSON representation.
    */
  @scala.inline
  def fromJSON[S /* <: Schema[js.Any, js.Any] */](schema: S): Fragment[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any]).asInstanceOf[Fragment[S]]
  @scala.inline
  def fromJSON[S /* <: Schema[js.Any, js.Any] */](schema: S, value: StringDictionary[js.Any]): Fragment[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Fragment[S]]
}
