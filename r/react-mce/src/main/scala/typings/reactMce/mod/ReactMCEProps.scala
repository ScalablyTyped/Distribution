package typings.reactMce.mod

import typings.tinymce.mod.Editor
import typings.tinymce.mod.Settings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactMCEProps extends js.Object {
  
  // Non-events
  var config: Settings_ = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var onActivate: js.UndefOr[EventHandler] = js.native
  
  var onAddUndo: js.UndefOr[EventHandler] = js.native
  
  var onBeforeAddUndo: js.UndefOr[EventHandler] = js.native
  
  var onBeforeExecCommand: js.UndefOr[EventHandler] = js.native
  
  var onBeforeGetContent: js.UndefOr[EventHandler] = js.native
  
  var onBeforeRenderUI: js.UndefOr[EventHandler] = js.native
  
  var onBeforeSetContent: js.UndefOr[EventHandler] = js.native
  
  var onBeforepaste: js.UndefOr[EventHandler] = js.native
  
  var onBlur: js.UndefOr[EventHandler] = js.native
  
  var onChange: js.UndefOr[EventHandler] = js.native
  
  var onClearUndos: js.UndefOr[EventHandler] = js.native
  
  var onClick: js.UndefOr[EventHandler] = js.native
  
  var onContextmenu: js.UndefOr[EventHandler] = js.native
  
  var onCopy: js.UndefOr[EventHandler] = js.native
  
  var onCut: js.UndefOr[EventHandler] = js.native
  
  var onDblclick: js.UndefOr[EventHandler] = js.native
  
  var onDeactivate: js.UndefOr[EventHandler] = js.native
  
  var onDirty: js.UndefOr[EventHandler] = js.native
  
  var onDrag: js.UndefOr[EventHandler] = js.native
  
  var onDragdrop: js.UndefOr[EventHandler] = js.native
  
  var onDragend: js.UndefOr[EventHandler] = js.native
  
  var onDraggesture: js.UndefOr[EventHandler] = js.native
  
  var onDragover: js.UndefOr[EventHandler] = js.native
  
  var onDrop: js.UndefOr[EventHandler] = js.native
  
  var onExecCommand: js.UndefOr[EventHandler] = js.native
  
  var onFocus: js.UndefOr[EventHandler] = js.native
  
  // Events
  var onFocusin: js.UndefOr[EventHandler] = js.native
  
  var onFocusout: js.UndefOr[EventHandler] = js.native
  
  var onGetContent: js.UndefOr[EventHandler] = js.native
  
  var onHide: js.UndefOr[EventHandler] = js.native
  
  var onInit: js.UndefOr[EventHandler] = js.native
  
  var onKeydown: js.UndefOr[EventHandler] = js.native
  
  var onKeypress: js.UndefOr[EventHandler] = js.native
  
  var onKeyup: js.UndefOr[EventHandler] = js.native
  
  var onLoadContent: js.UndefOr[EventHandler] = js.native
  
  var onMousedown: js.UndefOr[EventHandler] = js.native
  
  var onMouseenter: js.UndefOr[EventHandler] = js.native
  
  var onMouseleave: js.UndefOr[EventHandler] = js.native
  
  var onMousemove: js.UndefOr[EventHandler] = js.native
  
  var onMouseout: js.UndefOr[EventHandler] = js.native
  
  var onMouseover: js.UndefOr[EventHandler] = js.native
  
  var onMouseup: js.UndefOr[EventHandler] = js.native
  
  var onNodeChange: js.UndefOr[EventHandler] = js.native
  
  var onObjectResizeStart: js.UndefOr[EventHandler] = js.native
  
  var onObjectResized: js.UndefOr[EventHandler] = js.native
  
  var onObjectSelected: js.UndefOr[EventHandler] = js.native
  
  var onPaste: js.UndefOr[EventHandler] = js.native
  
  var onPostProcess: js.UndefOr[EventHandler] = js.native
  
  var onPostRender: js.UndefOr[EventHandler] = js.native
  
  var onPreInit: js.UndefOr[EventHandler] = js.native
  
  var onPreProcess: js.UndefOr[EventHandler] = js.native
  
  var onProgressState: js.UndefOr[EventHandler] = js.native
  
  var onRedo: js.UndefOr[EventHandler] = js.native
  
  var onRemove: js.UndefOr[EventHandler] = js.native
  
  var onReset: js.UndefOr[EventHandler] = js.native
  
  var onSaveContent: js.UndefOr[EventHandler] = js.native
  
  var onSelectionchange: js.UndefOr[EventHandler] = js.native
  
  var onSetAttrib: js.UndefOr[EventHandler] = js.native
  
  var onSetContent: js.UndefOr[EventHandler] = js.native
  
  var onShow: js.UndefOr[EventHandler] = js.native
  
  var onSubmit: js.UndefOr[EventHandler] = js.native
  
  var onUndo: js.UndefOr[EventHandler] = js.native
  
  var onVisualAid: js.UndefOr[EventHandler] = js.native
}
object ReactMCEProps {
  
  @scala.inline
  def apply(config: Settings_): ReactMCEProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMCEProps]
  }
  
  @scala.inline
  implicit class ReactMCEPropsOps[Self <: ReactMCEProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: Settings_): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setOnActivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    
    @scala.inline
    def setOnAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onAddUndo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAddUndo: Self = this.set("onAddUndo", js.undefined)
    
    @scala.inline
    def setOnBeforeAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBeforeAddUndo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforeAddUndo: Self = this.set("onBeforeAddUndo", js.undefined)
    
    @scala.inline
    def setOnBeforeExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBeforeExecCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforeExecCommand: Self = this.set("onBeforeExecCommand", js.undefined)
    
    @scala.inline
    def setOnBeforeGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBeforeGetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforeGetContent: Self = this.set("onBeforeGetContent", js.undefined)
    
    @scala.inline
    def setOnBeforeRenderUI(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBeforeRenderUI", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforeRenderUI: Self = this.set("onBeforeRenderUI", js.undefined)
    
    @scala.inline
    def setOnBeforeSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBeforeSetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforeSetContent: Self = this.set("onBeforeSetContent", js.undefined)
    
    @scala.inline
    def setOnBeforepaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBeforepaste", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBeforepaste: Self = this.set("onBeforepaste", js.undefined)
    
    @scala.inline
    def setOnBlur(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClearUndos(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onClearUndos", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClearUndos: Self = this.set("onClearUndos", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContextmenu(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onContextmenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnContextmenu: Self = this.set("onContextmenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onCopy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onCut", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnDblclick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDblclick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDblclick: Self = this.set("onDblclick", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDeactivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    
    @scala.inline
    def setOnDirty(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDirty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDirty: Self = this.set("onDirty", js.undefined)
    
    @scala.inline
    def setOnDrag(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragdrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDragdrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragdrop: Self = this.set("onDragdrop", js.undefined)
    
    @scala.inline
    def setOnDragend(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDragend", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragend: Self = this.set("onDragend", js.undefined)
    
    @scala.inline
    def setOnDraggesture(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDraggesture", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDraggesture: Self = this.set("onDraggesture", js.undefined)
    
    @scala.inline
    def setOnDragover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDragover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragover: Self = this.set("onDragover", js.undefined)
    
    @scala.inline
    def setOnDrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onExecCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExecCommand: Self = this.set("onExecCommand", js.undefined)
    
    @scala.inline
    def setOnFocus(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusin(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onFocusin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFocusin: Self = this.set("onFocusin", js.undefined)
    
    @scala.inline
    def setOnFocusout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onFocusout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFocusout: Self = this.set("onFocusout", js.undefined)
    
    @scala.inline
    def setOnGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onGetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnGetContent: Self = this.set("onGetContent", js.undefined)
    
    @scala.inline
    def setOnHide(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnKeydown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onKeydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeydown: Self = this.set("onKeydown", js.undefined)
    
    @scala.inline
    def setOnKeypress(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onKeypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeypress: Self = this.set("onKeypress", js.undefined)
    
    @scala.inline
    def setOnKeyup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onKeyup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyup: Self = this.set("onKeyup", js.undefined)
    
    @scala.inline
    def setOnLoadContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onLoadContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLoadContent: Self = this.set("onLoadContent", js.undefined)
    
    @scala.inline
    def setOnMousedown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMousedown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMousedown: Self = this.set("onMousedown", js.undefined)
    
    @scala.inline
    def setOnMouseenter(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMouseenter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseenter: Self = this.set("onMouseenter", js.undefined)
    
    @scala.inline
    def setOnMouseleave(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMouseleave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseleave: Self = this.set("onMouseleave", js.undefined)
    
    @scala.inline
    def setOnMousemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMousemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMousemove: Self = this.set("onMousemove", js.undefined)
    
    @scala.inline
    def setOnMouseout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMouseout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseout: Self = this.set("onMouseout", js.undefined)
    
    @scala.inline
    def setOnMouseover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMouseover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseover: Self = this.set("onMouseover", js.undefined)
    
    @scala.inline
    def setOnMouseup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onMouseup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseup: Self = this.set("onMouseup", js.undefined)
    
    @scala.inline
    def setOnNodeChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onNodeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnNodeChange: Self = this.set("onNodeChange", js.undefined)
    
    @scala.inline
    def setOnObjectResizeStart(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onObjectResizeStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectResizeStart: Self = this.set("onObjectResizeStart", js.undefined)
    
    @scala.inline
    def setOnObjectResized(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onObjectResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectResized: Self = this.set("onObjectResized", js.undefined)
    
    @scala.inline
    def setOnObjectSelected(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onObjectSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectSelected: Self = this.set("onObjectSelected", js.undefined)
    
    @scala.inline
    def setOnPaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onPaste", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPostProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onPostProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPostProcess: Self = this.set("onPostProcess", js.undefined)
    
    @scala.inline
    def setOnPostRender(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onPostRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPostRender: Self = this.set("onPostRender", js.undefined)
    
    @scala.inline
    def setOnPreInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onPreInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPreInit: Self = this.set("onPreInit", js.undefined)
    
    @scala.inline
    def setOnPreProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onPreProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPreProcess: Self = this.set("onPreProcess", js.undefined)
    
    @scala.inline
    def setOnProgressState(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onProgressState", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnProgressState: Self = this.set("onProgressState", js.undefined)
    
    @scala.inline
    def setOnRedo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onRedo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRedo: Self = this.set("onRedo", js.undefined)
    
    @scala.inline
    def setOnRemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnReset(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onReset", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnSaveContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onSaveContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSaveContent: Self = this.set("onSaveContent", js.undefined)
    
    @scala.inline
    def setOnSelectionchange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onSelectionchange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelectionchange: Self = this.set("onSelectionchange", js.undefined)
    
    @scala.inline
    def setOnSetAttrib(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onSetAttrib", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSetAttrib: Self = this.set("onSetAttrib", js.undefined)
    
    @scala.inline
    def setOnSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onSetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSetContent: Self = this.set("onSetContent", js.undefined)
    
    @scala.inline
    def setOnShow(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onUndo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUndo: Self = this.set("onUndo", js.undefined)
    
    @scala.inline
    def setOnVisualAid(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = this.set("onVisualAid", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnVisualAid: Self = this.set("onVisualAid", js.undefined)
  }
}
