package typings.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.AnonRight
import typings.std.ClipboardEvent
import typings.std.Event_
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
  def apply[S /* <: Schema[_, _] */](
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any,
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
    dispatchTransaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any => Unit = null,
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
    handlePaste: (/* view */ EditorView[S], /* event */ ClipboardEvent, /* slice */ Slice[S]) => Boolean = null,
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
    scrollMargin: Double | AnonRight = null,
    scrollThreshold: Double | AnonRight = null,
    transformPasted: /* p */ Slice[S] => Slice[S] = null,
    transformPastedHTML: /* html */ String => String = null,
    transformPastedText: /* text */ String => String = null
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clipboardParser != null) __obj.updateDynamic("clipboardParser")(clipboardParser.asInstanceOf[js.Any])
    if (clipboardSerializer != null) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer.asInstanceOf[js.Any])
    if (clipboardTextParser != null) __obj.updateDynamic("clipboardTextParser")(js.Any.fromFunction2(clipboardTextParser))
    if (clipboardTextSerializer != null) __obj.updateDynamic("clipboardTextSerializer")(js.Any.fromFunction1(clipboardTextSerializer))
    if (createSelectionBetween != null) __obj.updateDynamic("createSelectionBetween")(js.Any.fromFunction3(createSelectionBetween))
    if (decorations != null) __obj.updateDynamic("decorations")(js.Any.fromFunction1(decorations))
    if (dispatchTransaction != null) __obj.updateDynamic("dispatchTransaction")(js.Any.fromFunction1(dispatchTransaction))
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
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
}

