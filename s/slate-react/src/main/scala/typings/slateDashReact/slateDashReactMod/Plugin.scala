package typings.slateDashReact.slateDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.Element
import typings.react.Event
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.slate.slateMod.Command
import typings.slate.slateMod.CommandFunc
import typings.slate.slateMod.Node
import typings.slate.slateMod.Query
import typings.slate.slateMod.QueryFunc
import typings.slate.slateMod.SchemaProperties
import typings.slate.slateMod.SlateError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin
  extends typings.slate.slateMod.Plugin
     with PluginOrPlugins {
  var decorateNode: js.UndefOr[
    js.Function3[
      /* node */ Node, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var onBeforeInput: js.UndefOr[EventHook[FormEvent[Element]]] = js.undefined
  var onBlur: js.UndefOr[EventHook[FocusEvent[Element]]] = js.undefined
  var onClick: js.UndefOr[EventHook[MouseEvent[Element, NativeMouseEvent]]] = js.undefined
  var onCompositionEnd: js.UndefOr[EventHook[CompositionEvent[Element]]] = js.undefined
  var onCompositionStart: js.UndefOr[EventHook[CompositionEvent[Element]]] = js.undefined
  var onCopy: js.UndefOr[EventHook[ClipboardEvent[Element]]] = js.undefined
  var onCut: js.UndefOr[EventHook[ClipboardEvent[Element]]] = js.undefined
  var onDragEnd: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onDragEnter: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onDragExit: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onDragLeave: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onDragOver: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onDragStart: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onDrop: js.UndefOr[EventHook[DragEvent[Element]]] = js.undefined
  var onFocus: js.UndefOr[EventHook[FocusEvent[Element]]] = js.undefined
  var onInput: js.UndefOr[EventHook[FormEvent[Element]]] = js.undefined
  var onKeyDown: js.UndefOr[EventHook[KeyboardEvent[Element]]] = js.undefined
  var onPaste: js.UndefOr[EventHook[ClipboardEvent[Element]]] = js.undefined
  var onSelect: js.UndefOr[EventHook[SyntheticEvent[Element, Event]]] = js.undefined
  var renderAnnotation: js.UndefOr[
    js.Function3[
      /* props */ RenderAnnotationProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderBlock: js.UndefOr[
    js.Function3[
      /* props */ RenderBlockProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderDecoration: js.UndefOr[
    js.Function3[
      /* props */ RenderDecorationProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderDocument: js.UndefOr[
    js.Function3[
      /* props */ RenderDocumentProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderEditor: js.UndefOr[
    js.Function3[
      /* props */ EditorProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderInline: js.UndefOr[
    js.Function3[
      /* props */ RenderInlineProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var renderMark: js.UndefOr[
    js.Function3[
      /* props */ RenderMarkProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
  var shouldNodeComponentUpdate: js.UndefOr[
    js.Function4[
      /* previousProps */ RenderNodeProps, 
      /* props */ RenderNodeProps, 
      /* editor */ typings.slate.slateMod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    commands: StringDictionary[CommandFunc] = null,
    decorateNode: (/* node */ Node, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    normalizeNode: (/* node */ Node, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[Unit]) => (js.Function1[/* editor */ typings.slate.slateMod.Editor, Unit]) | Unit = null,
    onBeforeInput: (FormEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onBlur: (FocusEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onChange: (/* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onClick: (MouseEvent[Element, NativeMouseEvent], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCommand: (/* command */ Command, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onCompositionEnd: (CompositionEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCompositionStart: (CompositionEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onConstruct: (/* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onCopy: (ClipboardEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCut: (ClipboardEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragEnd: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragEnter: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragExit: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragLeave: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragOver: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragStart: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDrop: (DragEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onFocus: (FocusEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onInput: (FormEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onKeyDown: (KeyboardEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onPaste: (ClipboardEvent[Element], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onQuery: (/* query */ Query, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onSelect: (SyntheticEvent[Element, Event], /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    queries: StringDictionary[QueryFunc] = null,
    renderAnnotation: (/* props */ RenderAnnotationProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderBlock: (/* props */ RenderBlockProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderDecoration: (/* props */ RenderDecorationProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderDocument: (/* props */ RenderDocumentProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderEditor: (/* props */ EditorProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderInline: (/* props */ RenderInlineProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderMark: (/* props */ RenderMarkProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    schema: SchemaProperties = null,
    shouldNodeComponentUpdate: (/* previousProps */ RenderNodeProps, /* props */ RenderNodeProps, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[_]) => _ = null,
    validateNode: (/* node */ Node, /* editor */ typings.slate.slateMod.Editor, /* next */ js.Function0[Unit]) => SlateError | Unit = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (decorateNode != null) __obj.updateDynamic("decorateNode")(js.Any.fromFunction3(decorateNode))
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3(normalizeNode))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction3(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction3(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3(onCommand))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction3(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction3(onCompositionStart))
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2(onConstruct))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction3(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction3(onCut))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction3(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction3(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction3(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction3(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction3(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction3(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction3(onInput))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction3(onKeyDown))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction3(onPaste))
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3(onQuery))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (renderAnnotation != null) __obj.updateDynamic("renderAnnotation")(js.Any.fromFunction3(renderAnnotation))
    if (renderBlock != null) __obj.updateDynamic("renderBlock")(js.Any.fromFunction3(renderBlock))
    if (renderDecoration != null) __obj.updateDynamic("renderDecoration")(js.Any.fromFunction3(renderDecoration))
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

