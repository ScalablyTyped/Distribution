package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_Description
import typings.protonDashNative.Anon_DescriptionTitle
import typings.protonDashNative.protonDashNativeStrings.Error
import typings.protonDashNative.protonDashNativeStrings.Message
import typings.protonDashNative.protonDashNativeStrings.Open
import typings.protonDashNative.protonDashNativeStrings.Save
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proton-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("Dialog")
  def Dialog_Error(`type`: Error): Unit = js.native
  @JSName("Dialog")
  def Dialog_Error(`type`: Error, options: Anon_Description): Unit = js.native
  @JSName("Dialog")
  def Dialog_Error(`type`: Error, options: Anon_DescriptionTitle): Unit = js.native
  @JSName("Dialog")
  def Dialog_Message(`type`: Message): Unit = js.native
  @JSName("Dialog")
  def Dialog_Message(`type`: Message, options: Anon_Description): Unit = js.native
  @JSName("Dialog")
  def Dialog_Message(`type`: Message, options: Anon_DescriptionTitle): Unit = js.native
  @JSName("Dialog")
  def Dialog_Open(`type`: Open): String = js.native
  @JSName("Dialog")
  def Dialog_Save(`type`: Save): String = js.native
  def render(element: Element): Unit = js.native
}

