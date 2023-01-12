package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPClientRenderer extends StObject {
  
  var AddCallStackInfoToErrors: Boolean
  
  def AddPostRenderCallback(context: Any, callback: js.Function0[Unit]): Unit
  
  def CoreRender(): Unit
  
  var GlobalDebugMode: Boolean
  
  def IsDebugMode(): Boolean
  
  def ParseTemplateString(template: String): js.Function0[String]
  
  def ParseTemplateStringWorker(template: String): js.Function0[String]
  
  def Render(): Unit
  
  def RenderCore(): Unit
  
  var RenderErrors: Boolean
  
  def RenderReplace(): Unit
  
  def ReplaceUrlTokens(url: String): js.Function0[String]
  
  def _ExecuteRenderCallbacks(): Unit
  
  def _ExecuteRenderCallbacksWorker(): Unit
}
object SPClientRenderer {
  
  inline def apply(
    AddCallStackInfoToErrors: Boolean,
    AddPostRenderCallback: (Any, js.Function0[Unit]) => Unit,
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
  implicit open class MutableBuilder[Self <: SPClientRenderer] (val x: Self) extends AnyVal {
    
    inline def setAddCallStackInfoToErrors(value: Boolean): Self = StObject.set(x, "AddCallStackInfoToErrors", value.asInstanceOf[js.Any])
    
    inline def setAddPostRenderCallback(value: (Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "AddPostRenderCallback", js.Any.fromFunction2(value))
    
    inline def setCoreRender(value: () => Unit): Self = StObject.set(x, "CoreRender", js.Any.fromFunction0(value))
    
    inline def setGlobalDebugMode(value: Boolean): Self = StObject.set(x, "GlobalDebugMode", value.asInstanceOf[js.Any])
    
    inline def setIsDebugMode(value: () => Boolean): Self = StObject.set(x, "IsDebugMode", js.Any.fromFunction0(value))
    
    inline def setParseTemplateString(value: String => js.Function0[String]): Self = StObject.set(x, "ParseTemplateString", js.Any.fromFunction1(value))
    
    inline def setParseTemplateStringWorker(value: String => js.Function0[String]): Self = StObject.set(x, "ParseTemplateStringWorker", js.Any.fromFunction1(value))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "Render", js.Any.fromFunction0(value))
    
    inline def setRenderCore(value: () => Unit): Self = StObject.set(x, "RenderCore", js.Any.fromFunction0(value))
    
    inline def setRenderErrors(value: Boolean): Self = StObject.set(x, "RenderErrors", value.asInstanceOf[js.Any])
    
    inline def setRenderReplace(value: () => Unit): Self = StObject.set(x, "RenderReplace", js.Any.fromFunction0(value))
    
    inline def setReplaceUrlTokens(value: String => js.Function0[String]): Self = StObject.set(x, "ReplaceUrlTokens", js.Any.fromFunction1(value))
    
    inline def set_ExecuteRenderCallbacks(value: () => Unit): Self = StObject.set(x, "_ExecuteRenderCallbacks", js.Any.fromFunction0(value))
    
    inline def set_ExecuteRenderCallbacksWorker(value: () => Unit): Self = StObject.set(x, "_ExecuteRenderCallbacksWorker", js.Any.fromFunction0(value))
  }
}
