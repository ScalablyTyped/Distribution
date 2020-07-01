package typings.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.anon.Right
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps[ThisT, S /* <: Schema[_, _] */] extends js.Object {
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
    StringDictionary[String] | (js.ThisFunction1[
      /* this */ ThisT, 
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
    * The `plain` flag will be true when the text is pasted as plain
    * text.
    */
  var clipboardTextParser: js.UndefOr[
    (js.ThisFunction3[
      /* this */ ThisT, 
      /* text */ String, 
      /* $context */ ResolvedPos[S], 
      /* plain */ Boolean, 
      Slice[S]
    ]) | Null
  ] = js.undefined
  /**
    * A function that will be called to get the text for the current
    * selection when copying text to the clipboard. By default, the
    * editor will use [`textBetween`](#model.Node.textBetween) on the
    * selected range.
    */
  var clipboardTextSerializer: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], String]) | Null] = js.undefined
  /**
    * Can be used to override the way a selection is created when
    * reading a DOM selection between the given anchor and head.
    */
  var createSelectionBetween: js.UndefOr[
    (js.ThisFunction3[
      /* this */ ThisT, 
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
    (js.ThisFunction1[
      /* this */ ThisT, 
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
    (js.ThisFunction1[
      /* this */ ThisT, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when the editor is clicked, after `handleClickOn` handlers
    * have been called.
    */
  var handleClick: js.UndefOr[
    (js.ThisFunction3[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* event */ MouseEvent, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called for each node around a click, from the inside out. The
    * `direct` flag will be true for the inner node.
    */
  var handleClickOn: js.UndefOr[
    (js.ThisFunction6[
      /* this */ ThisT, 
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
    (StringDictionary[
      js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
    ]) | Null
  ] = js.undefined
  /**
    * Called when the editor is double-clicked, after `handleDoubleClickOn`.
    */
  var handleDoubleClick: js.UndefOr[
    (js.ThisFunction3[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* event */ MouseEvent, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called for each node around a double click.
    */
  var handleDoubleClickOn: js.UndefOr[
    (js.ThisFunction6[
      /* this */ ThisT, 
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
    (js.ThisFunction4[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* event */ Event, 
      /* slice */ Slice[S], 
      /* moved */ Boolean, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when the editor receives a `keydown` event.
    */
  var handleKeyDown: js.UndefOr[
    (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Handler for `keypress` events.
    */
  var handleKeyPress: js.UndefOr[
    (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.undefined
  /**
    * Can be used to override the behavior of pasting. `slice` is the
    * pasted content parsed by the editor, but you can directly access
    * the event to get at the raw content.
    */
  var handlePaste: js.UndefOr[
    (js.ThisFunction3[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* event */ ClipboardEvent, 
      /* slice */ Slice[S], 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when the view, after updating its state, tries to scroll
    * the selection into view. A handler function may return false to
    * indicate that it did not handle the scrolling and further
    * handlers or the default behavior should be tried.
    */
  var handleScrollToSelection: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* view */ EditorView[S], Boolean]) | Null] = js.undefined
  /**
    * Whenever the user directly input text, this handler is called
    * before the input is applied. If it returns `true`, the default
    * behavior of actually inserting the text is suppressed.
    */
  var handleTextInput: js.UndefOr[
    (js.ThisFunction4[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* from */ Double, 
      /* to */ Double, 
      /* text */ String, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called when the editor is triple-clicked, after `handleTripleClickOn`.
    */
  var handleTripleClick: js.UndefOr[
    (js.ThisFunction3[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* event */ MouseEvent, 
      Boolean
    ]) | Null
  ] = js.undefined
  /**
    * Called for each node around a triple click.
    */
  var handleTripleClickOn: js.UndefOr[
    (js.ThisFunction6[
      /* this */ ThisT, 
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
  var scrollMargin: js.UndefOr[Double | Right | Null] = js.undefined
  /**
    * Determines the distance (in pixels) between the cursor and the
    * end of the visible viewport at which point, when scrolling the
    * cursor into view, scrolling takes place. Defaults to 0.
    */
  var scrollThreshold: js.UndefOr[Double | Right | Null] = js.undefined
  /**
    * Can be used to transform pasted content before it is applied to
    * the document.
    */
  var transformPasted: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], Slice[S]]) | Null] = js.undefined
  /**
    * Can be used to transform pasted HTML text, _before_ it is parsed,
    * for example to clean it up.
    */
  var transformPastedHTML: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* html */ String, String]) | Null] = js.undefined
  /**
    * Transform pasted plain text. The `plain` flag will be true when
    * the text is pasted as plain text.
    */
  var transformPastedText: js.UndefOr[
    (js.ThisFunction2[/* this */ ThisT, /* text */ String, /* plain */ Boolean, String]) | Null
  ] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply[ThisT, /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    attributes: js.UndefOr[
      Null | StringDictionary[String] | (js.ThisFunction1[
        /* this */ ThisT, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
        js.UndefOr[StringDictionary[String] | Null | Unit]
      ])
    ] = js.undefined,
    clipboardParser: js.UndefOr[Null | DOMParser[S]] = js.undefined,
    clipboardSerializer: js.UndefOr[Null | DOMSerializer[S]] = js.undefined,
    clipboardTextParser: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ ThisT, 
        /* text */ String, 
        /* $context */ ResolvedPos[S], 
        /* plain */ Boolean, 
        Slice[S]
      ])
    ] = js.undefined,
    clipboardTextSerializer: js.UndefOr[Null | (js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], String])] = js.undefined,
    createSelectionBetween: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* anchor */ ResolvedPos[S], 
        /* head */ ResolvedPos[S], 
        js.UndefOr[Selection | Null]
      ])
    ] = js.undefined,
    decorations: js.UndefOr[
      Null | (js.ThisFunction1[
        /* this */ ThisT, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
        js.UndefOr[DecorationSet[S] | Null]
      ])
    ] = js.undefined,
    domParser: js.UndefOr[Null | DOMParser[S]] = js.undefined,
    editable: js.UndefOr[
      Null | (js.ThisFunction1[
        /* this */ ThisT, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
        Boolean
      ])
    ] = js.undefined,
    handleClick: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* pos */ Double, 
        /* event */ MouseEvent, 
        Boolean
      ])
    ] = js.undefined,
    handleClickOn: js.UndefOr[
      Null | (js.ThisFunction6[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* pos */ Double, 
        /* node */ Node[S], 
        /* nodePos */ Double, 
        /* event */ MouseEvent, 
        /* direct */ Boolean, 
        Boolean
      ])
    ] = js.undefined,
    handleDOMEvents: js.UndefOr[
      Null | (StringDictionary[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ])
    ] = js.undefined,
    handleDoubleClick: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* pos */ Double, 
        /* event */ MouseEvent, 
        Boolean
      ])
    ] = js.undefined,
    handleDoubleClickOn: js.UndefOr[
      Null | (js.ThisFunction6[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* pos */ Double, 
        /* node */ Node[S], 
        /* nodePos */ Double, 
        /* event */ MouseEvent, 
        /* direct */ Boolean, 
        Boolean
      ])
    ] = js.undefined,
    handleDrop: js.UndefOr[
      Null | (js.ThisFunction4[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* event */ Event, 
        /* slice */ Slice[S], 
        /* moved */ Boolean, 
        Boolean
      ])
    ] = js.undefined,
    handleKeyDown: js.UndefOr[
      Null | (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean])
    ] = js.undefined,
    handleKeyPress: js.UndefOr[
      Null | (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean])
    ] = js.undefined,
    handlePaste: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* event */ ClipboardEvent, 
        /* slice */ Slice[S], 
        Boolean
      ])
    ] = js.undefined,
    handleScrollToSelection: js.UndefOr[Null | (js.ThisFunction1[/* this */ ThisT, /* view */ EditorView[S], Boolean])] = js.undefined,
    handleTextInput: js.UndefOr[
      Null | (js.ThisFunction4[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* from */ Double, 
        /* to */ Double, 
        /* text */ String, 
        Boolean
      ])
    ] = js.undefined,
    handleTripleClick: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* pos */ Double, 
        /* event */ MouseEvent, 
        Boolean
      ])
    ] = js.undefined,
    handleTripleClickOn: js.UndefOr[
      Null | (js.ThisFunction6[
        /* this */ ThisT, 
        /* view */ EditorView[S], 
        /* pos */ Double, 
        /* node */ Node[S], 
        /* nodePos */ Double, 
        /* event */ MouseEvent, 
        /* direct */ Boolean, 
        Boolean
      ])
    ] = js.undefined,
    nodeViews: js.UndefOr[
      Null | (StringDictionary[
        js.Function4[
          /* node */ Node[S], 
          /* view */ EditorView[S], 
          /* getPos */ js.Function0[Double] | Boolean, 
          /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
          NodeView[S]
        ]
      ])
    ] = js.undefined,
    scrollMargin: js.UndefOr[Null | Double | Right] = js.undefined,
    scrollThreshold: js.UndefOr[Null | Double | Right] = js.undefined,
    transformPasted: js.UndefOr[Null | (js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], Slice[S]])] = js.undefined,
    transformPastedHTML: js.UndefOr[Null | (js.ThisFunction1[/* this */ ThisT, /* html */ String, String])] = js.undefined,
    transformPastedText: js.UndefOr[
      Null | (js.ThisFunction2[/* this */ ThisT, /* text */ String, /* plain */ Boolean, String])
    ] = js.undefined
  ): EditorProps[ThisT, S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardParser)) __obj.updateDynamic("clipboardParser")(clipboardParser.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardSerializer)) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardTextParser)) __obj.updateDynamic("clipboardTextParser")(clipboardTextParser.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardTextSerializer)) __obj.updateDynamic("clipboardTextSerializer")(clipboardTextSerializer.asInstanceOf[js.Any])
    if (!js.isUndefined(createSelectionBetween)) __obj.updateDynamic("createSelectionBetween")(createSelectionBetween.asInstanceOf[js.Any])
    if (!js.isUndefined(decorations)) __obj.updateDynamic("decorations")(decorations.asInstanceOf[js.Any])
    if (!js.isUndefined(domParser)) __obj.updateDynamic("domParser")(domParser.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(handleClick)) __obj.updateDynamic("handleClick")(handleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(handleClickOn)) __obj.updateDynamic("handleClickOn")(handleClickOn.asInstanceOf[js.Any])
    if (!js.isUndefined(handleDOMEvents)) __obj.updateDynamic("handleDOMEvents")(handleDOMEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(handleDoubleClick)) __obj.updateDynamic("handleDoubleClick")(handleDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(handleDoubleClickOn)) __obj.updateDynamic("handleDoubleClickOn")(handleDoubleClickOn.asInstanceOf[js.Any])
    if (!js.isUndefined(handleDrop)) __obj.updateDynamic("handleDrop")(handleDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(handleKeyDown)) __obj.updateDynamic("handleKeyDown")(handleKeyDown.asInstanceOf[js.Any])
    if (!js.isUndefined(handleKeyPress)) __obj.updateDynamic("handleKeyPress")(handleKeyPress.asInstanceOf[js.Any])
    if (!js.isUndefined(handlePaste)) __obj.updateDynamic("handlePaste")(handlePaste.asInstanceOf[js.Any])
    if (!js.isUndefined(handleScrollToSelection)) __obj.updateDynamic("handleScrollToSelection")(handleScrollToSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(handleTextInput)) __obj.updateDynamic("handleTextInput")(handleTextInput.asInstanceOf[js.Any])
    if (!js.isUndefined(handleTripleClick)) __obj.updateDynamic("handleTripleClick")(handleTripleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(handleTripleClickOn)) __obj.updateDynamic("handleTripleClickOn")(handleTripleClickOn.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeViews)) __obj.updateDynamic("nodeViews")(nodeViews.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollMargin)) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollThreshold)) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(transformPasted)) __obj.updateDynamic("transformPasted")(transformPasted.asInstanceOf[js.Any])
    if (!js.isUndefined(transformPastedHTML)) __obj.updateDynamic("transformPastedHTML")(transformPastedHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(transformPastedText)) __obj.updateDynamic("transformPastedText")(transformPastedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorProps[ThisT, S]]
  }
}

