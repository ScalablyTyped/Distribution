package typings.reactDashIcons

import typings.react.reactMod.Context
import typings.react.reactMod.Global.JSX.Element
import typings.reactDashIcons.libEsmIconBaseMod.IconBaseProps
import typings.reactDashIcons.libEsmIconBaseMod.IconTree
import typings.reactDashIcons.libEsmIconsManifestMod.IconManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-icons", JSImport.Namespace)
@js.native
object reactDashIconsMod extends js.Object {
  val DefaultContext: typings.reactDashIcons.libEsmIconContextMod.IconContext = js.native
  val IconContext: Context[typings.reactDashIcons.libEsmIconContextMod.IconContext] = js.native
  val icons: IconManifest = js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = js.native
  def IconBase(props: IconBaseProps with Anon_Attr): Element = js.native
}

