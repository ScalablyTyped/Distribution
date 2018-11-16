package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditorProps[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  /**
     * Control the DOM attributes of the editable element. May be either
     * an object or a function going from an editor state to an object.
     * By default, the element will get a class `"ProseMirror"`, and
     * will have its `contentEditable` attribute determined by the
     * [`editable` prop](#view.EditorProps.editable). Additional classes
     * provided here will be added to the class. For other attributes,
     * the value provided first (as in
     * [`someProp`](#view.EditorView.someProp)) will be used.
     */
  var attributes: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[java.lang.String] | (js.Function1[
      /* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      js.UndefOr[
        ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null | scala.Unit
      ]
    ]) | scala.Null
  ] = js.undefined
  /**
     * The [parser](#model.DOMParser) to use when reading content from
     * the clipboard. When not given, the value of the
     * [`domParser`](#view.EditorProps.domParser) prop is used.
     */
  var clipboardParser: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.DOMParser[S] | scala.Null] = js.undefined
  /**
     * The DOM serializer to use when putting content onto the
     * clipboard. If not given, the result of
     * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)
     * will be used.
     */
  var clipboardSerializer: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.DOMSerializer[S] | scala.Null] = js.undefined
  /**
     * A function to parse text from the clipboard into a document
     * slice. Called after
     * [`transformPastedText`](#view.EditorProps.transformPastedText).
     * The default behavior is to split the text into lines, wrap them
     * in `<p>` tags, and call
     * [`clipboardParser`](#view.EditorProps.clipboardParser) on it.
     */
  var clipboardTextParser: js.UndefOr[
    (js.Function2[
      /* text */ java.lang.String, 
      /* $context */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], 
      prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
    ]) | scala.Null
  ] = js.undefined
  /**
     * A function that will be called to get the text for the current
     * selection when copying text to the clipboard. By default, the
     * editor will use [`textBetween`](#model.Node.textBetween) on the
     * selected range.
     */
  var clipboardTextSerializer: js.UndefOr[
    (js.Function1[/* p */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], java.lang.String]) | scala.Null
  ] = js.undefined
  /**
     * Can be used to override the way a selection is created when
     * reading a DOM selection between the given anchor and head.
     */
  var createSelectionBetween: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* anchor */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], 
      /* head */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], 
      js.UndefOr[prosemirrorDashStateLib.prosemirrorDashStateMod.Selection[S] | scala.Null]
    ]) | scala.Null
  ] = js.undefined
  /**
     * A set of [document decorations](#view.Decoration) to show in the
     * view.
     */
  var decorations: js.UndefOr[
    (js.Function1[
      /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      js.UndefOr[DecorationSet[S] | scala.Null]
    ]) | scala.Null
  ] = js.undefined
  /**
     * The [parser](#model.DOMParser) to use when reading editor changes
     * from the DOM. Defaults to calling
     * [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) on the
     * editor's schema.
     */
  var domParser: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.DOMParser[S] | scala.Null] = js.undefined
  /**
     * When this returns false, the content of the view is not directly
     * editable.
     */
  var editable: js.UndefOr[
    (js.Function1[
      /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called when the editor is clicked, after `handleClickOn` handlers
     * have been called.
     */
  var handleClick: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called for each node around a click, from the inside out. The
     * `direct` flag will be true for the inner node.
     */
  var handleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* nodePos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      /* direct */ scala.Boolean, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Can be an object mapping DOM event type names to functions that
     * handle them. Such functions will be called before any handling
     * ProseMirror does of events fired on the editable DOM element.
     * Contrary to the other event handling props, when returning true
     * from such a function, you are responsible for calling
     * `preventDefault` yourself (or not, if you want to allow the
     * default behavior).
     */
  var handleDOMEvents: js.UndefOr[
    (ScalablyTyped.runtime.StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ stdLib.Event, scala.Boolean]]) | scala.Null
  ] = js.undefined
  /**
     * Called when the editor is double-clicked, after `handleDoubleClickOn`.
     */
  var handleDoubleClick: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called for each node around a double click.
     */
  var handleDoubleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* nodePos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      /* direct */ scala.Boolean, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called when something is dropped on the editor. `moved` will be
     * true if this drop moves from the current selection (which should
     * thus be deleted).
     */
  var handleDrop: js.UndefOr[
    (js.Function4[
      /* view */ EditorView[S], 
      /* event */ stdLib.Event, 
      /* slice */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], 
      /* moved */ scala.Boolean, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called when the editor receives a `keydown` event.
     */
  var handleKeyDown: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* event */ stdLib.KeyboardEvent, scala.Boolean]) | scala.Null
  ] = js.undefined
  /**
     * Handler for `keypress` events.
     */
  var handleKeyPress: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* event */ stdLib.KeyboardEvent, scala.Boolean]) | scala.Null
  ] = js.undefined
  /**
     * Can be used to override the behavior of pasting. `slice` is the
     * pasted content parsed by the editor, but you can directly access
     * the event to get at the raw content.
     */
  var handlePaste: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* event */ stdLib.Event, 
      /* slice */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called when the view, after updating its state, tries to scroll
     * the selection into view. A handler function may return false to
     * indicate that it did not handle the scrolling and further
     * handlers or the default behavior should be tried.
     */
  var handleScrollToSelection: js.UndefOr[(js.Function1[/* view */ EditorView[S], scala.Boolean]) | scala.Null] = js.undefined
  /**
     * Whenever the user directly input text, this handler is called
     * before the input is applied. If it returns `true`, the default
     * behavior of actually inserting the text is suppressed.
     */
  var handleTextInput: js.UndefOr[
    (js.Function4[
      /* view */ EditorView[S], 
      /* from */ scala.Double, 
      /* to */ scala.Double, 
      /* text */ java.lang.String, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called when the editor is triple-clicked, after `handleTripleClickOn`.
     */
  var handleTripleClick: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Called for each node around a triple click.
     */
  var handleTripleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* nodePos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      /* direct */ scala.Boolean, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /**
     * Allows you to pass custom rendering and behavior logic for nodes
     * and marks. Should map node and mark names to constructor
     * functions that produce a [`NodeView`](#view.NodeView) object
     * implementing the node's display behavior. `getPos` is a function
     * that can be called to get the node's current position, which can
     * be useful when creating transactions to update it.
     *
     * `decorations` is an array of node or inline decorations that are
     * active around the node. They are automatically drawn in the
     * normal way, and you will usually just want to ignore this, but
     * they can also be used as a way to provide context information to
     * the node view without adding it to the document itself.
     */
  var nodeViews: js.UndefOr[
    (ScalablyTyped.runtime.StringDictionary[
      js.Function4[
        /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
        /* view */ EditorView[S], 
        /* getPos */ js.Function0[scala.Double], 
        /* decorations */ js.Array[Decoration], 
        NodeView[S]
      ]
    ]) | scala.Null
  ] = js.undefined
  /**
     * Determines the extra space (in pixels) that is left above or
     * below the cursor when it is scrolled into view. Defaults to 5.
     */
  var scrollMargin: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
     * Determines the distance (in pixels) between the cursor and the
     * end of the visible viewport at which point, when scrolling the
     * cursor into view, scrolling takes place. Defaults to 0.
     */
  var scrollThreshold: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
     * Can be used to transform pasted content before it is applied to
     * the document.
     */
  var transformPasted: js.UndefOr[
    (js.Function1[
      /* p */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], 
      prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
    ]) | scala.Null
  ] = js.undefined
  /**
     * Can be used to transform pasted HTML text, _before_ it is parsed,
     * for example to clean it up.
     */
  var transformPastedHTML: js.UndefOr[(js.Function1[/* html */ java.lang.String, java.lang.String]) | scala.Null] = js.undefined
  /**
     * Transform pasted plain text.
     */
  var transformPastedText: js.UndefOr[(js.Function1[/* text */ java.lang.String, java.lang.String]) | scala.Null] = js.undefined
}

