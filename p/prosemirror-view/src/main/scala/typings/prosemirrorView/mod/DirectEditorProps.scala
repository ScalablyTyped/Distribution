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

trait DirectEditorProps[S /* <: Schema[_, _] */] extends EditorProps[S] {
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
    (js.Function1[
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
  def apply[S](
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any,
    attributes: js.UndefOr[
      Null | StringDictionary[String] | (js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
        js.UndefOr[StringDictionary[String] | Null | Unit]
      ])
    ] = js.undefined,
    clipboardParser: js.UndefOr[Null | DOMParser[S]] = js.undefined,
    clipboardSerializer: js.UndefOr[Null | DOMSerializer[S]] = js.undefined,
    clipboardTextParser: js.UndefOr[Null | ((/* text */ String, /* $context */ ResolvedPos[S]) => Slice[S])] = js.undefined,
    clipboardTextSerializer: js.UndefOr[Null | (/* p */ Slice[S] => String)] = js.undefined,
    createSelectionBetween: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* anchor */ ResolvedPos[S], /* head */ ResolvedPos[S]) => js.UndefOr[Selection | Null])
    ] = js.undefined,
    decorations: js.UndefOr[
      Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => js.UndefOr[DecorationSet[S] | Null])
    ] = js.undefined,
    dispatchTransaction: js.UndefOr[
      Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any => Unit)
    ] = js.undefined,
    domParser: js.UndefOr[Null | DOMParser[S]] = js.undefined,
    editable: js.UndefOr[
      Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => Boolean)
    ] = js.undefined,
    handleClick: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean)
    ] = js.undefined,
    handleClickOn: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean)
    ] = js.undefined,
    handleDOMEvents: js.UndefOr[
      Null | (StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ Event, Boolean]])
    ] = js.undefined,
    handleDoubleClick: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean)
    ] = js.undefined,
    handleDoubleClickOn: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean)
    ] = js.undefined,
    handleDrop: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* event */ Event, /* slice */ Slice[S], /* moved */ Boolean) => Boolean)
    ] = js.undefined,
    handleKeyDown: js.UndefOr[Null | ((/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean)] = js.undefined,
    handleKeyPress: js.UndefOr[Null | ((/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean)] = js.undefined,
    handlePaste: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* event */ ClipboardEvent, /* slice */ Slice[S]) => Boolean)
    ] = js.undefined,
    handleScrollToSelection: js.UndefOr[Null | (/* view */ EditorView[S] => Boolean)] = js.undefined,
    handleTextInput: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String) => Boolean)
    ] = js.undefined,
    handleTripleClick: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean)
    ] = js.undefined,
    handleTripleClickOn: js.UndefOr[
      Null | ((/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean)
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
    transformPasted: js.UndefOr[Null | (/* p */ Slice[S] => Slice[S])] = js.undefined,
    transformPastedHTML: js.UndefOr[Null | (/* html */ String => String)] = js.undefined,
    transformPastedText: js.UndefOr[Null | (/* text */ String => String)] = js.undefined
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardParser)) __obj.updateDynamic("clipboardParser")(clipboardParser.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardSerializer)) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardTextParser)) __obj.updateDynamic("clipboardTextParser")(if (clipboardTextParser != null) js.Any.fromFunction2(clipboardTextParser.asInstanceOf[(/* text */ String, /* $context */ ResolvedPos[S]) => Slice[S]]) else null)
    if (!js.isUndefined(clipboardTextSerializer)) __obj.updateDynamic("clipboardTextSerializer")(if (clipboardTextSerializer != null) js.Any.fromFunction1(clipboardTextSerializer.asInstanceOf[/* p */ Slice[S] => String]) else null)
    if (!js.isUndefined(createSelectionBetween)) __obj.updateDynamic("createSelectionBetween")(if (createSelectionBetween != null) js.Any.fromFunction3(createSelectionBetween.asInstanceOf[(/* view */ EditorView[S], /* anchor */ ResolvedPos[S], /* head */ ResolvedPos[S]) => js.UndefOr[Selection | Null]]) else null)
    if (!js.isUndefined(decorations)) __obj.updateDynamic("decorations")(if (decorations != null) js.Any.fromFunction1(decorations.asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => js.UndefOr[DecorationSet[S] | Null]]) else null)
    if (!js.isUndefined(dispatchTransaction)) __obj.updateDynamic("dispatchTransaction")(if (dispatchTransaction != null) js.Any.fromFunction1(dispatchTransaction.asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any => Unit]) else null)
    if (!js.isUndefined(domParser)) __obj.updateDynamic("domParser")(domParser.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(if (editable != null) js.Any.fromFunction1(editable.asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => Boolean]) else null)
    if (!js.isUndefined(handleClick)) __obj.updateDynamic("handleClick")(if (handleClick != null) js.Any.fromFunction3(handleClick.asInstanceOf[(/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean]) else null)
    if (!js.isUndefined(handleClickOn)) __obj.updateDynamic("handleClickOn")(if (handleClickOn != null) js.Any.fromFunction6(handleClickOn.asInstanceOf[(/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean]) else null)
    if (!js.isUndefined(handleDOMEvents)) __obj.updateDynamic("handleDOMEvents")(handleDOMEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(handleDoubleClick)) __obj.updateDynamic("handleDoubleClick")(if (handleDoubleClick != null) js.Any.fromFunction3(handleDoubleClick.asInstanceOf[(/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean]) else null)
    if (!js.isUndefined(handleDoubleClickOn)) __obj.updateDynamic("handleDoubleClickOn")(if (handleDoubleClickOn != null) js.Any.fromFunction6(handleDoubleClickOn.asInstanceOf[(/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean]) else null)
    if (!js.isUndefined(handleDrop)) __obj.updateDynamic("handleDrop")(if (handleDrop != null) js.Any.fromFunction4(handleDrop.asInstanceOf[(/* view */ EditorView[S], /* event */ Event, /* slice */ Slice[S], /* moved */ Boolean) => Boolean]) else null)
    if (!js.isUndefined(handleKeyDown)) __obj.updateDynamic("handleKeyDown")(if (handleKeyDown != null) js.Any.fromFunction2(handleKeyDown.asInstanceOf[(/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean]) else null)
    if (!js.isUndefined(handleKeyPress)) __obj.updateDynamic("handleKeyPress")(if (handleKeyPress != null) js.Any.fromFunction2(handleKeyPress.asInstanceOf[(/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean]) else null)
    if (!js.isUndefined(handlePaste)) __obj.updateDynamic("handlePaste")(if (handlePaste != null) js.Any.fromFunction3(handlePaste.asInstanceOf[(/* view */ EditorView[S], /* event */ ClipboardEvent, /* slice */ Slice[S]) => Boolean]) else null)
    if (!js.isUndefined(handleScrollToSelection)) __obj.updateDynamic("handleScrollToSelection")(if (handleScrollToSelection != null) js.Any.fromFunction1(handleScrollToSelection.asInstanceOf[/* view */ EditorView[S] => Boolean]) else null)
    if (!js.isUndefined(handleTextInput)) __obj.updateDynamic("handleTextInput")(if (handleTextInput != null) js.Any.fromFunction4(handleTextInput.asInstanceOf[(/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String) => Boolean]) else null)
    if (!js.isUndefined(handleTripleClick)) __obj.updateDynamic("handleTripleClick")(if (handleTripleClick != null) js.Any.fromFunction3(handleTripleClick.asInstanceOf[(/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean]) else null)
    if (!js.isUndefined(handleTripleClickOn)) __obj.updateDynamic("handleTripleClickOn")(if (handleTripleClickOn != null) js.Any.fromFunction6(handleTripleClickOn.asInstanceOf[(/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean]) else null)
    if (!js.isUndefined(nodeViews)) __obj.updateDynamic("nodeViews")(nodeViews.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollMargin)) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollThreshold)) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(transformPasted)) __obj.updateDynamic("transformPasted")(if (transformPasted != null) js.Any.fromFunction1(transformPasted.asInstanceOf[/* p */ Slice[S] => Slice[S]]) else null)
    if (!js.isUndefined(transformPastedHTML)) __obj.updateDynamic("transformPastedHTML")(if (transformPastedHTML != null) js.Any.fromFunction1(transformPastedHTML.asInstanceOf[/* html */ String => String]) else null)
    if (!js.isUndefined(transformPastedText)) __obj.updateDynamic("transformPastedText")(if (transformPastedText != null) js.Any.fromFunction1(transformPastedText.asInstanceOf[/* text */ String => String]) else null)
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
}

