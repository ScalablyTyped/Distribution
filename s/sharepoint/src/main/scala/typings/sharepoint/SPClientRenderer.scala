package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPClientRenderer extends js.Object {
  var AddCallStackInfoToErrors: Boolean
  var GlobalDebugMode: Boolean
  var RenderErrors: Boolean
  def AddPostRenderCallback(context: js.Any, callback: js.Function0[Unit]): Unit
  def CoreRender(): Unit
  def IsDebugMode(): Boolean
  def ParseTemplateString(template: String): js.Function0[String]
  def ParseTemplateStringWorker(template: String): js.Function0[String]
  def Render(): Unit
  def RenderCore(): Unit
  def RenderReplace(): Unit
  def ReplaceUrlTokens(url: String): js.Function0[String]
  def _ExecuteRenderCallbacks(): Unit
  def _ExecuteRenderCallbacksWorker(): Unit
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
    val __obj = js.Dynamic.literal(AddCallStackInfoToErrors = AddCallStackInfoToErrors, AddPostRenderCallback = js.Any.fromFunction2(AddPostRenderCallback), CoreRender = js.Any.fromFunction0(CoreRender), GlobalDebugMode = GlobalDebugMode, IsDebugMode = js.Any.fromFunction0(IsDebugMode), ParseTemplateString = js.Any.fromFunction1(ParseTemplateString), ParseTemplateStringWorker = js.Any.fromFunction1(ParseTemplateStringWorker), Render = js.Any.fromFunction0(Render), RenderCore = js.Any.fromFunction0(RenderCore), RenderErrors = RenderErrors, RenderReplace = js.Any.fromFunction0(RenderReplace), ReplaceUrlTokens = js.Any.fromFunction1(ReplaceUrlTokens), _ExecuteRenderCallbacks = js.Any.fromFunction0(_ExecuteRenderCallbacks), _ExecuteRenderCallbacksWorker = js.Any.fromFunction0(_ExecuteRenderCallbacksWorker))
  
    __obj.asInstanceOf[SPClientRenderer]
  }
}

