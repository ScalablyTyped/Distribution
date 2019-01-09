package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "EditorView")
@js.native
class EditorView[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  def this(place: js.Function1[/* p */ stdLib.Node, scala.Unit], props: DirectEditorProps[S]) = this()
  def this(place: js.UndefOr[scala.Nothing], props: DirectEditorProps[S]) = this()
  def this(place: prosemirrorDashViewLib.Anon_Mount, props: DirectEditorProps[S]) = this()
  /**
    * Create a view. `place` may be a DOM node that the editor should
    * be appended to, a function that will place it into the document,
    * or an object whose `mount` property holds the node to use as the
    * document container. If it is `null`, the editor will not be added
    * to the document.
    */
  def this(place: stdLib.Node, props: DirectEditorProps[S]) = this()
  /**
    * An editable DOM node containing the document. (You probably
    * should not directly interfere with its content.)
    */
  var dom: stdLib.Element = js.native
  /**
    * When editor content is being dragged, this object contains
    * information about the dragged slice and whether it is being
    * copied or moved. At any other time, it is null.
    */
  var dragging: js.UndefOr[prosemirrorDashViewLib.Anon_Move[S] | scala.Null] = js.native
  /**
    * The view's current [props](#view.EditorProps).
    */
  var props: DirectEditorProps[S] = js.native
  /**
    * Get the document root in which the editor exists. This will
    * usually be the top-level `document`, but might be a [shadow
    * DOM](https://developer.mozilla.org/en-US/docs/Web/Web_Components/Shadow_DOM)
    * root if the editor is inside one.
    */
  var root: stdLib.Document | stdLib.DocumentFragment = js.native
  /**
    * The view's current [state](#state.EditorState).
    */
  var state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any = js.native
  /**
    * Returns the viewport rectangle at a given document position. `left`
    * and `right` will be the same number, as this returns a flat
    * cursor-ish rectangle.
    */
  def coordsAtPos(pos: scala.Double): prosemirrorDashViewLib.Anon_Bottom = js.native
  /**
    * Removes the editor from the DOM and destroys all [node
    * views](#view.NodeView).
    */
  def destroy(): scala.Unit = js.native
  /**
    * Dispatch a transaction. Will call
    * [`dispatchTransaction`](#view.DirectEditorProps.dispatchTransaction)
    * when given, and otherwise defaults to applying the transaction to
    * the current state and calling
    * [`updateState`](#view.EditorView.updateState) with the result.
    * This method is bound to the view instance, so that it can be
    * easily passed around.
    */
  def dispatch(
    tr: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Transaction<S> */ js.Any
  ): scala.Unit = js.native
  /**
    * Find the DOM position that corresponds to the given document
    * position. Note that you should **not** mutate the editor's
    * internal DOM, only inspect it (and even that is usually not
    * necessary).
    */
  def domAtPos(pos: scala.Double): prosemirrorDashViewLib.Anon_Node = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_backward(dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.backward): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_backward(
    dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.backward,
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_down(dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.down): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_down(
    dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.down,
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_forward(dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.forward): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_forward(
    dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.forward,
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_left(dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.left): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_left(
    dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.left,
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_right(dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.right): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_right(
    dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.right,
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Boolean = js.native
  /**
    * Find out whether the selection is at the end of a textblock when
    * moving in a given direction. When, for example, given `"left"`,
    * it will return true if moving left from the current cursor
    * position would leave that position's parent textblock. Will apply
    * to the view's current state by default, but it is possible to
    * pass a different state.
    */
  @JSName("endOfTextblock")
  def endOfTextblock_up(dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.up): scala.Boolean = js.native
  @JSName("endOfTextblock")
  def endOfTextblock_up(
    dir: prosemirrorDashViewLib.prosemirrorDashViewLibStrings.up,
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Boolean = js.native
  /**
    * Focus the editor.
    */
  def focus(): scala.Unit = js.native
  /**
    * Query whether the view has focus.
    */
  def hasFocus(): scala.Boolean = js.native
  /**
    * Find the DOM node that represents the document node after the
    * given position. May return null when the position doesn't point
    * in front of a node or if the node is inside an opaque node view.
    *
    * This is intended to be able to call things like getBoundingClientRect
    * on that DOM node. Do not mutate the editor DOM directly, or add
    * styling this way, since that will be immediately overriden by the
    * editor as it redraws the node.
    */
  def nodeDOM(pos: scala.Double): js.UndefOr[stdLib.Node | scala.Null] = js.native
  /**
    * Given a pair of viewport coordinates, return the document
    * position that corresponds to them. May return null if the given
    * coordinates aren't inside of the visible editor. When an object
    * is returned, its `pos` property is the position nearest to the
    * coordinates, and its `inside` property holds the position of the
    * inner node that the position falls inside of, or -1 if it is at
    * the top level, not in any node.
    */
  def posAtCoords(coords: prosemirrorDashViewLib.Anon_Left): js.UndefOr[prosemirrorDashViewLib.Anon_Inside | scala.Null] = js.native
  /**
    * Find the document position that corresponds to a given DOM position.
    * (Whenever possible, it is preferable to inspect the document structure
    * directly, rather than poking around in the DOM, but sometimes—for
    * example when interpreting an event target—you don't have a choice.)
    *
    * The bias (default: -1) parameter can be used to influence which side of
    * a DOM node to use when the position is inside a leaf node.
    */
  def posAtDOM(node: stdLib.Node, offset: scala.Double): scala.Double = js.native
  def posAtDOM(node: stdLib.Node, offset: scala.Double, bias: scala.Double): scala.Double = js.native
  /**
    * Update the view by updating existing props object with the object
    * given as argument. Equivalent to `view.update(Object.assign({},
    * view.props, props))`.
    */
  def setProps(props: DirectEditorProps[S]): scala.Unit = js.native
  /**
    * Goes over the values of a prop, first those provided directly,
    * then those from plugins (in order), and calls `f` every time a
    * non-undefined value is found. When `f` returns a truthy value,
    * that is immediately returned. When `f` isn't provided, it is
    * treated as the identity function (the prop value is returned
    * directly).
    */
  def someProp(propName: java.lang.String): js.Any = js.native
  def someProp(propName: java.lang.String, f: js.Function1[/* prop */ js.Any, _]): js.Any = js.native
  /**
    * Update the view's props. Will immediately cause an update to
    * the DOM.
    */
  def update(props: DirectEditorProps[S]): scala.Unit = js.native
  /**
    * Update the editor's `state` prop, without touching any of the
    * other props.
    */
  def updateState(
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): scala.Unit = js.native
}

