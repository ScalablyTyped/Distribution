package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SPClientRenderer extends StObject {
  
  var AddCallStackInfoToErrors: Boolean = js.native
  
  def AddPostRenderCallback(context: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  def CoreRender(): Unit = js.native
  
  var GlobalDebugMode: Boolean = js.native
  
  def IsDebugMode(): Boolean = js.native
  
  def ParseTemplateString(template: String): js.Function0[String] = js.native
  
  def ParseTemplateStringWorker(template: String): js.Function0[String] = js.native
  
  def Render(): Unit = js.native
  
  def RenderCore(): Unit = js.native
  
  var RenderErrors: Boolean = js.native
  
  def RenderReplace(): Unit = js.native
  
  def ReplaceUrlTokens(url: String): js.Function0[String] = js.native
  
  def _ExecuteRenderCallbacks(): Unit = js.native
  
  def _ExecuteRenderCallbacksWorker(): Unit = js.native
}
object SPClientRenderer {
  
  @scala.inline
  def apply(
    AddCallStackInfoToErrors: Boolean,
    AddPostRenderCallback: (js.Any, js.Function0[Unit]) => Unit,
    CoreRender: () => Unit,
    GlobalDebugMode: Boolean,
    IsDebugMode: () => Boolean,
    ParseTemplateString: String => js.Function0[String],
    ParseTemplateStringWorker: String => js.Function0[String],
    Render: () => Unit,
    RenderCore: () => Unit,
    RenderErrors: Boolean,
    RenderReplace: () => Unit,
    ReplaceUrlTokens: String => js.Function0[String],
    _ExecuteRenderCallbacks: () => Unit,
    _ExecuteRenderCallbacksWorker: () => Unit
  ): SPClientRenderer = {
    val __obj = js.Dynamic.literal(AddCallStackInfoToErrors = AddCallStackInfoToErrors.asInstanceOf[js.Any], AddPostRenderCallback = js.Any.fromFunction2(AddPostRenderCallback), CoreRender = js.Any.fromFunction0(CoreRender), GlobalDebugMode = GlobalDebugMode.asInstanceOf[js.Any], IsDebugMode = js.Any.fromFunction0(IsDebugMode), ParseTemplateString = js.Any.fromFunction1(ParseTemplateString), ParseTemplateStringWorker = js.Any.fromFunction1(ParseTemplateStringWorker), Render = js.Any.fromFunction0(Render), RenderCore = js.Any.fromFunction0(RenderCore), RenderErrors = RenderErrors.asInstanceOf[js.Any], RenderReplace = js.Any.fromFunction0(RenderReplace), ReplaceUrlTokens = js.Any.fromFunction1(ReplaceUrlTokens), _ExecuteRenderCallbacks = js.Any.fromFunction0(_ExecuteRenderCallbacks), _ExecuteRenderCallbacksWorker = js.Any.fromFunction0(_ExecuteRenderCallbacksWorker))
    __obj.asInstanceOf[SPClientRenderer]
  }
  
  @scala.inline
  implicit class SPClientRendererMutableBuilder[Self <: SPClientRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCallStackInfoToErrors(value: Boolean): Self = StObject.set(x, "AddCallStackInfoToErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPostRenderCallback(value: (js.Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "AddPostRenderCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCoreRender(value: () => Unit): Self = StObject.set(x, "CoreRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobalDebugMode(value: Boolean): Self = StObject.set(x, "GlobalDebugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDebugMode(value: () => Boolean): Self = StObject.set(x, "IsDebugMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseTemplateString(value: String => js.Function0[String]): Self = StObject.set(x, "ParseTemplateString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseTemplateStringWorker(value: String => js.Function0[String]): Self = StObject.set(x, "ParseTemplateStringWorker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = StObject.set(x, "Render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderCore(value: () => Unit): Self = StObject.set(x, "RenderCore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderErrors(value: Boolean): Self = StObject.set(x, "RenderErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderReplace(value: () => Unit): Self = StObject.set(x, "RenderReplace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceUrlTokens(value: String => js.Function0[String]): Self = StObject.set(x, "ReplaceUrlTokens", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_ExecuteRenderCallbacks(value: () => Unit): Self = StObject.set(x, "_ExecuteRenderCallbacks", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_ExecuteRenderCallbacksWorker(value: () => Unit): Self = StObject.set(x, "_ExecuteRenderCallbacksWorker", js.Any.fromFunction0(value))
  }
}
