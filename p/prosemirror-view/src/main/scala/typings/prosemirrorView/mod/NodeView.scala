package typings.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.anon.Target
import typings.std.Document
import typings.std.Event
import typings.std.MutationRecord
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeView[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * The DOM node that should hold the node's content. Only meaningful
    * if the node view also defines a `dom` property and if its node
    * type is not a leaf node type. When this is present, ProseMirror
    * will take care of rendering the node's children into it. When it
    * is not present, the node view itself is responsible for rendering
    * (or deciding not to render) its child nodes.
    */
  var contentDOM: js.UndefOr[Node | Null] = js.undefined
  /**
    * When defining a `selectNode` method, you should also provide a
    * `deselectNode` method to remove the effect again.
    */
  var deselectNode: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  /**
    * Called when the node view is removed from the editor or the whole
    * editor is destroyed.
    */
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  /**
    * The outer DOM node that represents the document node. When not
    * given, the default strategy is used to create a DOM node.
    */
  var dom: js.UndefOr[Node | Null] = js.undefined
  /**
    * Called when a DOM
    * [mutation](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver)
    * or a selection change happens within the view. When the change is
    * a selection change, the record will have a `type` property of
    * `"selection"` (which doesn't occur for native mutation records).
    * Return false if the editor should re-read the selection or
    * re-parse the range around the mutation, true if it can safely be
    * ignored.
    */
  var ignoreMutation: js.UndefOr[(js.Function1[/* p */ MutationRecord | Target, Boolean]) | Null] = js.undefined
  /**
    * Can be used to override the way the node's selected status (as a
    * node selection) is displayed.
    */
  var selectNode: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  /**
    * This will be called to handle setting the selection inside the
    * node. The `anchor` and `head` positions are relative to the start
    * of the node. By default, a DOM selection will be created between
    * the DOM positions corresponding to those positions, but if you
    * override it you can do something else.
    */
  var setSelection: js.UndefOr[
    (js.Function3[/* anchor */ Double, /* head */ Double, /* root */ Document, Unit]) | Null
  ] = js.undefined
  /**
    * Can be used to prevent the editor view from trying to handle some
    * or all DOM events that bubble up from the node view. Events for
    * which this returns true are not handled by the editor.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event, Boolean]) | Null] = js.undefined
  /**
    * When given, this will be called when the view is updating itself.
    * It will be given a node (possibly of a different type), and an
    * array of active decorations (which are automatically drawn, and
    * the node view may ignore if it isn't interested in them), and
    * should return true if it was able to update to that node, and
    * false otherwise. If the node view has a `contentDOM` property (or
    * no `dom` property), updating its child nodes will be handled by
    * ProseMirror.
    */
  var update: js.UndefOr[
    (js.Function2[
      /* node */ typings.prosemirrorModel.mod.Node[S], 
      /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
      Boolean
    ]) | Null
  ] = js.undefined
}

object NodeView {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    contentDOM: js.UndefOr[Null | Node] = js.undefined,
    deselectNode: js.UndefOr[Null | (() => Unit)] = js.undefined,
    destroy: js.UndefOr[Null | (() => Unit)] = js.undefined,
    dom: js.UndefOr[Null | Node] = js.undefined,
    ignoreMutation: js.UndefOr[Null | (/* p */ MutationRecord | Target => Boolean)] = js.undefined,
    selectNode: js.UndefOr[Null | (() => Unit)] = js.undefined,
    setSelection: js.UndefOr[Null | ((/* anchor */ Double, /* head */ Double, /* root */ Document) => Unit)] = js.undefined,
    stopEvent: js.UndefOr[Null | (/* event */ Event => Boolean)] = js.undefined,
    update: js.UndefOr[
      Null | ((/* node */ typings.prosemirrorModel.mod.Node[S], /* decorations */ js.Array[Decoration[StringDictionary[_]]]) => Boolean)
    ] = js.undefined
  ): NodeView[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentDOM)) __obj.updateDynamic("contentDOM")(contentDOM.asInstanceOf[js.Any])
    if (!js.isUndefined(deselectNode)) __obj.updateDynamic("deselectNode")(if (deselectNode != null) js.Any.fromFunction0(deselectNode.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(if (destroy != null) js.Any.fromFunction0(destroy.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(dom)) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMutation)) __obj.updateDynamic("ignoreMutation")(if (ignoreMutation != null) js.Any.fromFunction1(ignoreMutation.asInstanceOf[/* p */ MutationRecord | Target => Boolean]) else null)
    if (!js.isUndefined(selectNode)) __obj.updateDynamic("selectNode")(if (selectNode != null) js.Any.fromFunction0(selectNode.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(setSelection)) __obj.updateDynamic("setSelection")(if (setSelection != null) js.Any.fromFunction3(setSelection.asInstanceOf[(/* anchor */ Double, /* head */ Double, /* root */ Document) => Unit]) else null)
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(if (stopEvent != null) js.Any.fromFunction1(stopEvent.asInstanceOf[/* event */ Event => Boolean]) else null)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(if (update != null) js.Any.fromFunction2(update.asInstanceOf[(/* node */ typings.prosemirrorModel.mod.Node[S], /* decorations */ js.Array[Decoration[StringDictionary[_]]]) => Boolean]) else null)
    __obj.asInstanceOf[NodeView[S]]
  }
}

