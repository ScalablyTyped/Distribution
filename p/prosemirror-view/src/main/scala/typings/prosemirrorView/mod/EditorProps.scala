package typings.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.AnonBottomLeft
import typings.std.Event_
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps[S /* <: Schema[_, _] */] extends js.Object {
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
    StringDictionary[String] | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
      js.UndefOr[StringDictionary[String] | Null | Unit]
    ]) | Null
  ] = js.undefined
  /**
    * The [parser](#model.DOMParser) to use when reading content from
    * the clipboard. When not given, the value of the
    * [`domParser`](#view.EditorProps.domParser) prop is used.
    */
  var clipboardParser: js.UndefOr[DOMParser[S] | Null] = js.undefined
  /**
    * The DOM serializer to use when putting content onto the
    * clipboard. If not given, the result of
    * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)
    * will be used.
    */
  var clipboardSerializer: js.UndefOr[DOMSerializer[S] | Null] = js.undefined
  /**
    * A function to parse text from the clipboard into a document
    * slice. Called after
    * [`transformPastedText`](#view.EditorProps.transformPastedText).
    * The default behavior is to split the text into lines, wrap them
    * in `<p>` tags, and call
    * [`clipboardParser`](#view.EditorProps.clipboardParser) on it.
    */
  var clipboardTextParser: js.UndefOr[
    (js.Function2[/* text */ String, /* $context */ ResolvedPos[S], Slice[S]]) | Null
  ] = js.undefined
  /**
    * A function that will be called to get the text for the current
    * selection when copying text to the clipboard. By default, the
    * editor will use [`textBetween`](#model.Node.textBetween) on the
    * selected range.
    */
  var clipboardTextSerializer: js.UndefOr[(js.Function1[/* p */ Slice[S], String]) | Null] = js.undefined
  /**
    * Can be used to override the way a selection is created when
    * reading a DOM selection between the given anchor and head.
    */
  var createSelectionBetween: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* anchor */ ResolvedPos[S], 
      /* head */ ResolvedPos[S], 
      js.UndefOr[Selection | Null]
    ]) | Null
  ] = js.undefined
  /**
    * A set of [document decorations](#view.Decoration) to show in the
    * view.
    */
  var decorations: js.UndefOr[
    (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      js.UndefOr[DecorationSet[S] | Null]
    ]) | Null
  ] = js.undefined
  /**
    * The [parser](#model.DOMParser) to use when reading editor changes
    * from the DOM. Defaults to calling
    * [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) on the
    * editor's schema.
    */
  var domParser: js.UndefOr[DOMParser[S] | Null] = js.undefined
  /**
    * When this returns false, the content of the view is not directly
    * editable.
    */
  var editable: js.UndefOr[
    (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when the editor is clicked, after `handleClickOn` handlers
    * have been called.
    */
  var handleClick: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Called for each node around a click, from the inside out. The
    * `direct` flag will be true for the inner node.
    */
  var handleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* node */ Node[S], 
      /* nodePos */ Double, 
      /* event */ MouseEvent, 
      /* direct */ Boolean, 
      Boolean
    ]) | Null
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
    (StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ Event_, Boolean]]) | Null
  ] = js.undefined
  /**
    * Called when the editor is double-clicked, after `handleDoubleClickOn`.
    */
  var handleDoubleClick: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Called for each node around a double click.
    */
  var handleDoubleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* node */ Node[S], 
      /* nodePos */ Double, 
      /* event */ MouseEvent, 
      /* direct */ Boolean, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when something is dropped on the editor. `moved` will be
    * true if this drop moves from the current selection (which should
    * thus be deleted).
    */
  var handleDrop: js.UndefOr[
    (js.Function4[
      /* view */ EditorView[S], 
      /* event */ Event_, 
      /* slice */ Slice[S], 
      /* moved */ Boolean, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when the editor receives a `keydown` event.
    */
  var handleKeyDown: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Handler for `keypress` events.
    */
  var handleKeyPress: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Can be used to override the behavior of pasting. `slice` is the
    * pasted content parsed by the editor, but you can directly access
    * the event to get at the raw content.
    */
  var handlePaste: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* event */ Event_, /* slice */ Slice[S], Boolean]) | Null
  ] = js.undefined
  /**
    * Called when the view, after updating its state, tries to scroll
    * the selection into view. A handler function may return false to
    * indicate that it did not handle the scrolling and further
    * handlers or the default behavior should be tried.
    */
  var handleScrollToSelection: js.UndefOr[(js.Function1[/* view */ EditorView[S], Boolean]) | Null] = js.undefined
  /**
    * Whenever the user directly input text, this handler is called
    * before the input is applied. If it returns `true`, the default
    * behavior of actually inserting the text is suppressed.
    */
  var handleTextInput: js.UndefOr[
    (js.Function4[/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String, Boolean]) | Null
  ] = js.undefined
  /**
    * Called when the editor is triple-clicked, after `handleTripleClickOn`.
    */
  var handleTripleClick: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Called for each node around a triple click.
    */
  var handleTripleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* node */ Node[S], 
      /* nodePos */ Double, 
      /* event */ MouseEvent, 
      /* direct */ Boolean, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Allows you to pass custom rendering and behavior logic for nodes
    * and marks. Should map node and mark names to constructor
    * functions that produce a [`NodeView`](#view.NodeView) object
    * implementing the node's display behavior. For nodes, the third
    * argument `getPos` is a function that can be called to get the
    * node's current position, which can be useful when creating
    * transactions to update it. For marks, the third argument is a
    * boolean that indicates whether the mark's content is inline.
    *
    * `decorations` is an array of node or inline decorations that are
    * active around the node. They are automatically drawn in the
    * normal way, and you will usually just want to ignore this, but
    * they can also be used as a way to provide context information to
    * the node view without adding it to the document itself.
    */
  var nodeViews: js.UndefOr[
    (StringDictionary[
      js.Function4[
        /* node */ Node[S], 
        /* view */ EditorView[S], 
        /* getPos */ js.Function0[Double] | Boolean, 
        /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
        NodeView[S]
      ]
    ]) | Null
  ] = js.undefined
  /**
    * Determines the extra space (in pixels) that is left above or
    * below the cursor when it is scrolled into view. Defaults to 5.
    */
  var scrollMargin: js.UndefOr[Double | AnonBottomLeft | Null] = js.undefined
  /**
    * Determines the distance (in pixels) between the cursor and the
    * end of the visible viewport at which point, when scrolling the
    * cursor into view, scrolling takes place. Defaults to 0.
    */
  var scrollThreshold: js.UndefOr[Double | AnonBottomLeft | Null] = js.undefined
  /**
    * Can be used to transform pasted content before it is applied to
    * the document.
    */
  var transformPasted: js.UndefOr[(js.Function1[/* p */ Slice[S], Slice[S]]) | Null] = js.undefined
  /**
    * Can be used to transform pasted HTML text, _before_ it is parsed,
    * for example to clean it up.
    */
  var transformPastedHTML: js.UndefOr[(js.Function1[/* html */ String, String]) | Null] = js.undefined
  /**
    * Transform pasted plain text.
    */
  var transformPastedText: js.UndefOr[(js.Function1[/* text */ String, String]) | Null] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    attributes: StringDictionary[String] | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
      js.UndefOr[StringDictionary[String] | Null | Unit]
    ]) = null,
    clipboardParser: DOMParser[S] = null,
    clipboardSerializer: DOMSerializer[S] = null,
    clipboardTextParser: (/* text */ String, /* $context */ ResolvedPos[S]) => Slice[S] = null,
    clipboardTextSerializer: /* p */ Slice[S] => String = null,
    createSelectionBetween: (/* view */ EditorView[S], /* anchor */ ResolvedPos[S], /* head */ ResolvedPos[S]) => js.UndefOr[Selection | Null] = null,
    decorations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => js.UndefOr[DecorationSet[S] | Null] = null,
    domParser: DOMParser[S] = null,
    editable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => Boolean = null,
    handleClick: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean = null,
    handleClickOn: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean = null,
    handleDOMEvents: StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ Event_, Boolean]] = null,
    handleDoubleClick: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean = null,
    handleDoubleClickOn: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean = null,
    handleDrop: (/* view */ EditorView[S], /* event */ Event_, /* slice */ Slice[S], /* moved */ Boolean) => Boolean = null,
    handleKeyDown: (/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean = null,
    handleKeyPress: (/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean = null,
    handlePaste: (/* view */ EditorView[S], /* event */ Event_, /* slice */ Slice[S]) => Boolean = null,
    handleScrollToSelection: /* view */ EditorView[S] => Boolean = null,
    handleTextInput: (/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String) => Boolean = null,
    handleTripleClick: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean = null,
    handleTripleClickOn: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean = null,
    nodeViews: StringDictionary[
      js.Function4[
        /* node */ Node[S], 
        /* view */ EditorView[S], 
        /* getPos */ js.Function0[Double] | Boolean, 
        /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
        NodeView[S]
      ]
    ] = null,
    scrollMargin: Double | AnonBottomLeft = null,
    scrollThreshold: Double | AnonBottomLeft = null,
    transformPasted: /* p */ Slice[S] => Slice[S] = null,
    transformPastedHTML: /* html */ String => String = null,
    transformPastedText: /* text */ String => String = null
  ): EditorProps[S] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clipboardParser != null) __obj.updateDynamic("clipboardParser")(clipboardParser.asInstanceOf[js.Any])
    if (clipboardSerializer != null) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer.asInstanceOf[js.Any])
    if (clipboardTextParser != null) __obj.updateDynamic("clipboardTextParser")(js.Any.fromFunction2(clipboardTextParser))
    if (clipboardTextSerializer != null) __obj.updateDynamic("clipboardTextSerializer")(js.Any.fromFunction1(clipboardTextSerializer))
    if (createSelectionBetween != null) __obj.updateDynamic("createSelectionBetween")(js.Any.fromFunction3(createSelectionBetween))
    if (decorations != null) __obj.updateDynamic("decorations")(js.Any.fromFunction1(decorations))
    if (domParser != null) __obj.updateDynamic("domParser")(domParser.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(js.Any.fromFunction1(editable))
    if (handleClick != null) __obj.updateDynamic("handleClick")(js.Any.fromFunction3(handleClick))
    if (handleClickOn != null) __obj.updateDynamic("handleClickOn")(js.Any.fromFunction6(handleClickOn))
    if (handleDOMEvents != null) __obj.updateDynamic("handleDOMEvents")(handleDOMEvents.asInstanceOf[js.Any])
    if (handleDoubleClick != null) __obj.updateDynamic("handleDoubleClick")(js.Any.fromFunction3(handleDoubleClick))
    if (handleDoubleClickOn != null) __obj.updateDynamic("handleDoubleClickOn")(js.Any.fromFunction6(handleDoubleClickOn))
    if (handleDrop != null) __obj.updateDynamic("handleDrop")(js.Any.fromFunction4(handleDrop))
    if (handleKeyDown != null) __obj.updateDynamic("handleKeyDown")(js.Any.fromFunction2(handleKeyDown))
    if (handleKeyPress != null) __obj.updateDynamic("handleKeyPress")(js.Any.fromFunction2(handleKeyPress))
    if (handlePaste != null) __obj.updateDynamic("handlePaste")(js.Any.fromFunction3(handlePaste))
    if (handleScrollToSelection != null) __obj.updateDynamic("handleScrollToSelection")(js.Any.fromFunction1(handleScrollToSelection))
    if (handleTextInput != null) __obj.updateDynamic("handleTextInput")(js.Any.fromFunction4(handleTextInput))
    if (handleTripleClick != null) __obj.updateDynamic("handleTripleClick")(js.Any.fromFunction3(handleTripleClick))
    if (handleTripleClickOn != null) __obj.updateDynamic("handleTripleClickOn")(js.Any.fromFunction6(handleTripleClickOn))
    if (nodeViews != null) __obj.updateDynamic("nodeViews")(nodeViews.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (transformPasted != null) __obj.updateDynamic("transformPasted")(js.Any.fromFunction1(transformPasted))
    if (transformPastedHTML != null) __obj.updateDynamic("transformPastedHTML")(js.Any.fromFunction1(transformPastedHTML))
    if (transformPastedText != null) __obj.updateDynamic("transformPastedText")(js.Any.fromFunction1(transformPastedText))
    __obj.asInstanceOf[EditorProps[S]]
  }
}

