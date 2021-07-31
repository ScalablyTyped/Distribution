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
  class ^ ()
    extends Component[ReactMCEProps, js.Object, js.Any]
  
  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ Editor, Unit]
  
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
    
    @scala.inline
    def apply(config: Settings_): ReactMCEProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMCEProps]
    }
    
    @scala.inline
    implicit class ReactMCEPropsMutableBuilder[Self <: ReactMCEProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Settings_): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setOnActivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      @scala.inline
      def setOnAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onAddUndo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAddUndoUndefined: Self = StObject.set(x, "onAddUndo", js.undefined)
      
      @scala.inline
      def setOnBeforeAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeAddUndo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeAddUndoUndefined: Self = StObject.set(x, "onBeforeAddUndo", js.undefined)
      
      @scala.inline
      def setOnBeforeExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeExecCommand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeExecCommandUndefined: Self = StObject.set(x, "onBeforeExecCommand", js.undefined)
      
      @scala.inline
      def setOnBeforeGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeGetContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeGetContentUndefined: Self = StObject.set(x, "onBeforeGetContent", js.undefined)
      
      @scala.inline
      def setOnBeforeRenderUI(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeRenderUI", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeRenderUIUndefined: Self = StObject.set(x, "onBeforeRenderUI", js.undefined)
      
      @scala.inline
      def setOnBeforeSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforeSetContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeSetContentUndefined: Self = StObject.set(x, "onBeforeSetContent", js.undefined)
      
      @scala.inline
      def setOnBeforepaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBeforepaste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforepasteUndefined: Self = StObject.set(x, "onBeforepaste", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClearUndos(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onClearUndos", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClearUndosUndefined: Self = StObject.set(x, "onClearUndos", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextmenu(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onContextmenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnContextmenuUndefined: Self = StObject.set(x, "onContextmenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDblclick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDblclick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      @scala.inline
      def setOnDeactivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      @scala.inline
      def setOnDirty(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDirty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDirtyUndefined: Self = StObject.set(x, "onDirty", js.undefined)
      
      @scala.inline
      def setOnDrag(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDragdrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDragdrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragdropUndefined: Self = StObject.set(x, "onDragdrop", js.undefined)
      
      @scala.inline
      def setOnDragend(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDragend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
      
      @scala.inline
      def setOnDraggesture(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDraggesture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDraggestureUndefined: Self = StObject.set(x, "onDraggesture", js.undefined)
      
      @scala.inline
      def setOnDragover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDragover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragoverUndefined: Self = StObject.set(x, "onDragover", js.undefined)
      
      @scala.inline
      def setOnDrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onExecCommand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExecCommandUndefined: Self = StObject.set(x, "onExecCommand", js.undefined)
      
      @scala.inline
      def setOnFocus(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnFocusin(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onFocusin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusinUndefined: Self = StObject.set(x, "onFocusin", js.undefined)
      
      @scala.inline
      def setOnFocusout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onFocusout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusoutUndefined: Self = StObject.set(x, "onFocusout", js.undefined)
      
      @scala.inline
      def setOnGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onGetContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnGetContentUndefined: Self = StObject.set(x, "onGetContent", js.undefined)
      
      @scala.inline
      def setOnHide(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnKeydown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onKeydown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
      
      @scala.inline
      def setOnKeypress(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onKeypress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
      
      @scala.inline
      def setOnKeyup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onKeyup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
      
      @scala.inline
      def setOnLoadContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onLoadContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLoadContentUndefined: Self = StObject.set(x, "onLoadContent", js.undefined)
      
      @scala.inline
      def setOnMousedown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMousedown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
      
      @scala.inline
      def setOnMouseenter(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseenter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseenterUndefined: Self = StObject.set(x, "onMouseenter", js.undefined)
      
      @scala.inline
      def setOnMouseleave(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseleave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseleaveUndefined: Self = StObject.set(x, "onMouseleave", js.undefined)
      
      @scala.inline
      def setOnMousemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMousemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      @scala.inline
      def setOnMouseout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      @scala.inline
      def setOnMouseover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      @scala.inline
      def setOnMouseup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onMouseup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseupUndefined: Self = StObject.set(x, "onMouseup", js.undefined)
      
      @scala.inline
      def setOnNodeChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onNodeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeChangeUndefined: Self = StObject.set(x, "onNodeChange", js.undefined)
      
      @scala.inline
      def setOnObjectResizeStart(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onObjectResizeStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectResizeStartUndefined: Self = StObject.set(x, "onObjectResizeStart", js.undefined)
      
      @scala.inline
      def setOnObjectResized(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onObjectResized", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectResizedUndefined: Self = StObject.set(x, "onObjectResized", js.undefined)
      
      @scala.inline
      def setOnObjectSelected(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onObjectSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectSelectedUndefined: Self = StObject.set(x, "onObjectSelected", js.undefined)
      
      @scala.inline
      def setOnPaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPostProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPostProcess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPostProcessUndefined: Self = StObject.set(x, "onPostProcess", js.undefined)
      
      @scala.inline
      def setOnPostRender(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPostRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPostRenderUndefined: Self = StObject.set(x, "onPostRender", js.undefined)
      
      @scala.inline
      def setOnPreInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPreInit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPreInitUndefined: Self = StObject.set(x, "onPreInit", js.undefined)
      
      @scala.inline
      def setOnPreProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onPreProcess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPreProcessUndefined: Self = StObject.set(x, "onPreProcess", js.undefined)
      
      @scala.inline
      def setOnProgressState(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onProgressState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnProgressStateUndefined: Self = StObject.set(x, "onProgressState", js.undefined)
      
      @scala.inline
      def setOnRedo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onRedo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRedoUndefined: Self = StObject.set(x, "onRedo", js.undefined)
      
      @scala.inline
      def setOnRemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setOnReset(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnSaveContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSaveContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSaveContentUndefined: Self = StObject.set(x, "onSaveContent", js.undefined)
      
      @scala.inline
      def setOnSelectionchange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSelectionchange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectionchangeUndefined: Self = StObject.set(x, "onSelectionchange", js.undefined)
      
      @scala.inline
      def setOnSetAttrib(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSetAttrib", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSetAttribUndefined: Self = StObject.set(x, "onSetAttrib", js.undefined)
      
      @scala.inline
      def setOnSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSetContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSetContentUndefined: Self = StObject.set(x, "onSetContent", js.undefined)
      
      @scala.inline
      def setOnShow(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onUndo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUndoUndefined: Self = StObject.set(x, "onUndo", js.undefined)
      
      @scala.inline
      def setOnVisualAid(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = StObject.set(x, "onVisualAid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVisualAidUndefined: Self = StObject.set(x, "onVisualAid", js.undefined)
    }
  }
  
  type TinyMCE = Component[ReactMCEProps, js.Object, js.Any]
}
