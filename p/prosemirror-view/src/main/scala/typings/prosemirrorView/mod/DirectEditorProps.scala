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

trait DirectEditorProps[S /* <: Schema[_, _] */]
  extends EditorProps[js.Any, S] {
  /**
    * The callback over which to send transactions (state updates)
    * produced by the view. If you specify this, you probably want to
    * make sure this ends up calling the view's
    * [`updateState`](#view.EditorView.updateState) method with a new
    * state that has the transaction
    * [applied](#state.EditorState.apply). The callback will be bound to have
    * the view instance as its `this` binding.
    */
  var dispatchTransaction: js.UndefOr[
    (js.ThisFunction1[
      /* this */ EditorView[S], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      Unit
    ]) | Null
  ] = js.undefined
  /**
    * The current state of the editor.
    */
  var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
}

object DirectEditorProps {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any,
    attributes: js.UndefOr[
      Null | StringDictionary[String] | (js.ThisFunction1[
        js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
        js.UndefOr[StringDictionary[String] | Null | Unit]
      ])
    ] = js.undefined,
    clipboardParser: js.UndefOr[Null | DOMParser[S]] = js.undefined,
    clipboardSerializer: js.UndefOr[Null | DOMSerializer[S]] = js.undefined,
    clipboardTextParser: js.UndefOr[
      Null | (js.ThisFunction3[js.Any, /* text */ String, /* $context */ ResolvedPos[S], /* plain */ Boolean, Slice[S]])
    ] = js.undefined,
    clipboardTextSerializer: js.UndefOr[Null | (js.ThisFunction1[js.Any, /* p */ Slice[S], String])] = js.undefined,
    createSelectionBetween: js.UndefOr[
      Null | (js.ThisFunction3[
        js.Any, 
        /* view */ EditorView[S], 
        /* anchor */ ResolvedPos[S], 
        /* head */ ResolvedPos[S], 
        js.UndefOr[Selection | Null]
      ])
    ] = js.undefined,
    decorations: js.UndefOr[
      Null | (js.ThisFunction1[
        js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
        js.UndefOr[DecorationSet[S] | Null]
      ])
    ] = js.undefined,
    dispatchTransaction: js.UndefOr[
      Null | (js.ThisFunction1[
        /* this */ EditorView[S], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
        Unit
      ])
    ] = js.undefined,
    domParser: js.UndefOr[Null | DOMParser[S]] = js.undefined,
    editable: js.UndefOr[
      Null | (js.ThisFunction1[
        js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
        Boolean
      ])
    ] = js.undefined,
    handleClick: js.UndefOr[
      Null | (js.ThisFunction3[js.Any, /* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean])
    ] = js.undefined,
    handleClickOn: js.UndefOr[
      Null | (js.ThisFunction6[
        js.Any, 
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
      Null | (StringDictionary[js.ThisFunction2[js.Any, /* view */ EditorView[S], /* event */ Event, Boolean]])
    ] = js.undefined,
    handleDoubleClick: js.UndefOr[
      Null | (js.ThisFunction3[js.Any, /* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean])
    ] = js.undefined,
    handleDoubleClickOn: js.UndefOr[
      Null | (js.ThisFunction6[
        js.Any, 
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
        js.Any, 
        /* view */ EditorView[S], 
        /* event */ Event, 
        /* slice */ Slice[S], 
        /* moved */ Boolean, 
        Boolean
      ])
    ] = js.undefined,
    handleKeyDown: js.UndefOr[
      Null | (js.ThisFunction2[js.Any, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean])
    ] = js.undefined,
    handleKeyPress: js.UndefOr[
      Null | (js.ThisFunction2[js.Any, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean])
    ] = js.undefined,
    handlePaste: js.UndefOr[
      Null | (js.ThisFunction3[
        js.Any, 
        /* view */ EditorView[S], 
        /* event */ ClipboardEvent, 
        /* slice */ Slice[S], 
        Boolean
      ])
    ] = js.undefined,
    handleScrollToSelection: js.UndefOr[Null | (js.ThisFunction1[js.Any, /* view */ EditorView[S], Boolean])] = js.undefined,
    handleTextInput: js.UndefOr[
      Null | (js.ThisFunction4[
        js.Any, 
        /* view */ EditorView[S], 
        /* from */ Double, 
        /* to */ Double, 
        /* text */ String, 
        Boolean
      ])
    ] = js.undefined,
    handleTripleClick: js.UndefOr[
      Null | (js.ThisFunction3[js.Any, /* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean])
    ] = js.undefined,
    handleTripleClickOn: js.UndefOr[
      Null | (js.ThisFunction6[
        js.Any, 
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
    transformPasted: js.UndefOr[Null | (js.ThisFunction1[js.Any, /* p */ Slice[S], Slice[S]])] = js.undefined,
    transformPastedHTML: js.UndefOr[Null | (js.ThisFunction1[js.Any, /* html */ String, String])] = js.undefined,
    transformPastedText: js.UndefOr[
      Null | (js.ThisFunction2[js.Any, /* text */ String, /* plain */ Boolean, String])
    ] = js.undefined
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardParser)) __obj.updateDynamic("clipboardParser")(clipboardParser.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardSerializer)) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardTextParser)) __obj.updateDynamic("clipboardTextParser")(clipboardTextParser.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardTextSerializer)) __obj.updateDynamic("clipboardTextSerializer")(clipboardTextSerializer.asInstanceOf[js.Any])
    if (!js.isUndefined(createSelectionBetween)) __obj.updateDynamic("createSelectionBetween")(createSelectionBetween.asInstanceOf[js.Any])
    if (!js.isUndefined(decorations)) __obj.updateDynamic("decorations")(decorations.asInstanceOf[js.Any])
    if (!js.isUndefined(dispatchTransaction)) __obj.updateDynamic("dispatchTransaction")(dispatchTransaction.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
}

