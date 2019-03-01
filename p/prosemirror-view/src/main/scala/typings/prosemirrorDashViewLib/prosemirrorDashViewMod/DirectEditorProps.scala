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
    clipboardTextParser: js.Function2[
      /* text */ java.lang.String, 
      /* $context */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], 
      prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
    ] = null,
    clipboardTextSerializer: js.Function1[/* p */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], java.lang.String] = null,
    createSelectionBetween: js.Function3[
      /* view */ EditorView[S], 
      /* anchor */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], 
      /* head */ prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], 
      js.UndefOr[stdLib.Selection | scala.Null]
    ] = null,
    decorations: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      js.UndefOr[DecorationSet[S] | scala.Null]
    ] = null,
    dispatchTransaction: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      scala.Unit
    ] = null,
    domParser: prosemirrorDashModelLib.prosemirrorDashModelMod.DOMParser[S] = null,
    editable: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      scala.Boolean
    ] = null,
    handleClick: js.Function3[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Boolean
    ] = null,
    handleClickOn: js.Function6[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* nodePos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      /* direct */ scala.Boolean, 
      scala.Boolean
    ] = null,
    handleDOMEvents: org.scalablytyped.runtime.StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ stdLib.Event, scala.Boolean]] = null,
    handleDoubleClick: js.Function3[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Boolean
    ] = null,
    handleDoubleClickOn: js.Function6[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* nodePos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      /* direct */ scala.Boolean, 
      scala.Boolean
    ] = null,
    handleDrop: js.Function4[
      /* view */ EditorView[S], 
      /* event */ stdLib.Event, 
      /* slice */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], 
      /* moved */ scala.Boolean, 
      scala.Boolean
    ] = null,
    handleKeyDown: js.Function2[/* view */ EditorView[S], /* event */ stdLib.KeyboardEvent, scala.Boolean] = null,
    handleKeyPress: js.Function2[/* view */ EditorView[S], /* event */ stdLib.KeyboardEvent, scala.Boolean] = null,
    handlePaste: js.Function3[
      /* view */ EditorView[S], 
      /* event */ stdLib.Event, 
      /* slice */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], 
      scala.Boolean
    ] = null,
    handleScrollToSelection: js.Function1[/* view */ EditorView[S], scala.Boolean] = null,
    handleTextInput: js.Function4[
      /* view */ EditorView[S], 
      /* from */ scala.Double, 
      /* to */ scala.Double, 
      /* text */ java.lang.String, 
      scala.Boolean
    ] = null,
    handleTripleClick: js.Function3[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Boolean
    ] = null,
    handleTripleClickOn: js.Function6[
      /* view */ EditorView[S], 
      /* pos */ scala.Double, 
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* nodePos */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      /* direct */ scala.Boolean, 
      scala.Boolean
    ] = null,
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
    transformPasted: js.Function1[
      /* p */ prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S], 
      prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
    ] = null,
    transformPastedHTML: js.Function1[/* html */ java.lang.String, java.lang.String] = null,
    transformPastedText: js.Function1[/* text */ java.lang.String, java.lang.String] = null
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clipboardParser != null) __obj.updateDynamic("clipboardParser")(clipboardParser)
    if (clipboardSerializer != null) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer)
    if (clipboardTextParser != null) __obj.updateDynamic("clipboardTextParser")(clipboardTextParser)
    if (clipboardTextSerializer != null) __obj.updateDynamic("clipboardTextSerializer")(clipboardTextSerializer)
    if (createSelectionBetween != null) __obj.updateDynamic("createSelectionBetween")(createSelectionBetween)
    if (decorations != null) __obj.updateDynamic("decorations")(decorations)
    if (dispatchTransaction != null) __obj.updateDynamic("dispatchTransaction")(dispatchTransaction)
    if (domParser != null) __obj.updateDynamic("domParser")(domParser)
    if (editable != null) __obj.updateDynamic("editable")(editable)
    if (handleClick != null) __obj.updateDynamic("handleClick")(handleClick)
    if (handleClickOn != null) __obj.updateDynamic("handleClickOn")(handleClickOn)
    if (handleDOMEvents != null) __obj.updateDynamic("handleDOMEvents")(handleDOMEvents)
    if (handleDoubleClick != null) __obj.updateDynamic("handleDoubleClick")(handleDoubleClick)
    if (handleDoubleClickOn != null) __obj.updateDynamic("handleDoubleClickOn")(handleDoubleClickOn)
    if (handleDrop != null) __obj.updateDynamic("handleDrop")(handleDrop)
    if (handleKeyDown != null) __obj.updateDynamic("handleKeyDown")(handleKeyDown)
    if (handleKeyPress != null) __obj.updateDynamic("handleKeyPress")(handleKeyPress)
    if (handlePaste != null) __obj.updateDynamic("handlePaste")(handlePaste)
    if (handleScrollToSelection != null) __obj.updateDynamic("handleScrollToSelection")(handleScrollToSelection)
    if (handleTextInput != null) __obj.updateDynamic("handleTextInput")(handleTextInput)
    if (handleTripleClick != null) __obj.updateDynamic("handleTripleClick")(handleTripleClick)
    if (handleTripleClickOn != null) __obj.updateDynamic("handleTripleClickOn")(handleTripleClickOn)
    if (nodeViews != null) __obj.updateDynamic("nodeViews")(nodeViews)
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (transformPasted != null) __obj.updateDynamic("transformPasted")(transformPasted)
    if (transformPastedHTML != null) __obj.updateDynamic("transformPastedHTML")(transformPastedHTML)
    if (transformPastedText != null) __obj.updateDynamic("transformPastedText")(transformPastedText)
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
}

