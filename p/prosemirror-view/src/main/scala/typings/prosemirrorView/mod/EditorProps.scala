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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  ] = js.native
  
  /**
    * The [parser](#model.DOMParser) to use when reading content from
    * the clipboard. When not given, the value of the
    * [`domParser`](#view.EditorProps.domParser) prop is used.
    */
  var clipboardParser: js.UndefOr[DOMParser[S] | Null] = js.native
  
  /**
    * The DOM serializer to use when putting content onto the
    * clipboard. If not given, the result of
    * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)
    * will be used.
    */
  var clipboardSerializer: js.UndefOr[DOMSerializer[S] | Null] = js.native
  
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
  ] = js.native
  
  /**
    * A function that will be called to get the text for the current
    * selection when copying text to the clipboard. By default, the
    * editor will use [`textBetween`](#model.Node.textBetween) on the
    * selected range.
    */
  var clipboardTextSerializer: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], String]) | Null] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * The [parser](#model.DOMParser) to use when reading editor changes
    * from the DOM. Defaults to calling
    * [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) on the
    * editor's schema.
    */
  var domParser: js.UndefOr[DOMParser[S] | Null] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * Can be an object mapping DOM event type names to functions that
    * handle them. Such functions will be called before any handling
    * ProseMirror does of events fired on the editable DOM element.
    * Contrary to the other event handling props, when returning true
    * from such a function, you are responsible for calling
    * `preventDefault` yourself (or not, if you want to allow the
    * default behavior).
    */
  var handleDOMEvents: js.UndefOr[(HandleDOMEventsProp[ThisT, S]) | Null] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * Called when the editor receives a `keydown` event.
    */
  var handleKeyDown: js.UndefOr[
    (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.native
  
  /**
    * Handler for `keypress` events.
    */
  var handleKeyPress: js.UndefOr[
    (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.native
  
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
  ] = js.native
  
  /**
    * Called when the view, after updating its state, tries to scroll
    * the selection into view. A handler function may return false to
    * indicate that it did not handle the scrolling and further
    * handlers or the default behavior should be tried.
    */
  var handleScrollToSelection: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* view */ EditorView[S], Boolean]) | Null] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * Determines the extra space (in pixels) that is left above or
    * below the cursor when it is scrolled into view. Defaults to 5.
    */
  var scrollMargin: js.UndefOr[Double | Right | Null] = js.native
  
  /**
    * Determines the distance (in pixels) between the cursor and the
    * end of the visible viewport at which point, when scrolling the
    * cursor into view, scrolling takes place. Defaults to 0.
    */
  var scrollThreshold: js.UndefOr[Double | Right | Null] = js.native
  
  /**
    * Can be used to transform pasted content before it is applied to
    * the document.
    */
  var transformPasted: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], Slice[S]]) | Null] = js.native
  
  /**
    * Can be used to transform pasted HTML text, _before_ it is parsed,
    * for example to clean it up.
    */
  var transformPastedHTML: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* html */ String, String]) | Null] = js.native
  
  /**
    * Transform pasted plain text. The `plain` flag will be true when
    * the text is pasted as plain text.
    */
  var transformPastedText: js.UndefOr[
    (js.ThisFunction2[/* this */ ThisT, /* text */ String, /* plain */ Boolean, String]) | Null
  ] = js.native
}
object EditorProps {
  
  @scala.inline
  def apply[ThisT, S /* <: Schema[_, _] */](): EditorProps[ThisT, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProps[ThisT, S]]
  }
  
  @scala.inline
  implicit class EditorPropsOps[Self <: EditorProps[_, _], ThisT, S /* <: Schema[_, _] */] (val x: Self with (EditorProps[ThisT, S])) extends AnyVal {
    
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
    def setAttributes(
      value: StringDictionary[String] | (js.ThisFunction1[
          /* this */ ThisT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
          js.UndefOr[StringDictionary[String] | Null | Unit]
        ])
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setAttributesNull: Self = this.set("attributes", null)
    
    @scala.inline
    def setClipboardParser(value: DOMParser[S]): Self = this.set("clipboardParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardParser: Self = this.set("clipboardParser", js.undefined)
    
    @scala.inline
    def setClipboardParserNull: Self = this.set("clipboardParser", null)
    
    @scala.inline
    def setClipboardSerializer(value: DOMSerializer[S]): Self = this.set("clipboardSerializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardSerializer: Self = this.set("clipboardSerializer", js.undefined)
    
    @scala.inline
    def setClipboardSerializerNull: Self = this.set("clipboardSerializer", null)
    
    @scala.inline
    def setClipboardTextParser(
      value: js.ThisFunction3[
          /* this */ ThisT, 
          /* text */ String, 
          /* $context */ ResolvedPos[S], 
          /* plain */ Boolean, 
          Slice[S]
        ]
    ): Self = this.set("clipboardTextParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardTextParser: Self = this.set("clipboardTextParser", js.undefined)
    
    @scala.inline
    def setClipboardTextParserNull: Self = this.set("clipboardTextParser", null)
    
    @scala.inline
    def setClipboardTextSerializer(value: js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], String]): Self = this.set("clipboardTextSerializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardTextSerializer: Self = this.set("clipboardTextSerializer", js.undefined)
    
    @scala.inline
    def setClipboardTextSerializerNull: Self = this.set("clipboardTextSerializer", null)
    
    @scala.inline
    def setCreateSelectionBetween(
      value: js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* anchor */ ResolvedPos[S], 
          /* head */ ResolvedPos[S], 
          js.UndefOr[Selection | Null]
        ]
    ): Self = this.set("createSelectionBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSelectionBetween: Self = this.set("createSelectionBetween", js.undefined)
    
    @scala.inline
    def setCreateSelectionBetweenNull: Self = this.set("createSelectionBetween", null)
    
    @scala.inline
    def setDecorations(
      value: js.ThisFunction1[
          /* this */ ThisT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
          js.UndefOr[DecorationSet[S] | Null]
        ]
    ): Self = this.set("decorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorations: Self = this.set("decorations", js.undefined)
    
    @scala.inline
    def setDecorationsNull: Self = this.set("decorations", null)
    
    @scala.inline
    def setDomParser(value: DOMParser[S]): Self = this.set("domParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomParser: Self = this.set("domParser", js.undefined)
    
    @scala.inline
    def setDomParserNull: Self = this.set("domParser", null)
    
    @scala.inline
    def setEditable(
      value: js.ThisFunction1[
          /* this */ ThisT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
          Boolean
        ]
    ): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditableNull: Self = this.set("editable", null)
    
    @scala.inline
    def setHandleClick(
      value: js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean
        ]
    ): Self = this.set("handleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleClick: Self = this.set("handleClick", js.undefined)
    
    @scala.inline
    def setHandleClickNull: Self = this.set("handleClick", null)
    
    @scala.inline
    def setHandleClickOn(
      value: js.ThisFunction6[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* node */ Node[S], 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean
        ]
    ): Self = this.set("handleClickOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleClickOn: Self = this.set("handleClickOn", js.undefined)
    
    @scala.inline
    def setHandleClickOnNull: Self = this.set("handleClickOn", null)
    
    @scala.inline
    def setHandleDOMEvents(value: HandleDOMEventsProp[ThisT, S]): Self = this.set("handleDOMEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleDOMEvents: Self = this.set("handleDOMEvents", js.undefined)
    
    @scala.inline
    def setHandleDOMEventsNull: Self = this.set("handleDOMEvents", null)
    
    @scala.inline
    def setHandleDoubleClick(
      value: js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean
        ]
    ): Self = this.set("handleDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleDoubleClick: Self = this.set("handleDoubleClick", js.undefined)
    
    @scala.inline
    def setHandleDoubleClickNull: Self = this.set("handleDoubleClick", null)
    
    @scala.inline
    def setHandleDoubleClickOn(
      value: js.ThisFunction6[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* node */ Node[S], 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean
        ]
    ): Self = this.set("handleDoubleClickOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleDoubleClickOn: Self = this.set("handleDoubleClickOn", js.undefined)
    
    @scala.inline
    def setHandleDoubleClickOnNull: Self = this.set("handleDoubleClickOn", null)
    
    @scala.inline
    def setHandleDrop(
      value: js.ThisFunction4[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ Event, 
          /* slice */ Slice[S], 
          /* moved */ Boolean, 
          Boolean
        ]
    ): Self = this.set("handleDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleDrop: Self = this.set("handleDrop", js.undefined)
    
    @scala.inline
    def setHandleDropNull: Self = this.set("handleDrop", null)
    
    @scala.inline
    def setHandleKeyDown(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
    ): Self = this.set("handleKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleKeyDown: Self = this.set("handleKeyDown", js.undefined)
    
    @scala.inline
    def setHandleKeyDownNull: Self = this.set("handleKeyDown", null)
    
    @scala.inline
    def setHandleKeyPress(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
    ): Self = this.set("handleKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleKeyPress: Self = this.set("handleKeyPress", js.undefined)
    
    @scala.inline
    def setHandleKeyPressNull: Self = this.set("handleKeyPress", null)
    
    @scala.inline
    def setHandlePaste(
      value: js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ ClipboardEvent, 
          /* slice */ Slice[S], 
          Boolean
        ]
    ): Self = this.set("handlePaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlePaste: Self = this.set("handlePaste", js.undefined)
    
    @scala.inline
    def setHandlePasteNull: Self = this.set("handlePaste", null)
    
    @scala.inline
    def setHandleScrollToSelection(value: js.ThisFunction1[/* this */ ThisT, /* view */ EditorView[S], Boolean]): Self = this.set("handleScrollToSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleScrollToSelection: Self = this.set("handleScrollToSelection", js.undefined)
    
    @scala.inline
    def setHandleScrollToSelectionNull: Self = this.set("handleScrollToSelection", null)
    
    @scala.inline
    def setHandleTextInput(
      value: js.ThisFunction4[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* from */ Double, 
          /* to */ Double, 
          /* text */ String, 
          Boolean
        ]
    ): Self = this.set("handleTextInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleTextInput: Self = this.set("handleTextInput", js.undefined)
    
    @scala.inline
    def setHandleTextInputNull: Self = this.set("handleTextInput", null)
    
    @scala.inline
    def setHandleTripleClick(
      value: js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean
        ]
    ): Self = this.set("handleTripleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleTripleClick: Self = this.set("handleTripleClick", js.undefined)
    
    @scala.inline
    def setHandleTripleClickNull: Self = this.set("handleTripleClick", null)
    
    @scala.inline
    def setHandleTripleClickOn(
      value: js.ThisFunction6[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* node */ Node[S], 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean
        ]
    ): Self = this.set("handleTripleClickOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleTripleClickOn: Self = this.set("handleTripleClickOn", js.undefined)
    
    @scala.inline
    def setHandleTripleClickOnNull: Self = this.set("handleTripleClickOn", null)
    
    @scala.inline
    def setNodeViews(
      value: StringDictionary[
          js.Function4[
            /* node */ Node[S], 
            /* view */ EditorView[S], 
            /* getPos */ js.Function0[Double] | Boolean, 
            /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
            NodeView[S]
          ]
        ]
    ): Self = this.set("nodeViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeViews: Self = this.set("nodeViews", js.undefined)
    
    @scala.inline
    def setNodeViewsNull: Self = this.set("nodeViews", null)
    
    @scala.inline
    def setScrollMargin(value: Double | Right): Self = this.set("scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMargin: Self = this.set("scrollMargin", js.undefined)
    
    @scala.inline
    def setScrollMarginNull: Self = this.set("scrollMargin", null)
    
    @scala.inline
    def setScrollThreshold(value: Double | Right): Self = this.set("scrollThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollThreshold: Self = this.set("scrollThreshold", js.undefined)
    
    @scala.inline
    def setScrollThresholdNull: Self = this.set("scrollThreshold", null)
    
    @scala.inline
    def setTransformPasted(value: js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], Slice[S]]): Self = this.set("transformPasted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformPasted: Self = this.set("transformPasted", js.undefined)
    
    @scala.inline
    def setTransformPastedNull: Self = this.set("transformPasted", null)
    
    @scala.inline
    def setTransformPastedHTML(value: js.ThisFunction1[/* this */ ThisT, /* html */ String, String]): Self = this.set("transformPastedHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformPastedHTML: Self = this.set("transformPastedHTML", js.undefined)
    
    @scala.inline
    def setTransformPastedHTMLNull: Self = this.set("transformPastedHTML", null)
    
    @scala.inline
    def setTransformPastedText(value: js.ThisFunction2[/* this */ ThisT, /* text */ String, /* plain */ Boolean, String]): Self = this.set("transformPastedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformPastedText: Self = this.set("transformPastedText", js.undefined)
    
    @scala.inline
    def setTransformPastedTextNull: Self = this.set("transformPastedText", null)
  }
}
