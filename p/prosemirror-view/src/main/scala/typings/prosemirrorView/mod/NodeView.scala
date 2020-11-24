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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeView[S /* <: Schema[_, _] */] extends js.Object {
  
  /**
    * The DOM node that should hold the node's content. Only meaningful
    * if the node view also defines a `dom` property and if its node
    * type is not a leaf node type. When this is present, ProseMirror
    * will take care of rendering the node's children into it. When it
    * is not present, the node view itself is responsible for rendering
    * (or deciding not to render) its child nodes.
    */
  var contentDOM: js.UndefOr[Node | Null] = js.native
  
  /**
    * When defining a `selectNode` method, you should also provide a
    * `deselectNode` method to remove the effect again.
    */
  var deselectNode: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  /**
    * Called when the node view is removed from the editor or the whole
    * editor is destroyed.
    */
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  /**
    * The outer DOM node that represents the document node. When not
    * given, the default strategy is used to create a DOM node.
    */
  var dom: js.UndefOr[Node | Null] = js.native
  
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
  var ignoreMutation: js.UndefOr[(js.Function1[/* p */ MutationRecord | Target, Boolean]) | Null] = js.native
  
  /**
    * Can be used to override the way the node's selected status (as a
    * node selection) is displayed.
    */
  var selectNode: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  /**
    * This will be called to handle setting the selection inside the
    * node. The `anchor` and `head` positions are relative to the start
    * of the node. By default, a DOM selection will be created between
    * the DOM positions corresponding to those positions, but if you
    * override it you can do something else.
    */
  var setSelection: js.UndefOr[
    (js.Function3[/* anchor */ Double, /* head */ Double, /* root */ Document, Unit]) | Null
  ] = js.native
  
  /**
    * Can be used to prevent the editor view from trying to handle some
    * or all DOM events that bubble up from the node view. Events for
    * which this returns true are not handled by the editor.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event, Boolean]) | Null] = js.native
  
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
  ] = js.native
}
object NodeView {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](): NodeView[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeView[S]]
  }
  
  @scala.inline
  implicit class NodeViewOps[Self <: NodeView[_], S /* <: Schema[_, _] */] (val x: Self with NodeView[S]) extends AnyVal {
    
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
    def setContentDOM(value: Node): Self = this.set("contentDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDOM: Self = this.set("contentDOM", js.undefined)
    
    @scala.inline
    def setContentDOMNull: Self = this.set("contentDOM", null)
    
    @scala.inline
    def setDeselectNode(value: () => Unit): Self = this.set("deselectNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDeselectNode: Self = this.set("deselectNode", js.undefined)
    
    @scala.inline
    def setDeselectNodeNull: Self = this.set("deselectNode", null)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDestroyNull: Self = this.set("destroy", null)
    
    @scala.inline
    def setDom(value: Node): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setDomNull: Self = this.set("dom", null)
    
    @scala.inline
    def setIgnoreMutation(value: /* p */ MutationRecord | Target => Boolean): Self = this.set("ignoreMutation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIgnoreMutation: Self = this.set("ignoreMutation", js.undefined)
    
    @scala.inline
    def setIgnoreMutationNull: Self = this.set("ignoreMutation", null)
    
    @scala.inline
    def setSelectNode(value: () => Unit): Self = this.set("selectNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSelectNode: Self = this.set("selectNode", js.undefined)
    
    @scala.inline
    def setSelectNodeNull: Self = this.set("selectNode", null)
    
    @scala.inline
    def setSetSelection(value: (/* anchor */ Double, /* head */ Double, /* root */ Document) => Unit): Self = this.set("setSelection", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetSelection: Self = this.set("setSelection", js.undefined)
    
    @scala.inline
    def setSetSelectionNull: Self = this.set("setSelection", null)
    
    @scala.inline
    def setStopEvent(value: /* event */ Event => Boolean): Self = this.set("stopEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStopEvent: Self = this.set("stopEvent", js.undefined)
    
    @scala.inline
    def setStopEventNull: Self = this.set("stopEvent", null)
    
    @scala.inline
    def setUpdate(
      value: (/* node */ typings.prosemirrorModel.mod.Node[S], /* decorations */ js.Array[Decoration[StringDictionary[_]]]) => Boolean
    ): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
}
