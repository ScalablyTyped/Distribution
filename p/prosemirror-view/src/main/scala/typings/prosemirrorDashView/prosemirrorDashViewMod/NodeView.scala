package typings.prosemirrorDashView.prosemirrorDashViewMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
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
    * happens within the view. Return false if the editor should
    * re-parse the range around the mutation, true if it can safely be
    * ignored.
    */
  var ignoreMutation: js.UndefOr[(js.Function1[/* p */ MutationRecord, Boolean]) | Null] = js.undefined
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
      /* node */ typings.prosemirrorDashModel.prosemirrorDashModelMod.Node[S], 
      /* decorations */ js.Array[Decoration], 
      Boolean
    ]) | Null
  ] = js.undefined
}

object NodeView {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    contentDOM: Node = null,
    deselectNode: () => Unit = null,
    destroy: () => Unit = null,
    dom: Node = null,
    ignoreMutation: /* p */ MutationRecord => Boolean = null,
    selectNode: () => Unit = null,
    setSelection: (/* anchor */ Double, /* head */ Double, /* root */ Document) => Unit = null,
    stopEvent: /* event */ Event => Boolean = null,
    update: (/* node */ typings.prosemirrorDashModel.prosemirrorDashModelMod.Node[S], /* decorations */ js.Array[Decoration]) => Boolean = null
  ): NodeView[S] = {
    val __obj = js.Dynamic.literal()
    if (contentDOM != null) __obj.updateDynamic("contentDOM")(contentDOM)
    if (deselectNode != null) __obj.updateDynamic("deselectNode")(js.Any.fromFunction0(deselectNode))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (ignoreMutation != null) __obj.updateDynamic("ignoreMutation")(js.Any.fromFunction1(ignoreMutation))
    if (selectNode != null) __obj.updateDynamic("selectNode")(js.Any.fromFunction0(selectNode))
    if (setSelection != null) __obj.updateDynamic("setSelection")(js.Any.fromFunction3(setSelection))
    if (stopEvent != null) __obj.updateDynamic("stopEvent")(js.Any.fromFunction1(stopEvent))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[NodeView[S]]
  }
}

