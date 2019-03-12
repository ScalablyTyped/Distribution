package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var decorateNode: js.UndefOr[
    js.Function3[
      /* node */ slateLib.slateMod.Node, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var onBeforeInput: js.UndefOr[EventHook] = js.undefined
  var onBlur: js.UndefOr[EventHook] = js.undefined
  var onClick: js.UndefOr[EventHook] = js.undefined
  var onCompositionEnd: js.UndefOr[EventHook] = js.undefined
  var onCompositionStart: js.UndefOr[EventHook] = js.undefined
  var onCopy: js.UndefOr[EventHook] = js.undefined
  var onCut: js.UndefOr[EventHook] = js.undefined
  var onDragEnd: js.UndefOr[EventHook] = js.undefined
  var onDragEnter: js.UndefOr[EventHook] = js.undefined
  var onDragExit: js.UndefOr[EventHook] = js.undefined
  var onDragLeave: js.UndefOr[EventHook] = js.undefined
  var onDragOver: js.UndefOr[EventHook] = js.undefined
  var onDragStart: js.UndefOr[EventHook] = js.undefined
  var onDrop: js.UndefOr[EventHook] = js.undefined
  var onFocus: js.UndefOr[EventHook] = js.undefined
  var onInput: js.UndefOr[EventHook] = js.undefined
  var onKeyDown: js.UndefOr[EventHook] = js.undefined
  var onPaste: js.UndefOr[EventHook] = js.undefined
  var onSelect: js.UndefOr[EventHook] = js.undefined
  var renderEditor: js.UndefOr[
    js.Function3[
      /* props */ EditorProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderMark: js.UndefOr[
    js.Function3[
      /* props */ RenderMarkProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderNode: js.UndefOr[
    js.Function3[
      /* props */ RenderNodeProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var shouldNodeComponentUpdate: js.UndefOr[
    js.Function4[
      /* previousProps */ RenderNodeProps, 
      /* props */ RenderNodeProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    decorateNode: (/* node */ slateLib.slateMod.Node, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    onBeforeInput: EventHook = null,
    onBlur: EventHook = null,
    onClick: EventHook = null,
    onCompositionEnd: EventHook = null,
    onCompositionStart: EventHook = null,
    onCopy: EventHook = null,
    onCut: EventHook = null,
    onDragEnd: EventHook = null,
    onDragEnter: EventHook = null,
    onDragExit: EventHook = null,
    onDragLeave: EventHook = null,
    onDragOver: EventHook = null,
    onDragStart: EventHook = null,
    onDrop: EventHook = null,
    onFocus: EventHook = null,
    onInput: EventHook = null,
    onKeyDown: EventHook = null,
    onPaste: EventHook = null,
    onSelect: EventHook = null,
    renderEditor: (/* props */ EditorProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderMark: (/* props */ RenderMarkProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderNode: (/* props */ RenderNodeProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    shouldNodeComponentUpdate: (/* previousProps */ RenderNodeProps, /* props */ RenderNodeProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (decorateNode != null) __obj.updateDynamic("decorateNode")(js.Any.fromFunction3(decorateNode))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (renderEditor != null) __obj.updateDynamic("renderEditor")(js.Any.fromFunction3(renderEditor))
    if (renderMark != null) __obj.updateDynamic("renderMark")(js.Any.fromFunction3(renderMark))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction3(renderNode))
    if (shouldNodeComponentUpdate != null) __obj.updateDynamic("shouldNodeComponentUpdate")(js.Any.fromFunction4(shouldNodeComponentUpdate))
    __obj.asInstanceOf[Plugin]
  }
}

