package typings.reactMce

import typings.react.mod.Component
import typings.tinymce.mod.Editor
import typings.tinymce.mod.Settings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mce", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ReactMCEProps, js.Object, Any]
  
  type EventHandler = js.Function2[/* event */ Any, /* editor */ Editor, Unit]
  
  trait ReactMCEProps extends StObject {
    
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
    
    inline def apply(config: Settings_): ReactMCEProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMCEProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactMCEProps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Settings_): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setOnActivate(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction2(value))
      
      inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      inline def setOnAddUndo(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onAddUndo", js.Any.fromFunction2(value))
      
      inline def setOnAddUndoUndefined: Self = StObject.set(x, "onAddUndo", js.undefined)
      
      inline def setOnBeforeAddUndo(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeAddUndo", js.Any.fromFunction2(value))
      
      inline def setOnBeforeAddUndoUndefined: Self = StObject.set(x, "onBeforeAddUndo", js.undefined)
      
      inline def setOnBeforeExecCommand(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeExecCommand", js.Any.fromFunction2(value))
      
      inline def setOnBeforeExecCommandUndefined: Self = StObject.set(x, "onBeforeExecCommand", js.undefined)
      
      inline def setOnBeforeGetContent(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeGetContent", js.Any.fromFunction2(value))
      
      inline def setOnBeforeGetContentUndefined: Self = StObject.set(x, "onBeforeGetContent", js.undefined)
      
      inline def setOnBeforeRenderUI(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeRenderUI", js.Any.fromFunction2(value))
      
      inline def setOnBeforeRenderUIUndefined: Self = StObject.set(x, "onBeforeRenderUI", js.undefined)
      
      inline def setOnBeforeSetContent(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeSetContent", js.Any.fromFunction2(value))
      
      inline def setOnBeforeSetContentUndefined: Self = StObject.set(x, "onBeforeSetContent", js.undefined)
      
      inline def setOnBeforepaste(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforepaste", js.Any.fromFunction2(value))
      
      inline def setOnBeforepasteUndefined: Self = StObject.set(x, "onBeforepaste", js.undefined)
      
      inline def setOnBlur(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClearUndos(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onClearUndos", js.Any.fromFunction2(value))
      
      inline def setOnClearUndosUndefined: Self = StObject.set(x, "onClearUndos", js.undefined)
      
      inline def setOnClick(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextmenu(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onContextmenu", js.Any.fromFunction2(value))
      
      inline def setOnContextmenuUndefined: Self = StObject.set(x, "onContextmenu", js.undefined)
      
      inline def setOnCopy(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction2(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction2(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDblclick(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDblclick", js.Any.fromFunction2(value))
      
      inline def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      inline def setOnDeactivate(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction2(value))
      
      inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      inline def setOnDirty(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDirty", js.Any.fromFunction2(value))
      
      inline def setOnDirtyUndefined: Self = StObject.set(x, "onDirty", js.undefined)
      
      inline def setOnDrag(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDragdrop(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDragdrop", js.Any.fromFunction2(value))
      
      inline def setOnDragdropUndefined: Self = StObject.set(x, "onDragdrop", js.undefined)
      
      inline def setOnDragend(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDragend", js.Any.fromFunction2(value))
      
      inline def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
      
      inline def setOnDraggesture(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDraggesture", js.Any.fromFunction2(value))
      
      inline def setOnDraggestureUndefined: Self = StObject.set(x, "onDraggesture", js.undefined)
      
      inline def setOnDragover(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDragover", js.Any.fromFunction2(value))
      
      inline def setOnDragoverUndefined: Self = StObject.set(x, "onDragover", js.undefined)
      
      inline def setOnDrop(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnExecCommand(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onExecCommand", js.Any.fromFunction2(value))
      
      inline def setOnExecCommandUndefined: Self = StObject.set(x, "onExecCommand", js.undefined)
      
      inline def setOnFocus(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnFocusin(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onFocusin", js.Any.fromFunction2(value))
      
      inline def setOnFocusinUndefined: Self = StObject.set(x, "onFocusin", js.undefined)
      
      inline def setOnFocusout(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onFocusout", js.Any.fromFunction2(value))
      
      inline def setOnFocusoutUndefined: Self = StObject.set(x, "onFocusout", js.undefined)
      
      inline def setOnGetContent(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onGetContent", js.Any.fromFunction2(value))
      
      inline def setOnGetContentUndefined: Self = StObject.set(x, "onGetContent", js.undefined)
      
      inline def setOnHide(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnInit(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnKeydown(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onKeydown", js.Any.fromFunction2(value))
      
      inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
      
      inline def setOnKeypress(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onKeypress", js.Any.fromFunction2(value))
      
      inline def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
      
      inline def setOnKeyup(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onKeyup", js.Any.fromFunction2(value))
      
      inline def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
      
      inline def setOnLoadContent(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onLoadContent", js.Any.fromFunction2(value))
      
      inline def setOnLoadContentUndefined: Self = StObject.set(x, "onLoadContent", js.undefined)
      
      inline def setOnMousedown(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMousedown", js.Any.fromFunction2(value))
      
      inline def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
      
      inline def setOnMouseenter(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseenter", js.Any.fromFunction2(value))
      
      inline def setOnMouseenterUndefined: Self = StObject.set(x, "onMouseenter", js.undefined)
      
      inline def setOnMouseleave(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseleave", js.Any.fromFunction2(value))
      
      inline def setOnMouseleaveUndefined: Self = StObject.set(x, "onMouseleave", js.undefined)
      
      inline def setOnMousemove(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMousemove", js.Any.fromFunction2(value))
      
      inline def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      inline def setOnMouseout(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseout", js.Any.fromFunction2(value))
      
      inline def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      inline def setOnMouseover(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseover", js.Any.fromFunction2(value))
      
      inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      inline def setOnMouseup(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseup", js.Any.fromFunction2(value))
      
      inline def setOnMouseupUndefined: Self = StObject.set(x, "onMouseup", js.undefined)
      
      inline def setOnNodeChange(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onNodeChange", js.Any.fromFunction2(value))
      
      inline def setOnNodeChangeUndefined: Self = StObject.set(x, "onNodeChange", js.undefined)
      
      inline def setOnObjectResizeStart(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onObjectResizeStart", js.Any.fromFunction2(value))
      
      inline def setOnObjectResizeStartUndefined: Self = StObject.set(x, "onObjectResizeStart", js.undefined)
      
      inline def setOnObjectResized(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onObjectResized", js.Any.fromFunction2(value))
      
      inline def setOnObjectResizedUndefined: Self = StObject.set(x, "onObjectResized", js.undefined)
      
      inline def setOnObjectSelected(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onObjectSelected", js.Any.fromFunction2(value))
      
      inline def setOnObjectSelectedUndefined: Self = StObject.set(x, "onObjectSelected", js.undefined)
      
      inline def setOnPaste(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction2(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPostProcess(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPostProcess", js.Any.fromFunction2(value))
      
      inline def setOnPostProcessUndefined: Self = StObject.set(x, "onPostProcess", js.undefined)
      
      inline def setOnPostRender(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPostRender", js.Any.fromFunction2(value))
      
      inline def setOnPostRenderUndefined: Self = StObject.set(x, "onPostRender", js.undefined)
      
      inline def setOnPreInit(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPreInit", js.Any.fromFunction2(value))
      
      inline def setOnPreInitUndefined: Self = StObject.set(x, "onPreInit", js.undefined)
      
      inline def setOnPreProcess(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPreProcess", js.Any.fromFunction2(value))
      
      inline def setOnPreProcessUndefined: Self = StObject.set(x, "onPreProcess", js.undefined)
      
      inline def setOnProgressState(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onProgressState", js.Any.fromFunction2(value))
      
      inline def setOnProgressStateUndefined: Self = StObject.set(x, "onProgressState", js.undefined)
      
      inline def setOnRedo(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onRedo", js.Any.fromFunction2(value))
      
      inline def setOnRedoUndefined: Self = StObject.set(x, "onRedo", js.undefined)
      
      inline def setOnRemove(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnReset(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction2(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSaveContent(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSaveContent", js.Any.fromFunction2(value))
      
      inline def setOnSaveContentUndefined: Self = StObject.set(x, "onSaveContent", js.undefined)
      
      inline def setOnSelectionchange(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSelectionchange", js.Any.fromFunction2(value))
      
      inline def setOnSelectionchangeUndefined: Self = StObject.set(x, "onSelectionchange", js.undefined)
      
      inline def setOnSetAttrib(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSetAttrib", js.Any.fromFunction2(value))
      
      inline def setOnSetAttribUndefined: Self = StObject.set(x, "onSetAttrib", js.undefined)
      
      inline def setOnSetContent(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSetContent", js.Any.fromFunction2(value))
      
      inline def setOnSetContentUndefined: Self = StObject.set(x, "onSetContent", js.undefined)
      
      inline def setOnShow(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnSubmit(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnUndo(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onUndo", js.Any.fromFunction2(value))
      
      inline def setOnUndoUndefined: Self = StObject.set(x, "onUndo", js.undefined)
      
      inline def setOnVisualAid(value: (/* event */ Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onVisualAid", js.Any.fromFunction2(value))
      
      inline def setOnVisualAidUndefined: Self = StObject.set(x, "onVisualAid", js.undefined)
    }
  }
  
  type TinyMCE = Component[ReactMCEProps, js.Object, Any]
}
