package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin
  extends slateLib.slateMod.Plugin
     with PluginOrPlugins {
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
  var renderBlock: js.UndefOr[
    js.Function3[
      /* props */ RenderBlockProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderDocument: js.UndefOr[
    js.Function3[
      /* props */ RenderDocumentProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderEditor: js.UndefOr[
    js.Function3[
      /* props */ EditorProps, 
      /* editor */ slateLib.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderInline: js.UndefOr[
    js.Function3[
      /* props */ RenderInlineProps, 
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
    commands: org.scalablytyped.runtime.StringDictionary[slateLib.slateMod.CommandFunc] = null,
    decorateNode: (/* node */ slateLib.slateMod.Node, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    normalizeNode: (/* node */ slateLib.slateMod.Node, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[scala.Unit]) => (js.Function1[/* editor */ slateLib.slateMod.Editor, scala.Unit]) | scala.Unit = null,
    onBeforeInput: EventHook = null,
    onBlur: EventHook = null,
    onChange: (/* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[scala.Unit]) => scala.Unit = null,
    onClick: EventHook = null,
    onCommand: (/* command */ slateLib.slateMod.Command, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[scala.Unit]) => scala.Unit = null,
    onCompositionEnd: EventHook = null,
    onCompositionStart: EventHook = null,
    onConstruct: (/* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[scala.Unit]) => scala.Unit = null,
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
    onQuery: (/* query */ slateLib.slateMod.Query, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[scala.Unit]) => scala.Unit = null,
    onSelect: EventHook = null,
    queries: org.scalablytyped.runtime.StringDictionary[slateLib.slateMod.QueryFunc] = null,
    renderBlock: (/* props */ RenderBlockProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderDocument: (/* props */ RenderDocumentProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderEditor: (/* props */ EditorProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderInline: (/* props */ RenderInlineProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderMark: (/* props */ RenderMarkProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    schema: slateLib.slateMod.SchemaProperties = null,
    shouldNodeComponentUpdate: (/* previousProps */ RenderNodeProps, /* props */ RenderNodeProps, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    validateNode: (/* node */ slateLib.slateMod.Node, /* editor */ slateLib.slateMod.Editor, /* next */ js.Function0[scala.Unit]) => slateLib.slateMod.SlateError | scala.Unit = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (decorateNode != null) __obj.updateDynamic("decorateNode")(js.Any.fromFunction3(decorateNode))
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3(normalizeNode))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3(onCommand))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2(onConstruct))
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
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3(onQuery))
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (renderBlock != null) __obj.updateDynamic("renderBlock")(js.Any.fromFunction3(renderBlock))
    if (renderDocument != null) __obj.updateDynamic("renderDocument")(js.Any.fromFunction3(renderDocument))
    if (renderEditor != null) __obj.updateDynamic("renderEditor")(js.Any.fromFunction3(renderEditor))
    if (renderInline != null) __obj.updateDynamic("renderInline")(js.Any.fromFunction3(renderInline))
    if (renderMark != null) __obj.updateDynamic("renderMark")(js.Any.fromFunction3(renderMark))
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (shouldNodeComponentUpdate != null) __obj.updateDynamic("shouldNodeComponentUpdate")(js.Any.fromFunction4(shouldNodeComponentUpdate))
    if (validateNode != null) __obj.updateDynamic("validateNode")(js.Any.fromFunction3(validateNode))
    __obj.asInstanceOf[Plugin]
  }
}

