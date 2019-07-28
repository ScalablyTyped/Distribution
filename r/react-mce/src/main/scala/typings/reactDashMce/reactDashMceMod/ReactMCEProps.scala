package typings.reactDashMce.reactDashMceMod

import typings.tinymce.tinymceMod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMCEProps extends js.Object {
  // Non-events
  var config: Settings
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
    config: Settings,
    content: String = null,
    onActivate: EventHandler = null,
    onAddUndo: EventHandler = null,
    onBeforeAddUndo: EventHandler = null,
    onBeforeExecCommand: EventHandler = null,
    onBeforeGetContent: EventHandler = null,
    onBeforeRenderUI: EventHandler = null,
    onBeforeSetContent: EventHandler = null,
    onBeforepaste: EventHandler = null,
    onBlur: EventHandler = null,
    onChange: EventHandler = null,
    onClearUndos: EventHandler = null,
    onClick: EventHandler = null,
    onContextmenu: EventHandler = null,
    onCopy: EventHandler = null,
    onCut: EventHandler = null,
    onDblclick: EventHandler = null,
    onDeactivate: EventHandler = null,
    onDirty: EventHandler = null,
    onDrag: EventHandler = null,
    onDragdrop: EventHandler = null,
    onDragend: EventHandler = null,
    onDraggesture: EventHandler = null,
    onDragover: EventHandler = null,
    onDrop: EventHandler = null,
    onExecCommand: EventHandler = null,
    onFocus: EventHandler = null,
    onFocusin: EventHandler = null,
    onFocusout: EventHandler = null,
    onGetContent: EventHandler = null,
    onHide: EventHandler = null,
    onInit: EventHandler = null,
    onKeydown: EventHandler = null,
    onKeypress: EventHandler = null,
    onKeyup: EventHandler = null,
    onLoadContent: EventHandler = null,
    onMousedown: EventHandler = null,
    onMouseenter: EventHandler = null,
    onMouseleave: EventHandler = null,
    onMousemove: EventHandler = null,
    onMouseout: EventHandler = null,
    onMouseover: EventHandler = null,
    onMouseup: EventHandler = null,
    onNodeChange: EventHandler = null,
    onObjectResizeStart: EventHandler = null,
    onObjectResized: EventHandler = null,
    onObjectSelected: EventHandler = null,
    onPaste: EventHandler = null,
    onPostProcess: EventHandler = null,
    onPostRender: EventHandler = null,
    onPreInit: EventHandler = null,
    onPreProcess: EventHandler = null,
    onProgressState: EventHandler = null,
    onRedo: EventHandler = null,
    onRemove: EventHandler = null,
    onReset: EventHandler = null,
    onSaveContent: EventHandler = null,
    onSelectionchange: EventHandler = null,
    onSetAttrib: EventHandler = null,
    onSetContent: EventHandler = null,
    onShow: EventHandler = null,
    onSubmit: EventHandler = null,
    onUndo: EventHandler = null,
    onVisualAid: EventHandler = null
  ): ReactMCEProps = {
    val __obj = js.Dynamic.literal(config = config)
    if (content != null) __obj.updateDynamic("content")(content)
    if (onActivate != null) __obj.updateDynamic("onActivate")(onActivate)
    if (onAddUndo != null) __obj.updateDynamic("onAddUndo")(onAddUndo)
    if (onBeforeAddUndo != null) __obj.updateDynamic("onBeforeAddUndo")(onBeforeAddUndo)
    if (onBeforeExecCommand != null) __obj.updateDynamic("onBeforeExecCommand")(onBeforeExecCommand)
    if (onBeforeGetContent != null) __obj.updateDynamic("onBeforeGetContent")(onBeforeGetContent)
    if (onBeforeRenderUI != null) __obj.updateDynamic("onBeforeRenderUI")(onBeforeRenderUI)
    if (onBeforeSetContent != null) __obj.updateDynamic("onBeforeSetContent")(onBeforeSetContent)
    if (onBeforepaste != null) __obj.updateDynamic("onBeforepaste")(onBeforepaste)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClearUndos != null) __obj.updateDynamic("onClearUndos")(onClearUndos)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextmenu != null) __obj.updateDynamic("onContextmenu")(onContextmenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(onDblclick)
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(onDeactivate)
    if (onDirty != null) __obj.updateDynamic("onDirty")(onDirty)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragdrop != null) __obj.updateDynamic("onDragdrop")(onDragdrop)
    if (onDragend != null) __obj.updateDynamic("onDragend")(onDragend)
    if (onDraggesture != null) __obj.updateDynamic("onDraggesture")(onDraggesture)
    if (onDragover != null) __obj.updateDynamic("onDragover")(onDragover)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onExecCommand != null) __obj.updateDynamic("onExecCommand")(onExecCommand)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onFocusin != null) __obj.updateDynamic("onFocusin")(onFocusin)
    if (onFocusout != null) __obj.updateDynamic("onFocusout")(onFocusout)
    if (onGetContent != null) __obj.updateDynamic("onGetContent")(onGetContent)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onKeydown != null) __obj.updateDynamic("onKeydown")(onKeydown)
    if (onKeypress != null) __obj.updateDynamic("onKeypress")(onKeypress)
    if (onKeyup != null) __obj.updateDynamic("onKeyup")(onKeyup)
    if (onLoadContent != null) __obj.updateDynamic("onLoadContent")(onLoadContent)
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(onMousedown)
    if (onMouseenter != null) __obj.updateDynamic("onMouseenter")(onMouseenter)
    if (onMouseleave != null) __obj.updateDynamic("onMouseleave")(onMouseleave)
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(onMousemove)
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(onMouseout)
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(onMouseover)
    if (onMouseup != null) __obj.updateDynamic("onMouseup")(onMouseup)
    if (onNodeChange != null) __obj.updateDynamic("onNodeChange")(onNodeChange)
    if (onObjectResizeStart != null) __obj.updateDynamic("onObjectResizeStart")(onObjectResizeStart)
    if (onObjectResized != null) __obj.updateDynamic("onObjectResized")(onObjectResized)
    if (onObjectSelected != null) __obj.updateDynamic("onObjectSelected")(onObjectSelected)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPostProcess != null) __obj.updateDynamic("onPostProcess")(onPostProcess)
    if (onPostRender != null) __obj.updateDynamic("onPostRender")(onPostRender)
    if (onPreInit != null) __obj.updateDynamic("onPreInit")(onPreInit)
    if (onPreProcess != null) __obj.updateDynamic("onPreProcess")(onPreProcess)
    if (onProgressState != null) __obj.updateDynamic("onProgressState")(onProgressState)
    if (onRedo != null) __obj.updateDynamic("onRedo")(onRedo)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onSaveContent != null) __obj.updateDynamic("onSaveContent")(onSaveContent)
    if (onSelectionchange != null) __obj.updateDynamic("onSelectionchange")(onSelectionchange)
    if (onSetAttrib != null) __obj.updateDynamic("onSetAttrib")(onSetAttrib)
    if (onSetContent != null) __obj.updateDynamic("onSetContent")(onSetContent)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onUndo != null) __obj.updateDynamic("onUndo")(onUndo)
    if (onVisualAid != null) __obj.updateDynamic("onVisualAid")(onVisualAid)
    __obj.asInstanceOf[ReactMCEProps]
  }
}

