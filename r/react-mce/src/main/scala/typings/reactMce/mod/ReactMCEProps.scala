package typings.reactMce.mod

import typings.tinymce.mod.Editor
import typings.tinymce.mod.Settings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMCEProps extends js.Object {
  // Non-events
  var config: Settings_
  var content: js.UndefOr[String] = js.undefined
  var onActivate: js.UndefOr[EventHandler] = js.undefined
  var onAddUndo: js.UndefOr[EventHandler] = js.undefined
  var onBeforeAddUndo: js.UndefOr[EventHandler] = js.undefined
  var onBeforeExecCommand: js.UndefOr[EventHandler] = js.undefined
  var onBeforeGetContent: js.UndefOr[EventHandler] = js.undefined
  var onBeforeRenderUI: js.UndefOr[EventHandler] = js.undefined
  var onBeforeSetContent: js.UndefOr[EventHandler] = js.undefined
  var onBeforepaste: js.UndefOr[EventHandler] = js.undefined
  var onBlur: js.UndefOr[EventHandler] = js.undefined
  var onChange: js.UndefOr[EventHandler] = js.undefined
  var onClearUndos: js.UndefOr[EventHandler] = js.undefined
  var onClick: js.UndefOr[EventHandler] = js.undefined
  var onContextmenu: js.UndefOr[EventHandler] = js.undefined
  var onCopy: js.UndefOr[EventHandler] = js.undefined
  var onCut: js.UndefOr[EventHandler] = js.undefined
  var onDblclick: js.UndefOr[EventHandler] = js.undefined
  var onDeactivate: js.UndefOr[EventHandler] = js.undefined
  var onDirty: js.UndefOr[EventHandler] = js.undefined
  var onDrag: js.UndefOr[EventHandler] = js.undefined
  var onDragdrop: js.UndefOr[EventHandler] = js.undefined
  var onDragend: js.UndefOr[EventHandler] = js.undefined
  var onDraggesture: js.UndefOr[EventHandler] = js.undefined
  var onDragover: js.UndefOr[EventHandler] = js.undefined
  var onDrop: js.UndefOr[EventHandler] = js.undefined
  var onExecCommand: js.UndefOr[EventHandler] = js.undefined
  var onFocus: js.UndefOr[EventHandler] = js.undefined
  // Events
  var onFocusin: js.UndefOr[EventHandler] = js.undefined
  var onFocusout: js.UndefOr[EventHandler] = js.undefined
  var onGetContent: js.UndefOr[EventHandler] = js.undefined
  var onHide: js.UndefOr[EventHandler] = js.undefined
  var onInit: js.UndefOr[EventHandler] = js.undefined
  var onKeydown: js.UndefOr[EventHandler] = js.undefined
  var onKeypress: js.UndefOr[EventHandler] = js.undefined
  var onKeyup: js.UndefOr[EventHandler] = js.undefined
  var onLoadContent: js.UndefOr[EventHandler] = js.undefined
  var onMousedown: js.UndefOr[EventHandler] = js.undefined
  var onMouseenter: js.UndefOr[EventHandler] = js.undefined
  var onMouseleave: js.UndefOr[EventHandler] = js.undefined
  var onMousemove: js.UndefOr[EventHandler] = js.undefined
  var onMouseout: js.UndefOr[EventHandler] = js.undefined
  var onMouseover: js.UndefOr[EventHandler] = js.undefined
  var onMouseup: js.UndefOr[EventHandler] = js.undefined
  var onNodeChange: js.UndefOr[EventHandler] = js.undefined
  var onObjectResizeStart: js.UndefOr[EventHandler] = js.undefined
  var onObjectResized: js.UndefOr[EventHandler] = js.undefined
  var onObjectSelected: js.UndefOr[EventHandler] = js.undefined
  var onPaste: js.UndefOr[EventHandler] = js.undefined
  var onPostProcess: js.UndefOr[EventHandler] = js.undefined
  var onPostRender: js.UndefOr[EventHandler] = js.undefined
  var onPreInit: js.UndefOr[EventHandler] = js.undefined
  var onPreProcess: js.UndefOr[EventHandler] = js.undefined
  var onProgressState: js.UndefOr[EventHandler] = js.undefined
  var onRedo: js.UndefOr[EventHandler] = js.undefined
  var onRemove: js.UndefOr[EventHandler] = js.undefined
  var onReset: js.UndefOr[EventHandler] = js.undefined
  var onSaveContent: js.UndefOr[EventHandler] = js.undefined
  var onSelectionchange: js.UndefOr[EventHandler] = js.undefined
  var onSetAttrib: js.UndefOr[EventHandler] = js.undefined
  var onSetContent: js.UndefOr[EventHandler] = js.undefined
  var onShow: js.UndefOr[EventHandler] = js.undefined
  var onSubmit: js.UndefOr[EventHandler] = js.undefined
  var onUndo: js.UndefOr[EventHandler] = js.undefined
  var onVisualAid: js.UndefOr[EventHandler] = js.undefined
}

object ReactMCEProps {
  @scala.inline
  def apply(
    config: Settings_,
    content: String = null,
    onActivate: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onAddUndo: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBeforeAddUndo: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBeforeExecCommand: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBeforeGetContent: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBeforeRenderUI: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBeforeSetContent: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBeforepaste: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onBlur: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onChange: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onClearUndos: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onClick: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onContextmenu: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onCopy: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onCut: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDblclick: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDeactivate: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDirty: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDrag: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDragdrop: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDragend: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDraggesture: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDragover: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onDrop: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onExecCommand: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onFocus: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onFocusin: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onFocusout: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onGetContent: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onHide: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onInit: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onKeydown: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onKeypress: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onKeyup: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onLoadContent: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMousedown: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMouseenter: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMouseleave: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMousemove: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMouseout: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMouseover: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onMouseup: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onNodeChange: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onObjectResizeStart: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onObjectResized: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onObjectSelected: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onPaste: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onPostProcess: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onPostRender: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onPreInit: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onPreProcess: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onProgressState: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onRedo: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onRemove: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onReset: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onSaveContent: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onSelectionchange: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onSetAttrib: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onSetContent: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onShow: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onSubmit: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onUndo: (/* event */ js.Any, /* editor */ Editor) => Unit = null,
    onVisualAid: (/* event */ js.Any, /* editor */ Editor) => Unit = null
  ): ReactMCEProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction2(onActivate))
    if (onAddUndo != null) __obj.updateDynamic("onAddUndo")(js.Any.fromFunction2(onAddUndo))
    if (onBeforeAddUndo != null) __obj.updateDynamic("onBeforeAddUndo")(js.Any.fromFunction2(onBeforeAddUndo))
    if (onBeforeExecCommand != null) __obj.updateDynamic("onBeforeExecCommand")(js.Any.fromFunction2(onBeforeExecCommand))
    if (onBeforeGetContent != null) __obj.updateDynamic("onBeforeGetContent")(js.Any.fromFunction2(onBeforeGetContent))
    if (onBeforeRenderUI != null) __obj.updateDynamic("onBeforeRenderUI")(js.Any.fromFunction2(onBeforeRenderUI))
    if (onBeforeSetContent != null) __obj.updateDynamic("onBeforeSetContent")(js.Any.fromFunction2(onBeforeSetContent))
    if (onBeforepaste != null) __obj.updateDynamic("onBeforepaste")(js.Any.fromFunction2(onBeforepaste))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClearUndos != null) __obj.updateDynamic("onClearUndos")(js.Any.fromFunction2(onClearUndos))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onContextmenu != null) __obj.updateDynamic("onContextmenu")(js.Any.fromFunction2(onContextmenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction2(onCut))
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(js.Any.fromFunction2(onDblclick))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction2(onDeactivate))
    if (onDirty != null) __obj.updateDynamic("onDirty")(js.Any.fromFunction2(onDirty))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onDragdrop != null) __obj.updateDynamic("onDragdrop")(js.Any.fromFunction2(onDragdrop))
    if (onDragend != null) __obj.updateDynamic("onDragend")(js.Any.fromFunction2(onDragend))
    if (onDraggesture != null) __obj.updateDynamic("onDraggesture")(js.Any.fromFunction2(onDraggesture))
    if (onDragover != null) __obj.updateDynamic("onDragover")(js.Any.fromFunction2(onDragover))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2(onDrop))
    if (onExecCommand != null) __obj.updateDynamic("onExecCommand")(js.Any.fromFunction2(onExecCommand))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onFocusin != null) __obj.updateDynamic("onFocusin")(js.Any.fromFunction2(onFocusin))
    if (onFocusout != null) __obj.updateDynamic("onFocusout")(js.Any.fromFunction2(onFocusout))
    if (onGetContent != null) __obj.updateDynamic("onGetContent")(js.Any.fromFunction2(onGetContent))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction2(onInit))
    if (onKeydown != null) __obj.updateDynamic("onKeydown")(js.Any.fromFunction2(onKeydown))
    if (onKeypress != null) __obj.updateDynamic("onKeypress")(js.Any.fromFunction2(onKeypress))
    if (onKeyup != null) __obj.updateDynamic("onKeyup")(js.Any.fromFunction2(onKeyup))
    if (onLoadContent != null) __obj.updateDynamic("onLoadContent")(js.Any.fromFunction2(onLoadContent))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction2(onMousedown))
    if (onMouseenter != null) __obj.updateDynamic("onMouseenter")(js.Any.fromFunction2(onMouseenter))
    if (onMouseleave != null) __obj.updateDynamic("onMouseleave")(js.Any.fromFunction2(onMouseleave))
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(js.Any.fromFunction2(onMousemove))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction2(onMouseout))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction2(onMouseover))
    if (onMouseup != null) __obj.updateDynamic("onMouseup")(js.Any.fromFunction2(onMouseup))
    if (onNodeChange != null) __obj.updateDynamic("onNodeChange")(js.Any.fromFunction2(onNodeChange))
    if (onObjectResizeStart != null) __obj.updateDynamic("onObjectResizeStart")(js.Any.fromFunction2(onObjectResizeStart))
    if (onObjectResized != null) __obj.updateDynamic("onObjectResized")(js.Any.fromFunction2(onObjectResized))
    if (onObjectSelected != null) __obj.updateDynamic("onObjectSelected")(js.Any.fromFunction2(onObjectSelected))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction2(onPaste))
    if (onPostProcess != null) __obj.updateDynamic("onPostProcess")(js.Any.fromFunction2(onPostProcess))
    if (onPostRender != null) __obj.updateDynamic("onPostRender")(js.Any.fromFunction2(onPostRender))
    if (onPreInit != null) __obj.updateDynamic("onPreInit")(js.Any.fromFunction2(onPreInit))
    if (onPreProcess != null) __obj.updateDynamic("onPreProcess")(js.Any.fromFunction2(onPreProcess))
    if (onProgressState != null) __obj.updateDynamic("onProgressState")(js.Any.fromFunction2(onProgressState))
    if (onRedo != null) __obj.updateDynamic("onRedo")(js.Any.fromFunction2(onRedo))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2(onRemove))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2(onReset))
    if (onSaveContent != null) __obj.updateDynamic("onSaveContent")(js.Any.fromFunction2(onSaveContent))
    if (onSelectionchange != null) __obj.updateDynamic("onSelectionchange")(js.Any.fromFunction2(onSelectionchange))
    if (onSetAttrib != null) __obj.updateDynamic("onSetAttrib")(js.Any.fromFunction2(onSetAttrib))
    if (onSetContent != null) __obj.updateDynamic("onSetContent")(js.Any.fromFunction2(onSetContent))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2(onSubmit))
    if (onUndo != null) __obj.updateDynamic("onUndo")(js.Any.fromFunction2(onUndo))
    if (onVisualAid != null) __obj.updateDynamic("onVisualAid")(js.Any.fromFunction2(onVisualAid))
    __obj.asInstanceOf[ReactMCEProps]
  }
}

