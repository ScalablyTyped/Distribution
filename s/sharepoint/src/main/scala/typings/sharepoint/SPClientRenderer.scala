package typings.sharepoint

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("SPClientRenderer")
@js.native
object SPClientRenderer extends TopLevel[SPClientRenderer]

