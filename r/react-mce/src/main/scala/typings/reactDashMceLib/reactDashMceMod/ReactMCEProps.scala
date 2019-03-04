package typings
package reactDashMceLib.reactDashMceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMCEProps extends js.Object {
  // Non-events
  var config: tinymceLib.tinymceMod.Settings
  var content: js.UndefOr[java.lang.String] = js.undefined
  var onActivate: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onAddUndo: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBeforeAddUndo: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBeforeExecCommand: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBeforeGetContent: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBeforeRenderUI: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBeforeSetContent: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBeforepaste: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onBlur: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onChange: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onClearUndos: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onClick: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onContextmenu: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onCopy: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onCut: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDblclick: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDeactivate: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDirty: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDrag: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDragdrop: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDragend: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDraggesture: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDragover: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onDrop: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onExecCommand: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onFocus: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  // Events
  var onFocusin: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onFocusout: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onGetContent: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onHide: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onInit: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onKeydown: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onKeypress: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onKeyup: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onLoadContent: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMousedown: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMouseenter: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMouseleave: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMousemove: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMouseout: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMouseover: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onMouseup: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onNodeChange: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onObjectResizeStart: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onObjectResized: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onObjectSelected: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onPaste: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onPostProcess: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onPostRender: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onPreInit: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onPreProcess: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onProgressState: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onRedo: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onRemove: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onReset: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onSaveContent: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onSelectionchange: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onSetAttrib: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onSetContent: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onShow: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onSubmit: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onUndo: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
  var onVisualAid: js.UndefOr[reactDashMceLib.EventHandler] = js.undefined
}

object ReactMCEProps {
  @scala.inline
  def apply(
    config: tinymceLib.tinymceMod.Settings,
    content: java.lang.String = null,
    onActivate: reactDashMceLib.EventHandler = null,
    onAddUndo: reactDashMceLib.EventHandler = null,
    onBeforeAddUndo: reactDashMceLib.EventHandler = null,
    onBeforeExecCommand: reactDashMceLib.EventHandler = null,
    onBeforeGetContent: reactDashMceLib.EventHandler = null,
    onBeforeRenderUI: reactDashMceLib.EventHandler = null,
    onBeforeSetContent: reactDashMceLib.EventHandler = null,
    onBeforepaste: reactDashMceLib.EventHandler = null,
    onBlur: reactDashMceLib.EventHandler = null,
    onChange: reactDashMceLib.EventHandler = null,
    onClearUndos: reactDashMceLib.EventHandler = null,
    onClick: reactDashMceLib.EventHandler = null,
    onContextmenu: reactDashMceLib.EventHandler = null,
    onCopy: reactDashMceLib.EventHandler = null,
    onCut: reactDashMceLib.EventHandler = null,
    onDblclick: reactDashMceLib.EventHandler = null,
    onDeactivate: reactDashMceLib.EventHandler = null,
    onDirty: reactDashMceLib.EventHandler = null,
    onDrag: reactDashMceLib.EventHandler = null,
    onDragdrop: reactDashMceLib.EventHandler = null,
    onDragend: reactDashMceLib.EventHandler = null,
    onDraggesture: reactDashMceLib.EventHandler = null,
    onDragover: reactDashMceLib.EventHandler = null,
    onDrop: reactDashMceLib.EventHandler = null,
    onExecCommand: reactDashMceLib.EventHandler = null,
    onFocus: reactDashMceLib.EventHandler = null,
    onFocusin: reactDashMceLib.EventHandler = null,
    onFocusout: reactDashMceLib.EventHandler = null,
    onGetContent: reactDashMceLib.EventHandler = null,
    onHide: reactDashMceLib.EventHandler = null,
    onInit: reactDashMceLib.EventHandler = null,
    onKeydown: reactDashMceLib.EventHandler = null,
    onKeypress: reactDashMceLib.EventHandler = null,
    onKeyup: reactDashMceLib.EventHandler = null,
    onLoadContent: reactDashMceLib.EventHandler = null,
    onMousedown: reactDashMceLib.EventHandler = null,
    onMouseenter: reactDashMceLib.EventHandler = null,
    onMouseleave: reactDashMceLib.EventHandler = null,
    onMousemove: reactDashMceLib.EventHandler = null,
    onMouseout: reactDashMceLib.EventHandler = null,
    onMouseover: reactDashMceLib.EventHandler = null,
    onMouseup: reactDashMceLib.EventHandler = null,
    onNodeChange: reactDashMceLib.EventHandler = null,
    onObjectResizeStart: reactDashMceLib.EventHandler = null,
    onObjectResized: reactDashMceLib.EventHandler = null,
    onObjectSelected: reactDashMceLib.EventHandler = null,
    onPaste: reactDashMceLib.EventHandler = null,
    onPostProcess: reactDashMceLib.EventHandler = null,
    onPostRender: reactDashMceLib.EventHandler = null,
    onPreInit: reactDashMceLib.EventHandler = null,
    onPreProcess: reactDashMceLib.EventHandler = null,
    onProgressState: reactDashMceLib.EventHandler = null,
    onRedo: reactDashMceLib.EventHandler = null,
    onRemove: reactDashMceLib.EventHandler = null,
    onReset: reactDashMceLib.EventHandler = null,
    onSaveContent: reactDashMceLib.EventHandler = null,
    onSelectionchange: reactDashMceLib.EventHandler = null,
    onSetAttrib: reactDashMceLib.EventHandler = null,
    onSetContent: reactDashMceLib.EventHandler = null,
    onShow: reactDashMceLib.EventHandler = null,
    onSubmit: reactDashMceLib.EventHandler = null,
    onUndo: reactDashMceLib.EventHandler = null,
    onVisualAid: reactDashMceLib.EventHandler = null
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

