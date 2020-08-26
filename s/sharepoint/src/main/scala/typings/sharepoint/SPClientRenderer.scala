package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientRenderer extends js.Object {
  var AddCallStackInfoToErrors: Boolean = js.native
  var GlobalDebugMode: Boolean = js.native
  var RenderErrors: Boolean = js.native
  def AddPostRenderCallback(context: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def CoreRender(): Unit = js.native
  def IsDebugMode(): Boolean = js.native
  def ParseTemplateString(template: String): js.Function0[String] = js.native
  def ParseTemplateStringWorker(template: String): js.Function0[String] = js.native
  def Render(): Unit = js.native
  def RenderCore(): Unit = js.native
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
  implicit class SPClientRendererOps[Self <: SPClientRenderer] (val x: Self) extends AnyVal {
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
    def setAddCallStackInfoToErrors(value: Boolean): Self = this.set("AddCallStackInfoToErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddPostRenderCallback(value: (js.Any, js.Function0[Unit]) => Unit): Self = this.set("AddPostRenderCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setCoreRender(value: () => Unit): Self = this.set("CoreRender", js.Any.fromFunction0(value))
    @scala.inline
    def setGlobalDebugMode(value: Boolean): Self = this.set("GlobalDebugMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDebugMode(value: () => Boolean): Self = this.set("IsDebugMode", js.Any.fromFunction0(value))
    @scala.inline
    def setParseTemplateString(value: String => js.Function0[String]): Self = this.set("ParseTemplateString", js.Any.fromFunction1(value))
    @scala.inline
    def setParseTemplateStringWorker(value: String => js.Function0[String]): Self = this.set("ParseTemplateStringWorker", js.Any.fromFunction1(value))
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("Render", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderCore(value: () => Unit): Self = this.set("RenderCore", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderErrors(value: Boolean): Self = this.set("RenderErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderReplace(value: () => Unit): Self = this.set("RenderReplace", js.Any.fromFunction0(value))
    @scala.inline
    def setReplaceUrlTokens(value: String => js.Function0[String]): Self = this.set("ReplaceUrlTokens", js.Any.fromFunction1(value))
    @scala.inline
    def set_ExecuteRenderCallbacks(value: () => Unit): Self = this.set("_ExecuteRenderCallbacks", js.Any.fromFunction0(value))
    @scala.inline
    def set_ExecuteRenderCallbacksWorker(value: () => Unit): Self = this.set("_ExecuteRenderCallbacksWorker", js.Any.fromFunction0(value))
  }
  
}

