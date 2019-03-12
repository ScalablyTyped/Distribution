package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectEditorProps[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends EditorProps[S] {
  /**
    * The callback over which to send transactions (state updates)
    * produced by the view. If you specify this, you probably want to
    * make sure this ends up calling the view's
    * [`updateState`](#view.EditorView.updateState) method with a new
    * state that has the transaction
    * [applied](#state.EditorState.apply).
    */
  var dispatchTransaction: js.UndefOr[
    (js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  /**
    * The current state of the editor.
    */
  var state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
}

object DirectEditorProps {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
      js.UndefOr[
        org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null | scala.Unit
      ]
    ]) = null,
    clipboardParser: prosemirrorDashModelLib.prosemirrorDashModelMod.DOMParser[S] = null,
    clipboardSerializer: prosemirrorDashModelLib.prosemirrorDashModelMod.DOMSerializer[S] = null,
    clipboardTextParser: (/* text */ java.lang.String, /* $context */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) => prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = null,
    clipboardTextSerializer: /* p */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] => java.lang.String = null,
    createSelectionBetween: (/* view */ EditorView[S], /* anchor */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], /* head */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) => js.UndefOr[stdLib.Selection | scala.Null] = null,
    decorations: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => js.UndefOr[DecorationSet[S] | scala.Null] = null,
    dispatchTransaction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any => scala.Unit = null,
    domParser: prosemirrorDashModelLib.prosemirrorDashModelMod.DOMParser[S] = null,
    editable: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => scala.Boolean = null,
    handleClick: (/* view */ EditorView[S], /* pos */ scala.Double, /* event */ stdLib.MouseEvent) => scala.Boolean = null,
    handleClickOn: (/* view */ EditorView[S], /* pos */ scala.Double, /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], /* nodePos */ scala.Double, /* event */ stdLib.MouseEvent, /* direct */ scala.Boolean) => scala.Boolean = null,
    handleDOMEvents: org.scalablytyped.runtime.StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ stdLib.Event, scala.Boolean]] = null,
    handleDoubleClick: (/* view */ EditorView[S], /* pos */ scala.Double, /* event */ stdLib.MouseEvent) => scala.Boolean = null,
    handleDoubleClickOn: (/* view */ EditorView[S], /* pos */ scala.Double, /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], /* nodePos */ scala.Double, /* event */ stdLib.MouseEvent, /* direct */ scala.Boolean) => scala.Boolean = null,
    handleDrop: (/* view */ EditorView[S], /* event */ stdLib.Event, /* slice */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], /* moved */ scala.Boolean) => scala.Boolean = null,
    handleKeyDown: (/* view */ EditorView[S], /* event */ stdLib.KeyboardEvent) => scala.Boolean = null,
    handleKeyPress: (/* view */ EditorView[S], /* event */ stdLib.KeyboardEvent) => scala.Boolean = null,
    handlePaste: (/* view */ EditorView[S], /* event */ stdLib.Event, /* slice */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]) => scala.Boolean = null,
    handleScrollToSelection: /* view */ EditorView[S] => scala.Boolean = null,
    handleTextInput: (/* view */ EditorView[S], /* from */ scala.Double, /* to */ scala.Double, /* text */ java.lang.String) => scala.Boolean = null,
    handleTripleClick: (/* view */ EditorView[S], /* pos */ scala.Double, /* event */ stdLib.MouseEvent) => scala.Boolean = null,
    handleTripleClickOn: (/* view */ EditorView[S], /* pos */ scala.Double, /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], /* nodePos */ scala.Double, /* event */ stdLib.MouseEvent, /* direct */ scala.Boolean) => scala.Boolean = null,
    nodeViews: org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
        /* view */ EditorView[S], 
        /* getPos */ js.Function0[scala.Double], 
        /* decorations */ js.Array[Decoration], 
        NodeView[S]
      ]
    ] = null,
    scrollMargin: scala.Int | scala.Double = null,
    scrollThreshold: scala.Int | scala.Double = null,
    transformPasted: /* p */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] => prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = null,
    transformPastedHTML: /* html */ java.lang.String => java.lang.String = null,
    transformPastedText: /* text */ java.lang.String => java.lang.String = null
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clipboardParser != null) __obj.updateDynamic("clipboardParser")(clipboardParser)
    if (clipboardSerializer != null) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer)
    if (clipboardTextParser != null) __obj.updateDynamic("clipboardTextParser")(js.Any.fromFunction2(clipboardTextParser))
    if (clipboardTextSerializer != null) __obj.updateDynamic("clipboardTextSerializer")(js.Any.fromFunction1(clipboardTextSerializer))
    if (createSelectionBetween != null) __obj.updateDynamic("createSelectionBetween")(js.Any.fromFunction3(createSelectionBetween))
    if (decorations != null) __obj.updateDynamic("decorations")(js.Any.fromFunction1(decorations))
    if (dispatchTransaction != null) __obj.updateDynamic("dispatchTransaction")(js.Any.fromFunction1(dispatchTransaction))
    if (domParser != null) __obj.updateDynamic("domParser")(domParser)
    if (editable != null) __obj.updateDynamic("editable")(js.Any.fromFunction1(editable))
    if (handleClick != null) __obj.updateDynamic("handleClick")(js.Any.fromFunction3(handleClick))
    if (handleClickOn != null) __obj.updateDynamic("handleClickOn")(js.Any.fromFunction6(handleClickOn))
    if (handleDOMEvents != null) __obj.updateDynamic("handleDOMEvents")(handleDOMEvents)
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
    if (nodeViews != null) __obj.updateDynamic("nodeViews")(nodeViews)
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (transformPasted != null) __obj.updateDynamic("transformPasted")(js.Any.fromFunction1(transformPasted))
    if (transformPastedHTML != null) __obj.updateDynamic("transformPastedHTML")(js.Any.fromFunction1(transformPastedHTML))
    if (transformPastedText != null) __obj.updateDynamic("transformPastedText")(js.Any.fromFunction1(transformPastedText))
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
}

